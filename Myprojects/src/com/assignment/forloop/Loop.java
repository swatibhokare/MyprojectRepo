package com.assignment.forloop;

public class Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //sum of even numbers 
		int sum=0;
		for(int i=1;i<=10;i++)
		{
			if(i%2==0)
			{
				sum=sum+i;
			}
		}
		System.out.println("sum :"+sum);
	}

}
