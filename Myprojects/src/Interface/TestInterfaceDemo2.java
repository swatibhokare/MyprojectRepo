package Interface;
interface language{
	void showName(String name);
}

class ProgramingLanguage implements language{
	public void showName(String name)
	{
		System.out.println("programing language name:"+name);
	}
}
class CommunicationLanguage implements language{
	public void showName(String name)
	{
		System.out.println("communication language name:"+name);
	}
}
public interface TestInterfaceDemo2 {

	public static void main(String[] args)
	{
		language ob;
		ob=new ProgramingLanguage();
		ob.showName("java");
		
		ob=new CommunicationLanguage();
		ob.showName("english");
		
	}
}
