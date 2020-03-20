import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * Reader
 * Writer �۾��� ����(buffer)
 * buffer ���δ��� �۾��� ����.
 */
public class Ex06_FileReader_FileWriter_Buffer {

	public static void main(String[] args) throws Exception {
		FileWriter fw=new FileWriter("Lotto.java",true);
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write("�ζ�");
		bw.newLine();
		bw.write("1,45,20,4,3,5");
		bw.newLine();
		bw.flush();
		
		
		FileReader fr= null;
		BufferedReader br = null;
	
		try {
			fr=new FileReader("Ex01_Stream.java");
			br=new BufferedReader(fr);
			String line = "";
			for(int i=0;(line=br.readLine())!=null;i++) {
				
				//System.out.println(line);
				if(line.indexOf(";")!=-1) {  //;�ִ¾ֵ鸸 ���.
					System.out.println(line);
				}
			}
		}catch (Exception e) {
			
		}finally {
			try {
			br.close();
			fr.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
		}
		

	}

}