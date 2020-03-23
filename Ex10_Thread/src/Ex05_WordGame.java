import javax.swing.JOptionPane;
/*
 * 문제
 * main함수 제외한 thread2개 생성
 * 1.시간을 제어하는 thread
 * 2.단어입력을 처리하는 thread
 * 메인함수에 2개 모두 실행
 * 단, 단어를 하나라도 입력해서 확인버튼을 누르면 시간을 멈추게 하세요.
 * hint)공유자원 (static)
 */


//
//class WordTime1 extends Thread{
//
//	@Override
//	public void run() {
//		for(int i =10;i>0;i--) {
//			try {
//				System.out.println("남은시간: "+i);
//				sleep(1000); //1초동안 휴게실 감
//			}catch(Exception e ) {
//				System.out.println(e.getMessage());
//			}
//		}
//	}	
//}
//
//public class Ex05_WordGame {
//	static boolean inputcheck =false;
//	public static void main(String[] args) {
//		WordTime1 timer=new WordTime1();
//		timer.start(); 
//		String inputdata= JOptionPane.showInputDialog("단어를 입력하세요");
//		System.out.println("단어: "+inputdata);
//		timer.stop();
//
//	}
//}
class WordInputProcess extends Thread{
	@Override
	public void run() {
		String dan="2";
		String inputdata = JOptionPane.showInputDialog("dan" + "단 값을 입력");
		if(inputdata != null && !inputdata.equals("")) {
			Ex05_WordGame.inputcheck = true; //값을 변경
		}
		System.out.println("입력한 값은: " + inputdata);
	}
}


class WordTimeOut extends Thread{
	@Override
	public void run() {
		for(int i=10; i > 0 ; i--) {
			if(Ex05_WordGame.inputcheck)return; //run함수 탈출			
			System.out.println("남은 시간: " + i);
			try {
				 Thread.sleep(1000); //대기실에서 1초간 쉬었다 ....
			}catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}

public class Ex05_WordGame {
	static boolean inputcheck= false;
	public static void main(String[] args) {
		WordInputProcess word = new WordInputProcess();
		WordTimeOut time = new WordTimeOut();
		word.start();
		time.start();
		System.out.println("Main END");
	}

}

