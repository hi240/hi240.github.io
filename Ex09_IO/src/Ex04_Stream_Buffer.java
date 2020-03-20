import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * file 처리(disk에 read/write)
 * 한 byte 를 read하고, write하는 작업.
 * 각각 처리 보다는, 버스로 한번에 가져가 처리
 * 버스의 역할 : Buffer (메모리임)
 * File을 read하거나 write한걸 buffer에  태우고,그걸로 io작업을 한다.
 * 1.I/O 성능개선을 위해 필수로 씀
 * 2.buffer은 모아놓기 때문에 line단위 작업,즉 엔터인식함.
 * 
 * 독자적인 객체 생성 불가(주클래스 의존)
 * 
 * 
 */
public class Ex04_Stream_Buffer {

	public static void main(String[] args) {
		FileOutputStream fos= null;
		BufferedOutputStream bos=null;
		try {
			fos=new FileOutputStream("data.txt");//default가 false:파일이없으면,생성을 하겠다.
			bos=new BufferedOutputStream(fos);
			for(int i=0;i<10;i++) {
				bos.write('a');
			}
			//java buffer크기 8kbyte > 8192byte ..
			//1.buffer은 기본적으로 내용이 꽉 8kb차면 스스로 비우는 작업(내부적으로 flush)
			//2.buffer 강제로 비우기 (flush 또는 close)
			//3.bos.close()자원해제>close()>내부적으로 flush호출
			
			bos.flush(); //다내려
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









