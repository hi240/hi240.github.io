import java.io.File;


public class Ex08_File_Directory {

	public static void main(String[] args) {
	System.out.println(args.length);
	//System.out.println(args[0]);
	if(args.length!=1) {
		System.out.println("����:java ���ϸ�[���丮��]");
		System.exit(0); //�����������ѷ�!
	}
	File f= new File(args[0]);
	if(!f.exists()||!f.isDirectory()) {
		//�������� �ʰų�,���丮�� �ƴ϶��
		System.out.println("��ȿ���� ���� ����Դϴ�");
		System.exit(0);//���������ѷ�!	
	}
	File[] files =f.listFiles();//����� ������ ���� �ȿ� �ִ� ��� ������ ������ ��� ���ڴ�.
	//C:\\Temp\\1.jpg >�ϳ��ϳ��� file��ü�� ��Ƽ� �ְڴ�..
	//C:\\Temp\\a.txt
	for(int i=0;i<files.length;i++) {
		String name= files[i].getName(); //���ϸ�,������
		System.out.println(files[i].isDirectory()?"[DIR]"+name:name);
	}
	
	
	}

}