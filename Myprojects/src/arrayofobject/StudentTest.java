package arrayofobject;

public class StudentTest {
	
	//find which student got marks greater than 80
	public static void showNames(Student s[])
	{
		int i,len=s.length;
		for(i=0;i<len;i++)
		{
			if(s[i].getMarks()>=80)
			{
				System.out.println(s[i]);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Student stuarr[];//declaring arr
        stuarr=new Student[5];
        System.out.println(stuarr[0]);//null
        System.out.println(stuarr[1]);//null
        
        
        stuarr[0]=new Student(11,"rahul",75);
        stuarr[1]=new Student(12,"saini",70);
        stuarr[2]=new Student(13,"rutu",75);
        stuarr[3]=new Student(14,"rakhi",80);
        stuarr[4]=new Student(15,"swati",92);
        
        
        System.out.println(stuarr[0]);//tostring
        
        //stuarr[0].display();
        
        System.out.println("-----student details by using for loop------");
        ///displaying student details using for loop
        for(int i=0;i<stuarr.length;i++)
        {
        	System.out.println(stuarr[i]);}
        
        System.out.println("------student details by using foe each loop----------");
        
        for(Student s:stuarr)
        {
        	System.out.println(s);
        }
        System.out.println("---------student greter than 80 marks----------");
        showNames(stuarr);
        }
}
