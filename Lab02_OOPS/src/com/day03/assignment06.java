package com.day03;

public class assignment06 {
	public static void main(String[] args) {
		int number, iterations;
		number = Integer.parseInt(args[0]);
		iterations = Integer.parseInt(args[1]);
		
		for(int i=1;i<=iterations;i++)
			System.out.println(i*number);
		
		String name = args[2];
		System.out.println(name.toUpperCase());
		
		System.out.println(name.toLowerCase().charAt(0)=='a'?"Starts with a":"Does not start with a");
		
		name = "SEED";
		
		System.out.println(name);
		
		
	}
}
