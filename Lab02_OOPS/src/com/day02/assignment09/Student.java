package com.day02.assignment09;

public class Student {
	private int studentId;
	private char studentType;
	private String studentName;
	private static int inc = 0;
	
	Student()
	{
		inc += 1;
	}
	
	Student(char sType, String fname, String lname)
	{
		this();
		studentId = 550 + inc;
		studentType = sType;
		studentName = fname+lname;
	}
	
	public void displayDetails(Student obj)
	{
		System.out.println("Student ID - "+obj.studentId);
		System.out.println("Student Name - "+obj.studentName);
		System.out.println("Student Type - "+obj.studentType);
	}
	
	public static void main(String[] args) {
		Student studentOne = new Student('D', "Bony", "Thomas");
		studentOne.displayDetails(studentOne);
		Student studentTwo = new Student('H', "Himanshu", "Sharma");
		studentTwo.displayDetails(studentTwo);
		Student studentThree = new Student('D', "Aditya", "Nayak");
		studentThree.displayDetails(studentThree);
	}
}
