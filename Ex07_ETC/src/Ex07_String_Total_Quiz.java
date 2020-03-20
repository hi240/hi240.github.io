
import java.util.Scanner;

public class Ex07_String_Total_Quiz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		//주민번호 : 뒷번호 첫자리 : 1,3 남자 , 2,4 여자 라고 출력 ...
		//main 함수 Scanner 사용 주민번호 입력받고
		//앞:6자리 뒷:7자리
		//입력값 : 123456-1234567 
		//1. 자리수 체크 (기능)함수 (14 ok)
		//2. 뒷번호 첫번째 자리값 1~4까지의 값만 허용 기능함수
		//3. 뒷번호 첫번째 자리값을 가지고 1,3 남자 , 2,4 여자 출력 기능함수
		//3개의 함수 static 
		
		System.out.print("주번을 입력하세요: ");	 
		String num= sc.nextLine();
		numcheck(num);
		datacheck(num);
		mancheck(num);

	}


static void numcheck(String s) { //13자리인지 체크
	if(s.length()!=14)
	 {System.out.println("13자리를 정확히 입력해주세요");
	 }
}
static void datacheck(String s) { //뒷번호 첫번째 자리값 1~4까지의 값만 허용 기능함수
if(s.substring(7,8)!="1"|s.substring(7,8)!="2"|s.substring(7,8)!="3"|s.substring(7,8)!="4") {	
	System.out.println("주민번호 뒷번호를 올바르게 입력하세요.");
	return;
}		

}
static void mancheck(String s) { //뒷번호 첫번째 자리값을 가지고 1,3 남자 , 2,4 여자 출력 기능함수
if(s.substring(7,8)=="1"&&s.substring(7,8)=="3")
	{System.out.println("남자입니다.");} 
else
{ System.out.println("여자입니다.");
}
}


}