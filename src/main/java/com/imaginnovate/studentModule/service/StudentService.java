package com.imaginnovate.studentModule.service;

import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imaginnovate.studentModule.dto.StudentDto;
import com.imaginnovate.studentModule.entity.StudentEntity;
import com.imaginnovate.studentModule.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	StudentRepository sr;
	public StudentEntity createStudent(StudentDto sd) throws ParseException{
		int total=sd.getMarks1()+sd.getMarks2()+sd.getMarks3();
		sd.setTotal(total);
		sd.setAverage(Double.valueOf(sd.getTotal())/3);
		if(sd.getMarks1()<35||sd.getMarks2()<35||sd.getMarks3()<35){
			sd.setResult("Fail");
		}else{
			sd.setResult("Pass");
		}
		StudentEntity se=sr.save(new StudentEntity(sd));
		return se;
		
	}
	public List<StudentEntity> getAllStudents() {
		// TODO Auto-generated method stub
		return sr.findAll();
	}
}
