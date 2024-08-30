package com.assignment08;

public class SeedBank {
	public static void main(String[] args) {
		BankFund bf = new BankFund(9000000);
		
		LoanTransaction[] lt = new LoanTransaction[100];
		
		for(int index = 0;index<lt.length;index++)
			lt[index] = new LoanTransaction(bf, 10000+index, 250000);
		
		for(int i=0;i<lt.length;i++)
			lt[i].run();
	}
}
