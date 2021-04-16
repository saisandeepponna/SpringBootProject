package com.training.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.training.bean.Trainer;
import com.training.interfaces.TrainerServiceI;
import com.training.repo.TrainerRepo;



@Service
public class TrainerService implements TrainerServiceI {

	@Autowired
	private TrainerRepo trainerRepo;
	@Value("${usernotfoundmessage}")
	public String usermessage;
	@Value("${useradd}")
	public String useradd;
	@Value("${nodata}")
	public String nodata;
	@Override
	public List<Trainer> findAll() {
			return trainerRepo.findAll();
	}

	@Override
	public String addTrainer(Trainer trainer) {
		Trainer t= trainerRepo.save(trainer);
		if(t instanceof Trainer) {
			return useradd;
		}
		return "USER NOT ADDED";
	}

	@Override
	public List<Trainer> getTrainerBySkillset(String skillset) {
		
		return trainerRepo.findTrainerBySkillset(skillset);
	}

	@Override
	public String loginUser(String email, String password) {
		List<Trainer> userList=trainerRepo.userLogin(email, password);
		System.out.println(userList);
		
		for(Trainer t:userList) {
			if(t.getEmail().equals(email) && t.getPassword().equals(password)) {
				return "USER LOGGED IN";
			}
		}
		return usermessage;
		
	}

	
	@Override
	public List<Trainer> getTrainerByTrainerCode(int trainercode) {
		
		return trainerRepo.findByTrainercode(trainercode);
	}

	@Override
	public String updateMobile(long mobileno,int trainercode) {
		
		int number= trainerRepo.updateMobileno(mobileno,trainercode);
	    if(number>0) {
	    	return "Mobile Number Updated";
	    }
	    return nodata;
	}
	
	
	

	
	

}
