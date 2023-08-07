package arrayAssignments;

import java.util.Scanner;

public class ArraySixth {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size;
		int count = 0;
		System.out.println("enter array size");
		size = sc.nextInt();

		System.out.print("enter array element");
		int[] arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println();

		// loop through the numbers one by one
		for (int i = 0; i < arr.length; i++) {
			boolean isPrime = true;
			if (arr[i] == 1)
				isPrime = false;
			else {
				// check to see if the numbers are prime
				for (int j = 2; j <= arr[i] / 2; j++) {
					if (arr[i] % j == 0) {
						isPrime = false;
						break;
					}
				}
			}
			// print the number
			if (isPrime) {
				if (arr[i] == 0) {
				} else {
					System.out.print(arr[i] + " , ");
				}
			}
		}
		System.out.println(" Are the prime number in the array ");
	}
}
