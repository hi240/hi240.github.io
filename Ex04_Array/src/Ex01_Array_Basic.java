import java.util.Arrays;

/*배열은(Array) 객체다
1.배열은 객체다 (new통해서 생성)
2.new heap 메모리에 생성된다.
3.고정배열(정적배열)배열의 크기는 한번 정해지면 고정된다.
4.자료구조의 기본입니다..
*/
public class Ex01_Array_Basic {

	public static void main(String[] args) {
		int s,s1,s2,s3;
		int[] score= new int[3];//방번호 (첨자,index)
		System.out.println(score[0]);
		score[0]=101; //각각의 방에 (index)를 사용해서 
		score[1]=20;
		score[2]=300;
		System.out.println(score[0]);
		
		//방의 개수는 항상 index값보다 1 크다..(n-1이 마지막 인덱스 값)
		
		//score[3]=40;
		//java.lang.ArrayIndexOutOfBoundsException:
		//예외가발생했어요
		//그래서 컴파일러가 강제로 프로그램을 종료.
		//문제가 발생했음에도 불구하고 일단 실행시키는 법은 try catch 구문을 사용
		//try catch는 오류를 해결하는게 아니고, 프로그램이 강제 종료되는 것만 막아준다.
		//Array 배열(궁합이 for문이랑 잘맞음)
		for(int i=0;i<3;i++) {
			System.out.printf("[%d]=%d\t",i,score[i]);
		}
		System.out.println();
		for(int i=0;i<score.length;i++) {
			System.out.printf("[%d]=%d\t",i,score[i]);
		}
		System.out.println();
		//Tip Array 도와주는 클래스
		String result = Arrays.toString(score); //지금은 쓰지 마세요.
		System.out.println(result);
		
		Arrays.sort(score); //자동으로 정렬. 지금은 쓰지 마세요.
		result = Arrays.toString(score);
		System.out.println(result);
		//Today Point
		//배열 3가지
		int[] arr = new int[5]; //기본 (방의 개수)
		int[] arr2= new int[] {100,200,300}; //초기값을 통해서 방이 만들어 지고 초기화
		int[] arr3= {11,22,33,44,55}; //컴파일러가 알아서 new 자동 생성
		//javascript : let cararr = [];
		
		for(int i=0;i<arr3.length;i++) {
			System.out.println(arr3[i]);
		}
		//배열은 객체다. 배열의 메모리는 heap이다.
		int[] arr4;
		arr4 = new int[] {2,3,4,2,5};
		System.out.println("arr4: "+arr4);
		int[] arr5 =arr4;
		System.out.println(arr5==arr4);
		
		String[] strarr = new String[] {"2","3","나"};

		char[] ch = new char[10]; //빈문자 '\u0000'
		for(int i=0;i<ch.length;i++) {
			System.out.println(">"+ch[i]+"<");
		}
		//8가지 기본타입과 string 타입이 > Array 타입가능
		//*클래스 타입 > Array 타입 가능
		//Car c = new Car();
		//Car c2 = new Car();
		//Car[] cars = new Car[10];
		
		
	}
}





