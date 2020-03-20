import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

/*
I/O
추상클래스
InputStream, OutPutStream (Byte)
두개의 클래스를 상속(재정의)하는 클래스를 통해 입/출력 작업
1~3번대상에 따라서
1.Memory : ByteArrayInputStream / ByteArrayOutStream
2.File : FileInputStream / FileOutputStream



 */
public class Ex01_Stream {

	public static void main(String[] args) {
		//byte (~128~127) 정수가 저장 타입
		byte[] inSrc = {0,1,2,3,4,5,6,7,8,9};
		byte[] outSrc = null; //현재는 메모리를 가지고 있지 않아요
		
		//내가 데이터를 read/write 하는 대상을 memory
		ByteArrayInputStream input = null;
		ByteArrayOutputStream output = null;
		
		input = new ByteArrayInputStream(inSrc);
		output = new ByteArrayOutputStream();
		System.out.println("outSrc before " +Arrays.toString(outSrc));
		//공식같은 로직. 암기 하시면 좋습니다.>또 글케 중요하진앟음ㄴ거같음.몰라..
		int data = 0;
		while((data=input.read())!=-1) { //더 이상 read할 데이터가 없다면,
//			System.out.println("data: "+data);
//			System.out.println("input.read(): "+input.read());
//			//read()함수는 내부적으로 next()기능 포함
	        output.write(data);
	        //자기 자신에게 data 변수의 값을 read해서 write 하겠다는 뜻.
	        //write하는 대상이 output (ByteArrayOutputStream) 자신의 통로에 read 가지고 있음.
	        
		}
		outSrc=output.toByteArray();
		//자기가 가지고 있는 값을 배열로 만들어서 그 주소값을 outSrc에게 전달.
		System.out.println("outSrc after "+Arrays.toString(outSrc));
		

		
	}

}
