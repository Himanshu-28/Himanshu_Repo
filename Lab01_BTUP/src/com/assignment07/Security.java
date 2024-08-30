package com.assignment07;

public class Security {
	public void authorization(Account account, Customer customer) throws UnauthorizedWithdrawTransactionException{
		if(account.getCustomer().getCustomerId() != customer.getCustomerId())
			throw new UnauthorizedWithdrawTransactionException();
	}
}
