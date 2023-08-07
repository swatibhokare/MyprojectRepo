package arrayofObjectAssignment;
//WAP to create Array of Employees and display the employee data by traversing array.
//Employee class has (id, name, salary, Dept),
//Departments has (did, dname). Hint : Object inside object

public class Employee1 {
	 int empid;
	 String empname;
	 double empSal;
	Department dept;
	
	 public Employee1()
	{}
	public Employee1(int empid,String empname,double empsal,Department dept)
	{
		this.empid=empid;
		this.empname=empname;
		this.empSal=empsal;
		this.dept=dept;
	}
	
	
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public double getEmpSal() {
		return empSal;
	}
	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}
	@Override
	public String toString() {
		return "Employee1 [empid=" + empid + ", empname=" + empname + ", empSal=" + empSal + "]";

}
}
