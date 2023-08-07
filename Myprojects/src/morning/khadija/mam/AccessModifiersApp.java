package morning.khadija.mam;

public class AccessModifiersApp {
	public static void main(String[] args) {

		Student std = new Student();
   //  	std.doPrivate(2); //private is accessible only within class.
		std.doDefault(20); //default will be accessible in another class having same package
		std.doPublic(12);
		std.doProtected(22345); //protected is not accessible outside the package 
		
	}
}
