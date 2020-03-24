import java.util.HashMap;

import javax.swing.JOptionPane;

class WordInputProcess1 extends Thread{
	
	
	WordTimeOut1 w= new WordTimeOut1();
		static int a;
		static int b;			
       String game() {
		return a+"x"+b+"=";
	   }     
      public void run() {		
		while(true) {
		//String inputdata = JOptionPane.showInputDialog(game());
		String inputdata = JOptionPane.showInputDialog(hash.);
		if(inputdata != null && !inputdata.equals("")) {
			System.out.println("제출 답안: " + inputdata);
			Ex06_GuGuDanGame.total++;
			if(inputdata.equals(a*b+"")) {
				System.out.println("정답입니다!");
				Ex06_GuGuDanGame.correct++;
			}
			else {System.out.println("틀렸습니다!");}
		}
		}		
	}

}


class WordTimeOut1 extends Thread{
	@Override
	public void run() {
		for(int i=10; i > 0 ; i--) {
				
			System.out.println("남은 시간: " + i);
			try {
				 Thread.sleep(1000); //대기실에서 1초간 쉬었다 ....				 
			}catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
     
	}
}
public class Ex06_GuGuDanGame {
	 static int correct;
	 static int total;

	public static void main(String[] args) {
	
		HashMap hash= new HashMap();
		hash.put((int)(Math.random()*8)+2,(int)(Math.random()*8)+2);
		WordInputProcess1 word = new WordInputProcess1();
		WordTimeOut1 time = new WordTimeOut1();
			
		word.start();
		time.start();
		try {		
			time.join(); //time 끝날때까지 기다려
			
		} catch (Exception e) {
			e.getMessage();
		}
		System.out.println("시간종료^^");		
		System.out.printf("총문제수: %d 푼 문제수: %d",total,correct);

		
		System.exit(0);

		
	

		
	}
}
