import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import kr.or.bit.Userinfo;

public class Ex15_ObjectDataOutputStream {

	public static void main(String[] args) {
		String filename="UserData.txt";
	
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		ObjectOutputStream out = null;
		
		try {
		fos = new FileOutputStream(filename,true);
		bos = new BufferedOutputStream(fos);
		out = new ObjectOutputStream(bos); //직렬화
		Userinfo u1 = new Userinfo("홍길동","super",500); //완제품
		Userinfo u2 = new Userinfo("scott","tiger",50); 
		
		//직렬화작업
		out.writeObject(u1); //분해해서 줄을 세워서 파일에 write
		out.writeObject(u2);
		//이제 파일에 userinfo 객체 2개가 write 되어있음.
		System.out.println("파일 생성 -> buffer -> 직렬화 -> 파일 write");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				out.close();
				bos.close();
				fos.close();
			} catch (Exception e2) {
				e2.printStackTrace();
				}
			
		}
		

	}

}
