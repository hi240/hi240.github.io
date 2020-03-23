import java.io.DataInputStream;
import java.io.FileInputStream;

public class Ex14_DataInputStream {

	public static void main(String[] args) {
		int sum=0;
		int score=0;
		FileInputStream fis = null;
		DataInputStream dis = null;
	
		try {
		    fis=new FileInputStream("score.txt");
		    dis=new DataInputStream(fis);
		    while(true) {
		    	score=dis.readInt();
		    	System.out.println("score int 타입: "+score); //정수값으로 쓴거 정수값으로 읽어들임.
		    	sum+=score;
		    }
		} catch (Exception e) {
			System.out.println("예외발생: "+e.getMessage()); //그냥예외처리해봤어요.
			e.printStackTrace(); //디테일한 오류
			System.out.println("sum 결과: "+sum);
		} finally {
			try {
				dis.close();
				fis.close();
			} catch (Exception e2) {
				
				System.out.println(e2.getMessage());
			}
		}

	}

}
