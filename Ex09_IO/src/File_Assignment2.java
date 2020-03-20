import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
//���� ���뺸��
public class File_Assignment2 {

	public static void main(String[] args) {
		
	    if(args.length != 3 && args.length != 4) {
	        System.out.println("���� : [java ���ϸ�] [���丮���] TYPE [���ϸ�]");
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
		}	    	    
	}

