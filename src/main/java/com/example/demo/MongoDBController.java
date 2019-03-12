package com.example.demo;

import java.util.Collection;
import java.util.LinkedHashSet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mongo")
public class MongoDBController {
	Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private StudentExamRepository SERepository;
	
	@RequestMapping("/save")
	public Student save() {
		Student s = new Student("Jack",26);
		Collection<Exam> exams = new LinkedHashSet<>();
		exams.add(new Exam("高等代数",90));
		exams.add(new Exam("线性几何",88));
		exams.add(new Exam("大学英语",95));
		s.setExams(exams);
		return SERepository.save(s);
	}
	
	@GetMapping("/selbyage")
	public Student findByage(Integer age ) {
		logger.info("执行于此了");
		return  SERepository.findByAge(age);
	}
	
	
	
}
