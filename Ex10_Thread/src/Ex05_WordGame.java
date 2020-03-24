import javax.swing.JOptionPane;

/*
����
main �Լ� ������ Thread 2�� ����
1. �ð�(time) �����ϴ� Thread
2. �ܾ� �Է��� ó���ϴ� Thread

main �Լ� 2�� ����

�� �ܾ �ϳ��� �Է��ؼ� Ȯ�� ��ư�� ������ �ð��� ���߰� �ϼ���
hint) �����ڿ� (static)



main thread���� �ٸ� Ŭ������ �ٳ������� ��ٸ��� �ϱ����� join�Լ� ���¿���.

�����ܰ���: ��� �¾Ҵ������� ���.
*/
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
		try {
			word.join(); //word�� ���������� ��ٷ�
			time.join(); //time ���������� ��ٷ�
			
		} catch (Exception e) {
			e.getMessage();
		}
		System.out.println("Main END");

	}

}
