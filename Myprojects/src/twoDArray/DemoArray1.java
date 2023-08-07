package twoDArray;

import java.util.Scanner;

public class DemoArray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int tab[][]=new int [3][3];
int i,j,rows,cols;
Scanner sc=new Scanner(System.in);

System.out.println("enter no of rows");
rows=sc.nextInt();
System.out.println("enter no of cols");
cols=sc.nextInt();
System.out.println("enter elememnts of 2d array");
for(i=0;i<rows;i++)
{for(j=0;j<cols;j++)
{
	System.out.println("enter elements for tab["+i+"]["+j+"]");
	tab[i][j]=sc.nextInt();
	}
	}
System.out.println("-------2d array---------");
for(i=0;i<rows;i++)
{
	for(j=0;j<cols;j++)
		{
		System.out.print(tab[i][j]+" \t");
		}
	System.out.println();
	}

	}

}
