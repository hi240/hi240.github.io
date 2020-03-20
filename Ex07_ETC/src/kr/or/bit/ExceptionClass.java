package kr.or.bit;

import java.io.IOException;

/*
설계도 (class) 만들때 ...... 여러가 코드 ... 문제가 ....
내 설계도를 사용하는 개발자가 ..예외를 처리해 주었으면 ... [강제로]

생성자 throws IOException , NullPointerException
함수

*/
public class ExceptionClass {
	public ExceptionClass(String path) throws IOException , NullPointerException  {
		//throws이하의 예외처리 문구를 강제로 만들어
	}
	
	public void call() throws ArithmeticException , IndexOutOfBoundsException {
		System.out.println("call 함수 start");
	//	int i = 0/0;
		System.out.println("call 함수 end");
	}
}


















