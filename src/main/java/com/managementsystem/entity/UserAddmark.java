package com.managementsystem.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="addmarkdetails")
public class UserAddmark {
	
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	@Column(name="id")
	private Long id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="regnumber")
	private String regnumber;

    @Column(name = "paper_m")
    private Integer major;

    @Column(name = "paper_a")
    private Integer allied;

    @Column(name = "paper_ma")
    private Integer maths;

    

    @Column(name = "paper_e")
    private Integer english;

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

	

	public Integer getEnglish() {
		return english;
	}

	public void setEnglish(Integer english) {
		this.english = english;
	}

	
	
}
