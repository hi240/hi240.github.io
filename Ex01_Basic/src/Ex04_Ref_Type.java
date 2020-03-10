/*
클래스는 설계도이다 , 클래스는 타입이다
클래스 == 설계도 == 타입
클래스는 구체화 (집을 짓는 행위) 통해서 사용
프로그램 세계에서 집을 짓는 행위 new 연산자를 통해서 memory >> 객체(인스턴스)

 설계도
클래스 2가지
1. main 함수를 가지는 설계도 >> 독자적 실행 가능
2. main 함수 없는 설계도 >> 도와주는 역할 > 라이브러리 (lib)
   
*/
class Apt2 {  //현업에서는 클래스 안에 클래스 안만듬 //The type Apt is already defined
	          // 하나의 자바 파일에서 오픈된 클래스는 하나 밖에 없어야한다. public은 하나만
	int door = 10;
	int window = 20;
}


public class Ex04_Ref_Type {

	public static void main(String[] args) {
		//Apt2 설계도 >> 구체화 >> 메모리 올려야 (new 연산자)
		Apt2 lgapt = new Apt2();
		//lgapt 변수 (참조변수, 객체변수 (주소를 가지고 있는 변수))
		System.out.println("lgapt : " + lgapt);
		
		Apt2 ssapt = lgapt; //할당도 주소를 가지는 방법중에 하나
		ssapt.door = 555;
	}

}
