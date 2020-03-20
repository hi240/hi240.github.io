import java.util.ArrayList;
import java.util.HashMap;

public class Account1 {
		int num;
		String name;
		int money;
        static HashMap<Integer,String> hashAccount;
        ArrayList<HashMap<String, String>> list ;
        Bank1 bank;
	
Account1(){
}

Account1(String name){
	hashAccount= new HashMap<Integer,String>();
	list = new ArrayList<HashMap<String,String>>();
	bank= new Bank1();
	this.num=(int)Math.random()*100000+1;
	this.name=bank.openaccount(name);
	hashAccount.put(num,name);  //hashmap에 자동 만들어진 계좌와 이름이 들어간다.
	this.money=0;
}

void deposit(int money) {   //입금
	this.money +=money;
}
void withdraw(int money) {  //출금
	this.money -=money;
}
public int check() {
	return this.money;      //잔고
}
	
	public static void main(String[] args) {
	
		
	}

}
