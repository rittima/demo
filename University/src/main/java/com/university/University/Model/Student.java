package com.university.University.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection="Student")
public class Student {

	
	@Id
	Long enrollId;
	String name;
	Subject subject;
	int totalScore;
	
	public Student(Long enrollId, String name, Subject subject, Integer totalScore) {
		super();
		this.enrollId = enrollId;
		this.name = name;
		this.subject = subject;
		this.totalScore = totalScore;
		
	}
	
	
	public Student() {
		super();
	}


	public Long getEnrollId() {
		return enrollId;
	}
	public void setEnrollId(Long enrollId) {
		this.enrollId = enrollId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Subject getSubject() {
		return subject;
	}
	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	public Integer getTotalScore() {
		return totalScore;
	}
	public void setTotalScore(Integer totalScore) {
		this.totalScore = totalScore;
	}


	@Override
	public String toString() {
		return "Student [enrollId=" + enrollId + ", name=" + name + ", subject=" + subject + ", totalScore="
				+ totalScore + "]";
	}
	
	
	
}
