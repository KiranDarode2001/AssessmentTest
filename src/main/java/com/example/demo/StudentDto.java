package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Getter
@Setter
@NoArgsConstructor
public class StudentDto extends TeacherDto {
	private Integer id;
	private String  schoolName;
	private String name;
	private String lastName;
	private School school;
	public StudentDto(Integer id, String schoolName, String name, String lastName, School school,String teacherName) {
		super(teacherName);
		this.id = id;
		this.schoolName = schoolName;
		this.name = name;
		this.lastName = lastName;
		this.school = school;
	}
	
	
}
