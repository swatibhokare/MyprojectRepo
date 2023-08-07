package arrayofobject;

public class TesstArrayasInstancevariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Student1 s1=new Student1(101,"navin",new double[] {45,30,85});
        
        double m1[]= {45,56,78};
        double m2[]= {34,56,78};
        double m3[]= {45,58,78};
        double m4[]= {45,23,78};
        
        Student1 s2=new Student1(102,"rahul",m1);
        Student1 s3=new Student1(107,"rahul",m2);
        Student1 s4=new Student1(105,"rahul",m3);
        Student1 s5=new Student1(104,"rahul",m4);
        System.out.println("----------Student1-----");
        s2.display();
        System.out.println("--------student2------");
        s3.display();
        System.out.println("---student by tostring-----");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        
        
	}

}
