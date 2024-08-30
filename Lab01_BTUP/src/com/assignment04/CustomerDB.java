package com.assignment04;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CustomerDB {
	private List<Customer> customerList = new ArrayList<Customer>();
	
	public boolean saveCustomer(Customer customer)
	{
		boolean status = false;
		
		status = customerList.add(customer);
		
		return status;
	}
	
	public List<Customer> getAllCustomers()
	{
		return customerList;
	}
	
	public Set<Integer> getLoanAvailedCustomers()
	{
		Set<Integer> loanAvailedCustomerID = new TreeSet<Integer>();
		
		for(Customer cs:customerList)
			if(cs.isLoanAvailed())
				loanAvailedCustomerID.add(cs.getCustomerId());
		
		return loanAvailedCustomerID;
	}
}
