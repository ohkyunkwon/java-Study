# java-Study
import java.util.Scanner;


public class Show {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("도서 관리 프로그램 입니다..");
		int user = 0;
		while(user != 5){
			int type;
			System.out.println("대여 관리(1), 반납 관리(2), 회원 관리(3), 책관리(4) 끝내기(5)");
			user = sc.nextInt();
			switch(user){
			case 1: // 대여 관리
				System.out.println("대여한 책 날짜(1), 대여한 회원 정보(2) 중이 고르세요.");
				type = sc.nextInt();
				if(type <1 || type >2){
					System.out.println("잘못선택하셨습니다.");
					break;
				}
				break;			
			case 2: // 반납 관리
				System.out.println("반납한 날짜(1), 연체된 회원 정보(2) 중이 고르세요.");
				type = sc.nextInt();
				if(type <1 || type >2){
					System.out.println("잘못선택하셨습니다.");
					break;
				}
				break;
			case 3: // 회원 관리
				System.out.println("회원 생년월일(1), 회원 가입 날짜(2), 회원이 빌려간 책 조회(3) 중이 고르세요.");
				type = sc.nextInt();
				if(type <1 || type >3){
					System.out.println("잘못선택하셨습니다.");
					break;
				}
				break;
			case 4: // 책 관리
				System.out.println("책 종류(1), 책 목록(2), 저자(3), 출판사(4) 중이 고르세요.");
				type = sc.nextInt();
				if(type <1 || type >4){
					System.out.println("잘못선택하셨습니다.");
					break;
				}
			case 5: // 끝내기
				break;
			default:
				System.out.println("잘못입력하셨습니다.");
			
			}	
		}
	}
}
