package com.university.University.Model;

public class Subject {

	
	int math;
	int english;
	int computer;
	public Subject(int math, int english, int computer) {
		super();
		this.math = math;
		this.english = english;
		this.computer = computer;
	}
	public Subject() {
		super();
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getEnglish() {
		return english;
	}
	public void setEnglish(int english) {
		this.english = english;
	}
	public int getComputer() {
		return computer;
	}
	public void setComputer(int computer) {
		this.computer = computer;
	}
	@Override
	public String toString() {
		return "Subject [math=" + math + ", english=" + english + ", computer=" + computer + "]";
	}
	
	
}
