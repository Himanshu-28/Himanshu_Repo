package com.assignment06;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@Data
@NoArgsConstructor
@ToString
public class WithdrawTransaction extends Security implements Runnable {

	private int transactionId;
	private Customer customer;
	private Account account;
	private double amount;
	
	public double withdraw(Account acc, double amt) throws InsufficientBalanceException {
		if(acc.getBalance() < amt)
			throw new InsufficientBalanceException();
		acc.setBalance(acc.getBalance()-amt);
		return acc.getBalance();
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			authorization(account, customer);
			double balance = withdraw(account, amount);
			
			System.out.println(transactionId+" transaction is complete and the balance is "+balance);
			
		} catch (UnauthorizedWithdrawTransactionException e) {
			System.out.println(transactionId+" transaction failed and "+e.getMessage());
		} catch (InsufficientBalanceException e) {
			System.out.println(transactionId+" transaction failed and "+e.getMessage());
		}
		
	}
	
}
