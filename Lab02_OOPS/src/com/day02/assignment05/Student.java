package com.day02.assignment05;

public class Student {
		private int studentId;
		private char studentType;
		
		Student()
		{
			studentId = 10;
			studentType = 'F';
		}
		
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
		
		public static void main(String[] args) {
			Student student = new Student();
			System.out.println(student.getStudentId());
			System.out.println(student.getStudentType());
		}

}
