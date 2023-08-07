package com.assignmentwhileloop;

public class Sumeven {

	public static void main(String[] args) {
		// find the sum of even numbers between 1 to 10

				int i = 1;
				int sum = 0;
				while (i <= 10) {
					if (i % 2 == 0) {
						sum = sum + i;
					}
					i++;
				}

				System.out.println(sum);



	}

}
