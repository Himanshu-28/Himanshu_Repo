package com.day02.assignment07;

public class Assignment7 {
	public static void passByValue(int sId)
	{
		sId = 10;
		System.out.println("The Student ID in the function is - "+sId);
	}
	public static void passTheValueMethod(Student s)
	{
		s.studentId = 10;
		System.out.println("The Student ID in the function is - "+s.studentId);
	}
	public static void main(String[] args) {
		int sId = 25;
		System.out.println("Before passing it to the function, the Student ID is - "+sId);
		passByValue(sId);
		System.out.println("After passing it to the function, the Student ID is - "+sId);
		
		System.out.println();
		
		Student s = new Student();
		System.out.println("Before passing it to the function, the Student ID is - "+s.studentId);
		passTheValueMethod(s);
		System.out.println("After passing it to the function, the Student ID is - "+s.studentId);
		
	}
}
