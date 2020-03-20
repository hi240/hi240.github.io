import java.io.File;
import java.util.ArrayList;
public class Ex10_File_SubList {

	static int totalfiles=0;
	static int totaldirs=0;
	
	public static void main(String[] args) {
		if(args.length != 1) { //�ڢ��迭�� ����ִ°� �ƴ϶��, ���� �˷��ֱ�.
			System.out.println("����:java[�������ϸ�][��θ�]");
			System.out.println("����: java Ex10_File_SubList C:\\Temp");
	    	System.exit(0);			
		}
		File f = new File(args[0]); //�ڢ������� ����ְų� �������������� �������.
		if(!f.exists()||!f.isDirectory()) {//���������ʰų� ���丮�����ٸ�
			System.out.println("��ȿ���� ���� ���丮 �Դϴ�.");
			System.exit(0);
		}	
		//�������� ���, ����
		printFileList(f); //�ڢ����!
		System.out.println("���� �� ���ϼ�: "+totalfiles);
		System.out.println("���� �� ������: "+totaldirs);		
	}
	static void printFileList(File dir) {
		System.out.println("[full path: ]"+dir.getAbsolutePath());		
		ArrayList<Integer> subdir = new ArrayList<Integer>();
		File[] files = dir.listFiles();
		//C:\\Temp
		//files[0] �� a.txt
		//files[1] �� aaaa��� ������ ���� �� �ִ�.
		//flies[4] bbbb
		for(int i=0;i<files.length;i++) {
			String filename = files[i].getName(); //������ or ���ϸ�
			if(files[i].isDirectory()) { //������ ������, arraylist[0]�� ���� 
				filename = "<DIR> ["+filename+"]";
				subdir.add(i); //0���� �濡 i�� �־���.> //����� �ø��°�.
				//arrayList�� dir������ �迭���� �����ִ�.
			}else {
				filename = filename+ "/"+files[i].length()+"byte";
			}
			System.out.println("  "+filename);
		}
	int dirnum = subdir.size(); //������ ����
	int filenum= files.length-dirnum; //���ϰ���
	//������ ����� ���ϸ
	totaldirs += dirnum; //�� ���� ���� ����
	totalfiles += filenum; //�� ���� ���� ����
	System.out.println("[Current dirNum "+ dirnum);
	System.out.println("[Current fileNum"+ filenum);
	System.out.println("**************************");
	
	//point
	//files[0]a.txt
	//files[1]aaaa ..
	//files[4]bbbb
	for(int j=0;j<subdir.size();j++) {
		int index=subdir.get(j);
		printFileList(files[index]);
	}
	
	}
	
	
}
