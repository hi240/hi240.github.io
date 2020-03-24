package Quiz;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

//도서 관리자 클래스

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class BookManager {

	Scanner scan = new Scanner(System.in);

	HashMap<String, Book> book_dic = new HashMap<String, Book>();

	public void Run() {

		int key = 0;

		while ((key = selectMenu()) != 0) {

			switch (key) {

			case 1:
				addBook();
				break;

			case 2:
				removeBook();
				break;

			case 3:
				readBook();
				break;

			case 4:
				writeBook();
				break;

			case 5:
				listISBN();
				break;

			default:
				System.out.println("잘못 선택하였습니다.");
				break;

			}

		}

		System.out.println("종료합니다...");

	}

	int selectMenu() {

		System.out.println("1:추가 2:삭제 3:검색 4:도서 목록 5:ISBN 목록0:종료");

		int key = scan.nextInt();

		scan.nextLine();

		return key;

	}

	void addBook() {

		String isbn;

		System.out.print("추가할 도서 ISBN:");

		isbn = scan.nextLine();

		if (book_dic.containsKey(isbn)) {

			System.out.println("이미 존재하는 ISBN입니다.");

			return;

		}

		String title;

		int price;

		System.out.print("도서 제목:");

		title = scan.nextLine();

		System.out.print("가격:");

		price = scan.nextInt();

		scan.nextLine();

		Book book = new Book(isbn, title, price);

		book_dic.put(isbn, book);

		System.out.println(book.toString() + " 생성하였습니다.");

	}
void readBook() { //read는 in이랑 짝
	File file1 = new File("hoho.txt");
	FileInputStream fis = null;
	BufferedInputStream bis = null;
	ObjectInputStream oos = null;
	try {
		fis = new FileInputStream(file1);
		bis = new BufferedInputStream(fis);
		oos = new ObjectInputStream(bis); //read를 하나씩 해와야 하는데 , hesh map 에 키에 모든게 있으니까 set으로 변경해서 읽자.
		Set<String> set1 = book_dic.keySet(); //book_dic의 key를 set에 하나씩 저장.
		for(String se:set1) {
			String isbn = book_dic.get(se).isbn;
			String title = book_dic.get(se).title;
			int price= book_dic.get(se).price;
			System.out.println(isbn+title+price);
		}
		
	}catch (Exception e) {
		e.getMessage();
	}finally {
		try {
			oos.close();
			bis.close();
			fis.close();
		} catch (Exception e2) {
			e2.getStackTrace();
		}
	}	
}
void writeBook() { //write는 out이랑짝
	File file1 = new File("hoho.txt");
	FileOutputStream fos = null;
	BufferedOutputStream bos = null;
	ObjectOutputStream oos = null;
	try {
		fos = new FileOutputStream(file1);
		bos = new BufferedOutputStream(fos);
		oos = new ObjectOutputStream(bos);
		oos.writeObject(book_dic);
	
	} catch (Exception e) {
	e.getMessage();
	}finally {
		try {
			oos.close();
			bos.close();
			fos.close();
		} catch (Exception e2) {
			e2.getStackTrace();
		}
	}	
}
	void removeBook() {

		String isbn;

		System.out.print("삭제할 도서 ISBN:");

		isbn = scan.nextLine();

		if (book_dic.containsKey(isbn)) {

			book_dic.remove(isbn);

			System.out.println("삭제하였습니다.");

		}

		else {

			System.out.println("존재하지 않습니다.");

		}

	}

	void searchBook() {

		String isbn;

		System.out.print("검색할 도서 ISBN:");

		isbn = scan.nextLine();

		if (book_dic.containsKey(isbn)) {

			Book book = book_dic.get(isbn);

			System.out.println("검색 결과>>" + book.toString());

		}

		else {

			System.out.println("존재하지 않습니다.");

		}

	}

	void listBook() {

		System.out.println("도서 목록");

		int cnt = book_dic.size();

		System.out.println("도서 수:" + cnt);

		for (Book book : book_dic.values()) {

			System.out.println(book.toString());

		}

	}

	void listISBN() {

		System.out.println("ISBN 목록");

		int cnt = book_dic.size();

		System.out.println("도서 수:" + cnt);

		for (String isbn : book_dic.keySet()) {

			System.out.println(isbn);

		}

	}

}