/*
 * ����ȭ(synchronized)
 * �������� thread�� ������ ���ִ� �Ѱ��� ȭ���(�����ڿ�):���� ���� �����尡 ���ÿ� ���ٰ����� �ڿ�
 * ȭ��� 1��, ��� 10�� (Thread 10��)
 * �ݴ�
 * �Ѱ� ����� ����:�������� ���
 * 
 * ��ü : Lock�� �ɼ���,
 * �Լ� : Lock�� �ɼ��� �ִ�.
 * ������ �Լ��� �ɰ�, ����ȭ��� �θ���.
 */
class Wroom{
	//void openDoor(String name){ �� �Ʒ��� �ٲٸ�, �����ġ ź��!
     synchronized void openDoor(String name){
		System.out.println(name+"�� ����ȸ ����");
		for(int i =0; i<100;i++) {
			System.out.println(name+"����ð�: "+i);
			if(i==10) {
				System.out.println(name + "���߱� ��");
			}
		}
		System.out.println("����� ����");
	}
}
class User extends Thread{
	Wroom wr;
	String who;
	User(String name,Wroom w){ //����.
		this.who = name;
		this.wr=w;
	}
	public void run() {
		wr.openDoor(this.who);
	}
}
public class Ex10_Sync_Thread {
	public static void main(String[] args) {
		//�Ѱ�
		Wroom w = new Wroom();
		//�����
		User kim = new User("kim",w);
		User park = new User("park",w);
		User lee = new User("lee",w);
		//������� �ɽ��ؿ�
		kim.start();
		park.start();
		lee.start();
		
	}

}
