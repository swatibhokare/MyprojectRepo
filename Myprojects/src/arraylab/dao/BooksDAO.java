package arraylab.dao;

import java.util.Scanner;

import arraylab.model.Books;

public class BooksDAO {
	static Books bookArray[]=new Books[4];
	static int index=0;
	
	
	
	public void addBook(Books book)
	{
		bookArray[index++]=book;
	}
	
	public boolean modifyBookName(int bookid,String bookname)
	{
		for(int i=0;i<bookArray.length;i++)
		{
		if(bookArray[i].getBookid()==bookid)
		{
			bookArray[i].setBookname(bookname);
			return true;
		}
		}
		return false;
	}
	
   public boolean modifyBookPrice(int bookid,float bookprice)
   {
	   for(int i=0;i<bookArray.length;i++)
	   {
		   if(bookArray[i].getBookid()==bookid)
		   {
			   bookArray[i].setBookprice(bookprice);
			   return true;
		   }
	   }
	   return false;
   }
   public Books[]getAllBooks()
   {
	   return bookArray;
   }

		public static void main(String[] args) {
			BooksDAO b1=new BooksDAO();
			b1.addBook(new Books(1,"c language",200f));
			System.out.println(b1.modifyBookName(1, "cpp"));

		}
}
