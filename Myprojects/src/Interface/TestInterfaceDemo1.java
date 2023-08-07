package Interface;
interface Printable{
	int a=10;
	void showMsg();
}
class Print implements Printable{
	public void showMsg()
	{
		System.out.println("printing msg");
	}
}

public interface TestInterfaceDemo1 {
	
	public static void main(String[] args)
	{
		Print p=new Print();
		p.showMsg();
		//Printable p2=new Printable();//compile time error can not create instance
		Printable p1=new Print();
		p1.showMsg();
	}

}
