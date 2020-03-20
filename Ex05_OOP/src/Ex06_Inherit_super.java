/*
 * this : ��ü �ڽ��� ����Ű�� this (this.empno, this.ename)
 * this : �����ڸ� ȣ���ϴ� this (this(100,"ȫ�浿"))
 * 
 * ���
 * �θ�: �ڽ�
 * super (���� �ڽ��� �θ� ���� �ּҰ�) : ��Ӱ��迡�� �θ� �����ϴ� ���! super(�θ��� �ּ�)
 * super
 * 1.��Ӱ��迡�� �ڽ��� �θ��ڿ��� ������ �� �ִ�.
 * 2.��Ӱ��迡�� �θ��� �����ڸ� ��������� ȣ���� �� �ִ�.
 * 
 * C# >> base()
 * 
 */
class Base{
	String basename;
	Base(){
		System.out.println("Base �⺻ ������ �Լ�");
	}
	Base(String basename){
		this.basename=basename;
		System.out.println("basename: "+this.basename);
	}
	void method() {
		System.out.println("�θ� method");
	}
}

class Derived extends Base{
	String dname;
	Derived(){
		System.out.println("Derived �⺻ ������ �Լ�");
	}
	Derived(String dname){
		super(dname); //�ڽ��� dname�� �޾ƹ�����, �θ� �װɷ� �ٲ�����
		this.dname=dname;
		System.out.println("dname : "+this.dname);
	}
	@Override
	void method() {
		System.out.println("�ڽ� method");
	}
	//����� �θ���� �ڿ��� �׸���.(method�Լ�) ������ �ع���? �������.
	//������ ��� : super(�ڽ��� �Լ� �������� ���) (������ �̰� ���� �� �����Ϸ����� �𸣰���)
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
