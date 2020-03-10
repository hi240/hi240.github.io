package kr.or.bit;

import java.util.Scanner;

/*
 * ���,���� ����� ���
 * �Լ� (function, method)
 * �Լ�(method): ���� �Ǵ� ����� �ּҴ���
 * ���� ���� �Կ� �Ұ���! > �Դ´�. �ܴ�. ���´�.
 * �Լ��� �ϳ��� ��ɸ� �����Ѵ�.
 * Ŭ���� : �ʵ� + �Լ� + ������
 * ex) ���ӹ� : ���ӱ� �������� ... �Լ�����
 *     �����̱� �������� ������ �޴� �� ... �Լ�����
 * JAVA �Լ��� ������ ũ�� 4����
 * 1.void, parameter(X):void print(){�����ڵ�} �������ٰ������غ���� �׷��� �� �����ϴٰ� �������� .
 * 2.void, parameter(0):void print(String str) {�����ڵ�} 
 * 3.return Type, parameter(0): int print(int data){return 100;}
 * 4.return Type, parameter(X): int print(){return 200;}
 * void : �����ִ� ���� ����. ���ݴ� �����ϰ� Ǯ��, return value�� ����. �ϰ� �ƹ��� ��ٷ����� �����°� ����.
 * return Type : ����,�Ǽ� �� 8������ �⺻ Ÿ���� �� ���ִ�.+String+ ����Ÿ�� (class�� Ÿ���̴�.)+Array+Collection+Interface 
 * ex) Car print(){return new Car();} //Car��� ������ �����, return���� �� �Լ��� �ּҰ��� ����, ������ �ּҰ��� �Ҵ��Ѵ�.
 * ex) boolean print(){return true;}
 * parameter(����,�μ��Ű���,���ް�):���ӱ��� ���� ����.(1���ϼ���, �������� ���� �ֵ�.)
 * ��������2���� 2���� ���� �־�� ������ �ǿ�. ���������� 10���� 10�� �� �־�� ������ �ſ�.
 * ex)void print(int a, int b, int c, int d, int f) : print(10,20,30,"a") (x) ������ ���ڶ�� int�� �ƴϿ��� �ȵ�.
 *                                                  : print(10,10,10,10,10,) (0)
 * :getChannelNumber(),getEmpListByEmpno �Լ��̸��� �f���� ������� �����Ҽ��־���Ѵ�. ù���ڴ� �ҹ���. . . .
 * �Լ���� �� �ݵ�� ȣ�� �Ǿ���Ѵ�.
 * 
 * 
 * 
 */
public class Fclass {
     public int data;
     public void m() {
    	 System.out.println("�Ϲ��Լ�:void ,parameter(x)");
     }
     public void m2(int i) {
    	 System.out.println("parameter value (scope : �Լ�����) :"+i); //�Լ��� �Ķ���ʹ� �Լ� �������� ��ȿ�ϴ�.
    	 System.out.println("�Ϲ��Լ� : void, parameter(0)");
     }
     public int m3() {
    	 return 100;
     }
     public int m4(int data) {
      return data+1;
     }   
     //Ȯ��
     public int sum(int i, int j,int k) {
    	 return i+j+k;
     }
     //�����ڰ� ����. default�� �پ�����. ��, default int subSum()
     //�ٸ� �������� ����� �� ����.
  /*   int subSum(int i) {
    	 return i+100;
     }*/
     //�������� �ǵ�: subSum �Լ��� Ȱ���� ���ο� �ٸ� �Լ��� �����ִ� �Լ�...
     
     //�ǵ�: subSum()��ü (����������) ���� ���ϰ�.. ���ο��� ���
     //�ٸ� �Լ��� ����ϴ� �����Լ�
     private int subSum(int i) { //private�Լ��� class���ο����� �����������̱⿡
    	 return i +100;          //��������, �ٸ��Լ������� ����ȣ���Ҽ�����.
     }
     public void CallSubSum() {
    	 int result= subSum(100);
    	 print(result);
     }
     //private [�ٸ��Լ��� ����]�ϴ� �Լ���. 
     private void print(int data) {
    	 System.out.println("data: "+data);
     }
     private int operationMethod(int data) {
    	 return data*200;
     }
     public int opSum(int data) {
    	 int result = operationMethod(data);
    	 if(result>0) {
    		 return 1;
    	 }else {
    		 return -1;
    	 }
     }
     public int max(int a, int b) {
  	   /*if (a>b)
  	     return a;
  	     else  
  		 return b;          30��¥��       return �� �ݺ��ϴ� ���� �ſ� ������ �����̴�....�ִ��� �ϳ���������...................
  		 
  		 int result=0;
  		 if(a>b){
  		 result=a;}
  		 else {result=b;}
  		 return result;     60��¥��
  		 
  		 int max=(a>b)?a:b;
  		 return max;        90��¥��
  		 
  		 return (a>b)?a:b; 100��¥��

  		 */ 
  	    	 return (a>b)?a:b;         //���׿����ڸ� �Ƴ��� ���� ���Ŷ�.
  	     }
     
     public String concat(String s, String s1, String s2) {
    	 // String result = ss+"/"+s1+"/"+s2;
    	 // return result;
    	 return s+"/"+s1+"/"+s2;    //���İ� �̽��� ������.
     }
     
     //Ŭ������ Ÿ���̴�.......................
     /*
      * public int call(int i,int j){return i+j;}
      * public Tv call(){  } 
      * Ŭ������ ���赵�̴�...���赵�� Ÿ���̴�... Ÿ���� �����տ� �����ִ�.. ��, int��ſ��� �� �� �־��..
      * 
      * 
      * return new Tv();             TvŸ�԰� ���� ��ü�� �ּ�
      * Tv t = new Tv(); return t;
      * return null;
      */

     
     
     public Tv tcall() {
         return new Tv();
     }
     
     public Tv tcall2(Tv t) {       //�̰Ŷ� �ؿ����� ����.���������� �ʴ� �����ʿ�.
    	 t.brandname="a";
    	 return t;
     }
     
     public int tcall3(int i) {
    	 return i;
     }

     public Tv objMethod() {
    	 Tv tv= new Tv();
    	 return tv;
     }
     
     public Tv objMethod2() {
    	 return new Tv();
     }
     
     public Tv objMethod3(Tv t) { //Tv��� Ÿ���� ���� ��ü�� �ּҰ��� �ްڴ�.
    	 return t;
     }
     /*
     main
     1. Tv t = new Tv();
     t.objMethod3();
     
     2. t.objMethod3(new Tv()); t��� ������ new Tv�� �ּҰ��� �޴´�.
     
     
     */
     
     
}




