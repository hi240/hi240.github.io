package kr.or.bit;

import java.util.Scanner;

public class Exercise_1 {

	public static void main(String[] args) {   //컴퓨터
	
		 int price=30000000;
		 String brand="brand";
		 String serial="12313454623";
		 String color="red";
		 //부품
		 Keyboard keyboard = new Keyboard();
		 Mainbody mainbody = new Mainbody();
		 Monitor monitor = new Monitor();
         //상태
		 Boolean sleepmode=true; //절전모드킴.
         //기능
		 keyboard.button=false; //버튼끔.
		 
		 mainbody.power=true; //전원킴.
		 
		 Calculator.minus(3,2); //사칙연산
         System.out.println("입력하고싶은 문자를 입력하세요");
      //   Scanner sc = new Scanner(System.in); 
		//  Write.write("하이"); //입력 및 출력
		 
		 
		 
		 // 입력/출력가능하다. 전원킬/끌수있따. 절전모드 온/오프. 사칙연산

	}
		 


}

	

