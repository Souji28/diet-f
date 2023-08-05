package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRegisterRepo extends JpaRepository<StudentRegistration,Integer> {

}
