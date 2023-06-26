package com.university.University.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.university.University.Model.Student;
import com.university.University.repo.StudentRepo;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	StudentRepo repo;
	

	@PostMapping("/add")
	public String addStudent(@RequestBody Student student) 
	{
		repo.save(student);
		return "Student is added with id : "+student.getEnrollId();
}
	
	@GetMapping("/getAll")
	public List<Student>getStudents(){
		return repo.findAll();
	}
	
	@GetMapping("/getById/{id}")
	public Optional<Student>getStudent(@PathVariable Long id) {
		return repo.findById(id);		
	}
	
	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable Long id) {
		repo.deleteById(id);
		return "student is deleted with id : "+id;
	}
}
	
	
	
	
	
	
	
	
	
	