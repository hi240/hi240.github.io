import java.util.Scanner;

public class assignment {

	public static void main(String[] args) {
		//1������
		
		for(char i=65;i<=90;i++) {
			System.out.println(i);
		}
		
		//2������
		for (int j=1;j<=100;j++){
		      System.out.print(j+" ");
		    if(j==10||j==20||j==30||j==40||j==50||j==60||j==70||j==80||j==90)
		    	//if(j%10==0) <-��ȿ����
		  System.out.println();
		}
		
        //�������� 1��    -�Ϸ�
		int sum1=0;
		for (int l=1;l<=20;l++) {
			if (l%2!=0&&l%3!=0) {
		sum1 +=l;
		}
		}
		System.out.printf("\n������ %d ",sum1);
		System.out.println();
        //�������� 2��    -�Ϸ�
		int sum2=0;
		for(int m=1;m<=6;m++){
		for(int n=1;n<=6;n++){
		 sum2=m+n;
		if(sum2==6)
		System.out.println("����� ����: "+m+" "+n);
		}
		}
		//�������� 3��    -�Ϸ�
		Scanner sc = new Scanner(System.in);
		int a=((int) (Math.random() * 3) + 1);//a=1 ���� , a=2 ����, a=3��
		System.out.println("����/����/�� �� �ϳ��� ������!");
		String d=sc.nextLine(); 
		if(d.equals("����")) {
			if(a==1) {
				System.out.println("�����ϴ�");
			}
			else if(a==2) {
				System.out.println("�����ϴ�.");
			}
			else {
				System.out.println("�̰���ϴ�.");
			}
			
		}
		else if(d.equals("����")) {
			if(a==1) {
				System.out.println("�̰���ϴ�");
			}
			else if(a==2) {
				System.out.println("�����ϴ�.");
			}
			else {
				System.out.println("�����ϴ�.");
			}
		}
		else if(d.equals("��")) {
			if(a==1) {
				System.out.println("�����ϴ�");
			}
			else if(a==2) {
				System.out.println("�̰���ϴ�.");
			}
			else {
				System.out.println("�����ϴ�.");
			}
		}
		else System.out.println("��Ȯ�� ���� �Է��ϼ���.");
		

			
		
				
	}
}