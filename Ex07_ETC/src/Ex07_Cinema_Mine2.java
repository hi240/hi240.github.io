import java.util.Scanner;

public class Ex07_Cinema_Mine2 {
	
	static int menu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.좌석확인");
		System.out.println("2.좌석예매");
		System.out.println("3.예매취소");
		System.out.println("4.예매확인");
		System.out.println("5.종료");
		int num=1;
		do{
		 try { num=Integer.parseInt(sc.nextLine());
		 if(num==1||num==2||num==3||num==4||num==5){break;}
		else {throw new Exception("번호가 잘못되었습니다.");}
		}
		catch(Exception e){
		System.out.println(e.getMessage());
		}} while (true);
		return num;
		}

		
	public static void main(String[] args) {
		Movie movie= new Movie();
		movie.makeseat();
		while(true)
		{
			switch(menu()) {		
			case 1: movie.showseat(); break;
			case 2: movie.reservation(); break;
			case 3: movie.cancel(); break;
			case 4: movie.check();break;
			case 5: System.out.println("종료됩니다.");System.exit(0);break;
			}
			}
		}

}
