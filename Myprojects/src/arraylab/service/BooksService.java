package arraylab.service;
import arraylab.dao.BooksDAO;
import arraylab.model.Books;
public class BooksService {
	
	static BooksDAO booksdao= new BooksDAO();
	public  void addBookService(Books b) {
		booksdao.addBook(b);
	}
	public void modifyBooknameService(Books b) {
		booksdao.modifyBookName(b.getBookid(),b.getBookname());
	}
	public void modifyBookPriceService(Books b) {
		booksdao.modifyBookPrice(b.getBookid(), b.getBookprice());
	}
    public static  Books[] getAllBooksService() {
		return booksdao.getAllBooks();
    }

	

}
