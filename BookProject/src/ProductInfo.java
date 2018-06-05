import java.util.Scanner;


public class ProductInfo {
	static int productID = 0;
	static int numberOfProduct = 0;
	static Product[] p = new Product[10];
	public static void main(String[] args) {
		Scanner sin = new Scanner(System.in);
		int choice = 0;
		while (choice != 3){
			int type;
			System.out.println("상품 추가(1), 모든 상품 조회(2), 끝내기(3)");
			choice = sin.nextInt();
			switch (choice){
				case 1: // 상품 추가
					if(numberOfProduct > p.length){
						System.out.println("더 이상 추가할 수 없습니다.");
						break;
					}
					System.out.print("상품 종류 책(1), 음악CD, 회화책(3)");
					type = sin.nextInt();
					if(type < 1 || type > 3){
						System.out.println("잘못된 상품 종류 입니다.");
						break;
					}
					addProduct(type);
					break;
				case 2: //모든 상품 조회
					for(int i=0; i<numberOfProduct; i++)
						p[i].showInfo();
					break;
					default:
						System.out.println("잘못 입력하셨습니다.");
					
			}
		}

	}
	private static void addProduct(int type) {
		Scanner sin = new Scanner(System.in);
		System.out.println("상품 설명>>");
		String desc = sin.nextLine();
		System.out.println("생산자>>");
		String maker = sin.nextLine();
		System.out.println("가격>>");
		int price = sin.nextInt();
		sin.nextLine();
		switch (type){
			case 1: //책
				System.out.println("대여 날짜>>");
				String title = sin.nextLine();
				System.out.println("대여 회원>>");
				
				p[numberOfProduct] =
				new Book(Loanmember, rental);
				break;
			case 2: //음악CD
				System.out.println("반납>>");
				String albumTitle = sin.nextLine();
				System.out.println("연체 회원>>");
				String artist = sin.nextLine();
				p[numberOfProduct] = 
				new CompactDisc(returnday, overduemember);
				break;
			case 3: // 회화책
				System.out.println("회원 생일>>");
				String title2 = sin.nextLine();
				System.out.println("회원 가입 날짜>>");
				String author2 = sin.nextLine();
				System.out.println("대여 책 조회>>");
				String language = sin.nextLine();
				System.out.println("ISBN>>");
				int ISBN2 = sin.nextInt();
				p[numberOfProduct] = 
						new ConversationBook(birthday, joinday, loanbook);
					break;
			case 4: // 회화책
				System.out.println("회원 생일>>");
				String title3 = sin.nextLine();
				System.out.println("회원 가입 날짜>>");
				String author3 = sin.nextLine();
				System.out.println("대여 책 조회>>");
				String language = sin.nextLine();
				System.out.println("ISBN>>");
				int ISBN2 = sin.nextInt();
				p[numberOfProduct] = 
						new ConversationBook(birthday, joinday, loanbook);
					break;
		}
		numberOfProduct++;
	}

}
