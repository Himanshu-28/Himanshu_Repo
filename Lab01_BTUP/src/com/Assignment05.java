package com;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Assignment05 {
	public void showRecords(Set<Integer> set)
	{
		if(!set.isEmpty())
		{
			Iterator<Integer> it = set.iterator();
			while(it.hasNext())
				System.out.println(it.next());
		}
		else {
			System.out.println("Empty Set!!");
		}
	}
	
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>();
		set.add(5);
		set.add(6);
		set.add(7);
		set.add(8); 
		
		Assignment05 debug = new Assignment05();
		System.out.println("Printing the records - ");
		debug.showRecords(set);
	}
}
