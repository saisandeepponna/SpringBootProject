package com.training.interfaces;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.training.bean.Trainer;


@FeignClient(name="trainereurekaclient", url="localhost:8060")
//@RibbonClient(name="ribbonclient")
public interface MyFeignClient {
	
	@GetMapping("/trainer/api/gettrainerbyskillset/skillset/{skillset}")
	public List<Trainer> getTrainersBySkillset(@PathVariable("skillset") String skillset);
    

	
	
	@DeleteMapping("/deletebyid/trainercode/{trainercode}")
	public boolean deleteById(@PathVariable("trainercode") int trainerCode);






	
}
