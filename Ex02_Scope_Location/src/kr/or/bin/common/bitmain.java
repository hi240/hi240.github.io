package kr.or.bin.common;

import java.util.Scanner;

public class bitmain {
//Car클래스, person 클래서 bitmain 같은 폴더안에 있다...
	
	public static void main(String[] args) {
	Car c= new Car();
	Person p = new Person();
	c.door=200;
	
	Scanner sc = new Scanner(System.in);
    int a=((int)(Math.random() * 3) + 1);//a=1 가위 , a=2 바위, a=3보
    System.out.printf("가위 바위 보 게임\n가위/바위/보 중 하나를 입력하세요!\n");
    String d=sc.nextLine();
    while(!(d.equals("가위")||d.equals("바위")||d.equals("보"))) {  //잘못 입력한 경우
     System.out.println("잘못 입력하셨습니다. 다시 입력해 주세요.");
     System.out.println("가위 바위 보 게임\n가위/바위/보 중 하나를 입력하세요!\n");   
     d=sc.nextLine();
      }
      
    if(d.equals("가위")) {
        if(a==1) System.out.println("컴퓨터는 가위, 당신도 가위, 비겼습니다");          
        else if(a==2) System.out.println("컴퓨터는 바위, 당신은 가위, 당신이 졌습니다.");
        else System.out.println("컴퓨터는 보, 당신은 가위, 당신이 이겼습니다.");
    }else if(d.equals("바위")) {
        if(a==1) System.out.println("컴퓨터는 가위, 당신은 바위, 당신이 이겼습니다.");
        else if(a==2) System.out.println("컴퓨터는 바위, 당신도 바위, 비겼습니다");
        else System.out.println("컴퓨터는 보, 당신은 바위, 당신이 졌습니다.");
    }else if(d.equals("보")) {
        if(a==1) System.out.println("컴퓨터는 가위, 당신은 보, 당신이 졌습니다.");
        else if(a==2) System.out.println("컴퓨터는 바위, 당신은 보, 당신이 이겼습니다.");
        else System.out.println("컴퓨터는 보, 당신도 보, 비겼습니다");
    }
	}

}
