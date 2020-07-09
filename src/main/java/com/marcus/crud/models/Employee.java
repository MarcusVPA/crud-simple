package com.marcus.crud.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.sun.istack.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@NotNull
	private String cpf;
	@NotNull
	private String name;
	@NotNull
	private String birthday;
	@NotNull
	private String nationality;
	@NotNull
	private String address;
	@NotNull
	private String phone;
	@NotNull
	private String sex;
	@NotNull
	private String profession;
	@NotNull
	private String active;
	
}