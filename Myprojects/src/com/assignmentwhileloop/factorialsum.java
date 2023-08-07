package com.assignmentwhileloop;

public class factorialsum {

	public static void main(String[] args) {
		int count=1;
				int sum=0;
		int fact=1;
		while(count<=5)
		{
			fact=fact*count;
			sum=fact+sum;
			count++;
		}
		System.out.println(sum);

	}

}
