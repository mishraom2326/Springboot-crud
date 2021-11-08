package com.apple.iphone13;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
/*
 * author :om mishra
 */
@Service
public class StudentService {
@Autowired
StudentRepo studentRepo;

public List<Student> getAll(){
	List<Student> st=studentRepo.findAll();
	if (st.size()>0) {
	return st;
	}
	else
		return new ArrayList<Student>();
}

public Student getDetailsById(long personid) {
	return studentRepo.findById(personid).get();
	
}

public void addupdate(Student student) {
	studentRepo.save(student);
}

public ResponseEntity<Object> update(Student student,long personid) {
	Optional<Student> so=studentRepo.findById(personid);
	if(!so.isPresent()) {
		return ResponseEntity.notFound().build();
	}
	student.setPersonid(personid);
	studentRepo.save(student);
	return ResponseEntity.noContent().build();	
}
}
