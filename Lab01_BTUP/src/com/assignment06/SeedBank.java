package com.assignment06;

public class SeedBank {
	public static void main(String[] args) {
		Customer c1 = new Customer(101, "Himanshu");
		Account a1 = new Account(201, c1, 20000);
		
		Customer c2 = new Customer(102, "Himanshu");
		Account a2 = new Account(202, c2, 20000);
		
		Deposit d1 = new Deposit(9001, a2, 5001, 4000);
		Deposit d2 = new Deposit(9002, a1, 5002, 7000);
		
		d2.start();
		
		WithdrawTransaction w1 = new WithdrawTransaction(9003, c2, a1, 500);
		
		Thread tw1 = new Thread(w1);
		
		tw1.start();	
		
	}
}
