package Quiz;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

//���� ������ Ŭ����

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
				System.out.println("�߸� �����Ͽ����ϴ�.");
				break;

			}

		}

		System.out.println("�����մϴ�...");

	}

	int selectMenu() {

		System.out.println("1:�߰� 2:���� 3:�˻� 4:���� ��� 5:ISBN ���0:����");

		int key = scan.nextInt();

		scan.nextLine();

		return key;

	}

	void addBook() {

		String isbn;

		System.out.print("�߰��� ���� ISBN:");

		isbn = scan.nextLine();

		if (book_dic.containsKey(isbn)) {

			System.out.println("�̹� �����ϴ� ISBN�Դϴ�.");

			return;

		}

		String title;

		int price;

		System.out.print("���� ����:");

		title = scan.nextLine();

		System.out.print("����:");

		price = scan.nextInt();

		scan.nextLine();

		Book book = new Book(isbn, title, price);

		book_dic.put(isbn, book);

		System.out.println(book.toString() + " �����Ͽ����ϴ�.");

	}
void readBook() { //read�� in�̶� ¦
	File file1 = new File("hoho.txt");
	FileInputStream fis = null;
	BufferedInputStream bis = null;
	ObjectInputStream oos = null;
	try {
		fis = new FileInputStream(file1);
		bis = new BufferedInputStream(fis);
		oos = new ObjectInputStream(bis); //read�� �ϳ��� �ؿ;� �ϴµ� , hesh map �� Ű�� ���� �����ϱ� set���� �����ؼ� ����.
		Set<String> set1 = book_dic.keySet(); //book_dic�� key�� set�� �ϳ��� ����.
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
void writeBook() { //write�� out�̶�¦
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

		System.out.print("������ ���� ISBN:");

		isbn = scan.nextLine();

		if (book_dic.containsKey(isbn)) {

			book_dic.remove(isbn);

			System.out.println("�����Ͽ����ϴ�.");

		}

		else {

			System.out.println("�������� �ʽ��ϴ�.");

		}

	}

	void searchBook() {

		String isbn;

		System.out.print("�˻��� ���� ISBN:");

		isbn = scan.nextLine();

		if (book_dic.containsKey(isbn)) {

			Book book = book_dic.get(isbn);

			System.out.println("�˻� ���>>" + book.toString());

		}

		else {

			System.out.println("�������� �ʽ��ϴ�.");

		}

	}

	void listBook() {

		System.out.println("���� ���");

		int cnt = book_dic.size();

		System.out.println("���� ��:" + cnt);

		for (Book book : book_dic.values()) {

			System.out.println(book.toString());

		}

	}

	void listISBN() {

		System.out.println("ISBN ���");

		int cnt = book_dic.size();

		System.out.println("���� ��:" + cnt);

		for (String isbn : book_dic.keySet()) {

			System.out.println(isbn);

		}

	}

}