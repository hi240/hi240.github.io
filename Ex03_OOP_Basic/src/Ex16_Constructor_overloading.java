/*
 * 생성자 함수 ! = constructor 
 * 1.함수긴 함순데, 특수한 목적의 함수!
 * 2.특수한 목적? member field 초기화/ 초기화를 할 수도 있는 함수.
 * 3.일반함수와 다른점!?
 * 3-1.함수의 이름이 고정돼 있음.(class이름과 동일하게)
 * 3-2.실행시점 때문에 return Type이 없다.(원래는 return type없으려면 void잖아요, 근데 왜 안써요?->default로 void기 때문에 생략)
 * 3-3.실행시점:객체생성(new)되고 변수가 만들어지고 [자동]으로 [호출되는 함수] >> 생성자 함수.
 * 유일하게 이름을 부르지 않아도 자동으로 호출되는 함수.
 * 4.목적:생성되는 객체마다, 강제적으로 다른 member field값을 (초기값) 부여하는 방법
 * class Car {String color;}
 * Car c = new Car(); 이 사람이 차를 만들 때, 무조건 색상을 정해주면 좋겠는데.. 이럴때! 생성자를 쓴다!!!!!
 * 5.생성자 함수 또한 overloading 가능하다.
 * 
 * "Car(){}" <<<요녀석이 생성자 함수임!
 *
 * 만약 overloading된 생성자 함수를 하나라도 구현했다면
 * default 생성자 함수는 반드시 구현을 통해서만 만들 수 있다.
 * 왜냐? 설계자 의도에 따라 ()안에 값을 넣지 않으면, 못만들게 할려고 할수도 있으니까
 * 
 *  
 * Tip) static {} , {} 초기자! (생성자와는 다르다. 왜 언급했는지는 모르겠음;;)
 * 클래스를 만들면 사실은 특수한 함수가 생성되는구나.. class이름하고 똑같은..
 * 
 */
//설계자의 의도: 자동차를 만들 때, 반드시 자동차의 이름을 넣어라.
class Car{ 
	String carname;
	//default 생략되어 있었다.
	//컴파일러가 직접 코딩하지 않으면 , 자동으로 코드를 만든다.
	//Car(){}
}
class Car2{
	String carname;
	Car2(){ 
		System.out.println("나는 default 생성자 입니다.(자동호출)");
		         //생성자 얘는 메모리를 만들때 호출되기 때문에, 아무 return값도 돌려줄수 없다.(참고.)
		carname="포니";//생성자가 member field의 초기값을 넣을 수 있다..
	}
}
class Car4{
	int door;
	int wheel;        
	Car4(){
		System.out.println("default");
	}
	//method overloading (함수)
	//오버로딩
	Car4(int num){
		door=num;
		System.out.println("overloading door: "+ door);
	}
	Car4(int num,int num2){
		door = num;
	    wheel = num2;
	    System.out.println("overloading door: "+ door+"/ wheel :"+wheel);
	}
}
public class Ex16_Constructor_overloading {
	public static void main(String[] args) {
		//Car c1  = new Car();
		//c1.carname="소나타"; // 이름을 강제하지 않는다...
		
		Car car=new Car();
	
		car.carname="2";
		Car2 c2=new Car2(); //car2()생성자함수를 호출. 여기의 ()이게 class Car2 안에있는 Car2()였구나..
		System.out.println(c2.carname);
		
		//원칙적으로는 객체를 생성할 때 생성자 함수는 1개만 호출할 수 있다.
		Car4 c4=new Car4();
		Car4 c5=new Car4(100);
		Car4 c6=new Car4(10,20);
		
		/* 자동차 주문제작
		 * Case
		 * Case 기본자동차
		 * Case1 자동차색상
		 * Case2 자동차색상,썬팅
 		 * Case3 자동차색상,썬팅,네비 장착
		 생성자 overloading 활용 (강제성)
		 */
}

}