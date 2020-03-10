package kr.or.bit;

/* instance variable >> class Car {String color;}
 * local variable >> class�ȿ� �ִ� �Լ� �ȿ� ���̴� ����. class Car{public void move(){int speed;}}
 * main�Լ� �ȿ� �ִ� ��� ������ local variable >> �ʱ�ȭ
 * static variable >> �����ڿ�(��ü��) ,��ü ���� ������ memory �ö󰡴� �ڿ�
 * 
 */
class Variable {
	int iv;
/* 1.member field, instance variable
* 2.Variable v= new Variable(); heap �޸𸮿� iv�� ������.
* 3.Variable v2=new Variable(); heap �޸𸮿� iv ����.
* ����: ������ �������� �Ѵ�. (������ �´� Ÿ�Լ���)
* ����(�Ӽ�)-���� ����, ��ǰ(���� ����)
* ������ �����Ǵ� ��ü���� �ٸ� ���� ���� �� �ִ�.
* �׷��� ���� �ʱ�ȭ�� ���� �ʴ´�.
* �⺻������ default ���� �����ִ�. int>>0, float>>0.0 ...
* boolean false, String null, ����Ÿ��>null
* 4.��������:new��� �����ڸ� ���ؼ� heap�޸𸮿� ��ü�� ��������� ���� �ٷ� ���� ����.
* 
*/
	static int cv;
	/*
* 1.class variable (Ŭ���� ����),static variable(����(��ü��)����)
* 2.����: ������ ��°� �ڡڡڻ����Ǵ� ��� ��ü�� �����ϴ� �ڿ��ڡڡڰ�ü�� �����ڿ�
*   heap ������ ������ ��ü���� �����ڿ�(�����ڿ�)
* 3.Ư¡:���ٹ�� 1.Ŭ�����̸�.static������(��ü�� ��������� ���� ��Ȳ������ ���ٰ���)
* ex)Math.Random() ����ϱ����ؼ� new Math�� ���������� ����(!)
* ���ٹ�� 2.������ �͵� �ƴϱ⿡,��������.static������ ���� ���ٰ���
* Variable v= new Variable();
* Variable v2=new Variable();
* 1.variable.cv Ŭ�����̸�����
* 2.v.cv        �����ּҷ�
* 3.v2.cv       �����ּҷ�
* 4.��������:Hello.java >javac Hello.java>Hello.class
* VM�� ���� ������ java.exeŰ��,Hello���ͽ���
* class loader System�� ���ؼ�
* Ŭ���� ������ (metadata:����)class area(method area)�÷���.
* �� Ŭ������ ����������� � �ڿ��� import�ϰ� �ְ� ������ �...
* �� Ŭ���� �ȿ� static variable �Ǵ� static method ������
* �� �༮�� memory(class area)�� �÷� ���´�.*/
	
	void method() {
	int lv=0;
	/*
	 * local variable �Լ��ȿ� ��������: ������� �ݵ�� �ʱ�ȭ
	 * �����ֱ�:�Լ��� ȣ��Ǹ� �����Ǿ��ٰ� �Լ��� ������ �����״´�.
	 * �Լ� �ȿ� ���
      for(int i..) i������ for�� ����Ǹ� ����,������ �Ҹ�
            ��������
	 */
	}
}

public class Ex05_Varaible_Scope {

	public static void main(String[] args) {
		Variable.cv=100;
		Variable v = new Variable();
		Variable v2 = new Variable();
		v2.cv=500;
		
	}

}