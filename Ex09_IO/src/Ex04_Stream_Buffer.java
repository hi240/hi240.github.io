import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * file ó��(disk�� read/write)
 * �� byte �� read�ϰ�, write�ϴ� �۾�.
 * ���� ó�� ���ٴ�, ������ �ѹ��� ������ ó��
 * ������ ���� : Buffer (�޸���)
 * File�� read�ϰų� write�Ѱ� buffer��  �¿��,�װɷ� io�۾��� �Ѵ�.
 * 1.I/O ���ɰ����� ���� �ʼ��� ��
 * 2.buffer�� ��Ƴ��� ������ line���� �۾�,�� �����ν���.
 * 
 * �������� ��ü ���� �Ұ�(��Ŭ���� ����)
 * 
 * 
 */
public class Ex04_Stream_Buffer {

	public static void main(String[] args) {
		FileOutputStream fos= null;
		BufferedOutputStream bos=null;
		try {
			fos=new FileOutputStream("data.txt");//default�� false:�����̾�����,������ �ϰڴ�.
			bos=new BufferedOutputStream(fos);
			for(int i=0;i<10;i++) {
				bos.write('a');
			}
			//java bufferũ�� 8kbyte > 8192byte ..
			//1.buffer�� �⺻������ ������ �� 8kb���� ������ ���� �۾�(���������� flush)
			//2.buffer ������ ���� (flush �Ǵ� close)
			//3.bos.close()�ڿ�����>close()>���������� flushȣ��
			
			bos.flush(); //�ٳ���
		}catch(Exception e) {
		}finally {
			try {
			bos.close();
			fos.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		

	}

}









