/*�ܾ���߱����,������..���� ���� �� ����.
 */
import javax.swing.JOptionPane;

public class Ex03_Single_Word_Game {  //�ð�����, �Էµ��θ� ���� �ǹ�? �����۾� �ʿ�->Thread�� �ʿ伺 ����!
	public static void main(String[] args) {
		String inputdata = JOptionPane.showInputDialog("�����Է��ϼ���");
		System.out.println("�Է°�: "+inputdata);
		timer();
	}

	static void timer() {
		for(int i =10;i>0;i--) {
			try {
				System.out.println("�����ð�: "+i);
			}catch(Exception e ) {
				System.out.println(e.getMessage());
			}
		}
	}
}
