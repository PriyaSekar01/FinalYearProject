package com.managementsystem.dto;


import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class StudentLoginDto {
	
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	
	private Long id;
	
	
	private String name;
	
	
	private String regnumber;
	
	 
	 private Integer major;

	 
	 private Integer allied;

	 
	 private Integer maths;

	
	 private Integer tamil;

	 
	 private Integer english;

	public Integer getMajor() {
		return major;
	}

	public void setMajor(Integer major) {
		this.major = major;
	}

	public Integer getAllied() {
		return allied;
	}

	public void setAllied(Integer allied) {
		this.allied = allied;
	}

	public Integer getMaths() {
		return maths;
	}

	public void setMaths(Integer maths) {
		this.maths = maths;
	}

	public Integer getTamil() {
		return tamil;
	}

	public void setTamil(Integer tamil) {
		this.tamil = tamil;
	}

	public Integer getEnglish() {
		return english;
	}

	public void setEnglish(Integer english) {
		this.english = english;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRegnumber() {
		return regnumber;
	}

	public void setRegnumber(String regnumber) {
		this.regnumber = regnumber;
	}

}
