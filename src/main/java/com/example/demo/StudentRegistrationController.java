package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
@CrossOrigin(origins="*")

public class StudentRegistrationController {
	@Autowired
	StudentRegisterRepo repo;
	@PostMapping("/student/reg")
	public String studentRegistration(@RequestBody StudentRegistration student) {
		repo.save(student);
		return "succussfully added";
	}


}
