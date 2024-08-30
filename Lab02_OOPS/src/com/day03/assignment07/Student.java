package com.day03.assignment07;

public class Student {
	
		private int studentId;
		private String studentName;
		private String residentialStatus;
		private long feesPerMonth;
		
		public int getStudentId() {
			return studentId;
		}

		public String getStudentName() {
			return studentName;
		}

		public String getResidentialStatus() {
			return residentialStatus;
		}

		public long getFeesPerMonth() {
			return feesPerMonth;
		}

		public void setStudentId(int studentId) {
			this.studentId = studentId;
		}

		public void setStudentName(String studentName) {
			this.studentName = studentName;
		}

		public void setResidentialStatus(String residentialStatus) {
			this.residentialStatus = residentialStatus;
		}
		
		public void setFeesPerMonth(long amt) {
			this.feesPerMonth = amt;
		}

		public static void main(String[] args) {
			Student student = new Student();
			student.setStudentId(Integer.parseInt(args[0]));
			student.setStudentName(args[1]);
			student.setResidentialStatus(args[2]);
			student.setFeesPerMonth(Integer.parseInt(args[3])+(int)(args[2].toLowerCase().equals("hostelite")?Integer.parseInt(args[4]):0));
			
			System.out.println("Name - "+student.getStudentName());
			System.out.println("ID - "+student.getStudentId());
			System.out.println("Residential Status - "+student.getResidentialStatus());
			System.out.println("Fee - "+student.getFeesPerMonth());
			
		}

}