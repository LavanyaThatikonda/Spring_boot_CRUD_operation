package com.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.student.entity.Student;
import com.student.repository.StudentRepository;

@RestController
public class Home {
	@Autowired
	private StudentRepository studentrepository;
	@GetMapping("/index")
	public String index() {
		return "welcome to springboot";
	}
	@PostMapping("/save")
	public Student sava(@RequestBody Student student) {
		
		studentrepository.save(student);
		return student;
		
	}
	@GetMapping("/get")
	public List<Student>getAll(){
		List<Student>studentList=studentrepository.findAll();
		return studentList;
	}
	@DeleteMapping("/delete/{roll_number}")
	public String deleteStudent(@PathVariable int roll_number) {
	Student student =studentrepository.findById(roll_number).get();
	if(student!=null)
		studentrepository.delete(student);
	return "Deleted Sucessfully";
}
	@PutMapping("/update")
	public Student updateStudentData(@RequestBody Student student) {
		studentrepository.save(student);
		return student;
	}
}
