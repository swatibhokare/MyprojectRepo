package com.assignment.forloop;

public class SkipLoop {

	public static void main(String[] args) {

		for (int i = 1; i <= 20; i++) {

			if (i % 3 != 0 && i % 5 != 0) {
				System.out.println(i);
			}
		}

	}
}
