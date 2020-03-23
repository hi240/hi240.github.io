/* ��������---
 * Thread : ���μ������� �ϳ��� �ּ� �������(method)
 * Thread�� Stack�̶�� ���� �����ϴ�.
 * 
 * Thread �����ϴ� ���
 * 1.ThreadŬ������ ��ӹ޴� ��� -> class Test extends Thread > ���ο� stack�ö󰡼� �� �غ�
 *   �ݵ�� Thread�� ���� �ִ� run()�Լ��� �����ؾ� �Ѵ�.
 *   Thread �Ϲ� Ŭ���� > ������ ��ü ���� ����..
 *   
 * 2.Runnable �������̽��� implements�ϴ� ���
 *   class Test extends Car implements Runnable
 *   >> �Ϲ� Ŭ���� Thread ���� �ٸ� Ŭ������ ����� ��� ..
 *   thread��ü�� �����ڸ� ����ϸ�, thread���� ��������.
 * 
 * 
 */

//���1
class Thread_1 extends Thread{
	public void run() { //run()�Լ��� main�Լ��� ������ ����. >> ���ο� stack�� ó�� �ö󰡴� �Լ�.
		for(int i = 0;i<1000;i++) {
			System.out.println("Thread_1: "+i+this.getName()); // getname�� thread�� �ڿ�
		}
		System.out.println("thread_1 run() end");
	}
}

//���2
class Thread_2 implements Runnable{ //�ִ� thread�� ����� �����, thread�� �ƴϴ�.
	public void run() {
		for(int i = 0;i<1000;i++) {
			System.out.println("Thread_2: "+i); // getname�� thread�� �ڿ�
		}
		System.out.println("thread_2 run() end");
		
	}
}

public class Ex02_Multi_Thread {

	public static void main(String[] args) { //main�� �ϳ��� thread
		//1��
		Thread_1 th = new Thread_1();
		th.start(); //POINT
		//start()�ϴ� ��: call stack�� ���� �����ϰ� �� stack�� run()�Լ� �÷�����, ������ �Ҹ�.
		
		//2��
		Thread_2 th2 = new Thread_2(); //Thread�� �ƴϴ�! thread�� �����ؾ� thread. �������̽��� ������class
		Thread thread = new Thread(th2); 
		thread.start();
		
		for(int i=0;i<1000;i++) {
			System.out.println("main: "+i);
		}
		System.out.println("main end");
		
	}
//thread���α׷��̶� stack�� ����������,�������� �Լ��� ���ÿ� ����ǰ� �ϴ°ǵ�, 

	/*
	 * Thread_1 th - new Thread_1();
	 * th.start();
	 */
}
