package com.day02.assignment06;

public class UserType {
	String name;

	public UserType(String name) {
		super();
		this.name = name;
	}
	
	public UserType()
	{
		this("Student");
	}
	
	public static void main(String[] args) {
		UserType us1 = new UserType("Faculty");
		UserType us2 = new UserType();
		
		System.out.println(us1.name);
		System.out.println(us2.name);
	}
}
