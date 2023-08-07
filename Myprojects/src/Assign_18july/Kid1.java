package Assign_18july;

class Kid {
	public void readbook() {

	}

	public void readbook(String name, int bookid) {
               System.out.println("java");
	}

	}

 class Bigkid extends Kid{

	public void readbook() {

	}

}

public class Kid1 {

	public static void main(String[] args) {
		Kid k=new Kid();
		k.readbook();
		k.readbook("java", 123);
		
	}

}
