
public class CompactDisc extends Product{
	private int returnday;
	private String overduemember;
	public CompactDisc(String bookType, String bookList, String author, String publisher, int returnday, String overduemember){
		super(bookType,  bookList, author, publisher);
		this.returnday = returnday;
		this.overduemember = overduemember;
	}
	public void setreturnday(int returnday){
		this.returnday = returnday;
	}
	public int getreturnday(){
		return returnday;
	}
	public void setoverduemember(String overduemember){
		this.overduemember = overduemember;
	}
	public String getoverduemember(){
		return overduemember;
	}
	public void showInfo(){
		super.showInfo();
		System.out.println("반납 날짜>>"+returnday);
		System.out.println("연체 회원>>"+overduemember);
	}

}