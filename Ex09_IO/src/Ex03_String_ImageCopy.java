import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex03_String_ImageCopy {

	public static void main(String[] args) {
 
		String orifile = "C:\\Temp\\6.jpg";
		String targetfile = "copy.jpg";
		//앞에 경로가 없으면, default경로는..
		FileInputStream fs= null;
		FileOutputStream fo= null;
		
		try {
			fs=new FileInputStream(orifile);
			fo=new FileOutputStream(targetfile,false);
			
			int data=0;
			while((data=fs.read())!=-1) {
				fo.write(data); //data값을 read해서 target file에 write하는 작업
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
