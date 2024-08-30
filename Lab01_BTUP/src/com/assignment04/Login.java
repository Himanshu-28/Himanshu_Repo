package com.assignment04;

import java.util.LinkedHashMap;
import java.util.Map;

public class Login {
	private Map<Integer, String> db = new LinkedHashMap<Integer, String>();
	
	public void addLogin(int customerId, String name){
		db.put(customerId, name);
	}
}

