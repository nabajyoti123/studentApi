package com.imaginnovate.studentModule.controler;

import java.text.ParseException;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.imaginnovate.studentModule.dto.StudentBasicDto;
import com.imaginnovate.studentModule.dto.StudentUpdateDto;
import com.imaginnovate.studentModule.entity.StudentEntity;
import com.imaginnovate.studentModule.exception.InvalidDOBException;
import com.imaginnovate.studentModule.service.StudentService;

@RestController
@RequestMapping(value = "/v1/student")
public class StudentController {

	@Autowired
    private StudentService studentService;

//	@PostMapping("/create")
//	public StudentEntity createStudent(StudentDto sd){
//		
//	}
	
	@PostMapping(value = "/create", consumes = { "application/xml", "application/json" })
	public ResponseEntity<StudentEntity> createStudent(@Valid @RequestBody StudentBasicDto studDto) throws ParseException, InvalidDOBException {
		StudentEntity savedStudent = studentService.createStudent(studDto);
		return new ResponseEntity<StudentEntity>(savedStudent, HttpStatus.OK);
	}
	
	@GetMapping(value = "/getall", consumes = { "application/xml", "application/json" })
	public ResponseEntity<List<StudentEntity>> getallStudent() throws ParseException {
		List<StudentEntity> savedStudent = studentService.getAllStudents();
		return new ResponseEntity<List<StudentEntity>>(savedStudent, HttpStatus.OK);
	}
	
	@PutMapping(value = "/update/{id}", consumes = { "application/xml", "application/json" })
	public ResponseEntity<StudentEntity> updateStudent(@Valid @RequestBody StudentUpdateDto studDto,@PathVariable(value = "id") Long id) throws ParseException, InvalidDOBException {
		StudentEntity savedStudent = studentService.updateStudent(studDto,id);
		return new ResponseEntity<StudentEntity>(savedStudent, HttpStatus.OK);
	}
}
