package arrayAssignments;

import java.util.Scanner;

public class Array8 {
	public static void search(int arr[],int search)
	{
	int position=-1;
	for(int i=0;i<arr.length;i++)
	{
		if(search==arr[i])
		{
			position=i;
			break;
		}
	}
	if(position!=-1)
	{
		System.out.println(search+" is present at index"+position);
	}
	else
	{
		System.out.println(search+"is not present in th array");
	}
	
		
	}

	public static void main(String[] args) {
		int num[]= {23,45,67,89,20,54,68};
		int search;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number you want to search");
		search=sc.nextInt();
		search(num,search);
	}

}
