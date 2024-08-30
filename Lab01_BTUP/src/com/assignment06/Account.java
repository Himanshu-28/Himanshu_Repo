package com.assignment06;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Account {
	private int accountNo;
	private Customer customer;
	private double balance;
}
