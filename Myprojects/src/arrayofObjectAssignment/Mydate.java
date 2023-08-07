package arrayofObjectAssignment;

public class Mydate {
	int day;
    String month;
    int year;
    
    Mydate()
    {}

    Mydate(int day ,String month,int year)
    {
    	this.day=day;
    	this.month=month;
    	this.year=year;
    }
    
    
    public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	

	@Override
	public String toString() {
		return "Mydate [day=" + day + ", month=" + month + ", year=" + year + "]";
	}

	public static void main(String[] args) {
		Mydate d1=new Mydate(12,"aug",2013);
		Mydate d2=new Mydate(23,"april",2023);
		Mydate d3=new Mydate(23,"april",2023);
		
		
	 Employee2 emp[]=new Employee2[3];
	 emp[0]=new Employee2(01,"shruti",12000,d1);
	 emp[1]=new Employee2(02,"leena",10000,d2);
	 emp[2]=new Employee2(03,"shekhar",15000,d3);
	 
	 System.out.println("------Employee joining after 2010--------");
	 for(int i=0;i<emp.length;i++)
	 {
		 if(emp[i].doj.getYear()>2010)
		 {
			 System.out.println(emp[i]);
		 }
	 }
	 System.out.println("-----------employee having same joining date-------- ");
	 for(int i=0;i<emp.length;i++)
	 {
		 for(int j=i+1;j<emp.length;j++)
		 {
			 if(emp[i].getDoj().getDay()==emp[j].getDoj().getDay()&&emp[i].getDoj().getMonth()==emp[j].getDoj().getMonth()&&emp[i].getDoj().getYear()==emp[j].getDoj().getYear())
			 {
				 System.out.println(emp[i].toString()+ "\n"+emp[j].toString());
			 }
		 }
	 }
	}

}
