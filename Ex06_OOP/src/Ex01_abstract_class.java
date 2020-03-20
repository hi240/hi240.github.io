/*
 * 추상클래스 
 * >>미완성 클래스 (미완성된 설계도)
 * 1.완성된 코드 + 미완성 코드
 * 2.완성(함수) 실행블럭이 있는 함수 + 미완성 (함수) 실행블럭이 없는 함수public void run(); >> {}X 
 * 3.완성/미완성의 차이는 new 객체 생성의 유무. new 객체 생성(완성), 객체 생성 불가능(미완성)
 * 
 * 정리
 * 1.추상클래스(미완성) 스스로 객체 생성 불가 (new 사용 불가능)
 * 2.추상클래스는 결국 완성된 클래스가 되는 것이 목적.
 * 3.추상클래스과 완성된 클래스가 되기 위한 방법? 상속. 따라서 상속이 목적.
 * 4.상속관계에서 미완성된 자원 (추상자원)완성해라. (구현) >> 재정의 해라. override
 * 
 * 설계자 입장에서
 * 내가 추상클래스를 만든다면 .. 이유는? 강제적 구현을 목적으로 한다. (재정의에 대한 강제성을 부여)
 * 자손클래스가 상속받은 추상클래스를 완성시켜야 한다.
 * 
 * 상속이 없으면 추상클래스는 있을 수 없다. 왜? 상속을 해야만 추상클래스 사용가능.
 */
abstract class ABclass{
	//추상클래스는 추상자원을 만들어야함.
	int pos=0;
	//완성코드
	void run() {
		pos++;
	}
	//미완성코드
	abstract void stop(); //{}이 실행블록 없다.
}
class Child extends ABclass{
	void stop() { //실행블럭만 강제. 내용은 없어도 무관!
		this.pos=0;
		System.out.println("stop: "+this.pos);
	}
}
class Child1 extends ABclass{
	void stop() { //실행블럭만 강제. 내용은 없어도 무관!
		this.pos=-1;
		System.out.println("stop: "+this.pos);
	}
}
public class Ex01_abstract_class {
	public static void main(String[] args) {
		//ABclass ab= new ABclass(); 불가...
		Child ch= new Child();
		ch.run();
		ch.run();
		System.out.println(ch.pos);
		ch.stop();
		
		Child1 ch2 = new Child1();
		ch2.run();
		ch2.run();
		ch2.stop();
		System.out.println(ch2.pos);
		
		//다형성
		ABclass ab= ch; //부모타입의 참조변수는 자식타입의 주소를 가질 수 있다. (다형성!!!)
		                //부모는 자신의 타입자원들만 활용
		                //**부모로 접근하더라도, 그 자원이 재정의 되어있다면, [자식 자원]으로 접근하게 된다..**
		System.out.println("g"+ch.pos);
		ab.run();
		ab.stop();
		System.out.println(ch.pos);
		//그런데 굳이 부모자원을 쓰고 싶다면, super을 써서 이용해야 한다...
		
	}

}
