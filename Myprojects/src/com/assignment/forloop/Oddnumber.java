package com.assignment.forloop;

public class Oddnumber {

	public static void main(String[] args) {
		// odd number bet 1 to 20
		int count=0;
		for(int i=1;i<=20;i++)
		{
		if(i%2 !=0)
		
		{
			count++;
		}
			
		}
		System.out.println("total count of odd number is" +count);
	}

}
