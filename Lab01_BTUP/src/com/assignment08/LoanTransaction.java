package com.assignment08;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class LoanTransaction implements Runnable {
	
	private BankFund bankfund;
	private int customerId;
	private double loanAmount;
	
	public void run() {
		try {
			bankfund.checkFund(loanAmount);
			Thread.sleep((long)(2000*Math.random()));
			
			double fundAvailable = bankfund.debitFund(loanAmount);
			System.out.println(customerId+" the loan is disbursed! Pl collect the cash from the teller");
			System.out.println("Fund left in the bank - "+fundAvailable);
			
		}catch(InsufficientFundException | InterruptedException e) {
			System.out.println(e.getMessage());
		}
	}
	
}