package kr.or.bit;

import java.io.IOException;

/*
���赵 (class) ���鶧 ...... ������ �ڵ� ... ������ ....
�� ���赵�� ����ϴ� �����ڰ� ..���ܸ� ó���� �־����� ... [������]

������ throws IOException , NullPointerException
�Լ�

*/
public class ExceptionClass {
	public ExceptionClass(String path) throws IOException , NullPointerException  {
		//throws������ ����ó�� ������ ������ �����
	}
	
	public void call() throws ArithmeticException , IndexOutOfBoundsException {
		System.out.println("call �Լ� start");
	//	int i = 0/0;
		System.out.println("call �Լ� end");
	}
}


















