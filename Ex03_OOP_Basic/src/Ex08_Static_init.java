
//static ������ ��ü���� ���� ���� ������.
//instance������ ��ü���� �ٸ� ���� ������.
	class InitTest{
		static int cv=10;
		int iv=1;
		static{                  //static �ʱ���: static ������ �ʱ�ȭ(�������)
			 cv=20;             //������ �ڵ带 ����ϰ� ������ �ʿ�..
	//		cv2=cv+10;
		}
	                        	//�ʱ���(static memberfield�� memberfield�� ���� �ʱ�ȭ �Ѵ�.)
		{                       //{} <-�ʱ���.�޸𸮿� iv��� ������ �ö󰡰� ���� �ٷ� ����...
			iv=3;
		}
		}

public class Ex08_Static_init {		
	public static void main(String[] args){
      System.out.println(InitTest.cv);        //System.out.println(init.iv);���������� ��������� �ȵ�. �ؿ� new�����ؾߵ�.   
 //     System.out.println(InitTest.iv);         �ȵǴ�����..??!! �ν��Ͻ������� new �޸𸮸� �������� �ʰ�� ����� �� ����.
   //   InitTest init= new InitTest();   static�� method memory�� ����Ǳ� ������, �ٷ� �ҷ��� �� ���,
     // System.out.println(init.iv);     instance ������ heap�� ����� �� ���� �ҷ��;� �ϱ� ������ new �����ڸ� �������� �ʰ�� ����� �� ����.
}
}