import javax.swing.JOptionPane;
/*
 * ����
 * main�Լ� ������ thread2�� ����
 * 1.�ð��� �����ϴ� thread
 * 2.�ܾ��Է��� ó���ϴ� thread
 * �����Լ��� 2�� ��� ����
 * ��, �ܾ �ϳ��� �Է��ؼ� Ȯ�ι�ư�� ������ �ð��� ���߰� �ϼ���.
 * hint)�����ڿ� (static)
 */


//
//class WordTime1 extends Thread{
//
//	@Override
//	public void run() {
//		for(int i =10;i>0;i--) {
//			try {
//				System.out.println("�����ð�: "+i);
//				sleep(1000); //1�ʵ��� �ްԽ� ��
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
//		String inputdata= JOptionPane.showInputDialog("�ܾ �Է��ϼ���");
//		System.out.println("�ܾ�: "+inputdata);
//		timer.stop();
//
//	}
//}
class WordInputProcess extends Thread{
	@Override
	public void run() {
		String dan="2";
		String inputdata = JOptionPane.showInputDialog("dan" + "�� ���� �Է�");
		if(inputdata != null && !inputdata.equals("")) {
			Ex05_WordGame.inputcheck = true; //���� ����
		}
		System.out.println("�Է��� ����: " + inputdata);
	}
}


class WordTimeOut extends Thread{
	@Override
	public void run() {
		for(int i=10; i > 0 ; i--) {
			if(Ex05_WordGame.inputcheck)return; //run�Լ� Ż��			
			System.out.println("���� �ð�: " + i);
			try {
				 Thread.sleep(1000); //���ǿ��� 1�ʰ� ������ ....
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

