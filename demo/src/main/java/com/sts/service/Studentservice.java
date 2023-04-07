package com.sts.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sts.entity.Student;
import com.sts.repository.Studentrepository;

@Service
public class Studentservice {

	@Autowired
	private Studentrepository repo;
//display all records
	public Iterable<Student> listAll(){
		
		return this.repo.findAll();
		
	}
//save
	public void update(Student student) {
		
		repo.save(student);
	}

//get by id
	public Student getStudentById(int id) {
		// TODO Auto-generated method stub
		return this.repo.findById(id).get();  
		
	}


//Edit or update
	public Student get(int id)  
	{  
	return repo.findById(id).get();  
	}
//delete record

	public void delete(int id) {
//		this.repo.deleteById((long) id);
	}

	
	
	
}
