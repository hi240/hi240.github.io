/*
thread는 우선순위가 있다.
cpu 점유율을 높임으로 조절할 수 있다.
MIn 1~ max 10 . default는 5.
 */
class Pth extends Thread{
	public void run() {
		for(int i =0;i<1000;i++) {
			System.out.println("----------------");
		}
	}
}
class Pth2 extends Thread{
	public void run() {
		for(int i =0;i<1000;i++) {
			System.out.println("||||||||||||||||||||");
		}
	}
}
class Pth3 extends Thread{
	public void run() {
		for(int i =0;i<1000;i++) {
			System.out.println("*********************");
		}
	}
}
public class Ex07_priority {

	public static void main(String[] args) {
Pth pth  = new Pth();
Pth2 pth2 = new Pth2();
Pth3 pth3 =new Pth3();
System.out.println(pth.getPriority()); //getPriority (우선순위를 갖고오는 함수)
System.out.println(pth2.getPriority()); //getPriority (우선순위를 갖고오는 함수)
System.out.println(pth3.getPriority()); //getPriority (우선순위를 갖고오는 함수)
pth.setPriority(10); //먼저 end확률 높임.
pth3.setPriority(1); //먼저 끝날 확률 낮춤.
pth.start();
pth2.start();
pth3.start();

	}

}
