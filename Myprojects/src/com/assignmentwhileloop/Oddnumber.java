package com.assignmentwhileloop;

public class Oddnumber {

	public static void main(String[] args) {
		int count=0;
		int i=1;
		while(i<=20)
		{
			i++;
			if(i%2!=0)
			{
				count++;
			}
			System.out.println(count);
		}

	}

}
