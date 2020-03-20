/*
 * user 사용자 : provider 제공자
 * class A{},class B{}
 * 관계 : A는 B를 사용한다.
 * 풀이는 총 두개.
 * 1.상속:A extends B
 * 2.포함:A 클래스 안에서 Member field B사용 >> class A{B b;}
 *       포함은 또 부분과 전체로 나눠진다.
 * 2-1.전체
 * class B{}
 * class A{
 * int i;
 * B b; A는 B를 사용합니다. 포함합니다.
 * A(){
 * b=new B();
 * }
 * A a= new A(); a가 생성되면 a객체가 만들어지면 B객체도 같이 생성
 * 차이! a가 없어지면 b도 없어짐.
 * --------------------------------------------------
 * 2-2.부분
 * class B{}
 * class A{
 * int i;
 * B b;
 * A(B b){
 * this.b=b;
 * }
 * }
 * B b = new B();
 * A a = new A(b);
 * 차이! a가 없어져도 b는 안없어짐.
 * ---------------------------------------------------
 * class B{}
 * class A{
 * int i;
 * member field B라는 타입을 가지는 변수는 없다..
 * void print(B b){}
 * B print(){
 *   B b = new B();
 *   return B;
 * }
 * }
 * B b = new B();
 * A a = new A();
 * a.print(b);
 * 
 * parameter로 사용되는 타입을 직접 명시
 * 
 */
interface Icall{
	void m();
}
class D implements Icall {
	public void m() {
		System.out.println("D Icall 인터페이스의 m()구현");
	}
}
class F implements Icall {
	public void m() {
		System.out.println("F Icall 인터페이스의 m()구현");
	}
}
//class C는 의존관계에서 활용법 예시..
class C {
	void method(Icall ic) { //ic변수는 어떤 타입의 객체를 받을 수 있나?
		ic.m();
	}
}
public class Ex05_User_Provider {

	public static void main(String[] args) {
	
        D d = new D();
        F f = new F();
	    C c = new C();
	
        c.method(d);
        c.method(f);
      //c.method(c); (X)
        
	}

}
