/*
 * user ����� : provider ������
 * class A{},class B{}
 * ���� : A�� B�� ����Ѵ�.
 * Ǯ�̴� �� �ΰ�.
 * 1.���:A extends B
 * 2.����:A Ŭ���� �ȿ��� Member field B��� >> class A{B b;}
 *       ������ �� �κа� ��ü�� ��������.
 * 2-1.��ü
 * class B{}
 * class A{
 * int i;
 * B b; A�� B�� ����մϴ�. �����մϴ�.
 * A(){
 * b=new B();
 * }
 * A a= new A(); a�� �����Ǹ� a��ü�� ��������� B��ü�� ���� ����
 * ����! a�� �������� b�� ������.
 * --------------------------------------------------
 * 2-2.�κ�
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
 * ����! a�� �������� b�� �Ⱦ�����.
 * ---------------------------------------------------
 * class B{}
 * class A{
 * int i;
 * member field B��� Ÿ���� ������ ������ ����..
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
 * parameter�� ���Ǵ� Ÿ���� ���� ���
 * 
 */
interface Icall{
	void m();
}
class D implements Icall {
	public void m() {
		System.out.println("D Icall �������̽��� m()����");
	}
}
class F implements Icall {
	public void m() {
		System.out.println("F Icall �������̽��� m()����");
	}
}
//class C�� �������迡�� Ȱ��� ����..
class C {
	void method(Icall ic) { //ic������ � Ÿ���� ��ü�� ���� �� �ֳ�?
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
