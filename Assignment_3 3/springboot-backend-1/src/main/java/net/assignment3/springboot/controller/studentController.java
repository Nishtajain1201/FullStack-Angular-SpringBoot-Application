package net.assignment3.springboot.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.assignment3.springboot.exception.ResourseNotFoundException;
import net.assignment3.springboot.model.student;
import net.assignment3.springboot.repository.studentRepo;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1/")
public class studentController {
	@Autowired
	private studentRepo StudentRepo;
	
		// get all students
		@GetMapping("/students")
		public List<student> getAllstudents(){
			return StudentRepo.findAll();
		}		
		
		// create student rest api
		@PostMapping("/students")
		public student createstudent(@RequestBody student student) {
			return StudentRepo.save(student);
		}

}
