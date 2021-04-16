package com.training.controllers;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.training.bean.Trainer;
import com.training.interfaces.TrainerServiceI;


@Configuration
@RestController
@RequestMapping("/trainer/api")
public class TrainerProducerController {


//	@Value("${usernotfoundmessage}")
//	public String usernotfoundmessage;
	@Autowired
	private TrainerServiceI trainerService;
	
	@GetMapping("/gettrainer")
	public List<Trainer> getTrainers()
	{
		return trainerService.findAll();
	}

	
	@GetMapping("/validate/email/{email}/password/{password}")
	public String validateUser(@PathVariable("email") String email,@PathVariable("password") String password)
	{
		
		return trainerService.loginUser(email,password);
	}
	
	@PostMapping("/addtrainer")
	public String addTrainer(@RequestBody Trainer trainer)
	{
		return trainerService.addTrainer(trainer);
	}
	
	@GetMapping("/gettrainerbyskillset/skillset/{skillset}")
	public List<Trainer> getTrainerBySkillset(@PathVariable("skillset") String skillset)
	{
		return trainerService.getTrainerBySkillset(skillset);
	}
	
	@GetMapping("/gettrainerbytrainercode/trainercode/{trainercode}")
	public List<Trainer> getTrainerByTrainercode(@PathVariable("trainercode") int trainercode)
	{
		return trainerService.getTrainerByTrainerCode(trainercode);
	}
	
	
	@GetMapping("/updatemobileno/mobileno/{mobileno}/trainercode/{trainercode}")
	public String UpdateMobileno(@PathVariable long mobileno,@PathVariable int trainercode )
	{
		return trainerService.updateMobile(mobileno,trainercode);
	}
	
}




