package arrayAssignments;

import java.util.Scanner;

public class Array7 {
	public static int average(int[] array) {
		int sum = 0;
		int avg = 0;
		for (int i = 0; i < array.length; i++) {
			sum = sum + array[i];
		}
		for (int i = 0; i < array.length; i++) {
			avg = sum / array.length;
		}
		return avg;
	}

	public static double average(double[] array) {
         double sum=0;
         double avg=0;
         for(int i=0;i<array.length;i++)
         {
        	 sum=sum+array[i];
         }
         for(int i=0;i<array.length;i++)
         {
        	 avg=sum/array.length;
         }
         return avg;
	}

	public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("enter number of elements for int method");
            int n1=sc.nextInt();
            int num[]=new int[n1];
            System.out.println("enter elements:");
            for(int i=0;i<n1;i++)
            {
            	
            	num[i]=sc.nextInt();
            }
         System.out.println("--------------------------------");
         System.out.println("enter elemnts for double method");
         int n2=sc.nextInt();
         double num1[]=new double [n2];
         System.out.println("enter elements:");
         for(int i=0;i<n2;i++) {
        	 
        	 num1[i]=sc.nextDouble();
         }
         int ans=average(num);
         System.out.println("int method avg:"+ans);
         double ans2=average(num1);
         System.out.println("double method avg:"+ans2);
           
	}

}
