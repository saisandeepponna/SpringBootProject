package com.training.interfaces;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.training.bean.Trainer;


@FeignClient(name="eureka-client-trainer-producer")
@RibbonClient(name="ribbonclient")
public interface MyFeignClient {
	
	@GetMapping("/trainer/api/gettrainerbyskillset/skillset/{skillset}")
	public Trainer getTrainersBySkillset(@PathVariable("skillset") String skillset);

}
