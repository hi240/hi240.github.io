/*단어맞추기게임,구구단..등을 만들 수 있음.
 */
import javax.swing.JOptionPane;

public class Ex03_Single_Word_Game {  //시간따로, 입력따로면 무슨 의미? 동시작업 필요->Thread의 필요성 이해!
	public static void main(String[] args) {
		Practice h=new Practice();
		h.start();
		String inputdata = JOptionPane.showInputDialog("값을입력하세요");
		System.out.println("입력값: "+inputdata);
		h.stop();

	}

}
class Practice extends Thread{
	public void run() {
		for(int i =10;i>0;i--) {
			try {
				System.out.println("남은시간: "+i);
				sleep(1000);
			}catch(Exception e ) {
				System.out.println(e.getMessage());
			}
		}

	}

}
