package Thoery_Assignment_22july;
/*
 * Write a program to demonstrate use of 'this' keyword
 */

public class ExampleUseofThis {
	private String name;
    private int age;
    private float weight;
     
    //without using this keywords
    public void getDetailsWithoutThis(String name, int age, float weight)
    {
        name=name;
        age=age;
        weight=weight;
    }
     
    //using this keywords
    public void getDetailsWithThis(String name, int age, float weight)
    {
        this.name=name;
        this.age=age;
        this.weight=weight;
    }
     
    public void putDetails()
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Weight: " + weight);
    }
     


	public static void main(String[] args) {
	  //Object creation
    ExampleUseofThis ExThis=new ExampleUseofThis();
     
    ExThis.getDetailsWithoutThis("neeta",25,60f);
    System.out.println("Values after get details using getDetailsWithoutThis():");
    ExThis.putDetails();
     
    ExThis.getDetailsWithThis("Sneha",24,50.4f);
    System.out.println("Values after get details using getDetailsWithThis():");
    ExThis.putDetails(); 
	}

}
