package arrayofobject;

public class Student1 {
	private int rollno;
	private String name;
	private double marks[];
	Student1()
	{
	}
	Student1(int rollno,String name,double marks[])
	{
		this.rollno=rollno;
		this.name=name;
		this.marks=marks;
	}
	public void display()
	{
		System.out.println("rollno :"+rollno);
		System.out.println("name :"+name);
		System.out.println("marks :"+marks);
		/*System.out.println("marks acheived in mcq, xobin, written test");
		 * for(int i=0;i<marks.length;i++)
		 * {
		 * System.out.println(marks[i])}
		 * */
		 
	}

}
