import java.util.Scanner;

public class Ex08_Operation_Quiz {

	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in); 
		 int a= Integer.parseInt(sc.nextLine());	//����1	
    	 String b = sc.nextLine();	
		 int c=Integer.parseInt(sc.nextLine());	   //����2
		int result=0; //result �ʱ�ȭ
		
		while(true) {
			if(b.equals("+"))
            {result=a+c;}
			else if(b.equals("-"))
			{result=a-c;}
			else if(b.equals("*"))
			{result=a*c;}
			else if(b.equals("/"))
			{result=a/c;}
			else System.out.println("�����ڸ� �ٽ��Է��ϼ���");
			
            System.out.println("��������: "+result);
            break;
            }

				
	/*	 switch(b) {                           //if���̳� while�����ε� �� �� ����.
		 case  "+": 
		  if (b.equals("+")) {result = a+c;} //equals()�� �� Ȯ���ϸ� �����.
		  break;                             //������ ������� ������ ������ �� ��.
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
			 
			// return �̶�� �� �Լ������� �����ڸ� �ǹ��Ѵ�.
		    // ��, [�Լ�����]�� ������ > main �Լ� Ż�� > ����.
			 System.out.println("�ùٸ� �����ڸ� �Է��ϼ���.");
			 return;         //return��  ������, main�Լ� ������ �ٷ� ��������.
		    //System.exit(0) //�������� ���α׷� ����
		 }
		 
		System.out.println("������ = "+result);
		System.out.printf("%d %s %d = %d",a,b,c,result);
		 */

		}
	}

		

	

