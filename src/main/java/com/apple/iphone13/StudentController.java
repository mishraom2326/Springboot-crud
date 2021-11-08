package com.apple.iphone13;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/employees")
public class StudentController {
	@Autowired
	StudentService studentService;
@GetMapping("/all")
public ResponseEntity<List<Student>> getDetails() {
	List<Student> list=studentService.getAll();
	return new ResponseEntity<List<Student>>(list,new HttpHeaders(),HttpStatus.OK);
	
}
@GetMapping("/byid/{personid}")
public Student getDetailsById(@PathVariable("personid") long personid) {
	return studentService.getDetailsById(personid) ;
	
}
@PostMapping("/save")
public long savedetails(@RequestBody Student student) {
	 studentService.addupdate(student);
	return student.getPersonid();
}
@PutMapping("/update/{personid}")
public void update(@RequestBody Student student,@PathVariable("personid")long personid) {
	 studentService.update(student, personid);
	
}
}
