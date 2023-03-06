package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	@Autowired
	private StudentService serive;

	@GetMapping("/getUserDetails")
	public ResponseEntity<List<Student>> getdata() {

		return new ResponseEntity <List<Student>>(serive.getData(), HttpStatus.OK);
	}
	
	@PostMapping("/sendDataStudnet")
	public ResponseEntity<Student> saveDataStudent(@RequestBody Student student){
		
		return new ResponseEntity<Student> (serive.saveData(student),HttpStatus.OK);
	}
	
	@GetMapping("/getAllRecords")
	public ResponseEntity<List<StudentDto>> getAllRecords(){
		return new ResponseEntity<List<StudentDto>> (serive.getStudentRecords(),HttpStatus.OK);
	}
	
}
