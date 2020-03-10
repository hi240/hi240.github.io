/*
 * ������ �Լ� ! = constructor 
 * 1.�Լ��� �Լ���, Ư���� ������ �Լ�!
 * 2.Ư���� ����? member field �ʱ�ȭ/ �ʱ�ȭ�� �� ���� �ִ� �Լ�.
 * 3.�Ϲ��Լ��� �ٸ���!?
 * 3-1.�Լ��� �̸��� ������ ����.(class�̸��� �����ϰ�)
 * 3-2.������� ������ return Type�� ����.(������ return type�������� void�ݾƿ�, �ٵ� �� �Ƚ��?->default�� void�� ������ ����)
 * 3-3.�������:��ü����(new)�ǰ� ������ ��������� [�ڵ�]���� [ȣ��Ǵ� �Լ�] >> ������ �Լ�.
 * �����ϰ� �̸��� �θ��� �ʾƵ� �ڵ����� ȣ��Ǵ� �Լ�.
 * 4.����:�����Ǵ� ��ü����, ���������� �ٸ� member field���� (�ʱⰪ) �ο��ϴ� ���
 * class Car {String color;}
 * Car c = new Car(); �� ����� ���� ���� ��, ������ ������ �����ָ� ���ڴµ�.. �̷���! �����ڸ� ����!!!!!
 * 5.������ �Լ� ���� overloading �����ϴ�.
 * 
 * "Car(){}" <<<��༮�� ������ �Լ���!
 *
 * ���� overloading�� ������ �Լ��� �ϳ��� �����ߴٸ�
 * default ������ �Լ��� �ݵ�� ������ ���ؼ��� ���� �� �ִ�.
 * �ֳ�? ������ �ǵ��� ���� ()�ȿ� ���� ���� ������, ������� �ҷ��� �Ҽ��� �����ϱ�
 * 
 *  
 * Tip) static {} , {} �ʱ���! (�����ڿʹ� �ٸ���. �� ����ߴ����� �𸣰���;;)
 * Ŭ������ ����� ����� Ư���� �Լ��� �����Ǵ±���.. class�̸��ϰ� �Ȱ���..
 * 
 */
//�������� �ǵ�: �ڵ����� ���� ��, �ݵ�� �ڵ����� �̸��� �־��.
class Car{ 
	String carname;
	//default �����Ǿ� �־���.
	//�����Ϸ��� ���� �ڵ����� ������ , �ڵ����� �ڵ带 �����.
	//Car(){}
}
class Car2{
	String carname;
	Car2(){ 
		System.out.println("���� default ������ �Դϴ�.(�ڵ�ȣ��)");
		         //������ ��� �޸𸮸� ���鶧 ȣ��Ǳ� ������, �ƹ� return���� �����ټ� ����.(����.)
		carname="����";//�����ڰ� member field�� �ʱⰪ�� ���� �� �ִ�..
	}
}
class Car4{
	int door;
	int wheel;        
	Car4(){
		System.out.println("default");
	}
	//method overloading (�Լ�)
	//�����ε�
	Car4(int num){
		door=num;
		System.out.println("overloading door: "+ door);
	}
	Car4(int num,int num2){
		door = num;
	    wheel = num2;
	    System.out.println("overloading door: "+ door+"/ wheel :"+wheel);
	}
}
public class Ex16_Constructor_overloading {
	public static void main(String[] args) {
		//Car c1  = new Car();
		//c1.carname="�ҳ�Ÿ"; // �̸��� �������� �ʴ´�...
		
		Car car=new Car();
	
		car.carname="2";
		Car2 c2=new Car2(); //car2()�������Լ��� ȣ��. ������ ()�̰� class Car2 �ȿ��ִ� Car2()������..
		System.out.println(c2.carname);
		
		//��Ģ�����δ� ��ü�� ������ �� ������ �Լ��� 1���� ȣ���� �� �ִ�.
		Car4 c4=new Car4();
		Car4 c5=new Car4(100);
		Car4 c6=new Car4(10,20);
		
		/* �ڵ��� �ֹ�����
		 * Case
		 * Case �⺻�ڵ���
		 * Case1 �ڵ�������
		 * Case2 �ڵ�������,����
 		 * Case3 �ڵ�������,����,�׺� ����
		 ������ overloading Ȱ�� (������)
		 */
}

}