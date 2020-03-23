import javax.swing.JOptionPane;


// 시간을 처리하는 함수가 thread객체로 만들어져야..


class WordTime extends Thread{

	@Override
	public void run() {
		for(int i =10;i>0;i--) {
			try {
				System.out.println("남은시간: "+i);
				sleep(1000); //1초동안 휴게실 감
			}catch(Exception e ) {
				System.out.println(e.getMessage());
			}
		}
	}		
}
public class Ex04_Multi_Thread_Word_Game { 

	public static void main(String[] args) {
		WordTime timer=new WordTime();
		timer.start(); 
		String inputdata= JOptionPane.showInputDialog("값을 입력하세요");
		System.out.println("입력값: "+inputdata);

	}

}
