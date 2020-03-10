/*
 Objected Oriented Programming 객체지향프로그래밍
 1.상속(Inheritance) 재사용을 위해 공통분모를 찾는 행위.
 2.캡슐화(은닉화): private: 직접할당을 막고 간접할당을 한다: setter,getter(특수한 함수)
 3.다형성
 
 다형성의 한 부분으로.. [오버로딩]
 method overloading 오버로딩과 오버라이딩(상속간의 재정의)의 차이점?
 오버로딩: 하나의 이름으로 여러가지 기능을 하는 것. (함수의 이름은 하나인데, 여러개의 파라미터를 가진 여러가지 함수를 사용)
 System.out.println이 바로 대표적인 오버로딩 함수
 특징: 오버로딩은 성능향상에 도움을 준다 (X)
 why? 개발자가.편하게 사용하려고
 왜? 하나의 함수이름. <쩜만 눌러도 오버로딩 해놓은 기능이 쭉 나오기 때문에 편리함.
 함수의 활용은 여러 개의 함수를 생성하려는게 아니고, 하나의 함수를 만들어서, 그 함수의 parameter을 달리한다.
 
 문법: 함수 이름은 같고 parameter의 [개수]와 [타입]을 달리하는 방법
 조건1. 함수 이름은 같아야한다.
 조건2. parameter의 갯수 또는 타입은 달라야한다.
 조건3. return타입은 영향을 주지 않는다. return type은 오버로딩의 판단 기준이 아니다.
 조건4. parameter의 순서가 다름을 인정한다.
 */

class Human{
	String name;
	int age;
}
class OverTest{
	int add(int i) {
		return 100+i;
	}
	int add(int l,int m) { //오버로딩(o) 함수이름은 똑같은데, error가 안난다?
		return l+m;        //parameter가 2개 이기 때문에, 다른 애이다.
	}
	//String add(int k) {} //오버로딩(x) int add(int i) 얘랑 같은 녀석이기 때문에!!!
	String add(String s) { //오버로딩(o) 파라미터의 개수는 같지만, 타입은 다르므로 인정!
		return s+"hello";
	}
	void add(int i, String s) {
		System.out.println("오버로딩: "+i+"/"+s);
	}
	void add(String s,int i) {  //오버로딩(o) 파라미터의 타입이 똑같지만, 순서가 다르면 인정!
		System.out.println("나도 오버로딩: "+s+"/"+i);
	}
	void add(Human h) {  //오버로딩(o)
		h.name="홍길동";
		h.age=20;
		System.out.println(h.name+h.age);
	}
}
public class Ex14_Method_Overloading {

	public static void main(String[] args) {
	 OverTest ot = new OverTest();
	 ot.add(100);
	 ot.add(2,2);
	 int result = ot.add(10,20);
	 System.out.println("result+ "+result);
	// ot.add(new Human()) ok
	Human h = new Human();
	ot.add(h);
	
	}

}
