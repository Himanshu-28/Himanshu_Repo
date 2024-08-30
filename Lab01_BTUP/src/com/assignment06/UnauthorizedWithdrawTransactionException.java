package com.assignment06;

public class UnauthorizedWithdrawTransactionException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public UnauthorizedWithdrawTransactionException() {
		super("This transaction is not authorized!");
		// TODO Auto-generated constructor stub
	}
	
}
