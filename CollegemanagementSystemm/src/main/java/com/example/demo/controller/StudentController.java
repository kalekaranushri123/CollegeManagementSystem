package com.example.demo.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;

@RestController
@RequestMapping("api/v2")
public class StudentController {
	
	@Autowired
	private StudentRepository studentRepository;
	
	//get all students
	
	@GetMapping("/students")
	public List<Student> getAllStudents(){
		return studentRepository.findAll();
		
	}

}
