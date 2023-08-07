package arraylab.model;

public class Books {
	private  int bookid;
	 private String bookname;
	 private float bookprice;
	
	Books()
	{
		
	}
	public Books(int bookid,String bookname,double bookprice)
	{
		this.bookid=bookid;
		this.bookname=bookname;
		this.bookprice=(float) bookprice;
	}
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public float getBookprice() {
		return bookprice;
	}
	public void setBookprice(float bookprice) {
		this.bookprice = bookprice;
	}
	
	
	public String toString()
	{
		return "bookid :"+" "+bookid+" "+"bookname :"+" "+bookname+" "+"bookprice: "+" "+bookprice;
	}
}
