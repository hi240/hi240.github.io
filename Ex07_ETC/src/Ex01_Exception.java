/*
 * 오류
 * 1. 에러(error): 네트워크 장애, 메모리, 하드웨어 (개발자 코드적으로 해결 불가능)
 * 2. 예외(Exception): 개발자의 코드에 의해 발생하고, 코드를 수정함으로써 해결할 수 있는 문제들..
 *    어떤 문제? 0으로 나누거나? 없는 배열에 들어간다거나? 
 *    예외가 발생하면, 프로그램은 강제로 종료됩니다.
 * 3. 예외처리하는 방법 : 그러나, 문제가 생기는 코드를 수정하는 게 아니고, 문제 발생시 비정상적 종료를 막는것뿐.
 * 
 */
//public class Ex01_Exception {
//
//	public static void main(String[] args) {
//	    try {
//	    	//문제가 발생할 수 있는 코드! (불안한 코드...
//	    }
//	    catch (Exception e) {
//	    	//문제가 생기면 catch 블럭에서 잡고
//	    	//관리자에게 email 한다던가 로그파일 문제 원인 기록
//	    	//강제종료를 우선 막는다.
//	    }finally {
//	    	//문제가 발생하던, 발생하지 않던 강제로 수행되어야 할 코드
//	    	//DB연결 닫기
//	    	
//	    }
//	}
//
//}
public class Ex01_Exception {

	public static void main(String[] args) {
	    System.out.println("main start");
	    try {
	    	System.out.println(0/0); //문제 발생 소지의 코드를넣는다...
	    }catch (Exception e) {
	    	System.out.println(e.getMessage());
	    }
	    System.out.println("main end");
	}

}