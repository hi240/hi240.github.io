import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 문자기반의 데이터 처리
 * char[]가지고 놀자 (String 클래스 내부적으로 데이터 char[]관리)
 * 한글 1자 > 2byte > Stream 빨대 불가능(byte)
 * 통로 2byte 빨대:
 * reader,writer 추상클래스를 사용하면 한글을 읽/쓰 가능하다.
 * 대상 file이면,
 * FileReader,FileWriter
 * 
 */
public class Ex05_Reader_Writer {

	public static void main(String[] args) {

		FileReader fr= null;
		FileWriter fw= null;
		
		try {
			fr= new FileReader("Lotto.java"); //Ex01_STream.java를 read 해서
			fw= new FileWriter("Lotto_java.txt"); //파일을 생성.. 후 이 파일에 write할 것.
			int data=0;
			while((data=fr.read())!= -1) {
				//System.out.println((char)data);
				if(data !='\n'&&data!='\r'&&data!='\t');
				fw.write(data);//data값을 read해서copy-stream.txt write하겠습니다.
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
