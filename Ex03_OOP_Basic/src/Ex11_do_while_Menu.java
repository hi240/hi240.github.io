import java.util.Scanner;

public class Ex11_do_while_Menu {
	Scanner sc = new Scanner(System.in); //부품 (참조:클래스)	
    //기능
	void inputRecord() {
		System.out.println("성적데이터 입력: ");
	}
	void deleteRecord() {
		System.out.println("성적데이터 삭제: ");
	}
	void sortRecord() {
		System.out.println("성적데이터 정렬: ");
	}	
	int displayMenu() {
		System.out.println("****************");
		System.out.println("*****성적관리*****");
		System.out.println("1. 학생성적 입력하기");
		System.out.println();
		System.out.println("2. 학생성적 삭제하기");
		System.out.println();
		System.out.println("3. 학생성적 이름순 정렬하기");
		System.out.println();
		System.out.println("4. 프로그램 종료");
		System.out.println();			
		int menu=0;
		do {
			try {         //trycatch 구문은 예외처리할때 제격이다. 예외가 나더라도, 프로그램이 계속 진행될 수 있게....
				menu =Integer.parseInt(sc.nextLine());
			if(menu>=1&&menu<=4) {   //do while문 탈출 (1~4사이 값이면,)
				break; 
			}else {
				//1보다 작거나 4보다 큰값. 프로그램적인 오류는 아니다. 그러나 나는 오류로취급 하겠다.
				//System.out.println("잘못입력하셨습니다");
				throw new Exception("메뉴 선택 번호가 잘못되었습니다.");
			}
			}catch(Exception e) {
			System.out.println(e.getMessage());//사용자가 만든 오류데이터를 뿌린다.즉, Exception이라는 메모리에 들어있는 문구를 호출하는 함수.
			System.out.println("메뉴 선택 문제 발생");
			System.out.println("메뉴 1~4번까지 입력");
			}
			
		}while(true); //내가 원하는 값이 나올떄 까지 계속 입력받을 수 있는 장점이있다.
		//실행 : 사용자가 1~4까지의 번호중에서 하나를선택
		return menu;
	}
	
	public static void main(String[] args) {
		Ex11_do_while_Menu ex11=new Ex11_do_while_Menu();
		while(true) {
			switch(ex11.displayMenu()) {
			case 1:ex11.inputRecord();
			break;
			case 2:ex11.deleteRecord();
				break;
			case 3:ex11.sortRecord();
				break;
			case 4:System.out.println("프로그램 종료");
			          //return; 메인함수를 종료...(마찬가지임)
			          System.exit(0); //프로그램 자체를 강제종료하는 함수.
				}
		}

	}

}
