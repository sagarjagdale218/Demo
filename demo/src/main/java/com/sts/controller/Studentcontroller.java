package com.sts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sts.entity.Student;
import com.sts.service.Studentservice;

@RestController
public class Studentcontroller {

	@Autowired 
	private Studentservice ss;
	
	@GetMapping("/getall")
	public Iterable<Student>getStudent(){
		return this.ss.listAll();
	}
		
	@PostMapping("/save")
	private long saveStudent(@RequestBody Student student) {
		ss.update(student);
		return student.getId();
	}
	

	@GetMapping("/student/{id}")  
	private Student getBooks(@PathVariable(name = "id") int id)  
	{  
	return this.ss.getStudentById(id);  
	}
	
	@PutMapping("/edit/{id}")
    private Student update(@RequestBody Student students ,@PathVariable int id)  
    {  
		students.setId(id);
        ss.update(students);  
       return students;  
    }  
	@DeleteMapping("/{id}")
	private String delete(@PathVariable(name = "id") int id) {
		this.ss.delete(id);
		return "deleted";
	}

	
	
}
