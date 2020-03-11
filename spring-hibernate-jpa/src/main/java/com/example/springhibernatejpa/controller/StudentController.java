package com.example.springhibernatejpa.controller;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springhibernatejpa.model.Student;
import com.example.springhibernatejpa.repository.StudentRepository;

@RestController
@RequestMapping(value="/rest")
public class StudentController {
	
	@Autowired
	StudentRepository studentRepository;
	
	@GetMapping(value= "/all")
	public List<Student> findALL()
	{
		return studentRepository.findAll();
	}
	
	@GetMapping("/name/{name}")
	public List<Student> getStudent(@PathVariable("name")final String name)
	{
		return studentRepository.findByName(name);
	}
	
	/*@GetMapping("/id/{id}")
	public Student getStudentId(@PathVariable("id") Long id)
	{
		return studentRepository.findOne(id);
	
		
	}
	
	@GetMapping("/{id}/{name}")
	public Student update(@PathVariable("id")final Long id,@PathVariable("name") final String name)
	{
		Student student = getStudentId(id);
		student.setName(name);
		
		return studentRepository.save(student);
	}*/
		
	
	
	

}
