import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * read,wite대상file물리적인파일> 1.txt, data.txt
 * FileInptStream
 * FileOutputStream
 */
public class EX02_POINT_File_read_Write {

	public static void main(String[] args) throws IOException {
		/*
		try {
			//Point: I/O작업은 대부분 garbage Collector의 대상이 아니다.
			//명시적인 자원의 해제를 (반환>>close()>>내부적으로 소멸자 호출)
			FileInputStream fs= new FileInputStream("c.....txt");
			int data=0;
			while((data=fs.read())!=-1) {
				System.out.println("숫자: "+data);
				char c=(char)data;
				System.out.println(c);
			}
		}catch(Exception e) {
		e.printStackTrace();
		}finally {
			//정상,비정상 무조건 실행.
			fs.close();
		}
		*/
		FileInputStream fs=null;
		FileOutputStream fos= null;
		String path = "C:\\Temp\\a.txt";
		try {
			//Point: I/O작업은 대부분 garbage Collector의 대상이 아니다.
			//명시적인 자원의 해제를 (반환>>close()>>내부적으로 소멸자 호출)
			fs= new FileInputStream(path);
			fos = new FileOutputStream("C:\\Temp\\new.txt",false);
			//write
			//fileoutputstream 파일 생성기능을 갖고 있을까?
			//파일에 write할때 파일이 존재하지 않으면, 파일을 [생성].
			//default는 기존 데이터 overwrite
			//true로 바꾸면 누적됨. Hellohellohello하고
			
			int data=0;
			while((data=fs.read())!=-1) {
//				System.out.println("숫자: "+data);
//				char c=(char)data;
//				System.out.println(c);
				fos.write(data); //여기다가 쓰는게 아니고, 저 경로에 있는 data값을 read해서 여기다 write한다는 뜻입니다.
			}
		}catch(Exception e) {
		e.printStackTrace();
		}finally {
			//정상,비정상 무조건 실행.
			try{
				fs.close();
				fos.close();
			}catch(IOException e){
				e.printStackTrace();
			}
		}
	}

}
