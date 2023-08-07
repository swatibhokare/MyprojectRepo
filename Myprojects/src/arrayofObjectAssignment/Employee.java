package arrayofObjectAssignment;

import java.util.Scanner;

/*
 * WAP to create Array of Employees and display the employee data by traversing array.
 *  Employee class has (id, name, salary)
 */

public class Employee {

	private int empid;
	private String empname;
	private double empSal;

	Employee() {
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

	public Employee(int empid, String empname, double empSal) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.empSal = empSal;
	}

//public void display()
//{
//	System.out.println("employee id:"+empid);
//	System.out.println("employee name:"+empname);
//	System.out.println("employee salary:"+empSal);
//	}

	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", empSal=" + empSal + "]";
	}

	public static void main(String[] args) {
		Employee emp[] = new Employee[2];
		emp[0] = new Employee(12, "swati", 5000);
		emp[1] = new Employee(14, "saini", 20000);
		System.out.println(emp[0]);
		System.out.println(emp[1]);
		System.out.println("--------------employee having salary greater than 10000-------------");
		for(int i=0;i<emp.length;i++)
		{
			if(emp[i].getEmpSal()>10000)
			{
				System.out.println(emp[i]);
			}
			
		}
//		for (Employee E : emp) {
//			System.out.println(E);
//		}
		
	}

}
