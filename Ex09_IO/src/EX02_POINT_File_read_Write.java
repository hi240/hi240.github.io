import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * read,wite���file������������> 1.txt, data.txt
 * FileInptStream
 * FileOutputStream
 */
public class EX02_POINT_File_read_Write {

	public static void main(String[] args) throws IOException {
		/*
		try {
			//Point: I/O�۾��� ��κ� garbage Collector�� ����� �ƴϴ�.
			//������� �ڿ��� ������ (��ȯ>>close()>>���������� �Ҹ��� ȣ��)
			FileInputStream fs= new FileInputStream("c.....txt");
			int data=0;
			while((data=fs.read())!=-1) {
				System.out.println("����: "+data);
				char c=(char)data;
				System.out.println(c);
			}
		}catch(Exception e) {
		e.printStackTrace();
		}finally {
			//����,������ ������ ����.
			fs.close();
		}
		*/
		FileInputStream fs=null;
		FileOutputStream fos= null;
		String path = "C:\\Temp\\a.txt";
		try {
			//Point: I/O�۾��� ��κ� garbage Collector�� ����� �ƴϴ�.
			//������� �ڿ��� ������ (��ȯ>>close()>>���������� �Ҹ��� ȣ��)
			fs= new FileInputStream(path);
			fos = new FileOutputStream("C:\\Temp\\new.txt",false);
			//write
			//fileoutputstream ���� ��������� ���� ������?
			//���Ͽ� write�Ҷ� ������ �������� ������, ������ [����].
			//default�� ���� ������ overwrite
			//true�� �ٲٸ� ������. Hellohellohello�ϰ�
			
			int data=0;
			while((data=fs.read())!=-1) {
//				System.out.println("����: "+data);
//				char c=(char)data;
//				System.out.println(c);
				fos.write(data); //����ٰ� ���°� �ƴϰ�, �� ��ο� �ִ� data���� read�ؼ� ����� write�Ѵٴ� ���Դϴ�.
			}
		}catch(Exception e) {
		e.printStackTrace();
		}finally {
			//����,������ ������ ����.
			try{
				fs.close();
				fos.close();
			}catch(IOException e){
				e.printStackTrace();
			}
		}
	}

}
