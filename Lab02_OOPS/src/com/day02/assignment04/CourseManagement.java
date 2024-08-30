package com.day02.assignment04;

public class CourseManagement {
	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		Student s4 = new Student();
		Student s5 = new Student();
		
		s1.setStudentId(1);
		s1.setStudentType('F');
		
		s2.setStudentId(2);
		s2.setStudentType('F');
		
		s3.setStudentId(3);
		s3.setStudentType('L');
		
		s4.setStudentId(4);
		s4.setStudentType('F');
		
		s5.setStudentId(5);
		s5.setStudentType('L');
		
		System.out.println(s1.getStudentId());
		System.out.println(s1.getStudentType());
		
		System.out.println(s2.getStudentId());
		System.out.println(s2.getStudentType());
		
		System.out.println(s3.getStudentId());
		System.out.println(s3.getStudentType());
		
		System.out.println(s4.getStudentId());
		System.out.println(s4.getStudentType());
		
		System.out.println(s5.getStudentId());
		System.out.println(s5.getStudentType());
	}
}
