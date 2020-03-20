/*
 * 변수 <->상수
 * 상수: 한번 값이 초기화 되면 변경이 불가능하다.
 * 상수자원 : 고유값(주민번호), 수학적인 값: 파이값..
 * 상수는 관용적으로 [대문자]
 * 
 * java : final int NUM=10;
 * C#   : const int NUM=10;
 * 
 * final 키워드 ㅋ_ㅋ♬ㅋ_ㅋ♬ㅋ_ㅋ♬ㅋ_ㅋ♬ㅋ_ㅋ♬ㅋ_ㅋ♬ㅋ_ㅋ♬ㅋ_ㅋ♬ㅋ_ㅋ♬ㅋ_ㅋ♬ㅋ_ㅋ♬ㅋ_ㅋ♬ㅋ_ㅋ♬♥♡♥♡♥♡♥♡♥♡♥♡♥♡♥♡♥♡♥♡♥
 * 클래스 앞에 >> final class Car{}>>final Math>>상속불가 ♥♡♥♡♥♡♥♡♥♡♥♡♥♡♥♡♥♡♥♡♥♡♥♡♥♡♥♡♥♡♥♡♥♡♥♡♥♡♥♡♥♡♥♡♥♡♥♡♥♡♥♡♥
 * 함수 앞에 >> public final void print(){} >> 상속관계에서 재정의 하지마라.
 * 상수 >> public final String KIND="heart"; //상수
 * 
 */
class Vcard{ 
	final String KIND="heart"; //한번 초기화 된 값은 변경이 불가능 하다.★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆♬♬♬♬♪♩♬♪♩♬♪♩
	final int NUM=10;
	
	void method() {
		//자바 API 시스템 상수♥♡♡♡♥☆★☆＊*'`"º′*＊♡♥♡★♡♥♡♥♡★☆＊*'`"º′*＊♡♥♡★☆★☆★☆＊*'`"º′*＊♡♥♡★☆★☆★☆＊*'`"º′*＊♥♡♥♡★☆★
		System.out.println(Math.PI);
	}
}
class Vcard2{
	final String KIND;
	final int NUM;
//	Vcard2(){
//		this.KIND="heart";
//		this.NUM=10;
//	}
	Vcard2(String kind,int num){
		this.KIND=kind;
		this.NUM=num;
	}
	@Override
	public String toString() { //객체를 문자열로 반환할 때 사용.
		return "Vcard2 [KIND=" + KIND + ", NUM=" + NUM + "]";
	}
}
//53장의 카드 kind 다르게 만들고싶어요 하지만 만들어지면 바꾸지않게...

public class Ex07_Inherit_Final {

	public static void main(String[] args) {
 
		Vcard2 c = new Vcard2("spade",1); 
		System.out.println(c.toString());
		Vcard2 c2 = new Vcard2("HEART",2);
		System.out.println(c2.toString());
		Vcard2 c3 = new Vcard2("STAR",3);
		System.out.println(c3.toString());
		
		// c.KIND="heart"; //한번 초기화 된 값은 수정이 불가능하다. [상수]
		}

}
