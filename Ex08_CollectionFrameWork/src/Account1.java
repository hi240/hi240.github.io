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
	hashAccount.put(num,name);  //hashmap�� �ڵ� ������� ���¿� �̸��� ����.
	this.money=0;
}

void deposit(int money) {   //�Ա�
	this.money +=money;
}
void withdraw(int money) {  //���
	this.money -=money;
}
public int check() {
	return this.money;      //�ܰ�
}
	
	public static void main(String[] args) {
	
		
	}

}
