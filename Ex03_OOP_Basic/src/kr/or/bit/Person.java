package kr.or.bit;
/*Ŭ����=���赵=Ÿ��
���赵�� �����ɰ����� �������ʴ´�
��üȭ �Ȱ� > ��ü,�ν��Ͻ�
���赵 �⺻���� ������� (�ʵ�+�Լ�)+������
class Car{} >> default class car {} //>���� ������������밡��
public class Car{ public String color; int door}



*/
public class Person {
     public String name;   //member field >>instance variable 
                            //�ʱ�ȭ�� ���� �ʾƵ� �ȴ�.
                            //�����Ǵ� ��ü(���)���� �ٸ� �̸��� ������ ������..
                            //Person p = new Person(); p.name="ȫ�浿"
                            //Person p2 = new Person(); p2.name="dd"
                            //default ���� ������.
                            //public int age;    default�� 0
                            //public boolean power;  default�� false
     public int age;
     //���(����) -�޼���
     public void print3(int coin) {   //()�� ���� ����. �׷��� void �� ��µǴ°� ����. 
     }
     public String print1(int coin1) {
    	 return "����";               // ������ ������, String���� ��ȯ����.
     }
     public void print() {
    	 System.out.println(name+age);            
     }
     public boolean power;  //boolean�� �⺻���� false
     //String�� �⺻���� null��.
     Tv stv= new Tv();
 //    stv.brandname="";
    
    //  System.out.println("����ä�� ����:"+stv.ch);
      //ch��,brandname���� ����ϴ� ����� �߰�
      

     
     
}