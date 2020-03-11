package com.example.springhibernatejpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springhibernatejpa.model.Teacher;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Long>{

	Teacher findByName(String name);

	//Teacher findOne(Long id);

}
