package arrayAssignments;

import java.util.Scanner;

public class ArrayThird {

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
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]%2==0)
			{
				System.out.println("even number:"+arr[i]);
			}else
			{
				System.out.println("odd number:"+arr[i]);
			}
			
		}
		
		
	}



	}


