package com.training.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.bean.Trainer;
import com.training.interfaces.MyFeignClient;
import com.training.repo.VendorRepo;

@Service
public  class VendorService implements MyFeignClient {
	List<Trainer> trainer1;

	@Autowired
	VendorRepo vendorRepo;
	
	public List<Trainer> getTrainersBySkillset(String skill){ 
		trainer1=vendorRepo.findBySkill(skill);
		return trainer1; }

	@Override
	public boolean deleteById(int trainerCode) {
		Trainer trainer=vendorRepo.findByTrainercode(trainerCode);
		if(trainer!=null) {
			vendorRepo.delete(trainer); 
			return true;
		}
		return false;
	}
}
