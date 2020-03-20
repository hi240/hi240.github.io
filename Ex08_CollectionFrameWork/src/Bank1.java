import java.util.Scanner;

public class Bank1 {
    Scanner sc;
	int accountTotal;
    Account1 account;
	
	Bank1(){
		sc = new Scanner(System.in);
		this.accountTotal=accountTotal;
		
	}
	String openaccount(String name) {
		System.out.println("이름을 입력하세요.");
		account= new Account1(sc.nextLine());
		System.out.println(account.hashAccount);
		return name;
	}
	
	public static void main(String[] args) {
		Bank1 b = new Bank1();
		b.openaccount("이서영");
		
	}

}
