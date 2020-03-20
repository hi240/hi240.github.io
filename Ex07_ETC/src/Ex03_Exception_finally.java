import java.io.IOException;

public class Ex03_Exception_finally {

	static void startInstall() {
		System.out.println("INSTALL");
	}
	static void copyFiles() {
		System.out.println("COPY FILES");
	}
	static void fileDelete() {
		System.out.println("DELETE FILES");
	}
	public static void main(String[] args) {
		
		try {
			copyFiles();
			startInstall();
			//throw : 개발자가 임의로 문제를 발생시켜서 강제로 예외처리를 하는 방법.
			throw new IOException("Install 중 문제 발생");	
		}catch (Exception e) {
			System.out.println("예외 메시지 출력: "+e.getMessage());
			
		}finally { //강제적 실행 블럭 (예외가 발생(o), 예외가 발생(x)무조건 실행)
			fileDelete();
		}
		//자원 해제.. 반환..

		
		System.out.println("Main END");
	
	}

}
