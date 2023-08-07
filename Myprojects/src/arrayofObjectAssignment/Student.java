package arrayofObjectAssignment;

public class Student {
	int rollno;
	String name;
	float age;
	int marks;
	
	Student()
	{}
	Student(int rollno,String name,float age,int marks)
	{
		this.rollno=rollno;
		this.name=name;
		this.age=age;
		this.marks=marks;
	}

	public static void main(String[] args) {
Student stu[] = new Student[5];
		
		stu[0] = new Student(14,"John",18,50);
		stu[1] = new Student(15,"Leena",13,70);
		stu[2] = new Student(16,"Rohan",32,80);
		stu[3] = new Student(17,"Ram",12,90);
		stu[4] = new Student(18,"Kaira",20,90);
		
		for(int i = 0; i < stu.length; i++)
		{
			System.out.println("Roll no: " + stu[i].rollno);
			System.out.println("Name: " + stu[i].name);
			System.out.println(stu[i].age);
			System.out.println(stu[i].marks);
			System.out.println("\n-----------------------");
		}
		
		for(int j = 0; j <stu.length; j++)
		{
			if(stu[j].marks > 60 && stu[j].age < 15)
			{
				System.out.println(stu[j].toString());
				//System.out.println(stu[j].toString());
			}
		}	
		

	}

}
