package arraylab.view;
import arraylab.model.Books;
import arraylab.service.BooksService;

import java.util.Scanner;

import arraylab.dao.BooksDAO;
public class BooksView {
	
	static Scanner sc=new Scanner(System.in);
    static BooksService bookService=new BooksService();
    static void getAllBooks()
    {
    	Books[] booksArray=bookService.getAllBooksService();
    	for(Books b:booksArray)
    	{
    		if(b!=null)

    			System.out.println(b);
    	} 	}
    	static void addBook()
    	{
    		System.out.println("enter book id");
    		int bookid=sc.nextInt();
    		System.out.println("enter book name");
    		String bookname=sc.next();
    		System.out.println("enter the book price");
    		double bookprice=sc.nextDouble();
    		
    		
    		Books newBook=new Books(bookid,bookname,bookprice);
    		bookService.addBookService(newBook);
    		System.out.println("");
    		System.out.println();
    	}
    	static void modifyBookName()
    	{
    		
    	}
    	static void modifyBookPrice()
    	{
    		System.out.println();
    	}
    	
    
	public static void main(String[] args) {
		
            BooksView.addBook();
            BooksView.getAllBooks();
       
	}

}
