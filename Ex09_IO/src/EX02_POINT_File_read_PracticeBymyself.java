import java.io.*;
public class EX02_POINT_File_read_PracticeBymyself {

	public static void main(String[] args) throws IOException {
try {
	FileInputStream fis = new FileInputStream(args[0]);
	FileInputStream fos = new FileInputStream(args[1]);
	int data=0;
	while((data=fis.read())!=-1)
		
	fis.close();
	fos.close();
}catch (IOException e) {
	e.printStackTrace();
}
	}

}
