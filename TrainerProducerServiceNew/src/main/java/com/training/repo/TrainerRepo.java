package com.training.repo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.training.bean.Trainer;

@Repository
public interface TrainerRepo extends JpaRepository<Trainer, String> {
	
	
    @Query("select t from Trainer t where t.trainercode=:trainercode")
	public List<Trainer> findByTrainercode(@Param("trainercode") int trainercode);

	
	@Query("select t from Trainer t where t.email =:email and t.password=:password")
	public List<Trainer> userLogin(@Param("email") String email,@Param("password") String password);
	
	@Query("select n from Trainer n where n.skillset like %:skillset%")
	public List<Trainer> findTrainerBySkillset(@Param("skillset") String skillset);
	
//	@Query("select name,email,mobileno from Trainer where skillset=:skillset")
//	public List<String> findTrainerBySkillset(@Param("skillset") String skillset);
	


	
	@Transactional
	@Modifying
	@Query("update Trainer t set t.mobileno=:mobileno where t.trainercode=:trainercode")
	public int updateMobileno(@Param("mobileno") long mobileno,@Param("trainercode") int trainercode);
		
	
	
}
	