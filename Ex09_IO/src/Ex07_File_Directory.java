import java.io.File;

/*
 * I/O�۾�
 * ���ϰ� ������ �ٷ� �� �ִ� Ŭ����
 * JAVA: ����, ���� �ϳ��� Ŭ���� : file
 * ���-a.txt ����,����,����,����read
 * Temp ���� ����,����,����read
 * 
 * ���
 * ������:C:\\,D:\\ > C:\\Temp\\a.txt
 * �����:���� ������ �߽����� C:\\Temp\\a.txt >
 * 
 */
public class Ex07_File_Directory {

	public static void main(String[] args) throws Exception{

		String path="C:\\Temp\\file.txt";
		File f=new File(path);
		//f.createNewFile(); �Լ��� ȣ���� �� ���� ����
		//FileŬ������ ���ؼ� 
		System.out.println("����");
		//�پ��� ������ �� �� �ִ�..
		String filename=f.getName();
		System.out.println("���ϸ�: "+filename);
		System.out.println("*��ü���: "+f.getPath()); //��κ��ٴ� ����ִ� ���ű�
		System.out.println("������: "+f.getAbsolutePath()); //c,d����̺� ��α���
		System.out.println("*�� ������: "+f.isDirectory());
		System.out.println("*�� �����̴�: "+f.isFile());
		System.out.println("*������ ũ��: "+f.length());
		System.out.println("*�θ���: "+f.getParent());//���� ������ �������
		System.out.println("*���翩��(����,����): "+f.exists());
		//f.delete() return >> true,false
		//f.canRead()
		//
		
	}

}
