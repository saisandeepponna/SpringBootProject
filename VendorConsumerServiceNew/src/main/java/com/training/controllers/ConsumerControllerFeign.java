package com.training.controllers;


import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.training.bean.Trainer;
import com.training.interfaces.MyFeignClient;
import com.training.repo.VendorRepo;
import com.training.services.VendorService;


@Configuration
@RequestMapping("/vendor/api")
@RestController
public class ConsumerControllerFeign {

	@Autowired
	private MyFeignClient myFeignClient;
	@Autowired
	private VendorService vendorService;

	@Autowired
	private VendorRepo vendorRepo;
	

	@Value("${nodata}")
	public String nodata;

	@GetMapping("/gettrainersbyskillsetfeign/skillset/{skillset}")
	public String getTrainersBySkillset(@PathVariable("skillset") String skillset)
	{

		List<Trainer>trainer= myFeignClient.getTrainersBySkillset(skillset);
        
		 for (Trainer t:trainer) {
			 vendorRepo.save(t);
		 }
	
		for(Trainer t:trainer) {
			List<String> skillsetList = Arrays.asList(t.getSkillset().split(",", -1));
			if(skillsetList.contains(skillset)) 
				return "name: "+t.getName()+" mobile: "+t.getMobileno()+" email "+t.getEmail();
		}
		return nodata;
	}
	@DeleteMapping("/deletebyid/trainercode/{trainercode}")
	public boolean deleteById(@PathVariable("trainercode") int trainerCode) {
		return vendorService.deleteById(trainerCode);

	}	 

}
