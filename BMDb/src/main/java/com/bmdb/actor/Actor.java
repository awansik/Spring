package com.bmdb.actor;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Actor {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;
		private String name;
		private String gender;
		private LocalDate birthDate;

public Actor(int id, String name, String gender, LocalDate birthDate) {
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.birthDate = birthDate;
	}

public Actor() {
}

public Actor(String name, String gender, LocalDate birthDate) {
	this.name = name;
	this.gender = gender;
	this.birthDate = birthDate;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getGender() {
	return gender;
}

public void setGender(String gender) {
	this.gender = gender;
}

public LocalDate getBirthDate() {
	return birthDate;
}

public void setBirthDate(LocalDate birthDate) {
	this.birthDate = birthDate;
}

@Override
public String toString() {
	return "Actor [id=" + id + ", name=" + name + ", gender=" + gender + ", birthDate=" + birthDate + "]";
}

		
}
