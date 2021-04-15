package com.training.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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

	
	@Override
	public List<Trainer> findAll() {
			return trainerRepo.findAll();
	}

	@Override
	public Trainer addTrainer(Trainer trainer) {
		return trainerRepo.save(trainer);
	}

	@Override
	public List<String> getTrainerBySkillset(String skillset) {
		
		return trainerRepo.findTrainerBySkillset(skillset);
	}

	@Override
	public boolean loginUser(String email, String password) {
		List<Trainer> userList=trainerRepo.userLogin(email, password);
		System.out.println(userList);
		
		for(Trainer t:userList) {
			if(t.getEmail().equals(email) && t.getPassword().equals(password)) {
				return true;
			}
		}
		return false;
		
	}

	
	@Override
	public List<Trainer> getTrainerByTrainerCode(int trainercode) {
		
		return trainerRepo.findByTrainercode(trainercode);
	}

	@Override
	public int updateMobile(long mobileno,int trainercode) {
		
		return trainerRepo.updateMobileno(mobileno,trainercode);
	}
	
	
	

	
	

}
