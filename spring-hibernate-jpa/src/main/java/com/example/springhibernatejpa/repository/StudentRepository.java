package com.example.springhibernatejpa.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.example.springhibernatejpa.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
	
	public List<Student> findByName(String name);

	//public Student findOne(Long id);
	
	

}
