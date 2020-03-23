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
		out = new ObjectOutputStream(bos); //����ȭ
		Userinfo u1 = new Userinfo("ȫ�浿","super",500); //����ǰ
		Userinfo u2 = new Userinfo("scott","tiger",50); 
		
		//����ȭ�۾�
		out.writeObject(u1); //�����ؼ� ���� ������ ���Ͽ� write
		out.writeObject(u2);
		//���� ���Ͽ� userinfo ��ü 2���� write �Ǿ�����.
		System.out.println("���� ���� -> buffer -> ����ȭ -> ���� write");
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
