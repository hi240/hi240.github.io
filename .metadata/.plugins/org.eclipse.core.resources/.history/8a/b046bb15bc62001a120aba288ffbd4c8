/*
 * OOP특징
 * 1.상속
 * 2.캡슐화(은닉화) ->Private
 * 3.다형성
 * 
 * 1. 상속표현
 * java : child extends Base
 * C# : child : Base
 * 
 * 2. 특징
 * 2-1. 다중 상속은 불가능하다.
 * 2-2. 단일 상속. (계층적 상속지원 : 통해서 여러 개의 클래스를 상속..)
 * 2-3. 다중 상속 지원(유일한 자원: Interface)
 * 
 * 3. 상속의 의미
 * 3-1. 장점 : 재사용성.
 * 3-2. 단점 : 초기비용이 많이듬.
 * 재사용성 >> 설계 >> 비용 (시간,공통자원(분모,추상화))
 * 
 * 
 * 4. 상속관계에서 메모리를 갖는 시점?
 * GrandFather  > father > child
 * 사용자가 만드는 모든 클래스는 default Object 클래스를 상속 합니다..........
 * class Car 라고 만들면.. 내부적으로는 class Car extends Object{}
 * Object는 모든 클래스의 root (최상위) : 모든 클래스의 부모 클래스
 * 
 * 
 */
class Car{}
class GrandFather {
     public GrandFather() {
    	 System.out.println("GrandFather");
     }
     public int gmoney=5000;
     private int pmoney=10000; //private이 상속관계 에서는, [접근 불가]:내부에서 활용하겠다.
}
class Father extends GrandFather {
	public Father() {
		System.out.println("Father");
	}
	public int fmoney=1000;
	
}
class Child extends Father{
	public Child() {
		System.out.println("Child");
	}
	public int cmoney=500;
	
}

public class Ex01_Inherit {

	public static void main(String[] args) {
	Child ch = new Child();
	System.out.println(ch.gmoney);
	System.out.println(ch.fmoney);
	System.out.println(ch.cmoney);
	ch.gmoney=200;
	
	Car c = new Car();
	}

}
