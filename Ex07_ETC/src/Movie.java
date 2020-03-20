import java.util.Scanner;

public class Movie {
	Scanner sc = new Scanner(System.in);
	
	String[][] seat = new String[3][5];
	public void makeseat() {
	for (int i = 0; i < seat.length; i++) {
		for (int j = 0; j < seat[i].length; j++) {
			seat[i][j] = "___";
		}
	}
	}
	public void showseat() {
		for (int i = 0; i < seat.length; i++) {
			for (int j = 0; j < seat[i].length; j++) {
				System.out.printf("[%s]", seat[i][j].equals("___") ? "�ڸ�" : "����");
			}
			System.out.println();
		}
	}
	public void reservation() { //����
		System.out.println("������ �¼��� �Է��ϼ���.");
		String s=sc.nextLine();
		int a =Integer.parseInt(s.substring(0,1));
		int b =Integer.parseInt(s.substring(2,3));
		if(seat[a][b].equals("___")) {
			System.out.println("���ŵǾ����ϴ�.");
			seat[a][b]="����";
		}
		else System.out.println("�̹� ���ŵ� �¼� �Դϴ�.");
	}
	public void cancel() { //���
		System.out.println("����� �¼��� �Է��ϼ���.");
		String s=sc.nextLine();
		int a =Integer.parseInt(s.substring(0,1));
		int b =Integer.parseInt(s.substring(2,3));
		if(seat[a][b].equals("___")) {
	System.out.println("���ŵ��� ���� �¼��Դϴ�.");
		}
		else if(seat[a][b].equals("����")){
			seat[a][b]="___";
			System.out.println("���� ��� �Ǿ����ϴ�.");
		}
	}
	public void check() {
		System.out.println("��ȸ�� �¼��� �Է��ϼ���.");
		String s=sc.nextLine();
		int a =Integer.parseInt(s.substring(0,1));
		int b =Integer.parseInt(s.substring(2,3));
		if(seat[a][b].equals("___")) {
	    System.out.println("���ŵ��� ���� �¼��Դϴ�.");
		}
		else if(seat[a][b].equals("����")){
	    System.out.println("���ŵ� �¼��Դϴ�.");
		}
	}
	
}
