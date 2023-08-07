package arrayAssignments;

import java.util.Scanner;

public class ArrayFifth {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size;
		int count=0;
		System.out.println("enter array size");
		size = sc.nextInt();

		System.out.print("enter array element");
		int[] arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println();
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]<0)
			{
				System.out.println("Negative numbers:"+arr[i]);
				count++;
			}
			
		}
		System.out.println("count of negative numbers"+count);
	}

	}


