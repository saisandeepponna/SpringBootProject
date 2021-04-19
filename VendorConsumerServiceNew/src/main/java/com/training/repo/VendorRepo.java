package com.training.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.training.bean.Trainer;

@Repository
public interface VendorRepo extends JpaRepository<Trainer, String> {
	@Query("select t from Trainer t where t.skillset=:skillset")
	List<Trainer>findBySkill(@Param("skillset") String skillset);
	
	@Query("select t from Trainer t where t.trainercode=:trainercode")
	Trainer findByTrainercode(@Param("trainercode") int trainercode);
}
