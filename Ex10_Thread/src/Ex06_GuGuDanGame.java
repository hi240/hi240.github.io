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
			System.out.println("���� ���: " + inputdata);
			Ex06_GuGuDanGame.total++;
			if(inputdata.equals(a*b+"")) {
				System.out.println("�����Դϴ�!");
				Ex06_GuGuDanGame.correct++;
			}
			else {System.out.println("Ʋ�Ƚ��ϴ�!");}
		}
		}		
	}

}


class WordTimeOut1 extends Thread{
	@Override
	public void run() {
		for(int i=10; i > 0 ; i--) {
				
			System.out.println("���� �ð�: " + i);
			try {
				 Thread.sleep(1000); //���ǿ��� 1�ʰ� ������ ....				 
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
			time.join(); //time ���������� ��ٷ�
			
		} catch (Exception e) {
			e.getMessage();
		}
		System.out.println("�ð�����^^");		
		System.out.printf("�ѹ�����: %d Ǭ ������: %d",total,correct);

		
		System.exit(0);

		
	

		
	}
}
