import java.io.File;
//���� ............������
import java.util.ArrayList;

public class File_Assignment3 {
	static int totalfiles=0;
	static int totaldirs=0;
	public static void main(String[] args) throws Exception {
		
	    if(args.length != 2) {
	    //args�� java �ϰ� ���ϸ� ������ ���ڰ� �迭�� �ϳ��� ���� ����.
	        System.out.println("���� : [java ���ϸ�] [���丮���] DIR");
	        System.exit(0);
	    }
	    
	    File f = new File(args[0]);
	    if(!f.exists() || !f.isDirectory()) { 
	        System.out.println("��ȿ���� ���� ���丮�Դϴ�");
	        System.exit(0);
	    } 
	    if(args[1].equals("DIR")) 
	    {
	        File di = new File(args[0]);
	        if(!f.exists()||!f.isDirectory()) {//���������ʰų� ���丮�����ٸ�
				System.out.println("��ȿ���� ���� ���丮 �Դϴ�.");
				System.exit(0);
			}	
	        else {
	        	printFileList(di);
	             }
	        }
	    }
	    static void printFileList(File dir) {
	  
	            System.out.println("[���� full path: ]"+dir.getAbsolutePath());
	            ArrayList<Integer> subdir = new ArrayList<Integer>();
	    		File[] files = dir.listFiles();
	    		
	    		for(int i=0;i<files.length;i++) {
	    			String filename = files[i].getName();
	    			if(files[i].isDirectory()) {
	    				filename = "<DIR> ["+filename+"]";
	    				subdir.add(i); 
	    			}else {
	    				filename = filename+ "/"+files[i].length()+"byte";
	    			}
	    			System.out.println("  "+filename);
	    		}
	    	int dirnum = subdir.size(); //������ ����
	    	int filenum= files.length-dirnum; //���ϰ���

	    	totaldirs += dirnum; //�� ���� ���� ����
	    	totalfiles += filenum; //�� ���� ���� ����
	    	System.out.println("[���� �������� "+ dirnum+"]");
	    	System.out.println("[���� ���ϰ��� "+ filenum+"]");
	    	System.out.println("**************************");

	    	
	    	}
	        
		}
	    
	

	

