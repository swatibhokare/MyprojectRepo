package Methodoverriding;

class person{
	
	protected String name;
	protected int age;
	protected String email;
	protected String contact;
	
	person(String name, int age,String email,String contact)
	{
		this.name=name;
		this.age=age;
		this.email=email;
		this.contact=contact;
		
	}
	public void show()
	{
		System.out.println("name\t:" +name);
		System.out.println("age\t:" +age);
		System.out.println("email\t:" +email);
		System.out.println("contact\t:" +contact);
		
	}
	
	
}
class Teacher extends person{
	
	int id;
	double salary;
	Teacher(String name,int age,String email,String contact,int id,double salary)
	{
		super(name,age,email,contact);
		this.id=id;
		this.salary=salary;
	}
	public void show()
	{
		System.out.println("id\t:"+id);
		System.out.println("Salary\t:"+salary);
	}

}

public class MethodOverridingExample {

	public static void main(String[] args) {
               
		person p=new person("swati",25,"swati@gmail.com","9096886662");
		p.show();
		System.out.println("..................................");
		Teacher t=new Teacher("swati",25,"swati@gmail.com","9096886662",12,10000);
		t.show();
		
	}

}
