package com.day02.assignment04;

public class Student {
	private int studentId;
	private char studentType;
	
	void setStudentId(int id) {
		studentId = id;
	}
	void setStudentType(char type) {
		if(type != 'F' && type != 'L')
		{
			System.out.println("Wrong Type Input!");
			return;
		}
		studentType = type;
	}
	int getStudentId() {
		return studentId;
	}
	char getStudentType() {
		return studentType;
	}
}
