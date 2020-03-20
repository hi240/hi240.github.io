/*
 * 추상클래스 : 인터페이스(표준,약속,규칙,규약 만드는 행위)
 * 1.스스로 객체 생성 불가능 (new연산자를 사용 불가능)
 *   추상클래스(미완성),인터페이스(모든 것이 추상 자원)
 * 2.상속(extends), 구현(implements)을 통해서만 사용 가능.(heap메모리에 적재가 가능하다.)
 * 3.재정의를 통한 강제적 구현이 목적이다.
 * 
 * 추상클래스와 인터페이스의 다른점?
 * 1.인터페이스는 다중 구현이 가능하다. (약속(표준) 작게 만들어야..범용화될 수 있게): 작은 약속을 모아모아서 크게 만든다.
 *   class Test extends Object implements Ia,Ib,Ic
 * 2.추상클래스는 단일 상속이 원칙(계층적 상속을 통해서는 가능)
 * 3.추상클래스는 완성된 코드+미완성 코드
 * 4.인터페이스는 상수를 제외한 나머지는 미완성(추상)
 * 
 * 인터페이스 : 소프트웨어 설계에서 최상위단계에 존재.
 * *초급 개발자 입장에서*
 * 1.인터페이스를 [다형성] 입장으로 접근. (인터페이스를 부모 타입)
 * 2.서로 연관성이 없는 클래스를 하나로 묶어주는 기능을 하는 측면(부모를 동일하게 만들자)
 * 3.인터페이스는 만들지 않아도 Java API 거의 제공..
 * 4.인터페이스는 (~able) : 날 수 있는, 수리할 수 있는 (설계)
 * 5.객체간의 연결 고리(객체 소통 역할)
 * 
 * 소프트웨어 설계
 * 1.개발단계의 최상위 > 요구사항에 따른 설계를 함.
 * 2.설계 표준에 따라 강제 이해(구현)> 재정의 되게.
 * 
 * Interface
 * 1.실제 구현부가 없다 : 실행 블럭이 없다. 약속(시스템에서 이동:move, 좌표값 받자)
 *                                    void move(int x,int y); 추상메서드다.
 *                                    인터페이스의 모든 메서드는 추상자원임.
 * JavaAPI (개발에 필요한 수 많은 인터페이스를 설계 : 인터페이스를 기반으로 생성된 수 많은 클래스가 있다.
 * Collection이라고 부름.(동적배열) 방이 1개 였다가 3개.. 등 가변적임. Vector,ArrayList,HashSet,HashMap 등..
 * 표준화된 약속을 구현하고 있는 Class들이다.
 * 여러 개의 Interface 구현..
 * 
 * 생성방법
 * 1.상수(final): public static final int VERSION=1;
 * 어차피 인터페이스로 만드는 모든 자원은 public아닌가요? > 그래서 int VERSION=1; 이렇게 짧게 생략 가능.
 * 2.함수(method): public abstract void run(); > void run(); 이렇게 짧게.
 * 3.           : String move(int x, int y); > 
 * 
 * interface Ia{
 *    int VERSION=1;
 *    void run();
 *    String move(int x, int y);
 *    }
 * 
 */

//class Test implements Ia, Ib{
//	@Override
//	public void run() {
//	}
// }

interface Ia{
	int AGE=100; //public static final 생략
	String GENDER="여";
	String print(); //public이면서, abstract 인게 생략!
	void message(String str); //public abstract
}
interface Ib{
	int AGE=10;
	void info();
	String val(String s);
}
class Test2 extends Object implements Ia,Ib{ //Ia에 관한 내용을 강제적으로 구현한다. 는 약속임.

	public String print() {
		return null;
	}
	
	public void message(String str) {
	}

	public void info() {
	}

	public String val(String s) {
		return null;
	}
}
public class Ex03_Interface {

	public static void main(String[] args) {		
     
	
     Test2 t=new Test2();
   //System.out.println(t.AGE); // 에러. 두 interface의 AGE 중 어떤 것인지 판단 안되기 때문
     Ia ia=t; //다형성 - > 원래는 부모는 자식꺼를 못쓰는데, 자식의 객체를 이식해줌으로써 부모도 자식 자원에 접근하게 된다.
     System.out.println(ia.AGE);
     Ib ib=t;
     System.out.println(ib.AGE);
	}

}
