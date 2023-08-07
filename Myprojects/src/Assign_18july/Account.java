package Assign_18july;
class Account1
{
	public void Display()
	{
		System.out.println("the rate of intrest is 2%");
	}
	
}
class SavingAcc extends Account1{
	
	public void Display()
	{
		System.out.println("the rate of interest is 3%");
	}
}
class CurrentAcc extends Account1
{
   public void Display()
   {
	   System.out.println("the rate of interest is 5%");
   }
	
}

public class Account {

	public static void main(String[] args) {
		Account1 A=new Account1();
		A.Display();
		SavingAcc sa=new SavingAcc();
		sa.Display();
		CurrentAcc ca=new CurrentAcc();
		ca.Display();

	}

}
