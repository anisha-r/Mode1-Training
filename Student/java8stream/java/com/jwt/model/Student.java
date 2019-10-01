package com.jwt.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student implements Serializable {

	private static final long serialVersionUID = -3465813074586302847L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column
	private int rollNum;

	@Column
	private String sName;

	@Column
	private int age;

	@Column
	private String gender;
	
	@Column
	private String country;
	
	@Column
	private Date dateofJoin;
	
	@Column
	private float fScore;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getRollNum() {
		return rollNum;
	}

	public void setRollNum(int rollNum) {
		this.rollNum = rollNum;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Date getDateofJoin() {
		return dateofJoin;
	}

	public void setDateofJoin(Date dateofJoin) {
		this.dateofJoin = dateofJoin;
	}

	public float getfScore() {
		return fScore;
	}

	public void setfScore(float fScore) {
		this.fScore = fScore;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	

	

	
	

}