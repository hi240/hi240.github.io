import java.util.Scanner;

public class Ex10_Statement {

	public static void main(String[] args) {
	/*	//반복문 (while, do while)
		int i=10;
		while(i>=10) {
			System.out.println(i);
			 i--;// 반드시 조건에 증가감을 통해 true false를 만들어줘야함.
			//break;
		}

		//while 1~100까지의 합
		//누적값:
	/*	int sum=0;
		int j = 1;
		while(j <= 100) {
			//sum +=j;
			//j++;
			
			//j++;
			//sum +=j;   //위와 얘는 다르다.
		}
		System.out.println("1~100까지의 합: "+sum);
		*/

		//while 문으로 구구단을출력하세요
		
	/*	int k=2,p=1,num=0;
		while(k<=9) {
			p=1; ///내가 틀렸던부분!!!
			while(p<=9) {
				num=k*p;
				System.out.printf("%d * %d = %d\n",k,p,num);
				p++;
			}
			k++;
		}
*/

		//do ~~while : 강제적 수행.. 무조건 한번은 실행 되게 하겠다.
		//do {실행문} while(조건)
		//메뉴구성
		//1.인사
		//2.급여
		//당신이 원하는 업무 번호는 입력하세요 do {}무조건
		//입력값:3 while(조건) 에서 판단. . . . . .
	/*	Scanner sc = new Scanner(System.in);
		int inputdata =0;
		do {
			System.out.println("숫자입력해 (0~9)");
			inputdata = Integer.parseInt(sc.nextLine());
		}while(inputdata>=10); //조건이 true이면 do문을 계속 실행
		//inputdata 값이 9가 온다면 조건 false반환.. 탈출
		System.out.println("당신이 입력한 숫자는:"+inputdata);
	
	}
*/
	
	}}


