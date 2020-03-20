/*
 * String 클래스
 * String str = new String ("홍길동");
 * 8가지 기본 타입과 동일하게 사용할 수 있도록 설계
 * int i=100;
 * String str="홍길동";
 * 
 * 1.String 클래스: 데이터의 저장 구조가 character배열이다.char[]배열저장>[홍][길][동]이런 식..
 * String ename="ABC" >> char[]>>[A][B][C]
 * class String extends Object{
 *  char[]....
 *  void length(){}
 *  @Override
 *  String toString(){ 
 *  재정의..  }
 *
 * }
 */
public class Ex05_String_Class {

	public static void main(String[] args) {

		String str="홍길동";
		System.out.println(str.length());//내부적으로 배열로 돼있다.
		System.out.println(str); //str.toString()과 동일 toString이 생략되어서임..
		System.out.println(str.toString());
		//원래같으면 주소 값이 나와야 정상. 즉, str공간은 스택에 마련, "홍길동"은 heap에 저장돼있음.
		String str1="AAA";
		String str2="AAA";
		System.out.println(System.identityHashCode("str1: "+str1));
        System.out.println(System.identityHashCode("str2: "+str2));
		System.out.println(str1==str2);//true
		//문자열 비교는 결국 (참조하는 heap의) 주소값을 비교하는 것("xx번지"=="xx번지")
		//그치만 문자열의 내용이 같다면? 같은 heap을 공유한다.
		System.out.println(str1.equals(str2));
		//**실제로 heap에 있는 값을 비교 ("AAA"=="AAA")
		String str3=new String("BBB"); //new를 사용하면, 새로운 객체를 생성한다.
		String str4=new String("BBB");

		System.out.println(str3 == str4);//false xx번지 ==yy번지 를 물어보는 것.
		System.out.println(str3.equals(str4));//true "BBB"=="BBB"  입니까
		System.out.println(System.identityHashCode("str3: "+str3));
        System.out.println(System.identityHashCode("str4: "+str4));
        System.out.println("str1: "+System.identityHashCode(str1));//문자열stack주소확인
        System.out.println("str2: "+System.identityHashCode(str2));
        System.out.println("str3: "+System.identityHashCode(str3));
        System.out.println("str4: "+System.identityHashCode(str4));
		String s="A";
		s+="B"; 
		s+="c"; 
		System.out.println(s);
		s="A";
		System.out.println(s);
		
	}

}
