/*
thread�� �켱������ �ִ�.
cpu �������� �������� ������ �� �ִ�.
MIn 1~ max 10 . default�� 5.
 */
class Pth extends Thread{
	public void run() {
		for(int i =0;i<1000;i++) {
			System.out.println("----------------");
		}
	}
}
class Pth2 extends Thread{
	public void run() {
		for(int i =0;i<1000;i++) {
			System.out.println("||||||||||||||||||||");
		}
	}
}
class Pth3 extends Thread{
	public void run() {
		for(int i =0;i<1000;i++) {
			System.out.println("*********************");
		}
	}
}
public class Ex07_priority {

	public static void main(String[] args) {
Pth pth  = new Pth();
Pth2 pth2 = new Pth2();
Pth3 pth3 =new Pth3();
System.out.println(pth.getPriority()); //getPriority (�켱������ ������� �Լ�)
System.out.println(pth2.getPriority()); //getPriority (�켱������ ������� �Լ�)
System.out.println(pth3.getPriority()); //getPriority (�켱������ ������� �Լ�)
pth.setPriority(10); //���� endȮ�� ����.
pth3.setPriority(1); //���� ���� Ȯ�� ����.
pth.start();
pth2.start();
pth3.start();

	}

}
