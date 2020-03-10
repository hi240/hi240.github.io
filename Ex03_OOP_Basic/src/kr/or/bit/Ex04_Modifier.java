package kr.or.bit;
/*
 * 접근자(한정자):modifier
 * public(공유: package 구분없이, 폴더 구분없이 모든 자원 공유)
 * private(개인: 클래스 내부 공유자원, 참조변수 입장에서 접근 불가능.
 * default(
 * 
 * 객체지향 언어가 가지는 특징
 * 1.캡슐화 (은닉화)-private
 * 1-1.클래스 내부에 있는 자원(member field,method)적용
 *     private int number;직접할당을 막고 간접할당을 통해서 자원보호.(방법:setter,getter 함수이용)
 *     private함수 void call();다른 함수의 보조.공통함수.의 역할...
 * 1-2.[직접할당]
 *     public class Car{public int door;}Car c=new Car();c.door=1000;
 *     만약에 원하지 않는 c.door=-1넣으면 어떡하지
 *     public class Car{private int door;
 *     public void writeDoor(int data){
 *     if(data>=0){
 *     door = data;}
 *     else { door=0;}
 *     }
 *     Car c = new Car(); c.writeDoor(-1); ->door :0
 *     private 변수하나당 > 함수 2개 (write,read)
 *     java에서는 툭수한 목적의 함수. (setter(private자원write),getter(private 자원  read_)
 *     쓰기전용/읽기전용
 *     private int age;\
 *     setter,getter
 *     setter
 *     gestter>private int age=100;
 *     
 * 
 */
public class Ex04_Modifier {

	public static void main(String[] args) {
		Car c=new Car();
		c.setSpeed(100);
		int result = c.getSpeed();
		System.out.println("속도: "+result);
		
		c.speedUp();
		c.speedUp();
		c.speedUp();
		result=c.getSpeed();
		System.out.println("속도: "+result);
		
		c.speedDown();
		c.speedDown();
		c.speedDown();
		c.speedDown();
		c.speedDown();
		result=c.getSpeed();
		System.out.println("속도: "+result);
	}

}
