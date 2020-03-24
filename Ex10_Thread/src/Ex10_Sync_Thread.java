/*
 * 동기화(synchronized)
 * 여러개의 thread가 접근할 수있는 한강의 화장실(공유자원):여러 개의 스레드가 동시에 접근가능한 자원
 * 화장실 1개, 사람 10명 (Thread 10개)
 * 반대
 * 한강 비빔밥 축제:동시접근 허용
 * 
 * 객체 : Lock을 걸수도,
 * 함수 : Lock을 걸수도 있다.
 * 보통은 함수에 걸고, 동기화라고 부른다.
 */
class Wroom{
	//void openDoor(String name){ 를 아래로 바꾸면, 잠금장치 탄생!
     synchronized void openDoor(String name){
		System.out.println(name+"님 무도회 입장");
		for(int i =0; i<100;i++) {
			System.out.println(name+"입장시간: "+i);
			if(i==10) {
				System.out.println(name + "춤추기 끝");
			}
		}
		System.out.println("기분이 좋다");
	}
}
class User extends Thread{
	Wroom wr;
	String who;
	User(String name,Wroom w){ //입장.
		this.who = name;
		this.wr=w;
	}
	public void run() {
		wr.openDoor(this.who);
	}
}
public class Ex10_Sync_Thread {
	public static void main(String[] args) {
		//한강
		Wroom w = new Wroom();
		//사람들
		User kim = new User("kim",w);
		User park = new User("park",w);
		User lee = new User("lee",w);
		//사람들이 심심해요
		kim.start();
		park.start();
		lee.start();
		
	}

}
