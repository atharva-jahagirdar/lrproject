package com.example.springhibernatejpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springhibernatejpa.model.StudentContact;
import com.example.springhibernatejpa.repository.StudentContactRepository;

@RestController
@RequestMapping("/contact")
public class StudentContactController {

	@Autowired
	StudentContactRepository studentContactRepository;
	
	@GetMapping(value="/getall")
	public List<StudentContact> getAll()
	{
		return studentContactRepository.findAll();
	}
	
	@PostMapping(value="/update/{id}")
	public String update(@RequestBody StudentContact studentContact)
	{
		 studentContactRepository.save(studentContact);
		 return "Student contact is saved";
	}
}
