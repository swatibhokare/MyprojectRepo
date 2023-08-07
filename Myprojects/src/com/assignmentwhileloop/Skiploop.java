package com.assignmentwhileloop;

public class Skiploop {

	public static void main(String[] args) {
		int i=0;
		while(i<=20)
		{
			i++;
			if (i % 3 != 0 && i % 5 != 0) {
				System.out.println(i);
			}
			
		}
	}

}
