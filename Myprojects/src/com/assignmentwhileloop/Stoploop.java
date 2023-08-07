package com.assignmentwhileloop;

public class Stoploop {

	public static void main(String[] args) {
		int i = 1;
		int count=1;
		while (i <= 20) {
         
			System.out.println(i);
			if (i % 3 == 0 && i % 9 == 0)
			{
				break;
			}
			 i++;
		}
	}

}
