import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

/*
I/O
�߻�Ŭ����
InputStream, OutPutStream (Byte)
�ΰ��� Ŭ������ ���(������)�ϴ� Ŭ������ ���� ��/��� �۾�
1~3����� ����
1.Memory : ByteArrayInputStream / ByteArrayOutStream
2.File : FileInputStream / FileOutputStream



 */
public class Ex01_Stream {

	public static void main(String[] args) {
		//byte (~128~127) ������ ���� Ÿ��
		byte[] inSrc = {0,1,2,3,4,5,6,7,8,9};
		byte[] outSrc = null; //����� �޸𸮸� ������ ���� �ʾƿ�
		
		//���� �����͸� read/write �ϴ� ����� memory
		ByteArrayInputStream input = null;
		ByteArrayOutputStream output = null;
		
		input = new ByteArrayInputStream(inSrc);
		output = new ByteArrayOutputStream();
		System.out.println("outSrc before " +Arrays.toString(outSrc));
		//���İ��� ����. �ϱ� �Ͻø� �����ϴ�.>�� ���� �߿������������Ű���.����..
		int data = 0;
		while((data=input.read())!=-1) { //�� �̻� read�� �����Ͱ� ���ٸ�,
//			System.out.println("data: "+data);
//			System.out.println("input.read(): "+input.read());
//			//read()�Լ��� ���������� next()��� ����
	        output.write(data);
	        //�ڱ� �ڽſ��� data ������ ���� read�ؼ� write �ϰڴٴ� ��.
	        //write�ϴ� ����� output (ByteArrayOutputStream) �ڽ��� ��ο� read ������ ����.
	        
		}
		outSrc=output.toByteArray();
		//�ڱⰡ ������ �ִ� ���� �迭�� ���� �� �ּҰ��� outSrc���� ����.
		System.out.println("outSrc after "+Arrays.toString(outSrc));
		

		
	}

}
