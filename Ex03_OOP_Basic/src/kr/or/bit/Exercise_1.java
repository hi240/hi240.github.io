package kr.or.bit;

import java.util.Scanner;

public class Exercise_1 {

	public static void main(String[] args) {   //��ǻ��
	
		 int price=30000000;
		 String brand="brand";
		 String serial="12313454623";
		 String color="red";
		 //��ǰ
		 Keyboard keyboard = new Keyboard();
		 Mainbody mainbody = new Mainbody();
		 Monitor monitor = new Monitor();
         //����
		 Boolean sleepmode=true; //�������Ŵ.
         //���
		 keyboard.button=false; //��ư��.
		 
		 mainbody.power=true; //����Ŵ.
		 
		 Calculator.minus(3,2); //��Ģ����
         System.out.println("�Է��ϰ����� ���ڸ� �Է��ϼ���");
      //   Scanner sc = new Scanner(System.in); 
		//  Write.write("����"); //�Է� �� ���
		 
		 
		 
		 // �Է�/��°����ϴ�. ����ų/�����ֵ�. ������� ��/����. ��Ģ����

	}
		 


}

	
