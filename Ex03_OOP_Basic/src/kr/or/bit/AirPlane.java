package kr.or.bit;

/*
public class AirPlane {
/*
	public String name;
	public int number;
	public static int count;
		
	 public void airInfo() {
   	  System.out.printf("�̸�:%s,��ȣ:%d\n",name,number);
     }
	 

	private String name;//ĸ��ȭ��Ŵ���ν� �ٸ������� ���� ���ϰ��Ѵ�.
	private int number;
	private static int count;
	public void airInfo(String a,int b) {
		 name=a;
		 number=b;
     System.out.printf("�װ��� �ѹ��� %s ��ȣ�� %d \n",a,b);
     count++;
	}
	public int airCount() {
		return count;
	}
	
	
}
*/
public class AirPlane{


	private String name;
	private int number;
	private static int count;
	
	public AirPlane(String name,int number) { //����� �ݵ�� a�� b�� �־���Ѵٰ� �����ϴ� ��. . . . . . . . .
	 this.name=name;
     this.number=number;
     System.out.printf("�װ��� �ѹ��� %s ��ȣ�� %d \n",name,number);
     count++;
	}
	
	public int airCount() {
		return count;
	}
}