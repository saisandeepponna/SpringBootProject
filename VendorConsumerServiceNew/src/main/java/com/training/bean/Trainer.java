package com.training.bean;




//import javax.persistence.*;

import lombok.*;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode

//@Entity
public class Trainer{ 
  //  @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
	private int trainercode;
    //@Column
	private String name;

	private String email;
	private long mobileno;
	private String password;
	private String skillset;
	
	
}
