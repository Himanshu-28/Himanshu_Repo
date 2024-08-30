package com.day03.assignment04;

public class Student {
		private int studentId;
		private char studentType;
		private String studentName;
		
		Student()
		{
			studentId = 10;
			studentType = 'F';
		}
		
		Student(int id, char type, String fname, String lname)
		{
			this.studentId = id;
			this.studentType = type;
			this.studentName = fname+lname;
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
		
		void setStudentName(String fname, String lname)
		{
			this.studentName = fname+" "+lname;
		}
		
		int getStudentId() {
			return studentId;
		}
		String getStudentName() {
			return studentName;
		}
		char getStudentType() {
			return studentType;
		}
		
		public static void main(String[] args) {
			Student student1 = new Student();
			student1.setStudentId(101);
			student1.setStudentName("Himanshu", "Sharma");
			student1.setStudentType('F');
			System.out.println(student1.getStudentId());
			System.out.println(student1.getStudentName());
			System.out.println(student1.getStudentType());
			
			Student student2 = new Student(102,'D', "Nikhil", "Kunte");
			System.out.println(student2.getStudentId());
			System.out.println(student2.getStudentName());
			System.out.println(student2.getStudentType());
			
		}

}
