/*�ܾ���߱����,������..���� ���� �� ����.
 */
import javax.swing.JOptionPane;

public class Ex03_Single_Word_Game {  //�ð�����, �Էµ��θ� ���� �ǹ�? �����۾� �ʿ�->Thread�� �ʿ伺 ����!
	public static void main(String[] args) {
		Practice h=new Practice();
		h.start();
		String inputdata = JOptionPane.showInputDialog("�����Է��ϼ���");
		System.out.println("�Է°�: "+inputdata);
		h.stop();

	}

}
class Practice extends Thread{
	public void run() {
		for(int i =10;i>0;i--) {
			try {
				System.out.println("�����ð�: "+i);
				sleep(1000);
			}catch(Exception e ) {
				System.out.println(e.getMessage());
			}
		}

	}

}
