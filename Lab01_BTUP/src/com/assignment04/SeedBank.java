package com.assignment04;

import java.util.List;
import java.util.Set;

public class SeedBank {
	private static CustomerDB customerdb = new CustomerDB();
	
	private static Login login = new Login();
	
	public static void printCustomerList(List<Customer> customerlist)
	{
		System.out.println("-----------------------------------");
		System.out.println("|\tALL CUSTOMERS LIST\t|");
		System.out.println("-----------------------------------");
		System.out.println("|\tCustomer ID\t|Customer Name|Loan Availed|");
		for(Customer c:customerlist)
			System.out.println("|\t"+c.getCustomerId()+"\t|"+c.getCustomerName()+"|"+c.isLoanAvailed()+"|");
	}
	
	public static void main(String[] args) {
		Customer c1 = new Customer(101, "Himanshu", false);
		Customer c2 = new Customer(102, "Aishwary", true);
		Customer c3 = new Customer(103, "Drake", true);
		Customer c4 = new Customer(104, "John", false);
		
		login.addLogin(101, "Himanshu");
		login.addLogin(102, "Aishwary");
		login.addLogin(103, "Drake");
		login.addLogin(104, "John");
		
		customerdb.saveCustomer(c1);
		customerdb.saveCustomer(c2);
		customerdb.saveCustomer(c3);
		customerdb.saveCustomer(c4);
		
		List<Customer> customerList = customerdb.getAllCustomers();
		
		if(customerList.isEmpty())
		{
			System.out.println("No customers in the bank!");
		}
		else {
			printCustomerList(customerList);
		}
		
		Set<Integer> loanAvailedCustomers = customerdb.getLoanAvailedCustomers();

		System.out.println("-----------------------------------");
		System.out.println("|  Customer ID  |");
		for(Integer c:loanAvailedCustomers)
			System.out.println("|\t"+c.intValue()+"\t|");
		
		
		
	}
}
