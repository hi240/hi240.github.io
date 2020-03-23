package Quiz;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.HashMap;
import java.util.Set;

//ó�� �Ͻô� �� 
//�߰����� : ���� ���� , ���� �б� 
public class BookMain {
	public static void main(String[] args) {
		BookManager bm = new BookManager();
        bm.Run();
        public void load() {
    		File file = new File("Book.txt");
    		try{
    			FileInputStream fis = new FileInputStream(file);
    			ObjectInputStream oos = new ObjectInputStream(fis);
    			
    			bm = (BookManager) oos.readObject(); //��ü���� Object�� �д´�. �ٿ�ĳ������ oos������Ʈ�� �о �ؽ��ʿ� �����Ų��.
    			
    			Set<String> set = bm.keySet();
    			System.out.println("isbn\t����\t����\t");
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
    			System.out.println("�ҷ����µ� �����Ͽ����ϴ�.");
    			e.printStackTrace();
    		}
    	}
	}

}