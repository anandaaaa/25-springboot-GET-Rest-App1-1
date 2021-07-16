package in.anand.response;



public class Book {
	
	private Integer bookId;
	private String bookName;
	private Double bookprice;
	
	
	public Book(Integer bookId, String bookName, Double bookprice) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookprice = bookprice;
	}
	public Integer getBookId() {
		return bookId;
	}
	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public Double getBookprice() {
		return bookprice;
	}
	public void setBookprice(Double bookprice) {
		this.bookprice = bookprice;
	}
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", bookprice=" + bookprice + "]";
	}
	
	
	

}
