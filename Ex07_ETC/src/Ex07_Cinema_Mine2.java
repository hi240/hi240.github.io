import java.util.Scanner;

public class Ex07_Cinema_Mine2 {
	
	static int menu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.�¼�Ȯ��");
		System.out.println("2.�¼�����");
		System.out.println("3.�������");
		System.out.println("4.����Ȯ��");
		System.out.println("5.����");
		int num=1;
		do{
		 try { num=Integer.parseInt(sc.nextLine());
		 if(num==1||num==2||num==3||num==4||num==5){break;}
		else {throw new Exception("��ȣ�� �߸��Ǿ����ϴ�.");}
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
			case 5: System.out.println("����˴ϴ�.");System.exit(0);break;
			}
			}
		}

}
