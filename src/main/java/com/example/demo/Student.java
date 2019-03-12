package com.example.demo;

import java.util.Collection;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "student_exams")
public class Student {

	@Id
	private String id;
	private String name;
	private Integer age; 
	private Collection<Exam> exams;
	
	public Student() {
		super();
	}

	public Student(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Collection<Exam> getExams() {
		return exams;
	}

	public void setExams(Collection<Exam> exams) {
		this.exams = exams;
	}
	
	
}
/*
@Document注解映射了模型和MongoDB的文档，其中collection属性
表明了MongoDB中使用的文档名称；而@Id注解表明了该属性为文档的Id。*/
