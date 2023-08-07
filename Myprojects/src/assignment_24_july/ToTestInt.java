package assignment_24_july;

import java.util.Scanner;

interface Test {              // declare interface
	int square(int n);
}

class Arithmetic implements Test {
	public int square(int n) {            // implement interface
		return n * n;
	}
}

public class ToTestInt {

	public static void main(String[] args) {

		System.out.println("enter a number: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Arithmetic obj = new Arithmetic();              // call method
		System.out.println(obj.square(n));
	}
}
