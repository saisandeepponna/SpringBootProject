package com.training.controllers;


import org.springframework.beans.factory.annotation.Autowired;
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
	
	//http://localhost:8093/customer/api/getpbook/isbn/456/qty/10
	@GetMapping("/gettrainersbyskillsetfeign/skillset/{skillset}")
	public Trainer getTrainersBySkillset(@PathVariable("skillset") String skillset)
	{
		Trainer getTrainer = myFeignClient.getTrainersBySkillset(skillset);
		return getTrainer;
	}
	
	
	
}
