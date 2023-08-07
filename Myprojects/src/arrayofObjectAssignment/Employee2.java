package arrayofObjectAssignment;

import java.util.Arrays;

//Employee class has (id, name, salary, joining date) Use MyDate class 
//as a joining date. MyDate class has (day, month, year). Now create array of Employee and print
//only those Employees who joined after 2010.
public class Employee2 {
	int empid;
	String empname;
	double salary;
	Mydate doj;
	
	Employee2()
	{}
	Employee2(int empid,String empname,double salary,Mydate doj)
	{
		this.empid=empid;
		this.empname=empname;
		this.salary=salary;
		this.doj=doj;
		
		
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
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Mydate getDoj() {
		return doj;
	}
	
	public void setDoj(Mydate doj) {
		this.doj = doj;
	}
	@Override
	public String toString() {
		return "Employee2 [empid=" + empid + ", empname=" + empname + ", salary=" + salary +"date="+doj+ "]";
	}
	
	
	
	

}
