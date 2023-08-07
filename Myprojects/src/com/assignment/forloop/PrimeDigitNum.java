package com.assignment.forloop;

public class PrimeDigitNum {

	public static void main(String[] args) {

		for (int i = 21; i <= 30; i++) {
			int temp = i;
			boolean isprime = true;
			while (temp > 0) {
				int rem = temp % 10;
				temp = temp / 10;
				for (int num = 2; num < rem; num++) {
					if (rem % num == 0) {
						isprime = false;
						break;

					}
					// break;
				}
			}
			if (isprime == true) {
				System.out.println(i);
			}
		}
	}

}
