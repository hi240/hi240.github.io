import java.util.Scanner;
public class hi {
	public static void main(String[] args) {
	/*	//점점 늘어나는 별찍기
				for(int i =2; i<=9; i++) {
					for (int j=1;j<=9;i++) {
						if(i==j) {
							continue; //아래 구문을 스킵하세요.
						}
						System.out.printf("%s","*");
					}
					System.out.println();
				}                 			
	for(int i=2;i<=9;i++) {       //점점 늘어나는 별찍기
		for(int j=1;j<i;j++) {
			System.out.print("*");
		}
		System.out.println();
	}
	
	for( int i=10;i>=0;i--) {     //점점 줄어드는 별찍기
		System.out.println(i);
	}
	*/
	//문제1 오른쪽 정렬해서 점점 늘어나는 별 찍기
		for(int i=1;i<10;i++) {       
			for(int j=1;j<=9-i;j++) { 
				System.out.print(" ");	
			}
			for(int j=1;j<=i;j++) {                
				System.out.print("*");      
			}
			System.out.println();    
		}
    //문제2 오른쪽 정렬해서 점점 줄어드는 별 찍기
		for(int i=2;i<10;i++) {
			for(int j=1;j<i;j++) 
			{System.out.print(" ");}
			for(int j=0;j<10-i;j++)
			{System.out.print("*");}
			System.out.println();
		}
		

		//문제3 피라미드 별 찍기
		for(int i=1;i<10;i++) {       
			for(int j=9;j>i;j--) {    
				System.out.print(" "); 
			}
			for(int j=1;j<=i*2-1;j++) {              
				System.out.print("*");      
			}
			System.out.println();  
		}
 

		
	
	}
}
