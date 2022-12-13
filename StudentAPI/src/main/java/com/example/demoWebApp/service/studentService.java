package com.example.demoWebApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demoWebApp.model.student;
import com.example.demoWebApp.repo.studentRepo;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class studentService {
	
	@Autowired
	private studentRepo repo;
	
	public void saveStudent(student s)
	{
		repo.save(s);
	}
	
	public List<student> listAllStudent()
	{
		return repo.findAll();
	}
	
	public student getStudent(Integer id)
	{
		return repo.findById(id).get();
	}
	
	public void deleteStudent(Integer id)
	{
		repo.deleteById(id);
	}
	
	public student updateStudent(student s,Integer id)
	{
		student existingStudent= repo.findById(id).get();
		
		existingStudent.setId(s.getId());
		existingStudent.setName(s.getName());
		existingStudent.setDept(s.getDept());
		existingStudent.setEmail(s.getEmail());
		existingStudent.setContact(s.getContact());
		
		repo.save(existingStudent);
		return existingStudent;
	}

	
	
	

}
