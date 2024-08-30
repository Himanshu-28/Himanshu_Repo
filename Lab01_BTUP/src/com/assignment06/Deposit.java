package com.assignment06;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Deposit extends Thread {
	
	private int transactionId;
	private Account acc;
	private double amt;
	private int customerId;
	
	public void depositamt(Account account, double amount) {
		account.setBalance(account.getBalance()+amount);
	}
	
	public void run()
	{
		depositamt(acc, amt);
		System.out.println(transactionId+" transaction completed! "+customerId+" thankyou for depositing to account "+acc.getAccountNo());
	}
}
