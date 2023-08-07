package Thoery_Assignment_22july;

/*public class Code {
	 public static void main(String args[]) {
		 System.out.println(value());
		 }
		 static int value() {
	     static int data = 0;//exception illegal modifer only final accepted.
			 return data;
		 }
		}
*/

/*class Super {
public int index = 1;
}
class App extends Super {
public App(int index) {
 index = index;
}
public static void main(String args[]) {
 App myApp = new App(10);
 System.out.println(myApp.index);
}
}
*///....................//couldnt find main class.


public class Code {
	 public static void main(String[] args) {
	// method(null); //ambigous method error
	 }
	 public static void method(Object o) {
	 System.out.println("Object method");
	 }
	 public static void method(Integer i) {
	 System.out.println("Integer method");
	 }
	 public static void method(String s) {
	 System.out.println("String method");
	 }
	}