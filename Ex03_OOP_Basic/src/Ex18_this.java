/*
 * 1.��ü �ڽ��� ����Ű�� this(������ ������ ��ü�� �ּҸ� ���� ���̶�� ����)
 * 2.this ��ü �ڽ� (������ ȣ��, �ڱⰡ �ڱ� ������ ȣ��):��Ģ������, �����ڴ� ��ü�� ���������, �Ѱ��� ȣ���.
     �׷��� ���������� this�� Ȱ���ϸ�, ���� ���� �����ڸ� ȣ���� �� ����....��today point��
 */
/* class Test6{
	int i;
	int j;
	Test6(){ //default constructor
	}
	//������ ���忡�� Test6(int k, int p){ �������� ����. �׷��� ��������..
	//�ǵ����̸�,,,, parameter�̸���... ����� �Ҵ��Ϸ��� �ϴ� instance �������� �����ϰ� �ϸ� ���?
	//���� �ǹ��ִ� ������ >> ������>> ���������� ���ϴ�.. �ڵ带 ���� �� ���߰� �Ǵ°� ����..
	//[�׷��� �� �ν��Ͻ� ������ parameter�� �޴� i �� j �� �ٸ��ٴ� ���� �˷��ְڴ�.]�� ���� this�� ��.
	Test6(int i, int j){
		//this.i >>Test6�� ������ �ִ� member
		this.i=i; //this. i �� i �� instance�� ������. �� �������ִ� ���� i ��.
		this.j=j;
	}
}
class Book2{
	String bname;
	Book2(String bname){
		this.bname=bname;
	}
}*/

//Today Point
class SoCar{
	String color;
	String geartype;
     int door;
	
	SoCar(){ //�⺻Ÿ��
		this("red","auto",3);
		System.out.println(this.color+"/"+this.geartype+"/"+this.door);
	}
	SoCar(String color,String geartype,int door){
		this.color=color;
		this.geartype=geartype;
		this.door=door;
		System.out.println(this.color+"/"+this.geartype+"/"+this.door);
	}
 }
public class Ex18_this {

	public static void main(String[] args) {

		SoCar socar = new SoCar();
		//socar.print();
		SoCar socar2=new SoCar("pink","auto",6);
	   //socar2.print();
	}
}