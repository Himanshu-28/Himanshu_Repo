package com.day02;

public class Assignment01 {
	public static void main(String[] args) {
		int intVal = 100;
		byte byteVal = (byte)intVal;
		byte max = 127;
		byte min = -127;
		byte sum = (byte) (max+min);
		
		System.out.println("Sum = "+sum);
	}
}