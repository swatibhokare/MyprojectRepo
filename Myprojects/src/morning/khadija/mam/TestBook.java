package morning.khadija.mam;

import java.util.Scanner;

public class TestBook {
	
	public static void main(String[] args) {
		Book book = new Book();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the Book name:");
		book.setBookName(scanner.next()); 
		
		System.out.println("Enter the price:");
		book.setBookPrice(scanner.nextInt());
		
		System.out.println("Enter the Author name:");
		book.setAuthorName(scanner.next());
		
		scanner.close();
		System.out.println();
		
		System.out.println("Book Details");
		System.out.println("Book Name 	:" +book.getBookName());
		System.out.println("Book Price	:"+book.getBookPrice());
		System.out.println("Author Name	:"+book.getAuthorName());		
		
	}

}
