import java.io.IOException;

import kr.or.bit.ExceptionClass;

public class Ex04_Exception {

	public static void main(String[] args) {
		ExceptionClass ex = null;
		try {
			String a;
			ex = new ExceptionClass("d");
			System.out.println(0/0);
		} catch (ArithmeticException | IOException e1) {
			System.out.println("걸렷지롱");
			//e1.printStackTrace();
		}
		
		ex.call();
		//이상하네..원래는 throws 의 catch문을 써야된다.

	}

}
