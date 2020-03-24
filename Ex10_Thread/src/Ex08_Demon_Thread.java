/*
 * ����:Thread(����)
 * Main Thread �� ������ ���� �ϰڴ�.
 * �ѱ�main >> �۾� >>3�� �������� �۾����� ����.
 * �ѱ� �۾� ���� >> 3�ʰ������� �۾� ���� ����
 */
public class Ex08_Demon_Thread implements Runnable{
	static boolean autosave= false;
	public static void main(String[] args) {
		Thread th = new Thread(new Ex08_Demon_Thread());
		th.setDaemon(true);
		//th ��� thread�� main thread�� ���� thread(demon)�� �����.
		//main�� �ϳ��� thread, demon�� �ƴ� ��� thread�� non-demon�̶�� �θ���.
		//main�Լ��� thread�� ����� ���� �ϰڴ�. (����:�� th��)	
		th.start();

		for(int i=0;i<=30;i++) {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			    System.out.println(e.getMessage());	
			}
			System.out.println("Main Thread ����: "+i);
			if(i==5) { //i���� 5���Ǵ� ��������
			System.out.println("i: "+i);	
			autosave = true;
			}
		}
	}
	public void autoSave() {
		System.out.println("���ڰ� 3�� �������� �ڵ� ���� �Ǿ����ϴ�.");
	}
	
public void run() {
	while(true) {
		try {
			Thread.sleep(3000);//3�ʰ������� ���
		} catch (Exception e) {
			
		}if(autosave) { //static boolean autosave �� true ���..
			autoSave();
		}
	}
}
}
