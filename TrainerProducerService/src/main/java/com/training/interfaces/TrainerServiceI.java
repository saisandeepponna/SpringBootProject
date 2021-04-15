package com.training.interfaces;

import java.util.List;

import com.training.bean.Trainer;

public interface TrainerServiceI
{
	List<Trainer> findAll();
	Trainer addTrainer(Trainer trainer);
	int updateMobile(long mobileno,int trainercode);
	List<Trainer> getTrainerByTrainerCode(int trainercode);
	List<String> getTrainerBySkillset(String skillset);
	boolean loginUser(String email,String password);
//	List<Trainer> getAllTrainersByCodePattern(String pattern);
}