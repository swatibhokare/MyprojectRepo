package MorningAssign;
class Department
{
	  private int  deptid;
	  private String deptname;
	  
	  public void setDeptid( int deptid)
	  {
		  this.deptid=deptid;
	  }
	  public void setDeptname(String deptname)
	  {
		  this.deptname=deptname;
	  }
	  
	  public int getDeptid()
	  {
		  return deptid;
	  }
	  public String getDeptname()
	  {
		  return deptname;
	  }
}
public class Employee {
	private int empid;
	private String empname;
	private int empsalary;
	 private Department dept;
	
	public void setEmpid(int empid)
	{
		this.empid=empid;
	}
	public void setEmpname(String empname)
	{
		this.empname=empname;
	}
	public void setEmpsalary( int empsalary)
	{
		this.empsalary=empsalary;
	}
	
	public int getEmpid()
	{
		return empid;
	}
	
	public String getEmpname()
	{
		return empname;
	}
	
	public int getempsalary()
	
	{
		return empsalary;
	}
	public void setdept(Department dept)
	{
		this.dept=dept;	
	}
	public Department getdept()
	{
		return dept;
	}

  
 
  
  public static void main(String []args)
  {
	Employee emp=new Employee();
	emp.setEmpid(2);
	emp.setEmpname("swati");
	emp.setEmpsalary(10000);
	emp.setdept(new Department());
	 Department dept=emp.getdept();
	 dept.setDeptid(1);
	dept.setDeptname("HR");

	
	
	System.out.println(emp.getEmpid());
	System.out.println(emp.getEmpname());
	System.out.println(emp.getempsalary());
	System.out.println(dept.getDeptid());
  System.out.println(dept.getDeptname());
  }
  }
