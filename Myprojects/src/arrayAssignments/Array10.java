package arrayAssignments;

import java.util.Scanner;

public class Array10 {
	public static void InsertElement(int arr[],int indx,int n)
	{
		int i,len=arr.length;
		if(indx<len)
		{
			arr[indx]=n;
		}
		else
		{
			System.out.println("index not found");
		}
	}

	public static void main(String[] args) {
		int a[]= {12,4,5,47,89,63};
		int index,num,i,len=a.length;
		Scanner sc=new Scanner(System.in);
		System.out.println("you caan enter index number from 0 to "+(len-1));
		System.out.println("enter index for that number which you want to change ");
		index=sc.nextInt();
		System.out.println("enter new number");
		num=sc.nextInt();
		InsertElement(a,index,num);
		System.out.println("--------After replacing with new number----------");
		for(i=0;i<len;i++)
		{
			System.out.print(a[i]+" ");
		}
		
	}

}
