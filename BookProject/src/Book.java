
public class Book extends Product{
	private int rental;
	private String Loanmember;
	public Book(String bookType, String bookList, String author, String publisher, int rental, String loanmember) {
		super(bookType, bookList, author, publisher);
		this.rental = rental;
		this.Loanmember = Loanmember;
	}
	public void setLoanmember(String Loanmember){
		this.Loanmember = Loanmember;
	}
	public String getLoanmember(){
		return Loanmember;
	}
	public void showInfo(){
		super.showInfo();
		System.out.println("�뿩��¥>>"+rental);
		System.out.println("�뿩�� ȸ��>>"+Loanmember);
		
	}

}
