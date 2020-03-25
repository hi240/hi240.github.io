import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

import kr.or.bit.Userinfo;

//userDara.txt에 직렬화된 객체가 두개 있음. 이제 읽는 작업.
//원상태로 복원 : 역직렬화
public class Ex16_ObjectDataInputStream {
	public static void main(String[] args) {
		String filename = "UserData.txt";

		FileInputStream fis = null;
		BufferedInputStream bis = null;
		ObjectInputStream in = null;
		
		try {
			fis = new FileInputStream(filename); //filename이 갖고있는 txt파일을 
			bis = new BufferedInputStream(fis);//buffer을 통해서
			in = new ObjectInputStream(bis); //역직렬화로 조립!
			
			//방법1 : 초보자는 이거 추천하는듯
			Userinfo r1=(Userinfo) in.readObject(); //다운캐스팅
			Userinfo r2=(Userinfo) in.readObject();
			System.out.println(r1.toString());
			System.out.println(r2.toString());
			Object users= null;
			//방법2
			while((users = in.readObject())!=null) {
				System.out.println(((Userinfo)users).toString());
			}
			

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			try {
		    in.close();
			bis.close();
			fis.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		
		}
	}

}
