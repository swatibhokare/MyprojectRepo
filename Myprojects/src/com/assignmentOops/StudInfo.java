package com.assignmentOops;

public class StudInfo {
	int sid;
	String sname;
	float sm1;
	float  sm2;
	float sm3;
	public StudInfo(int id,String name,float m1,float  m2,float m3)
	{
		sid=id;
		sname=name;
		sm1=m1;
		sm2=m2;
		sm3=m3;
		
	}
	public void result()
	{
		float total=sm1+sm2+sm3;
		float percentage=(total/300)*100;
		System.out.println(percentage);
		if(percentage>60)
		{
			System.out.println("Grade A");
		}else if(percentage>=50) {
			System.out.println("Grade B");
		}else
		{
			System.out.println("Grade c");
		}
	}	
	public void display()

	{
		System.out.println(sid+" "+sname+" "+sm1+" "+sm2+" "+sm3);
	}
	public static void main(String[] args) {
		StudInfo s=new StudInfo(101,"sudha",50f,60f,30f);
		s.result();
		s.display();

	}

}
