package com.day01;

public class Assignment06 {
	public static void main(String[] args) {
		int intVal = 10;
		float floatVal = 0.3f;
		
		boolean bool1 = true;
		boolean bool2 = false;
		boolean bool3 = true;
		
		System.out.println("Arithmetic");
		System.out.println(intVal + " % " + floatVal + " = " + intVal%floatVal);
		System.out.println();
		
		System.out.println("String Concatenation");
		System.out.println("Day " + 2 + " Session");
		System.out.println(""+2+", "+3+", "+(2+3));
		System.out.println();
		
		System.out.println("Relational");
		System.out.println(intVal+" == "+floatVal+" = "+(intVal==floatVal));
		floatVal = 10.0f;
		System.out.println(intVal+" == "+floatVal+" = "+(intVal==floatVal));
		System.out.println();
		
		bool2 = false;
		
		if (bool1 || (bool1 && bool2))
			System.out.println("Success");
		else
			System.out.println("False");
	}
}