/*
 * 프로그램 >> 프로세스 >> 쓰레드 (최소 동작 단위)
 * 지금까지 싱글 프로세스에 싱글 쓰레드로 프로그램 짜왔음..(main함수가 싱글 쓰레드)
 * JVM : call Stack 으로 함수 동작시킴.
 * 현재 프로세스가 stack 하나만 가지고 있기 ㄸㅐ문에
 * 함수가 10개라도 한번에 하나의 함수만 동작.
 * 순차적 실행(Sequential한 프로그래밍)
 */
public class Ex01_Single_Thread {

	public static void main(String[] args) {
		System.out.println("메인일꿀");
		worker();
		worker2(); //셋이 동시에 실행이 안됨. -> 순차적 실행되는 중...
		System.out.println("메인일꿀종료");
	}
      static void worker () {
    	  System.out.println("1번일꿀");
      }
      static void worker2 () {
    	  System.out.println("2번일꿀");
      }

}
