////예매 취소 조회
//public class Ex07_Cinema_Mine {
//	
//	
//	
//	public static void main(String[] args) {
//
//		for (int i = 0; i < seat.length; i++) {
//			for (int j = 0; j < seat[i].length; j++) {
//				seat[i][j] = "___";
//			}
//		}
//		show(); //좌석 보여주기
//		reservation("이서영",1,2); //좌석생성 및 예매
//	}
//
//	static void show() {
//		for (int i = 0; i < seat.length; i++) {
//			for (int j = 0; j < seat[i].length; j++) {
//				System.out.printf("[%s]", seat[i][j].equals("___") ? "자리" : "예매");
//			}
//			System.out.println();
//		}
//	}	
//	static void reservation(String s,int a,int b) {		
//		if(seat[a][b].equals("___")) {
//			System.out.println("예매가능합니다.");
//		}
//		else{System.out.println("이미 예약된 자석 입니다.");	
//		
//		}
//    }
//}
