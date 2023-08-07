package arrayDemos;
import java.util.Arrays;
class Student
 { int rollno;
   String name;
   int marks[];
   int totalMarks;
   Student(int rollno,String name,int marks[],int totalMarks)
   {
	   this.rollno=rollno;
	   this.marks=marks;
	   this.name=name;
	   this.totalMarks=totalMarks;
   }
   public String toString()
   {
	   return "rollno:"+rollno+"\nname:"+name+"\nmarks:"+Arrays.toString(marks)+"totalMarks:"+totalMarks;
   }
   
 /*public void display()
 {
	 System.out.println("rollno:"+rollno);
	 System.out.println("name:"+name);
	 System.out.println("marks:"+Array.toString(marks));
	 
 }*/
	
   
   public void sum()
   {
	   
	   for(int i=0;i<marks.length;i++)
	   {
		   totalMarks=totalMarks+marks[i];
	   }
	   
   }
   
   
   
}

public class ArrayInstance {

	public static void main(String[] args) {
		int m1[]= {12,34,43,56};
		int m2[]= {32,65,78,89};
		int m3[]= {32,34,56,76,90};
		
		Student s2=new Student(101,"swati",m1);
		Student s3=new Student(102,"sachin",m2);
		
		System.out.println(s3);
		System.out.println(s2);
	}

}
