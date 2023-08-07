package arrayDemos;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
         String name[]=new String[10];
         int len=name.length;
         int i;
         int n;
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter count of names you want to add in array ");
          n=sc.nextInt();
          for(i=0;i<n;i++)
          {
        	  System.out.println("Enter names");
        	  name[i]=sc.next();
          }
          System.out.println("______________ array_________");
          for(i=0;i<n;i++)
          {
        	  System.out.println("Name["+i+"]:"+name[i]);
          }
	}

}
