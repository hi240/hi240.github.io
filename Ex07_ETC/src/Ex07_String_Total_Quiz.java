
import java.util.Scanner;

public class Ex07_String_Total_Quiz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		//�ֹι�ȣ : �޹�ȣ ù�ڸ� : 1,3 ���� , 2,4 ���� ��� ��� ...
		//main �Լ� Scanner ��� �ֹι�ȣ �Է¹ް�
		//��:6�ڸ� ��:7�ڸ�
		//�Է°� : 123456-1234567 
		//1. �ڸ��� üũ (���)�Լ� (14 ok)
		//2. �޹�ȣ ù��° �ڸ��� 1~4������ ���� ��� ����Լ�
		//3. �޹�ȣ ù��° �ڸ����� ������ 1,3 ���� , 2,4 ���� ��� ����Լ�
		//3���� �Լ� static 
		
		System.out.print("�ֹ��� �Է��ϼ���: ");	 
		String num= sc.nextLine();
		numcheck(num);
		datacheck(num);
		mancheck(num);

	}


static void numcheck(String s) { //13�ڸ����� üũ
	if(s.length()!=14)
	 {System.out.println("13�ڸ��� ��Ȯ�� �Է����ּ���");
	 }
}
static void datacheck(String s) { //�޹�ȣ ù��° �ڸ��� 1~4������ ���� ��� ����Լ�
if(s.substring(7,8)!="1"|s.substring(7,8)!="2"|s.substring(7,8)!="3"|s.substring(7,8)!="4") {	
	System.out.println("�ֹι�ȣ �޹�ȣ�� �ùٸ��� �Է��ϼ���.");
	return;
}		

}
static void mancheck(String s) { //�޹�ȣ ù��° �ڸ����� ������ 1,3 ���� , 2,4 ���� ��� ����Լ�
if(s.substring(7,8)=="1"&&s.substring(7,8)=="3")
	{System.out.println("�����Դϴ�.");} 
else
{ System.out.println("�����Դϴ�.");
}
}


}