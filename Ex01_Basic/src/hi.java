import java.util.Scanner;
public class hi {
	public static void main(String[] args) {
	/*	//���� �þ�� �����
				for(int i =2; i<=9; i++) {
					for (int j=1;j<=9;i++) {
						if(i==j) {
							continue; //�Ʒ� ������ ��ŵ�ϼ���.
						}
						System.out.printf("%s","*");
					}
					System.out.println();
				}                 			
	for(int i=2;i<=9;i++) {       //���� �þ�� �����
		for(int j=1;j<i;j++) {
			System.out.print("*");
		}
		System.out.println();
	}
	
	for( int i=10;i>=0;i--) {     //���� �پ��� �����
		System.out.println(i);
	}
	*/
	//����1 ������ �����ؼ� ���� �þ�� �� ���
		for(int i=1;i<10;i++) {       
			for(int j=1;j<=9-i;j++) { 
				System.out.print(" ");	
			}
			for(int j=1;j<=i;j++) {                
				System.out.print("*");      
			}
			System.out.println();    
		}
    //����2 ������ �����ؼ� ���� �پ��� �� ���
		for(int i=2;i<10;i++) {
			for(int j=1;j<i;j++) 
			{System.out.print(" ");}
			for(int j=0;j<10-i;j++)
			{System.out.print("*");}
			System.out.println();
		}
		

		//����3 �Ƕ�̵� �� ���
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