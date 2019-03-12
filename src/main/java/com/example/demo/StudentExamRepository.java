package com.example.demo;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentExamRepository extends MongoRepository<Student,String>{

	Student findByAge(Integer age);
}
