package Methodoverriding;
class Mobile
{
	public void msg()
	{
		System.out.println("mobile msg() method");
	}
	
	}
class Basic extends Mobile
{
	public void msg()
	{
		System.out.println("Basic msg()method");
	}
	
	public void player()
	{
		System.out.println("player method from child class");
	}
	}
class Android extends Mobile
{
   public void msg()
   {
	   System.out.println("Android msg() method");
   }
   public void Notification()
   {
	   System.out.println("android notification method");
   }
}

public class PolymorphismUpcasting {//dynamic polymorphism//

	public static void main(String[] args) {
		Mobile m1=new Mobile();
		m1.msg();//parent
		//
       Mobile m2=new Basic();//upcasting or dynamic dispatch
       m2.msg();//child class
       
       m2=new Android();
       m2.msg();
       
       Basic b1=new Basic();
       b1.msg();
       b1.player();
       
	}

}
