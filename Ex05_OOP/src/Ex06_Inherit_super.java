/*
 * this : 객체 자신을 가리키는 this (this.empno, this.ename)
 * this : 생성자를 호출하는 this (this(100,"홍길동"))
 * 
 * 상속
 * 부모: 자식
 * super (현재 자식이 부모에 접근 주소값) : 상속관계에서 부모에 접근하는 방법! super(부모의 주소)
 * super
 * 1.상속관계에서 자식이 부모자원에 접근할 수 있다.
 * 2.상속관계에서 부모의 생성자를 명시적으로 호출할 수 있다.
 * 
 * C# >> base()
 * 
 */
class Base{
	String basename;
	Base(){
		System.out.println("Base 기본 생성자 함수");
	}
	Base(String basename){
		this.basename=basename;
		System.out.println("basename: "+this.basename);
	}
	void method() {
		System.out.println("부모 method");
	}
}

class Derived extends Base{
	String dname;
	Derived(){
		System.out.println("Derived 기본 생성자 함수");
	}
	Derived(String dname){
		super(dname); //자식이 dname을 받아버리면, 부모도 그걸로 바껴버림
		this.dname=dname;
		System.out.println("dname : "+this.dname);
	}
	@Override
	void method() {
		System.out.println("자식 method");
	}
	//어느날 부모님의 자원이 그리워.(method함수) 재정의 해버림? 방법없음.
	//유일한 방법 : super(자식의 함수 내에서만 사용) (솔직히 이걸 굳이 왜 설명하려는지 모르겠음)
	void p_method() {
		super.method();
	}
}
public class Ex06_Inherit_super {
	public static void main(String[] args) {
		Derived d=new Derived("hello");
		d.method();
		d.p_method();
	}

}
