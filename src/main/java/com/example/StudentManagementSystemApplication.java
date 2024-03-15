package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.entity.Student;
import com.example.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements  CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	
	@Autowired
	private StudentRepository studentRepository;
	/**
	 *
	 */
	@Override
	public void run(String... args) throws Exception {
		
		
		
//		  Student student1 = new Student("Ramesh", "R", "ramesh@gmail.com"); Student
//		  student2 = new Student("Supreeth", "J", "j@gmail.com"); Student student3 =new
//		  Student("Chandra Sekhar", "k", "k@gmail.com"); Student student4 = new
//		  Student("Anuj", "s", "@gmail.com"); Student student5 = new
//		  Student("AnkiReddy", "s", "s@gmail.com"); studentRepository.save(student1);
//		  studentRepository.save(student2); studentRepository.save(student3);
//		  studentRepository.save(student4); studentRepository.save(student5);
		 
		 
	}

}
