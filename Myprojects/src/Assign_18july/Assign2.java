package Assign_18july;

class Company{
	String address="latur";
	public void address()
	{
		System.out.println("address is:"+address);
	}
}
class Ebay extends Company
{
	
	public void address()
	{
		System.out.println("child address");
	}
	}

public class Assign2 {

	public static void main(String[] args) {
		Company c=new Company();
		c.address();
		Ebay e=new Ebay();
		e.address();

	}

}
