package com.assignment.forloop;

public class Stoploop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=20;i++)
		{
			
				System.out.println(i);
				if(i%3==0 && i%9==0)
				{
					break;
				}
				
		}
	}

}
