package com.sts.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sts.entity.Student;
@Repository
public interface Studentrepository extends CrudRepository<Student, Long> {

	Iterable<Student> findAll();

	//void deleteById(int id);

	Optional<Student> findById(int id);

//	Iterable<Student> findAll();

	
	
}
