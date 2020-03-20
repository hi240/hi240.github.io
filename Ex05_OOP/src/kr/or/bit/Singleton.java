package kr.or.bit;
//���������� (��������) >> new >>��ü�� ����� ���
//��ü �ϳ��� ���� ����..
//ȸ�� : ����������,

//Singleton�� ���鼭 ���� ���� �� �ִ� ������ : ��ü�� �ּҰ� �׻� �����ϴ�.

//Ȱ�� : JDBC���� �غ� ���Դϴ�. java<(JDBC)>database DB�� �̾��ִ� �������̽���. 

//main�Լ�
//Singleton singleton = new Singleton(); ������ ȣ��. ->�����ڰ� ������ ȣ���� �����ؼ� �׵��� public�� �����ڿ���.
//�������� singleton �ڵ� ¥���� �ܰ���.
public class Singleton {
   private static Singleton p;
   private Singleton(){     //���� ��ü���� �Ұ���. 14_singleton���� new�� ������.
	   //�����ڸ� �������ν� ������� �����ڸ� ������.
   }
   public static Singleton getInstance() {
	   if(p==null) {          //�����ڶ� �ʱ�ȭ �Ȱ� ���ٸ�,
		   p=new Singleton(); //��������, ���� �ʱ�ȭ���� �����ڸ� ���� �� �ְԵ�.
	   }
	   return p; //private Singleton�� �����ִ°� ��ǥ�����ϱ� �̷���.
   }
}
//�ٽ� �ѹ� �Ẹ�� �� �ܿ��.

 
 
 