import java.io.IOException;

public class Ex03_Exception_finally {

	static void startInstall() {
		System.out.println("INSTALL");
	}
	static void copyFiles() {
		System.out.println("COPY FILES");
	}
	static void fileDelete() {
		System.out.println("DELETE FILES");
	}
	public static void main(String[] args) {
		
		try {
			copyFiles();
			startInstall();
			//throw : �����ڰ� ���Ƿ� ������ �߻����Ѽ� ������ ����ó���� �ϴ� ���.
			throw new IOException("Install �� ���� �߻�");	
		}catch (Exception e) {
			System.out.println("���� �޽��� ���: "+e.getMessage());
			
		}finally { //������ ���� �� (���ܰ� �߻�(o), ���ܰ� �߻�(x)������ ����)
			fileDelete();
		}
		//�ڿ� ����.. ��ȯ..

		
		System.out.println("Main END");
	
	}

}
