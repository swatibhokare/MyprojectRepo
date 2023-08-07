package TestFile;

import java.util.Scanner;

public class test {

	public static int secondHighest(int[] a)
	{
		int high1,high2;
		high1=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>high1)
			{
				high1=a[i];
			}
		}
		high2=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>high2 && a[i]!=high1)
			{
				high2=a[i];
			}
		}
		return high2;
	}
	
	
	public static void main(String[] args) {
		//{10,20,30,40}
		
		int a[]=new int[4];//new int[10];
	Scanner sc=new Scanner(System.in);
		int sum=0;
		int high2 = secondHighest(a);
		System.out.println("enter the elements of array");
		for(int i=0;i<a.length;i++)
		{
 	a[i]=sc.nextInt();
			if(a[i]<high2)
			{
				sum=sum+a[i];
			}
		}
		System.out.println(sum);
		

	}

}
