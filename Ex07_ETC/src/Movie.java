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
				System.out.printf("[%s]", seat[i][j].equals("___") ? "자리" : "예매");
			}
			System.out.println();
		}
	}
	public void reservation() { //예약
		System.out.println("예매할 좌석을 입력하세요.");
		String s=sc.nextLine();
		int a =Integer.parseInt(s.substring(0,1));
		int b =Integer.parseInt(s.substring(2,3));
		if(seat[a][b].equals("___")) {
			System.out.println("예매되었습니다.");
			seat[a][b]="예매";
		}
		else System.out.println("이미 예매된 좌석 입니다.");
	}
	public void cancel() { //취소
		System.out.println("취소할 좌석을 입력하세요.");
		String s=sc.nextLine();
		int a =Integer.parseInt(s.substring(0,1));
		int b =Integer.parseInt(s.substring(2,3));
		if(seat[a][b].equals("___")) {
	System.out.println("예매되지 않은 좌석입니다.");
		}
		else if(seat[a][b].equals("예매")){
			seat[a][b]="___";
			System.out.println("예매 취소 되었습니다.");
		}
	}
	public void check() {
		System.out.println("조회할 좌석을 입력하세요.");
		String s=sc.nextLine();
		int a =Integer.parseInt(s.substring(0,1));
		int b =Integer.parseInt(s.substring(2,3));
		if(seat[a][b].equals("___")) {
	    System.out.println("예매되지 않은 좌석입니다.");
		}
		else if(seat[a][b].equals("예매")){
	    System.out.println("예매된 좌석입니다.");
		}
	}
	
}
