import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class File_Assignment_mix {
	static int totalfiles=0;
	static int totaldirs=0;
public static void main(String[] args) {
		
	   if(args.length!=2&&args.length != 3 && args.length != 4) {
			System.out.println("���� : [java ���ϸ�] [���丮���] mkdir [�������丮��]");
	    	System.out.println("���� : [java ���ϸ�] [���丮���] RD [���ϸ�]");
	        System.out.println("���� : [java ���ϸ�] [���丮���] TYPE [���ϸ�]");
	        System.out.println("���� : [java ���ϸ�] [���丮���] DIR");
	        System.exit(0);
	    }
	    
	    File f = new File(args[0]);
	    if(!f.exists() || !f.isDirectory()) { //�������� �ʰų� ���丮 �ƴ϶��
	        System.out.println("��ȿ���� ���� ���丮�Դϴ�");
	        System.exit(0);
	    }
	    
	    if(args[1].equals("TYPE")) 
	    {
	    	String path = "";
            path = f + "\\" + args[2];
            File newfile = new File(path);
            if(!newfile.exists()) {
                System.out.println("�������� �ʴ� �����Դϴ�.");
            }else {
            	System.out.println("���ϳ��뺸��");
            	FileReader fr= null;
        		BufferedReader br = null;        	
        		try {
        			fr=new FileReader(newfile);
        			br=new BufferedReader(fr);
        			String line = "";
        			for(int i=0;(line=br.readLine())!=null;i++) {
        					System.out.println(line);       				
        			}
        		}catch (Exception e) {
        			
        		}finally {
        		}
            }   }     
	    
	   
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


	    //	File f = new File(args[0]);
	    	if(!f.exists() || !f.isDirectory()) { //�������� �ʰų� ���丮 �ƴ϶��
	    	System.out.println("��ȿ���� ���� ���丮�Դϴ�");
	    	System.exit(0);
	    	}

	    	if(args[1].equals("RD")) 
	    	{
	    	String path = "";
	    	path = f + "\\" + args[2];
	    	File newfile = new File(path);
	    	if(!newfile.exists()) {
	    	System.out.println("�������� �ʴ� �����Դϴ�.");
	    	}else {
	    	newfile.delete();
	    	System.out.println("�����߽��ϴ�.");
	    	} 
	    	}	

}
}