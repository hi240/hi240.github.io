import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * ���ڱ���� ������ ó��
 * char[]������ ���� (String Ŭ���� ���������� ������ char[]����)
 * �ѱ� 1�� > 2byte > Stream ���� �Ұ���(byte)
 * ��� 2byte ����:
 * reader,writer �߻�Ŭ������ ����ϸ� �ѱ��� ��/�� �����ϴ�.
 * ��� file�̸�,
 * FileReader,FileWriter
 * 
 */
public class Ex05_Reader_Writer {

	public static void main(String[] args) {

		FileReader fr= null;
		FileWriter fw= null;
		
		try {
			fr= new FileReader("Lotto.java"); //Ex01_STream.java�� read �ؼ�
			fw= new FileWriter("Lotto_java.txt"); //������ ����.. �� �� ���Ͽ� write�� ��.
			int data=0;
			while((data=fr.read())!= -1) {
				//System.out.println((char)data);
				if(data !='\n'&&data!='\r'&&data!='\t');
				fw.write(data);//data���� read�ؼ�copy-stream.txt write�ϰڽ��ϴ�.
			}			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				fw.close();
				fr.close();				
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
