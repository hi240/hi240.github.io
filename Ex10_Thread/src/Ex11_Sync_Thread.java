/*
 * ���� ���¸� �ϳ� ������ �ִ�.
 * ���� ���¸� ���ؼ� �Ա� .��ݾ����� �Ѵ�.
 * 
 * ģ�� 3���� �𿩼� �Ȱ��� ī�带 3�� �����ϰ�
 * ���ÿ� ���...
 * ���� 1000
 * ATM ��⿡�� ����� �Ѵٰ� ����.
 */
class Account{
	int balance=1000;
	//������ �Ѹ��̶� ���� withdraw�� �����ϸ�, �۾��� ���� �� ���� Lock �ɾ�α�.
	void withDraw(int money) {//����ȭ �������� �۾��� ���������� lock.
	System.out.println("��: "+Thread.currentThread().getName());
	System.out.println("�����ܾ�: "+this.balance);
	
	if(this.balance >=money) {
		try {
			Thread.sleep(1000); //���� ���� ���� �����ϴ°���...
		} catch (Exception e) {
			e.getMessage();
		}
		this.balance-=money;
	}
	System.out.println("����ݾ�: "+money);
	System.out.println("���� �� �ܾ�: "+this.balance);
	}
}
class Bank implements Runnable{
	Account acc = new Account();
	public void run(){
		while(acc.balance>0) {
			int money = (int)(Math.random()*3 +1)*100;
			acc.withDraw(money);
		}
	}
}
public class Ex11_Sync_Thread {

	public static void main(String[] args) {
		Bank bank = new Bank();
		Thread th = new Thread(bank,"park"); //�ڵ����� �����ε��� �Լ��� ����.
		Thread th2 = new Thread(bank,"kim");
		Thread th3 = new Thread(bank,"lee");
		th.start();
		th2.start();
		th3.start();
		
	}

}
