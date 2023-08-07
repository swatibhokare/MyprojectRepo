package Assignment_19july;

class Bank {
	Bank(String name)
	{}
	//Bank()
	//{}
	float getRateOfIntrest() {
		return 0;
	}
}

class ICICI extends Bank {
	ICICI(String name)
	{
		super(name);
	}
	float getRateOfIntrest() {
		return 7.3f;
	}
}

class SBI extends Bank {
	SBI(String name)
	{
		super(name);
	}
	float getRateOfIntrest() {
		return 9.5f;
	}
}

class AXIS extends Bank {
	AXIS(String name)
	{
		super(name);
	//	this.name=name;
	}
	float getRateOfIntrest()

	{
		return 8.6f;
	}
}

public class AssignmentBank {

	public static void main(String[] args) {
		Bank bank;
		bank = new ICICI("icici");
		System.out.println("ICICI rate of intrest is:" + bank.getRateOfIntrest());
		bank = new SBI("sbi");
		System.out.println("SBI rate of intrest is :" + bank.getRateOfIntrest());
		bank = new AXIS("axis");
		System.out.println("AXIS rate of intrest is:" + bank.getRateOfIntrest());

	}

}
