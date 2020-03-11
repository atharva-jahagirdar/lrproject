package com.example.springhibernatejpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springhibernatejpa.model.StudentContact;

@Repository
public interface StudentContactRepository extends JpaRepository<StudentContact, Long> {

}
