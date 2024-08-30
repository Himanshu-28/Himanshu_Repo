package com.day03;

public class assignment02 {
	public static void main(String[] args) {
		int firstMatrix[][] = {{1,2,3},{4,5,6}};
		int secondMatrix[][] = {{7,8,9},{10,11,12}};
		
		int[][] thirdMatrix = new int[2][3];
		
		for(int i=0;i<2;i++)
			for(int j=0;j<3;j++)
				thirdMatrix[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
		
		System.out.println("First Matrix");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
				System.out.print(firstMatrix[i][j]+" ");
			System.out.println();
		}
		
		System.out.println("Second Matrix");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
				System.out.print(secondMatrix[i][j]+" ");
			System.out.println();
		}
		
		System.out.println("Third Matrix");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
				System.out.print(thirdMatrix[i][j]+" ");
			System.out.println();
		}
	}
}