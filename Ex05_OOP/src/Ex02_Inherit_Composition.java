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
	void draw() {        //������
		System.out.println("�׸���");
	}
}
class Radiance{
	int r=10;
	Radiance(){
		this.r=10;
	}
}
class Point{
	int x;
	int y;
	Point(){
		this(10, 15);
	}
	Point(int x,int y){
		this.x=x;
		this.y=y;
	}
}
class Rectangle extends Shape{

	Point[] pointarray;   
	Rectangle(){
	//pointarray=new Point[] {new Point(10,10),new Point(10,19),new Point(20,20),new Point(29,29)};	-�԰���
	this(new Point[] {new Point(10,10),new Point(10,19),new Point(20,20),new Point(29,29)});		
	}
	Rectangle(Point[] pointarray){ //�켱, Point�迭�� �Ű������� �ϴ� �ν��Ͻ��� ����ڴ�. 
		this.pointarray=pointarray;
	}
}
class Triangle2 extends Shape{
	Point[] pointarray;
	Triangle2(){
//		pointarray=new Point[3];
//		pointarray[0]=new Point(10,20);
//		pointarray[1]=new Point(30,40);
//		pointarray[2]=new Point(50,60);	
   this(new Point[] {new Point(10,20),new Point(30,40),new Point(50,60)});
   //this(new Point[] {(10,20),(30,40),(50,60)}); �̰� �ȵǴ� ������ 
   //���� �������� ���� int�迭�� ���� �ϴ�. ���� int�� �ؼ� �� �迭�� ���Ҹ� ä��� ��! �׷���, �� ����..
   //Point��� ��ü�� Ÿ������ �迭�� ���� ���̱� ������, �� ���ҷ� ��ü��� Ÿ���� ���;� �ϰ�, PointŬ���� �ȿ� �����ε����� �ʱ�ȭ��
   //�� �� �ִ� �����ڰ� �ֱ� ������ �װ��� ����ؼ� ��üȭ ������ �־��� �� �̴�.
	}
	Triangle2(Point[] pointarray){
		this.pointarray=pointarray;
	}
	void trianglePoint() {
    	for(Point point : this.pointarray) { 
    		//this�� �� ������ pointarray�� ���������� ���� ��������°Ŷ� ���� ���⶧���̴�.
    		//this.pointarray�� �����ν� Ŭ������ �ִ� ������ ���ٴ� �ǹ̸� ���� ���� �־��� �� �ִ�...
    		System.out.printf("point: (%d,%d)\t",point.x,point.y);
			System.out.println();
    	}
    }
}
class Triangle extends Shape{
	Point x;
	Point y;
	Point z;
    Triangle(){
//    	x=new Point(10,20);
//    	y=new Point(30,40);
//    	z=new Point(20,60);
    	this(new Point(10,20),new Point(30,40),new Point(20,60));
    }
    Triangle(Point x,Point y,Point z){
    	this.x=x;
    	this.y=y;
    	this.z=z;
    }
    //��üȭ, Ư��ȭ
    //�߰����� ���
    void trianglePoint() {
    	System.out.printf("x: (%d,%d) \t",x.x,x.y);
    	System.out.printf("y: (%d,%d) \t",y.x,y.y);
    	System.out.printf("z: (%d,%d) \t",z.x,z.y);
    	System.out.println();
    }
}
class Circle extends Shape{    //�����̴�.
	//Point point = new Point(); //���� ������ �ֵ�.	
	Point point; //�� new �Ƚ���?�ᵵ �Ǵµ� ������ ������ ����.(�Ʊ� ����)
	//Radiance r = new Radiance(); //�������� ������ �ְ�, default������ 10�� ������.
	int r;
	Circle(){
		//this.r=10;
	    //this.point=new Point(10,15);
	    this(10,new Point(10,15));
	}
	Circle(int r,Point point){
		this.r=r;
		this.point=point;
	}
}


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
		
		Triangle triangle = new Triangle();
		
		triangle.trianglePoint();
		triangle.draw();
		//�⺻���ƴѰ�
		Point[] pointarr= {new Point(11,21),new Point(31,42),new Point(52,62)};
		Triangle2 triangle2= new Triangle2(pointarr);
		triangle2.trianglePoint();
		//�⺻��
    //	Triangle2 triangle2= new Triangle2();
	//	triangle2.trianglePoint();
	}

}
