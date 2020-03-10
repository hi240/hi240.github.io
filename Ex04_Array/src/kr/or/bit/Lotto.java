package kr.or.bit;

import java.util.Random;
import java.util.Scanner;

//설계도
//1. 1~45까지의 난수를 발생시켜 6개의 배열에 담으세요
//(int)(Math.random()*45 + 1)
//lotto[0] = 44 , lotto[1] = 1 .... lotto[5] = 33
//*2. 배열에 담긴 6개의 배열값은 중복값이 나오면 안되요  (중복값 검증 :별찍기 비슷)
//*3. 배열에 있는 6개의 값은 낮은 순으로 정렬 시키세요  (정렬 : 자리바꿈)
//*4. 위 결과를 담고 있는 배열을 출력하세요 (화면 출력)

//오늘의 약속: *클래스의 멤버변수의 초기화는 되도록이면 생성자에서 하자.

public class Lotto {  
	//public int numbers=10; <이렇게 초기화 해도 되나, 밑으로 하는게 예뻐서 보여드림.
	
//    private int numbers;
//  
//    public Lotto() {//생성자의 목적: 초기화!(**멤버필드초기화**)
//    	this(10); //밑에랑 같은 말.
//    	//this.numbers=10;
//    }
//    public Lotto(int numbers) {
//    	this.numbers=numbers;
//    }
	private int[] numbers;
	private Scanner scanner;    //scanner는 한번만 만들어도 돼용
	private Random r ;// = new Random();

	public Lotto() {
		//초기화(member field) 앞으로 초기화는 주로 생성자에서 하세요.
		numbers=new int[6];
		scanner = new Scanner(System.in);
		r=new Random();
	}
	//기능 method 안에서 함수 하나당 기능은 한개만. 그래야 유지보수가 편하다.
	//중복값이 나오면 안돼요
	//낮은 순으로 정렬 시키세요
	//출력하세요(화면 출력)
	//메뉴 기능을 넣어서 선택하게 해봅시다.
	//1번>로또 추출
	//2번>프로그램종료
	
	public void selectLottoNumber() {
	loop_1: while(true) {
			 String selectionnum = showMenu(scanner);
			 switch (selectionnum) {
			 	case "1":
	        	//makeLottoNumber(r,numbers); //실번호 추출
	        	//showLottoNumbers(); //정렬하고 출력하기
			 		do {
		 				makeLottoNumber(r,numbers); //실번호 추출
		 			}while(!checkAverage());
		 			showLottoNumbers();
	        	break;
	         case "2": //프로그램 종료: return (함수탈출),System.exit(0), 라벨값
                System.out.println("good luck!");
	        	break loop_1;
	         default:
	        	System.out.println("Not in Operation");
	        	break;
	         }
		}

	}
	  //왜 private 일까? >내부에서만 사용할거기 때문이다..
      private String showMenu(Scanner sc) { //parameter연습이니까
    	System.out.println("******************");
    	System.out.println("*1. 당첨 예상 번호 추출*");
    	System.out.println("*2. 프로그램 종료  ^^!*");
     	System.out.println("******************");
        System.out.print("원하는 작업 번호를 입력하세요: ");
    	String selectionnum = sc.nextLine();
    	return selectionnum;
      }
//번호 추출,중복값 제거
      private void makeLottoNumber(Random r, int[] numbers) { //parameter연습
    	  for(int i=0;i<6;i++) {
    		  numbers[i]=(int)(Math.random()*45+1);
    		  // numbers[i]=r.nextInt(45)+1;
    		  for(int j=0;j<i;j++) {
    			  if(numbers[i]==numbers[j]) {
    			  i--;
    			  break;
    			  }
    		  }
    	  }
      }
//화면 출력기능
      private void showLottoNumbers() {
    	  System.out.println("[선택한 Lotto 번호]");
       for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[i] > numbers[j]) {
					int tmp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = tmp;
				}
			}

		}

  	    for (int i = 0; i < numbers.length; i++) {
		System.out.printf("[%2d]" + numbers[i]);
	     }
	      System.out.println();
      }
      //규칙 배열의 합의 평균이 특정 범위에 벗어나면 재추출.
      private boolean checkAverage() {
    	  int sum=0;
    	  int average =0;
    	  for(int num : numbers) {
    		  sum+=num;
    	  }
    	  average=sum/numbers.length;
    	  System.out.println("평균: "+average);
    	  return (average >= 15 && average <= 35);
    	  
      }
}