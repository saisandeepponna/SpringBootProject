package com.training.bean;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode

@Entity
public class Trainer { 
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int trainercode;
	@Column
	private String name;

	private String email;
	private long mobileno;
	private String password;
	private String skillset;
	
	
}
