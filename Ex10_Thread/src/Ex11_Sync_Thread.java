/*
 * 은행 계좌를 하나 가지고 있다.
 * 은행 계좌를 통해서 입금 .출금업무를 한다.
 * 
 * 친구 3명이 모여서 똑같은 카드를 3장 복제하고
 * 동시에 출금...
 * 통장 1000
 * ATM 기기에서 출금을 한다고 가정.
 */
class Account{
	int balance=1000;
	//누군가 한명이라도 먼저 withdraw에 접근하면, 작업이 끝날 때 까지 Lock 걸어두기.
	void withDraw(int money) {//동기화 누군가의 작업이 끝날떄까지 lock.
	System.out.println("고객: "+Thread.currentThread().getName());
	System.out.println("현재잔액: "+this.balance);
	
	if(this.balance >=money) {
		try {
			Thread.sleep(1000); //기계들 동작 텀을 가정하는것임...
		} catch (Exception e) {
			e.getMessage();
		}
		this.balance-=money;
	}
	System.out.println("인출금액: "+money);
	System.out.println("인출 후 잔액: "+this.balance);
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
		Thread th = new Thread(bank,"park"); //자동으로 오버로딩된 함수가 있음.
		Thread th2 = new Thread(bank,"kim");
		Thread th3 = new Thread(bank,"lee");
		th.start();
		th2.start();
		th3.start();
		
	}

}
