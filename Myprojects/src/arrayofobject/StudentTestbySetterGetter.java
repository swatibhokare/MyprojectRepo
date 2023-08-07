package arrayofobject;

import java.util.Scanner;

public class StudentTestbySetterGetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Student str[]=new Student[3];
  int i,len=str.length;
  System.out.println("Enter Data for student array");
  Scanner sc=new Scanner(System.in);
  for(i=0;i<len;i++)
  {
	  str[i]=new Student();
	  System.out.println("enter Roll no :");
	  str[i].setRollno(sc.nextInt());
	  System.out.println("enter name :");
	  str[i].setName(sc.next());
	  System.out.println("enter marks :");
	  str[i].setMarks(sc.nextDouble());
  }
  
  
  System.out.println("---------Display------");
	for(Student s:str)
	{
		System.out.println(s);
	}
	
	}

}
