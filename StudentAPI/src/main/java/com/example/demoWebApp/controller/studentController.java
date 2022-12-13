package com.example.demoWebApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoWebApp.model.student;
import com.example.demoWebApp.service.studentService;

@RestController
@RequestMapping("/student")
public class studentController {
	
	@Autowired
	studentService stuSer;
	
	@PostMapping("/add")
	public ResponseEntity<String> add(@RequestBody student s)
	{
		stuSer.saveStudent(s);
		return new ResponseEntity<>("Student details inserted successfully!.....", HttpStatus.OK);
	
	}
	
	@GetMapping("/view")
	public List<student> getStudent()
	{
		return stuSer.listAllStudent();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<student> getStudentID(@PathVariable Integer id)
	{
		return new  ResponseEntity<student>(stuSer.getStudent(id),HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteStudent(@PathVariable Integer id)
	{
		stuSer.deleteStudent(id);
		return new ResponseEntity<String>("Student deleted successfully!!............",HttpStatus.OK);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<student> updateStudent(@PathVariable Integer id,@RequestBody student s)
	{
		return new ResponseEntity<student>(stuSer.updateStudent(s, id),HttpStatus.OK);
	}
	
	
	

}
