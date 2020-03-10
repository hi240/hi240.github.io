/*
 Objected Oriented Programming ��ü�������α׷���
 1.���(Inheritance) ������ ���� ����и� ã�� ����.
 2.ĸ��ȭ(����ȭ): private: �����Ҵ��� ���� �����Ҵ��� �Ѵ�: setter,getter(Ư���� �Լ�)
 3.������
 
 �������� �� �κ�����.. [�����ε�]
 method overloading �����ε��� �������̵�(��Ӱ��� ������)�� ������?
 �����ε�: �ϳ��� �̸����� �������� ����� �ϴ� ��. (�Լ��� �̸��� �ϳ��ε�, �������� �Ķ���͸� ���� �������� �Լ��� ���)
 System.out.println�� �ٷ� ��ǥ���� �����ε� �Լ�
 Ư¡: �����ε��� ������� ������ �ش� (X)
 why? �����ڰ�.���ϰ� ����Ϸ���
 ��? �ϳ��� �Լ��̸�. <���� ������ �����ε� �س��� ����� �� ������ ������ ����.
 �Լ��� Ȱ���� ���� ���� �Լ��� �����Ϸ��°� �ƴϰ�, �ϳ��� �Լ��� ����, �� �Լ��� parameter�� �޸��Ѵ�.
 
 ����: �Լ� �̸��� ���� parameter�� [����]�� [Ÿ��]�� �޸��ϴ� ���
 ����1. �Լ� �̸��� ���ƾ��Ѵ�.
 ����2. parameter�� ���� �Ǵ� Ÿ���� �޶���Ѵ�.
 ����3. returnŸ���� ������ ���� �ʴ´�. return type�� �����ε��� �Ǵ� ������ �ƴϴ�.
 ����4. parameter�� ������ �ٸ��� �����Ѵ�.
 */

class Human{
	String name;
	int age;
}
class OverTest{
	int add(int i) {
		return 100+i;
	}
	int add(int l,int m) { //�����ε�(o) �Լ��̸��� �Ȱ�����, error�� �ȳ���?
		return l+m;        //parameter�� 2�� �̱� ������, �ٸ� ���̴�.
	}
	//String add(int k) {} //�����ε�(x) int add(int i) ��� ���� �༮�̱� ������!!!
	String add(String s) { //�����ε�(o) �Ķ������ ������ ������, Ÿ���� �ٸ��Ƿ� ����!
		return s+"hello";
	}
	void add(int i, String s) {
		System.out.println("�����ε�: "+i+"/"+s);
	}
	void add(String s,int i) {  //�����ε�(o) �Ķ������ Ÿ���� �Ȱ�����, ������ �ٸ��� ����!
		System.out.println("���� �����ε�: "+s+"/"+i);
	}
	void add(Human h) {  //�����ε�(o)
		h.name="ȫ�浿";
		h.age=20;
		System.out.println(h.name+h.age);
	}
}
public class Ex14_Method_Overloading {

	public static void main(String[] args) {
	 OverTest ot = new OverTest();
	 ot.add(100);
	 ot.add(2,2);
	 int result = ot.add(10,20);
	 System.out.println("result+ "+result);
	// ot.add(new Human()) ok
	Human h = new Human();
	ot.add(h);
	
	}

}
