package com.day02;

public class Assignment03 {
	public static char getGrade(int marks)
	{
		if(marks<=100 && marks >=80)
			return 'A';
		else if(marks<80 && marks>72)
			return 'B';
		else if(marks<=72 && marks>=65)
			return 'C';
		else if(marks<=64 && marks>=55)
			return 'D';
		else if(marks<55 && marks>=0)
			return 'E';
		else
			return 'F';
		
	}
	public static void main(String[] args) {
		int marks = 1001;
		System.out.println(getGrade(marks)=='F'?"Grade does not exist!":getGrade(marks));
	}
}
