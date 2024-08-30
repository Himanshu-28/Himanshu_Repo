package com.day05.assignment02.registrationpack;

import com.day05.assignment01.courseregistration.Student;

public class DayScholar extends Student {

	private String residentialAddress;

	public String getResidentialAddress() {
		return residentialAddress;
	}

	public void setResidentialAddress(String residentialAddress) {
		this.residentialAddress = residentialAddress;
	}
	public void getDetails() {
		System.out.println("Student ID :"+studentId);
		System.out.println("Student Type :"+studentType);
		System.out.println("Student Name :"+studentName);
		
	}
	
}
