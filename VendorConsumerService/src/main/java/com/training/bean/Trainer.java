package com.training.bean;

import lombok.*;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode


public class Trainer{ 

	private int trainercode;

	private String name;

	private String email;
	private long mobileno;
	private String password;
	private String skillset;
	
	
}
