import java.util.Scanner;

public class Ex07_Printf_format {

	public static void main(String[] args) {
		//java:System.out.println();
		//C#: Console.WriteLine();
		
		System.out.println(); //println�� �ٹٲ�
		System.out.print("A"); //print�� ������ �ٿ���
		System.out.print("A");
		System.out.println("A");	
		System.out.println("A");
		
		int num =100;
		char a= 'a';
		System.out.println(num);
		System.out.println("num����: "+num+"�Դϴ�");
	   //���� format	
		System.out.printf("num����: %d�Դϴ� \n",num);
		//format�� �����ϴ� ���Ĺ���
		//%d (����)
		//%f (�Ǽ�)
        //%s (���ڿ�)
		//%c (����)
		// \t : tab \n : �ٹٲ�
		System.out.printf("num���� [%d]�Դϴ�. �׸��� [%c]�� �־�� \n",num,a);
 
		float f=3.14f;
		System.out.println(f);
		System.out.printf("f�������� %f�Դϴ� \n",f);
		//%.2f :��°�ڸ� �Ҽ������� ����϶�.
		
		//�ݴ�� cmd (console) â���� ������ �Է� �ޱ�.
		//������ = �Լ��̸��� Ŭ�����̸��� �Ȱ���. ��ü�� ������ �� ȣ��Ǵ� �Լ��� �� �� �ִ�.
		
		/* ��ȭ�н� 
		 *  ���� :ex class Car{
		 *          String color;
		            Car(String carcolor){
		            color=carcolor;}
		            car n=new car("�ʷϻ�"); 
		 �Լ������� �ݵ�� string�� �ش��ϴ� ���� �־������ new�� ������ �� �ִ�.
		*/
		
		Scanner sc = new Scanner(System.in); 
		//Multiple markers at this line- Scanner cannot be resolved to a type�̶�� ����
        //ctrl+shift+O : import���� �ڵ� �����ϱ�.
	//	System.out.println("���� �Է��ϼ���");
	//	String value = sc.nextLine(); //�Է��ϰ� �����Ҷ����� ��� �� ���ڿ��� ��ȯ
	//	System.out.println(value);
	//	int number = sc.nextInt();
	//	System.out.println("������: "+number);
	//	float fnumber = sc.nextFloat();
	//	System.out.println("�Ǽ���: "+fnumber);
		//����:nextInt,nextFloat���ٴ� nextLine()���� ����
		//Today Point
		//web������ ���ڵ� ������.
		//���ڸ� >���ڷ� (����,�Ǽ�)
	    //Integer.parseInt("11");���ڿ��� ������
	    //Float.partseFloat("3.111"); ���ڿ��� �Ǽ���
        //Double.parseDouble(s); ��������
		
		System.out.println("���� �Է��ϼ���");
		int num2= Integer.parseInt(sc.nextLine());
		System.out.println("������: "+num2);
		//Tip���� �˾Ƶμ���
		//valueOf��� �Լ�? valueOf �� ���ڸ� -> ���ڷ� �ٲٴ� �Լ�.
		String dat=String.valueOf(100);
		System.out.println(dat);
	
		
		
	}

}
