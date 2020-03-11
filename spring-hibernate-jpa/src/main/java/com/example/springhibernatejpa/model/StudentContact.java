package com.example.springhibernatejpa.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="contact")
public class StudentContact {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	public StudentContact() {
		super();
		// TODO Auto-generated constructor stub
	}

	private Long phoneno;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="id",referencedColumnName = "id")
	private Student student;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(Long phoneno) {
		this.phoneno = phoneno;
	}
	
	
}
 