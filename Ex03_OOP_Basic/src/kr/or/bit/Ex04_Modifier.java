package kr.or.bit;
/*
 * ������(������):modifier
 * public(����: package ���о���, ���� ���о��� ��� �ڿ� ����)
 * private(����: Ŭ���� ���� �����ڿ�, �������� ���忡�� ���� �Ұ���.
 * default(
 * 
 * ��ü���� �� ������ Ư¡
 * 1.ĸ��ȭ (����ȭ)-private
 * 1-1.Ŭ���� ���ο� �ִ� �ڿ�(member field,method)����
 *     private int number;�����Ҵ��� ���� �����Ҵ��� ���ؼ� �ڿ���ȣ.(���:setter,getter �Լ��̿�)
 *     private�Լ� void call();�ٸ� �Լ��� ����.�����Լ�.�� ����...
 * 1-2.[�����Ҵ�]
 *     public class Car{public int door;}Car c=new Car();c.door=1000;
 *     ���࿡ ������ �ʴ� c.door=-1������ �����
 *     public class Car{private int door;
 *     public void writeDoor(int data){
 *     if(data>=0){
 *     door = data;}
 *     else { door=0;}
 *     }
 *     Car c = new Car(); c.writeDoor(-1); ->door :0
 *     private �����ϳ��� > �Լ� 2�� (write,read)
 *     java������ ������ ������ �Լ�. (setter(private�ڿ�write),getter(private �ڿ�  read_)
 *     ��������/�б�����
 *     private int age;\
 *     setter,getter
 *     setter
 *     gestter>private int age=100;
 *     
 * 
 */
public class Ex04_Modifier {

	public static void main(String[] args) {
		Car c=new Car();
		c.setSpeed(100);
		int result = c.getSpeed();
		System.out.println("�ӵ�: "+result);
		
		c.speedUp();
		c.speedUp();
		c.speedUp();
		result=c.getSpeed();
		System.out.println("�ӵ�: "+result);
		
		c.speedDown();
		c.speedDown();
		c.speedDown();
		c.speedDown();
		c.speedDown();
		result=c.getSpeed();
		System.out.println("�ӵ�: "+result);
	}

}
