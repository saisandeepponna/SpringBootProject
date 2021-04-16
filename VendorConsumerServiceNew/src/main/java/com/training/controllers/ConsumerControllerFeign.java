package com.training.controllers;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.training.bean.Trainer;
import com.training.interfaces.MyFeignClient;



@RequestMapping("/consumer/api")
@RestController
public class ConsumerControllerFeign {
	
	@Autowired
	private MyFeignClient myFeignClient;
	
	@Value("${nodata}")
	public String nodata;
	
	@GetMapping("/gettrainersbyskillsetfeign/skillset/{skillset}")
	public String getTrainersBySkillset(@PathVariable("skillset") String skillset)
	{
		 
		List<Trainer>trainer= myFeignClient.getTrainersBySkillset(skillset);
		
		
	    for(Trainer t:trainer) {
	    	List<String> skillsetList = Arrays.asList(t.getSkillset().split(",", -1));
	    	if(skillsetList.contains(skillset)) 
	    		return "name: "+t.getName()+" mobile: "+t.getMobileno()+" email "+t.getEmail();
	    	}
	    return nodata;
	}
	
	
	
//	@GetMapping("/getconsumertrainer")
//	public List<Trainer> getTrainers()
//	{
//		return trainerConsumerService.findAll();
//	}
//	
//	@GetMapping("/addconsumertrainer")
//	public List<Trainer> addTrainers()
//	{
//		return myFeignClient.addTrainers();
//	}
	
//	@DeleteMapping("/deltrainer/isbn/{isbn}") 
//	public boolean deleteBook(@PathVariable("isbn") String isbn)
//	{
//		return bookService.deleteById(isbn);
//	}
	
	
	
}
