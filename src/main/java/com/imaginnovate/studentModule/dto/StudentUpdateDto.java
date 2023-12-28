package com.imaginnovate.studentModule.dto;

import java.util.Date;

import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.sun.istack.NotNull;


public class StudentUpdateDto {
	Long Id;
	//@NotEmpty(message="FirstName cant be empty")
	@Size(min=3,message = "First Name must be at least 3 characters long")
	 String firstName;
	
	//@NotEmpty(message="Lastname cant be empty")
	@Size(min=3,message = "Last Name must be at least 3 characters long")
	 String lastName;
	
	//@NotEmpty(message="DOB should be in DD-MM-YYYY format")
	 String dob;
	
	//@NotEmpty(message="Section Cannot be empty")
	@Pattern(regexp = "^[A-C]*$" , message="Gender should be A/B/C")
	 String section;
	
	@Pattern(regexp = "^[MF]*$" , message="Gender should be M/F")
	//@NotEmpty(message="Gender Cannot be empty")
	 String gender;
	
	@Max(100)
	@Min(0)
	@NotNull
	 Integer marks1;
	@Max(100)
	@Min(0)
	@NotNull
	Integer marks2;
	@Max(100)
	@Min(0)
	@NotNull()
	Integer marks3;
	
	//to get calculated autometically
	 Integer total;
	 Double average;
	 String result;
	 
	 
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getMarks1() {
		return marks1;
	}
	public void setMarks1(int marks1) {
		this.marks1 = marks1;
	}
	public int getMarks2() {
		return marks2;
	}
	public void setMarks2(int marks2) {
		this.marks2 = marks2;
	}
	public int getMarks3() {
		return marks3;
	}
	public void setMarks3(int marks3) {
		this.marks3 = marks3;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public Double getAverage() {
		return average;
	}
	public void setAverage(Double average) {
		this.average = average;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public StudentUpdateDto(Long id, String firstName, String lastName, String dob, String section, String gender,
			int marks1, int marks2, int marks3, int total, Double average, String result) {
		super();
		Id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		this.section = section;
		this.gender = gender;
		this.marks1 = marks1;
		this.marks2 = marks2;
		this.marks3 = marks3;
		this.total = total;
		this.average = average;
		this.result = result;
	}
	public StudentUpdateDto() {
		super();
		// TODO Auto-generated constructor stub
	}
}
