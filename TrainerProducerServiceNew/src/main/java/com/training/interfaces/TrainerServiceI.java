package com.training.interfaces;

import java.util.List;

import com.training.bean.Trainer;

public interface TrainerServiceI
{
	List<Trainer> findAll();
	String addTrainer(Trainer trainer);
	String updateMobile(long mobileno,int trainercode);
	List<Trainer> getTrainerByTrainerCode(int trainercode);
	List<Trainer> getTrainerBySkillset(String skillset);
	String loginUser(String email,String password);
//	List<Trainer> getAllTrainersByCodePattern(String pattern);
}