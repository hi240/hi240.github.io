import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class File_Assignment_mix {
	static int totalfiles=0;
	static int totaldirs=0;
public static void main(String[] args) {
		
	   if(args.length!=2&&args.length != 3 && args.length != 4) {
			System.out.println("사용법 : [java 파일명] [디렉토리경로] mkdir [생성디렉토리명]");
	    	System.out.println("사용법 : [java 파일명] [디렉토리경로] RD [파일명]");
	        System.out.println("사용법 : [java 파일명] [디렉토리경로] TYPE [파일명]");
	        System.out.println("사용법 : [java 파일명] [디렉토리경로] DIR");
	        System.exit(0);
	    }
	    
	    File f = new File(args[0]);
	    if(!f.exists() || !f.isDirectory()) { //존재하지 않거나 디렉토리 아니라면
	        System.out.println("유효하지 않은 디렉토리입니다");
	        System.exit(0);
	    }
	    
	    if(args[1].equals("TYPE")) 
	    {
	    	String path = "";
            path = f + "\\" + args[2];
            File newfile = new File(path);
            if(!newfile.exists()) {
                System.out.println("존재하지 않는 파일입니다.");
            }else {
            	System.out.println("파일내용보기");
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
	        System.out.println("유효하지 않은 디렉토리입니다");
	        System.exit(0);
	    } 
	    if(args[1].equals("DIR")) 
	    {
	        File di = new File(args[0]);
	        if(!f.exists()||!f.isDirectory()) {//존재하지않거나 디렉토리에없다면
				System.out.println("유효하지 않은 디렉토리 입니다.");
				System.exit(0);
			}	
	        else {
	        	printFileList(di);
	             }
	        }
	    
	    static void printFileList(File dir) {
	  
	            System.out.println("[파일 full path: ]"+dir.getAbsolutePath());
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
	    	int dirnum = subdir.size(); //폴더의 개수
	    	int filenum= files.length-dirnum; //파일개수
	    	totaldirs += dirnum; //총 누적 폴더 개수
	    	totalfiles += filenum; //총 파일 누적 개수
	    	System.out.println("[현재 폴더개수 "+ dirnum+"]");
	    	System.out.println("[현재 파일개수 "+ filenum+"]");
	    	System.out.println("**************************");

		}	 


	    //	File f = new File(args[0]);
	    	if(!f.exists() || !f.isDirectory()) { //존재하지 않거나 디렉토리 아니라면
	    	System.out.println("유효하지 않은 디렉토리입니다");
	    	System.exit(0);
	    	}

	    	if(args[1].equals("RD")) 
	    	{
	    	String path = "";
	    	path = f + "\\" + args[2];
	    	File newfile = new File(path);
	    	if(!newfile.exists()) {
	    	System.out.println("존재하지 않는 파일입니다.");
	    	}else {
	    	newfile.delete();
	    	System.out.println("삭제했습니다.");
	    	} 
	    	}	

}
}