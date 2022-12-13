package com.example.demoWebApp.entity;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	
	@GetMapping("/student")
	public Student getStudent()
	{
		return new Student("Parthi","rahi","parthi@gmail.com");
	}
	
	@GetMapping("/list-of-students")
	public List<Student> getStudentList()
	{
		List<Student> student=new ArrayList<>();
		student.add(new Student("Parthi","rahi","parthi@gmail.com"));
		student.add(new Student("Ram","ravi","ram@gmail.com"));
		student.add(new Student("Priya","sweety","priya@gmail.com"));
		student.add(new Student("Swathi","rahi","swathi@gmail.com"));
		student.add(new Student("Aarthi","Rose","Aarthi@gmail.com"));
		student.add(new Student("Peter","John","peter@gmail.com"));
		
		return student;
	}
	
	@GetMapping("/{firstName}/{lastName}/{email}")
	public Student getStudentPath(@PathVariable("firstName") String firstName,@PathVariable("lastName") String lastName,@PathVariable("email") String email)
	{
		return new Student(firstName,lastName,email);
	}

	
	@GetMapping("/student/query")
	public Student getStudentRequestParam(@RequestParam("firstName") String firstName,@RequestParam("lastName") String lastName,@RequestParam("email") String email)
	{
		return new Student(firstName,lastName,email);
	}

}

