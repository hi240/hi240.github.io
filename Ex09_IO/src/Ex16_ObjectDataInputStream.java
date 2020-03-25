import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

import kr.or.bit.Userinfo;

//userDara.txt�� ����ȭ�� ��ü�� �ΰ� ����. ���� �д� �۾�.
//�����·� ���� : ������ȭ
public class Ex16_ObjectDataInputStream {
	public static void main(String[] args) {
		String filename = "UserData.txt";

		FileInputStream fis = null;
		BufferedInputStream bis = null;
		ObjectInputStream in = null;
		
		try {
			fis = new FileInputStream(filename); //filename�� �����ִ� txt������ 
			bis = new BufferedInputStream(fis);//buffer�� ���ؼ�
			in = new ObjectInputStream(bis); //������ȭ�� ����!
			
			//���1 : �ʺ��ڴ� �̰� ��õ�ϴµ�
			Userinfo r1=(Userinfo) in.readObject(); //�ٿ�ĳ����
			Userinfo r2=(Userinfo) in.readObject();
			System.out.println(r1.toString());
			System.out.println(r2.toString());
			Object users= null;
			//���2
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
