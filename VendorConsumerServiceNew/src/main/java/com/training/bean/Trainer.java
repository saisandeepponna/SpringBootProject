package com.training.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.*;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Entity
public class Trainer{ 
    @Id
	private int trainercode;
    @Column
	private String name;

	private String email;
	private long mobileno;
	private String password;
	private String skillset;


}
