package com.example.demo.test;

import static javax.persistence.GenerationType.AUTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TestDTO {

	private int projectno;
	private String email;
	private String pwd;
	
	
}
