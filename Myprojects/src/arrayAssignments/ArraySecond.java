package arrayAssignments;

import java.util.Scanner;

public class ArraySecond {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size;
		System.out.println("enter array size");
		size = sc.nextInt();

		System.out.println("enter array element");
		int[] arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println();
		int sum =0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			System.out.print(arr[i] +" ");
		}
		
		System.out.println("\nSum of array element : " +sum);
		System.out.println("Average of arrya elements :" + sum/2);
	}


	}


