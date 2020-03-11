package com.example.springhibernatejpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springhibernatejpa.model.Teacher;
import com.example.springhibernatejpa.repository.TeacherRepository;

@RestController
@RequestMapping("/teacher")
public class TeacherController {

	@Autowired
	TeacherRepository teacherRepository;
	
	@GetMapping(value="/teacher/get")
	public List<Teacher> getAll()
	{
		return teacherRepository.findAll();
	}
	@GetMapping(value="/teacher/getByName/{name}")
	public Teacher getByName(@PathVariable("name") String name)
	{
		return teacherRepository.findByName(name);
	}
	
	/*@GetMapping(value="/id/{id}")
	public Teacher getTeacherId(@PathVariable("id") Long id)
	{
		return teacherRepository.findOne(id);
	}*/
	
	@PostMapping(value="{id}/{name}")
	public String update(@RequestBody Teacher teacher )
	{
		 teacherRepository.save(teacher);
		 return "teacher is saved";
	}
	@DeleteMapping("/delete/{id}")
	public String deleteTeacherId(@PathVariable Long id)
	{
		teacherRepository.deleteById(id);
		return "teacher deleted with id is -:"+id;
	}
	
}
