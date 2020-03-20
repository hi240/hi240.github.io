import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
//파일 내용보기
public class File_Assignment2 {

	public static void main(String[] args) {
		
	    if(args.length != 3 && args.length != 4) {
	        System.out.println("사용법 : [java 파일명] [디렉토리경로] TYPE [파일명]");
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
		}	    	    
	}

