package kr.or.bin.common;

import java.util.Scanner;

public class bitmain {
//CarŬ����, person Ŭ���� bitmain ���� �����ȿ� �ִ�...
	
	public static void main(String[] args) {
	Car c= new Car();
	Person p = new Person();
	c.door=200;
	
	Scanner sc = new Scanner(System.in);
    int a=((int)(Math.random() * 3) + 1);//a=1 ���� , a=2 ����, a=3��
    System.out.printf("���� ���� �� ����\n����/����/�� �� �ϳ��� �Է��ϼ���!\n");
    String d=sc.nextLine();
    while(!(d.equals("����")||d.equals("����")||d.equals("��"))) {  //�߸� �Է��� ���
     System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է��� �ּ���.");
     System.out.println("���� ���� �� ����\n����/����/�� �� �ϳ��� �Է��ϼ���!\n");   
     d=sc.nextLine();
      }
      
    if(d.equals("����")) {
        if(a==1) System.out.println("��ǻ�ʹ� ����, ��ŵ� ����, �����ϴ�");          
        else if(a==2) System.out.println("��ǻ�ʹ� ����, ����� ����, ����� �����ϴ�.");
        else System.out.println("��ǻ�ʹ� ��, ����� ����, ����� �̰���ϴ�.");
    }else if(d.equals("����")) {
        if(a==1) System.out.println("��ǻ�ʹ� ����, ����� ����, ����� �̰���ϴ�.");
        else if(a==2) System.out.println("��ǻ�ʹ� ����, ��ŵ� ����, �����ϴ�");
        else System.out.println("��ǻ�ʹ� ��, ����� ����, ����� �����ϴ�.");
    }else if(d.equals("��")) {
        if(a==1) System.out.println("��ǻ�ʹ� ����, ����� ��, ����� �����ϴ�.");
        else if(a==2) System.out.println("��ǻ�ʹ� ����, ����� ��, ����� �̰���ϴ�.");
        else System.out.println("��ǻ�ʹ� ��, ��ŵ� ��, �����ϴ�");
    }
	}

}
