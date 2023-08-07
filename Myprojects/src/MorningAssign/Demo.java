package MorningAssign;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		
		int num = sc.nextInt();
		System.out.println("enter lucky no");
		int luckyNo = sc.nextInt();
		
		int i = 1, count = 0;
		int digit = 0;
		while (i <= num) {
			digit = num % 10;
			if (digit == luckyNo) {
				count++;
			}

		}
		System.out.println("count of lucky number"+count);

	}

}
