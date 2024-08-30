package com.day01;

public class Assignment07 {
	public static void main(String[] args) {
		boolean bool1 = false;
		boolean bool2 = true;
		boolean bool3 = true;
		
		if((bool1=true) && (bool3 && bool2))
			System.out.println("Success");
		else
			System.out.println("Failure");
		System.out.println("Bool2 value - "+bool2);
	}
}