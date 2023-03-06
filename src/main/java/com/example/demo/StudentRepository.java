package com.example.demo;

import java.util.List;
import java.util.Set;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer> {

	@Query("select std from Student std")
	public List<Student> getAllStudent();
	
	@Query("select new com.example.demo.StudentDto(st.id,sch.schoolName ,st.name, st.lastName,sch as school,tech.teacherName) from Student st join School sch ON st.id=sch.id, Teacher tech where st.id IN ?1")
	public List<StudentDto> getStudentRecords(Set<Integer> id);
}
