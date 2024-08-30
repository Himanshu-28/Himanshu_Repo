package com;

import java.util.ArrayList;
import java.util.List;

public class Assignment01 {
	public static void printCustomers(List<String> cl) {
		for(String s:cl)
			System.out.println(s);
	}
	
	public static void main(String[] args) {
		List<String> customers = new ArrayList<String>();
		
		customers.add("Himanshu");
		customers.add("Nikhil");
		customers.add("Vansh");
		customers.add("Rishit");
		
		printCustomers(customers);
	}
}
