public class Product {
	private String bookType;
	private String bookList;
	private String author;
	private String publisher;
	public Product(String bookType, String bookList, String author, String publisher) {
		this.bookType = bookType;
		this.bookList = bookList;
		this.author = author;
		this.publisher = publisher;

	}
	public void setBookType(String bookType){
		this.bookType = bookType;
	}
	public String getBookType(){
		return bookType;
	}
	public void setBookList(String bookList){
		this.bookList = bookList;
	}
	public String getBookList(){
		return bookList;
	}
	public void setAuthor(String author){
		this.author = author;
	}
	public String getAuthor(){
		return author;
	}
	public void setPublisher(String publisher){
		this.publisher = publisher;
	}
	public String getPublisher(){
		return publisher;
	}
	public void showInfo(){
		System.out.println("책 종류>>"+bookType);
		System.out.println("책 목록>>"+bookList);
		System.out.println("저자>>"+author);
		System.out.println("출판사>>"+publisher);
	}
}