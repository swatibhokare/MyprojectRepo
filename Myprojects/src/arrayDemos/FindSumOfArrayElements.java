package arrayDemos;

import java.util.Scanner;

//wap to find sum of array elements
public class FindSumOfArrayElements {
	//passing array as argts
	public static int findsumofArray(int a[]) {
		int sum=0;
		int length=a.length;
		for(int i=0;i<length;i++)
		{
			sum=sum+a[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		int num[]=new int[10];
		int i,len=num.length,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of elements:");
		n=sc.nextInt();
		//
		for(i=0;i<n;i++)
		{
			System.out.println("enter element");
			num[i]=sc.nextInt();
			
		}
		int ans=findsumofArray(num);
		System.out.println(ans);
	}
	
}
