package com.example.demo;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataLocationNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

	@Autowired
	private StudentRepository repo;

	public List<Student> getData() {

		return repo.getAllStudent();
	}

	public Student saveData(Student student) {
		return repo.save(student);

	}

	public List<StudentDto> getStudentRecords() {
		
		Set<Integer> id=new HashSet<Integer> ();
		
		id.add(1);
		id.add(2);
		
		List<StudentDto> allStudent = repo.getStudentRecords(id);

		if (allStudent == null) {
			throw new ConfigDataLocationNotFoundException(null, "sorry data not found", null);
		} else {
			

			return allStudent;
		}
	}

}
