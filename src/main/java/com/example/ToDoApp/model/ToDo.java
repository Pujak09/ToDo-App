package com.example.ToDoApp.model;

//import java.sql.Date;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name="todo")

public class ToDo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private Long id;
	
	@Column
	private String title;
	
	@Column
	@Nonnull
	@DateTimeFormat(pattern = "YYYY-MM-DD")
	private Date date;
	
	private String status;
	
	public ToDo() {
		
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}

	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}
	
	

}
