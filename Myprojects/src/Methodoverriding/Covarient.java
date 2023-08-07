package Methodoverriding;

class Calculator{
	public Object add()
	{
		return 20;
	}
}
class Simplecal extends Calculator{
	
	public String add()
	{
		return "addition";
	}
	
}
public class Covarient {

	public static void main(String[] args) {
		
      Calculator c=new Calculator();
      c.add();
    
      Simplecal sc=new Simplecal();
      String m=sc.add();
      System.out.println(m);
	}

}
