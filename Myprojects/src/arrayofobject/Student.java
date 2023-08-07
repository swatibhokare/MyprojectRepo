package arrayofobject;

public class Student {
	private int rollno;
	private String name;
	private double marks;
	
	
	Student()
	{
		
	}
	Student(int rollno,String name,double marks)

	{this.rollno=rollno;
	this.name=name;
	this.marks=marks;
		
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	/*public void display()
	{
		System.out.println("rollno:"+rollno);
		System.out.println("name :"+name);
		System.out.println("marks:"+marks);
	}*/
	public String toString()
	{
		return "rollno"+rollno+"name"+name+"marks"+marks;
	}
	

}
