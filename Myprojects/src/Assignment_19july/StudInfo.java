package Assignment_19july;
//1.Declare a class ‘Student’ with data members ‘name’, ‘roll number’ and ‘marks’.
//Also declare a class ‘MyRecord’ which inherited from class ‘Student’. 
//Display name, roll number and percentage by creating the object of class MyRecord.


class Student{
	String studentname="swati";
	int rollnumber=12;
	int marks=100;
	
}
class MyRecord extends Student{
	
	public void show()
	{
		System.out.println("student name is:"+studentname);
		System.out.println("Student Rollnumber is:"+ rollnumber);
		System.out.println("student marks:"+marks);
	}
	
}
public class StudInfo {

	public static void main(String[] args) {
          MyRecord r=new MyRecord();
          r.show();
	}

}
