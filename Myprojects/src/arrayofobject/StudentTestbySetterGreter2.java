package arrayofobject;

import java.util.Scanner;


public class StudentTestbySetterGreter2 {

	
	static Scanner sc=new Scanner(System.in);
	public static void addStudents(Student s)
	{
		   System.out.println("enter roll no");
		   s.setRollno(sc.nextInt());
		   System.out.println("enter name");
		   s.setName(sc.next());
		   System.out.println("enter marks");
		    s.setMarks(sc.nextDouble());   
	}
	
	public static void showStudent(Student sarr[]) {
		for (Student s:sarr)
		{
			System.out.println(s);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Student str[]=new Student[3];
       int i,len=str.length;
       for(i=0;i<len;i++)
       {
    	   str[i]=new Student();
    	   addStudents(str[i]);
       }
       showStudent(str);
	}

}
