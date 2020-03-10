import java.util.Scanner;

public class Ex07_Printf_format {

	public static void main(String[] args) {
		//java:System.out.println();
		//C#: Console.WriteLine();
		
		System.out.println(); //println은 줄바꿈
		System.out.print("A"); //print는 옆으로 붙여씀
		System.out.print("A");
		System.out.println("A");	
		System.out.println("A");
		
		int num =100;
		char a= 'a';
		System.out.println(num);
		System.out.println("num값은: "+num+"입니다");
	   //형식 format	
		System.out.printf("num값은: %d입니다 \n",num);
		//format을 제어하는 형식문자
		//%d (정수)
		//%f (실수)
        //%s (문자열)
		//%c (문자)
		// \t : tab \n : 줄바꿈
		System.out.printf("num값은 [%d]입니다. 그리고 [%c]도 있어요 \n",num,a);
 
		float f=3.14f;
		System.out.println(f);
		System.out.printf("f변수값은 %f입니다 \n",f);
		//%.2f :둘째자리 소수점까지 출력하라.
		
		//반대로 cmd (console) 창에서 데이터 입력 받기.
		//생성자 = 함수이름과 클래스이름이 똑같음. 객체가 생성될 때 호출되는 함수라 볼 수 있다.
		
		/* 심화학습 
		 *  참고 :ex class Car{
		 *          String color;
		            Car(String carcolor){
		            color=carcolor;}
		            car n=new car("초록색"); 
		 함수생성시 반드시 string에 해당하는 값을 넣어야지만 new를 생성할 수 있다.
		*/
		
		Scanner sc = new Scanner(System.in); 
		//Multiple markers at this line- Scanner cannot be resolved to a type이라는 오류
        //ctrl+shift+O : import구문 자동 생성하기.
	//	System.out.println("값을 입력하세요");
	//	String value = sc.nextLine(); //입력하고 엔터할때까지 대기 후 문자열로 반환
	//	System.out.println(value);
	//	int number = sc.nextInt();
	//	System.out.println("정수값: "+number);
	//	float fnumber = sc.nextFloat();
	//	System.out.println("실수값: "+fnumber);
		//권장:nextInt,nextFloat보다는 nextLine()으로 읽자
		//Today Point
		//web에서는 숫자도 문자임.
		//문자를 >숫자로 (정수,실수)
	    //Integer.parseInt("11");문자열을 정수로
	    //Float.partseFloat("3.111"); 문자열을 실수로
        //Double.parseDouble(s); 마찬가지
		
		System.out.println("숫자 입력하세요");
		int num2= Integer.parseInt(sc.nextLine());
		System.out.println("정수값: "+num2);
		//Tip으로 알아두세요
		//valueOf라는 함수? valueOf 뒤 숫자를 -> 문자로 바꾸는 함수.
		String dat=String.valueOf(100);
		System.out.println(dat);
	
		
		
	}

}
