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
			System.out.println("��ǰ �߰�(1), ��� ��ǰ ��ȸ(2), ������(3)");
			choice = sin.nextInt();
			switch (choice){
				case 1: // ��ǰ �߰�
					if(numberOfProduct > p.length){
						System.out.println("�� �̻� �߰��� �� �����ϴ�.");
						break;
					}
					System.out.print("��ǰ ���� å(1), ����CD, ȸȭå(3)");
					type = sin.nextInt();
					if(type < 1 || type > 3){
						System.out.println("�߸��� ��ǰ ���� �Դϴ�.");
						break;
					}
					addProduct(type);
					break;
				case 2: //��� ��ǰ ��ȸ
					for(int i=0; i<numberOfProduct; i++)
						p[i].showInfo();
					break;
					default:
						System.out.println("�߸� �Է��ϼ̽��ϴ�.");
					
			}
		}

	}
	private static void addProduct(int type) {
		Scanner sin = new Scanner(System.in);
		System.out.println("��ǰ ����>>");
		String desc = sin.nextLine();
		System.out.println("������>>");
		String maker = sin.nextLine();
		System.out.println("����>>");
		int price = sin.nextInt();
		sin.nextLine();
		switch (type){
			case 1: //å
				System.out.println("�뿩 ��¥>>");
				String title = sin.nextLine();
				System.out.println("�뿩 ȸ��>>");
				
				p[numberOfProduct] =
				new Book(Loanmember, rental);
				break;
			case 2: //����CD
				System.out.println("�ݳ�>>");
				String albumTitle = sin.nextLine();
				System.out.println("��ü ȸ��>>");
				String artist = sin.nextLine();
				p[numberOfProduct] = 
				new CompactDisc(returnday, overduemember);
				break;
			case 3: // ȸȭå
				System.out.println("ȸ�� ����>>");
				String title2 = sin.nextLine();
				System.out.println("ȸ�� ���� ��¥>>");
				String author2 = sin.nextLine();
				System.out.println("�뿩 å ��ȸ>>");
				String language = sin.nextLine();
				System.out.println("ISBN>>");
				int ISBN2 = sin.nextInt();
				p[numberOfProduct] = 
						new ConversationBook(birthday, joinday, loanbook);
					break;
			case 4: // ȸȭå
				System.out.println("ȸ�� ����>>");
				String title3 = sin.nextLine();
				System.out.println("ȸ�� ���� ��¥>>");
				String author3 = sin.nextLine();
				System.out.println("�뿩 å ��ȸ>>");
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
