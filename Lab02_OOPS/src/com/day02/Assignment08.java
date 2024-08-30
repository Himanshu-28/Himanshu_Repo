package com.day02;

public class Assignment08 {
	int i;
	int j;
	boolean k;
	boolean l;
	
	Assignment08()
	{
		i = 22;
		j = 14000;
	}
	
	public boolean Method1(int i)
	{
		if(i>20 && i<30)
			return true;
		else
			return false;
	}
	
	public boolean Method2(int j)
	{
		if(j>14000 && j<20000)
			return true;
		else
			return false;
	}
	
	
	public static void main(String[] args) {
		int x = 22;
		int y = 14000;
		
		Assignment08 assignment8 = new Assignment08();
		
		boolean v = assignment8.Method1(x);
		boolean w = assignment8.Method1(y);
		
		if(v && w)
			System.out.println("Is a new employee");
		else
			System.out.println("Is not a new employee");
		
	}

}
