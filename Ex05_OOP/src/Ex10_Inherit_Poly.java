/*
 * oop 3대 특징
 * 상속 캡슐화 다형성
 * Polymorphism 다형성이란?
 * (상속관계에서 존재)
 * 
 * C#  :다형성(overloading, override) 능력
 * java:[상속관계]에서 [하나의 참조변수]가 [여러개의 타입]을 가질 수 있는 능력
 *      단, 하나의 참조변수는 [부모타입] 이어야 한다.
 * 부모 클래스 타입의 참조변수로 여러 개의 자식 클래스 객체를  참조 할 수 있다.
 * 
 * 다형성: 현실과 반대로 자식은 부모에게 조건없이 준다.
 */
class Tv2{ //부모 (일반화,추상화) 공통자원
	boolean power;
	int ch;
	void power() {
		this.power=!this.power;
	}
	void chUp() {
		this.ch++;
	}
	void chDown() {
		this.ch--;
	}
}
class Captv extends Tv2{ //capTv 특수화, 구체화되고 고유한 표현..
	String text;
	String captionText() {
		return this.text="현재 자막 처리중..";
	}
}
public class Ex10_Inherit_Poly {

	public static void main(String[] args) {
		Captv captv=new Captv();
		captv.power();
		System.out.println("전원: "+captv.power);
		captv.chUp();
		System.out.println("채널정보: "+captv.ch);
		System.out.println("자막처리: "+captv.captionText());
        //기존 배운 내용
		//같은 타입 끼리만 할당이 가능했었다..
		//Car c = new Car();
		//Car c2= c; <-이런 식으로 할당했었다...
		Tv2 tv2=captv;
		/*[상속관계]에서 [부모타입]은 [자식타입]의 주소를 가질 수 있다.(다형성)
		단 부모는 자신의 객체만 볼 수 있다.
		단 재정의만 제외하고.
		Tv2 tv = new Tv2(); (X) */
		System.out.println(tv2.toString());
		System.out.println(captv.toString());
		//tv2.captionText();// (X) >>자신의 객체만>>자식의 자원 접근 불가..
        
		
	}
	
}
