import java.util.Scanner;

public class assignment {

	public static void main(String[] args) {
		//1번문제
		
		for(char i=65;i<=90;i++) {
			System.out.println(i);
		}
		
		//2번문제
		for (int j=1;j<=100;j++){
		      System.out.print(j+" ");
		    if(j==10||j==20||j==30||j==40||j==50||j==60||j==70||j==80||j==90)
		    	//if(j%10==0) <-더효율적
		  System.out.println();
		}
		
        //조별과제 1번    -완료
		int sum1=0;
		for (int l=1;l<=20;l++) {
			if (l%2!=0&&l%3!=0) {
		sum1 +=l;
		}
		}
		System.out.printf("\n총합은 %d ",sum1);
		System.out.println();
        //조별과제 2번    -완료
		int sum2=0;
		for(int m=1;m<=6;m++){
		for(int n=1;n<=6;n++){
		 sum2=m+n;
		if(sum2==6)
		System.out.println("경우의 수는: "+m+" "+n);
		}
		}
		//조별과제 3번    -완료
		Scanner sc = new Scanner(System.in);
		int a=((int) (Math.random() * 3) + 1);//a=1 가위 , a=2 바위, a=3보
		System.out.println("가위/바위/보 중 하나를 내세요!");
		String d=sc.nextLine(); 
		if(d.equals("가위")) {
			if(a==1) {
				System.out.println("비겼습니다");
			}
			else if(a==2) {
				System.out.println("졌습니다.");
			}
			else {
				System.out.println("이겼습니다.");
			}
			
		}
		else if(d.equals("바위")) {
			if(a==1) {
				System.out.println("이겼습니다");
			}
			else if(a==2) {
				System.out.println("비겼습니다.");
			}
			else {
				System.out.println("졌습니다.");
			}
		}
		else if(d.equals("보")) {
			if(a==1) {
				System.out.println("졌습니다");
			}
			else if(a==2) {
				System.out.println("이겼습니다.");
			}
			else {
				System.out.println("비겼습니다.");
			}
		}
		else System.out.println("정확한 값을 입력하세요.");
		

			
		
				
	}
}
