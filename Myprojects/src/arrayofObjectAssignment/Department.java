package arrayofObjectAssignment;

public class Department {
	int did;
	String dname;
	public Department()
	{}
	public Department(int did,String dname)
	{
		this.did=did;
		this.dname=dname;
	}
	

	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	
	@Override
	public String toString() {
		return "Department [did=" + did + ", dname=" + dname + "]";
	}
	public static void main(String[] args) {
		Department d1=new Department(12,"sales");
		Department d2=new Department(11,"HR");
		Department d3=new Department(23,"sales");
		Department d4=new Department(14,"HR");
		Department d5=new Department(15,"Devloper");
		
		
		Employee1 emp[]=new Employee1[5];
		emp[0]=new Employee1(12,"saini",12000,d1);
		emp[1]=new Employee1(11,"swati",14000,d2);
		emp[2]=new Employee1(10,"shivani",15000,d3);
		emp[3]=new Employee1(23,"sharda",20000,d4);
		emp[4]=new Employee1(25,"ulka",15000,d5);
		
		System.out.println("-----------Employee who works in sales department:-------------- ");
		
		for(int i=0;i<emp.length;i++)
		{
			if(emp[i].dept.getDname()=="sales")
			{
				System.out.println(emp[i]);
			}
		}
		
		System.out.println("----------------Employee who works in same department:---------------");
		for(int i=0;i<emp.length;i++)
		{
			if(emp[i].dept.getDname().equals(d1.getDname()))
			{
				System.out.println(emp[i]);
			}
		}
	}

}
