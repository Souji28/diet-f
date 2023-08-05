package com.example.demo;
import org.hibernate.tool.schema.internal.exec.GenerationTarget;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class StudentRegistration {
	@Id
	@GeneratedValue (strategy=GenerationType.AUTO)
int id;
String name;
String email;
String dob;
String gender;
/**
 * 
 */
public StudentRegistration() {
	super();
	// TODO Auto-generated constructor stub
}
/**
 * @param id
 * @param name
 * @param email
 * @param dob
 * @param gender
 */
public StudentRegistration(int id, String name, String email, String dob, String gender) {
	super();
	this.id = id;
	this.name = name;
	this.email = email;
	this.dob = dob;
	this.gender = gender;
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
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getDob() {
	return dob;
}
public void setDob(String dob) {
	this.dob = dob;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}

}
