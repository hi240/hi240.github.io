/* 복습했음---
 * Thread : 프로세스에서 하나의 최소 실행단위(method)
 * Thread는 Stack이라고 봐도 무방하다.
 * 
 * Thread 생성하는 방법
 * 1.Thread클래스를 상속받는 방법 -> class Test extends Thread > 새로운 stack올라가서 놀 준비
 *   반드시 Thread가 갖고 있는 run()함수를 구현해야 한다.
 *   Thread 일반 클래스 > 스스로 객체 생성 가능..
 *   
 * 2.Runnable 인터페이스를 implements하는 방법
 *   class Test extends Car implements Runnable
 *   >> 일반 클래스 Thread 말고 다른 클래스를 상속할 경우 ..
 *   thread객체의 생성자를 사용하면, thread임을 인정하자.
 * 
 * 
 */

//방법1
class Thread_1 extends Thread{
	public void run() { //run()함수는 main함수와 동일한 역할. >> 새로운 stack에 처음 올라가는 함수.
		for(int i = 0;i<1000;i++) {
			System.out.println("Thread_1: "+i+this.getName()); // getname은 thread의 자원
		}
		System.out.println("thread_1 run() end");
	}
}

//방법2
class Thread_2 implements Runnable{ //애는 thread의 요건을 갖춘것, thread는 아니다.
	public void run() {
		for(int i = 0;i<1000;i++) {
			System.out.println("Thread_2: "+i); // getname은 thread의 자원
		}
		System.out.println("thread_2 run() end");
		
	}
}

public class Ex02_Multi_Thread {

	public static void main(String[] args) { //main도 하나의 thread
		//1번
		Thread_1 th = new Thread_1();
		th.start(); //POINT
		//start()하는 일: call stack을 새로 생성하고 그 stack에 run()함수 올려놓고, 본인은 소멸.
		
		//2번
		Thread_2 th2 = new Thread_2(); //Thread가 아니다! thread를 구현해야 thread. 인터페이스만 구현한class
		Thread thread = new Thread(th2); 
		thread.start();
		
		for(int i=0;i<1000;i++) {
			System.out.println("main: "+i);
		}
		System.out.println("main end");
		
	}
//thread프로그램이란 stack을 여러개만들어서,여러개의 함수가 동시에 실행되게 하는건데, 

	/*
	 * Thread_1 th - new Thread_1();
	 * th.start();
	 */
}
