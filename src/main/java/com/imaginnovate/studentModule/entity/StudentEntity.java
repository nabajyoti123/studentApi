package com.imaginnovate.studentModule.entity;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import javax.persistence.*;

import com.imaginnovate.studentModule.dto.StudentDto;



@Entity
@Table(name = "Students")
public class StudentEntity {
	 @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	Long Id;
	 String firstName;
	 String lastName;
	 Date dob;
	 String section;
	 String gender;
	 Integer marks1;
	 Integer marks2;
	 Integer marks3;
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
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
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
	public StudentEntity(Long id, String firstName, String lastName, Date dob, String section, String gender,
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
	
	public StudentEntity(StudentDto sd) throws ParseException {
		super();
		this.firstName = sd.getFirstName();
		this.lastName = sd.getLastName();
		
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
		this.dob = formatter.parse(sd.getDob());;
		this.section = sd.getSection();
		this.gender = sd.getGender();
		this.marks1 = sd.getMarks1();
		this.marks2 = sd.getMarks2();
		this.marks3 = sd.getMarks3();
		this.total = sd.getTotal();
		this.average = sd.getAverage();
		this.result = sd.getResult();
	}
	public StudentEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
}
