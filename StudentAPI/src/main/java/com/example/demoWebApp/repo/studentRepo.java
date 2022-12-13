package com.example.demoWebApp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demoWebApp.model.student;

public interface studentRepo extends JpaRepository<student,Integer> {

}
