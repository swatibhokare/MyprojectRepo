package twoDArray;

import java.util.Scanner;

public class DemoArray2 {

	public static void main(String[] args) {
		int rows=3,cols=4;
		int mat1[][]=new int [rows][cols];
		int mat2[][]=new int [rows][cols];
		int sum[][]=new int [rows][cols];
		int i,j;
		Scanner sc=new Scanner(System.in);

		System.out.println("enter no of rows for mat1");
		rows=sc.nextInt();
		System.out.println("enter no of cols for mat1");
		cols=sc.nextInt();
		System.out.println("enter no of rows for mat2");
		rows=sc.nextInt();
		System.out.println("enter no of cols for mat2");
		cols=sc.nextInt();
		System.out.println("enter elememnts of 2d array");
		mat1[rows][cols]=sc.nextInt();
		mat2[rows][cols]=sc.nextInt();
		
		for(i=0;i<rows;i++)
		{
			for(j=0;j<cols;j++)
			{
				sum[i][j]=mat1[i][j]+mat2[i][j];
			}
		}
		System.out.println("----sumof two matrices-------");
		for(i=0;i<rows;i++)
		{
			for(j=0;j<cols;j++)
			{
				System.out.println(sum[i][j]+" ");
			}
		}
	}

}
