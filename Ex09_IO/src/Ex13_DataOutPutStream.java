import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 보조스트림
 * DataOutputStream, DataInputStream
 * Java 8가지 기본타입 (타입별로 write & read)
 * 자기들끼리만 사용할 수 있다.
 * txt파일:100,300,80,60 >> split >> convert >> 연산
 * 
 * 
 */


public class Ex13_DataOutPutStream {

	public static void main(String[] args) {
		int[] score = {100,60,55,94,23};
		FileOutputStream fos = null;
		DataOutputStream dos = null;
		try {
			fos = new FileOutputStream("score.txt");
			dos = new DataOutputStream(fos);
			for(int i=0;i<score.length;i++) {
				dos.writeInt(score[i]); //정수값을 write할거야. read는 반드시 DataInputStream으로.
				//dos.writeUTF(str); UTF방식은 web한글처리에 유용..
			}
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				dos.close();
				fos.close();
			}catch(IOException e) {
			e.printStackTrace();	
			}
		}

	}

}
