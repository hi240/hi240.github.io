import java.util.Scanner;

public class Ex08_Operation_Quiz {

	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in); 
		 int a= Integer.parseInt(sc.nextLine());	//정수1	
    	 String b = sc.nextLine();	
		 int c=Integer.parseInt(sc.nextLine());	   //정수2
		int result=0; //result 초기화
		
		while(true) {
			if(b.equals("+"))
            {result=a+c;}
			else if(b.equals("-"))
			{result=a-c;}
			else if(b.equals("*"))
			{result=a*c;}
			else if(b.equals("/"))
			{result=a/c;}
			else System.out.println("연산자를 다시입력하세요");
			
            System.out.println("연산결과는: "+result);
            break;
            }

				
	/*	 switch(b) {                           //if문이나 while문으로도 쓸 수 있음.
		 case  "+": 
		  if (b.equals("+")) {result = a+c;} //equals()로 또 확인하면 낭비다.
		  break;                             //하지만 강사님이 쓰래서 억지로 쓴 것.
		 case "-" :
			 if (b.equals("-")) {result = a-c;} //if
		  break;
		 case "*" :
			 if (b.equals("*")) {result = a*c;}
		  break;
		 case "/" :
			 if (b.equals("/")) {result = a/c;}
		  break;
		 default : 
			 
			// return 이라는 건 함수단위의 종결자를 의미한다.
		    // 즉, [함수단위]의 종결자 > main 함수 탈출 > 종료.
			 System.out.println("올바른 연산자를 입력하세요.");
			 return;         //return을  만나면, main함수 밖으로 바로 나가버림.
		    //System.exit(0) //강제적인 프로그램 종료
		 }
		 
		System.out.println("연산결과 = "+result);
		System.out.printf("%d %s %d = %d",a,b,c,result);
		 */

		}
	}

		

	

