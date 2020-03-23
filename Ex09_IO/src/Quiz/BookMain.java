package Quiz;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.HashMap;
import java.util.Set;

//처음 하시는 분 
//추가사항 : 파일 저장 , 파일 읽기 
public class BookMain {
	public static void main(String[] args) {
		BookManager bm = new BookManager();
        bm.Run();
        public void load() {
    		File file = new File("Book.txt");
    		try{
    			FileInputStream fis = new FileInputStream(file);
    			ObjectInputStream oos = new ObjectInputStream(fis);
    			
    			bm = (BookManager) oos.readObject(); //객체에서 Object를 읽는다. 다운캐스팅한 oos오브젝트를 읽어서 해쉬맵에 저장시킨다.
    			
    			Set<String> set = bm.keySet();
    			System.out.println("isbn\t제목\t가격\t");
    			//(String isbn, String title,int price){
    			for (String number : set) {
    				String isbn = bm.listISBN();();
    				String title = bm.listBook();
    			    int price= bm.addBook().price;


    				System.out.printf("[%s]\t%.2f\t%.2f\t%.2f\t%s\n", isbn,title,price);
    			}
    			oos.close();
    			fis.close();
    			
    		}catch(Exception e){
    			System.out.println("불러오는데 실패하였습니다.");
    			e.printStackTrace();
    		}
    	}
	}

}