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
		System.out.println("å ����>>"+bookType);
		System.out.println("å ���>>"+bookList);
		System.out.println("����>>"+author);
		System.out.println("���ǻ�>>"+publisher);
	}
}