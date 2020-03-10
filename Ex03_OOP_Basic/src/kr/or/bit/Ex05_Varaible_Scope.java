package kr.or.bit;

/* instance variable >> class Car {String color;}
 * local variable >> class안에 있는 함수 안에 쓰이는 변수. class Car{public void move(){int speed;}}
 * main함수 안에 있는 모든 변수는 local variable >> 초기화
 * static variable >> 공유자원(객체간) ,객체 생성 이전에 memory 올라가는 자원
 * 
 */
class Variable {
	int iv;
/* 1.member field, instance variable
* 2.Variable v= new Variable(); heap 메모리에 iv가 생성됨.
* 3.Variable v2=new Variable(); heap 메모리에 iv 생성.
* 목적: 정보를 담을려고 한다. (정보에 맞는 타입설정)
* 정보(속성)-고유 상태, 부품(참조 정보)
* 정보는 생성되는 객체마다 다른 값을 가질 수 있다.
* 그래서 굳이 초기화를 하지 않는다.
* 기본적으로 default 값을 갖고있다. int>>0, float>>0.0 ...
* boolean false, String null, 참조타입>null
* 4.생성시점:new라는 연산자를 통해서 heap메모리에 객체가 만들어지고 나서 바로 변수 생성.
* 
*/
	static int cv;
	/*
* 1.class variable (클래스 변수),static variable(공유(객체간)변수)
* 2.목적: 정보를 담는것 ★★★생성되는 모든 객체가 공유하는 자원★★★객체간 공유자원
*   heap 영역에 생성된 객체들의 공통자원(공유자원)
* 3.특징:접근방법 1.클래스이름.static변수명(객체가 만들어지지 않은 상황에서도 접근가능)
* ex)Math.Random() 사용하기위해서 new Math로 정의한적이 없다(!)
* 접근방법 2.누구의 것도 아니기에,참조변수.static변수명 으로 접근가능
* Variable v= new Variable();
* Variable v2=new Variable();
* 1.variable.cv 클래스이름으로
* 2.v.cv        참조주소로
* 3.v2.cv       참조주소로
* 4.생성시점:Hello.java >javac Hello.java>Hello.class
* VM이 도는 시점은 java.exe키고,Hello엔터실행
* class loader System에 의해서
* 클래스 정보를 (metadata:설명)class area(method area)올려요.
* 이 클래스는 언제만들었고 어떤 자원을 import하고 있고 변수가 몇개...
* 이 클래스 안에 static variable 또는 static method 있으면
* 이 녀석을 memory(class area)에 올려 놓는다.*/
	
	void method() {
	int lv=0;
	/*
	 * local variable 함수안에 지역변수: 사용전에 반드시 초기화
	 * 생명주기:함수가 호출되면 생성되엇다가 함수가 끝나면 값이죽는다.
	 * 함수 안에 제어문
      for(int i..) i변수는 for이 실행되면 생성,끝나면 소멸
            블럭변수
	 */
	}
}

public class Ex05_Varaible_Scope {

	public static void main(String[] args) {
		Variable.cv=100;
		Variable v = new Variable();
		Variable v2 = new Variable();
		v2.cv=500;
		
	}

}
