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
public class User {		
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
	private int id;
    @NotNull
    private String firstname;
    @NotNull
    private String lastname;
    @NotNull
	private String username;
    @NotNull
	private String password;
	
}
