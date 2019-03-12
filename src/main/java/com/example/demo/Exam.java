package com.example.demo;

public class Exam {

	private String course;
	private Integer score;
	
	public Exam() {
		super();
	}

	public Exam(String course, Integer score) {
		super();
		this.course = course;
		this.score = score;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}
	
	
}
