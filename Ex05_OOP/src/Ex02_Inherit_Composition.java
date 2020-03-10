/*
 * ���赵 1��.. ������ �������� ������
 * ������ ������ ����... 1�� �̻��� ���赵 ����.
 * ���>���θ� �����ؼ� ���赵�� 5���� ������..(ȸ������,�ֹ�����,��۰��� ��)
 * **������** ���� ���� ���赵�� (����)�� �ξ��ִ� ��.
 * 1.��Ӱ���(is ~a) �� ~�̴�.
 * 2.���԰���(has ~a)�� ~�� ������ �ִ�.
 * 
 * ��)
 * ��Ŭ����  ����Ŭ����
 * ���� �����̴�.
 * �� extends ���� [��Ӱ���]
 * 
 * ��Ŭ���� ��Ŭ����
 * ���� ���� ������ �ִ�. [���԰���]
 * �ʿ��� �ڿ��� member field�� ����� ��.
 * class �� {�� ������}
 * 
 * ����Ŭ���� ����Ŭ����
 * ������ ������ ������ �ִ�. [���԰���]
 * class ���� {���� ����}
 * 
 * ���� �����̴�.
 * �ﰢ���� �����̴�.
 * �簢���� �����̴�.
 * 
 * ���� : �߻�ȭ, �Ϲ�ȭ (�׸���,����)>>�����ڿ� �̴� ����.
 * �� : ��üȭ, Ư��ȭ(������, ��)>>���θ��� ������ Ư¡
 * �� : ��ǥ��(x,y)
 * ���� ���� ������ �ִ�.
 * �ﰢ���� ���� ������ �ִ�.
 * �簢���� ���� ������ �ִ�.
 * class Shape : �Ϲ�ȭ,�߻�,����(�׸���,����) > ��Ӱ���
 * class Point : �� > ���԰���
 * ��üȭ, Ư��ȭ : Circle, triangle 

 * �߻�ȭ, �Ϲ�ȭ, ����
 */
class Shape{
	String color="gold"; //����Ӽ�
	void draw() { //������
		System.out.println("�׸���");
	}
}
class Point{
	int x;
	int y;
	Point(){
		//this.x=1;
		//this.y=1;
		this(10, 15);
	}
	Point(int x,int y){
		this.x=x;
		this.y=y;
	}
}
class Radiance{
	int r=10;
	Radiance(){
		this.r=10;
	}
}
//���� ���� ���弼��... 
/* ���� �����̴�.
 * ���� ���� ���� �ִ�.
 * ���� �������� ������ �ִ�.
 * ���� �������� default������ 10�� ������
 * ���� x,y��ǥ�� default�� 10,15
 * �⺻���� �������� ������ �������� ���� ���� �Է¹��� �� �ִ�. (���� ����� �� ��)
 */
class Circle extends Shape{    //�����̴�.
	//Point point = new Point(); //���� ������ �ֵ�.	
	Point point; //�� new �Ƚ���?
	//Radiance r = new Radiance(); //�������� ������ �ְ�, default������ 10�� ������.
	int r;
	Circle(){
		//this.r=10;
	//	this.point=new Point(10,15);
	    this(10,new Point(10,15));
	}
	Circle(int r,Point point){
		this.r=r;
		this.point=point;
		
	}
}
//Circle circle = new Circle();

public class Ex02_Inherit_Composition {

	public static void main(String[] args) {

		Circle circle=new Circle();
		System.out.println(circle.r);
		System.out.println("�θ�: "+circle.color);
		System.out.println("x��ǥ: "+circle.point.x);
		System.out.println("y��ǥ: "+circle.point.y);
		circle.draw();
		Circle circle2=new Circle(20,new Point(2,5));
		System.out.println(circle2.r);
		System.out.println("�θ�: "+circle2.color);
		System.out.println("x��ǥ: "+circle2.point.x);
		System.out.println("y��ǥ: "+circle2.point.y);
		circle2.draw();
	}

}
