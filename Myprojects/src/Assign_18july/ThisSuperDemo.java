package Assign_18july;
class Student{
	
	int student_id;
	String student_name;
	int student_age;
	
	public Student(int student_id,String student_name,int student_age)
	{
		this.student_id=student_id;
		this.student_name=student_name;
		this.student_age=student_age;
		
		
	}
	public void Display()
	{
		System.out.println("Student name is:" + student_name);
		System.out.println("Student id is:" + student_id);
		System.out.println("student age is:"+ student_age);
	}

}

class PrimaryStudent extends Student
{
	}



public class ThisSuperDemo {
	
	
	public static void main(String[] args) {
		Student s=new Student(1,"swati",25);
		s.Display();

	}

}
