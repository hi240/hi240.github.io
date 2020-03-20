import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex03_String_ImageCopy {

	public static void main(String[] args) {
 
		String orifile = "C:\\Temp\\6.jpg";
		String targetfile = "copy.jpg";
		//�տ� ��ΰ� ������, default��δ�..
		FileInputStream fs= null;
		FileOutputStream fo= null;
		
		try {
			fs=new FileInputStream(orifile);
			fo=new FileOutputStream(targetfile,false);
			
			int data=0;
			while((data=fs.read())!=-1) {
				fo.write(data); //data���� read�ؼ� target file�� write�ϴ� �۾�
			}
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				fs.close();
				fo.close();
			} catch(IOException e1) {
				e1.printStackTrace();
			}
		}
	}
}
