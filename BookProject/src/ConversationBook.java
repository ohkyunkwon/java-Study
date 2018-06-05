
public class ConversationBook extends Book{
	private int birthday;
	private int joinday;
	private String loanbook;
	public ConversationBook(String bookType, String bookList, String author, String publisher, int rental, String loanmember){
		super(bookType, bookList, author, publisher, rental, loanmember);
		this.setBirthday(birthday);
		this.setJoinday(joinday);
		this.setLoanbook(loanbook);
	}
	public void setBirthday(int birthday){
		this.birthday = birthday;
	}
	public int getBirthday(){
		return birthday;
	}
	public void setJoinday(int joinday){
		this.joinday = joinday;
	}
	public int getJoinday(){
		return joinday;
	}
	public void setLoanbook(String loanbook){
		this.loanbook = loanbook;
	}
	public String getLoanbook(){
		return loanbook;
	}
	public void showInfo(){
		super.showInfo();
		System.out.println("ȸ�� ����>>"+birthday);
		System.out.println("ȸ�� ���Գ�>>"+joinday);
		System.out.println("�뿩å ��ȸ>>"+loanbook);
	}
}
