
public class Ex10_Static_Method {
	public static void smethod() {
		System.out.println("�� static�Լ���");
		
	}
	public void method() {
	System.out.println("���Ϲ��Լ���");	
	}
	
	public static void main(String[] args) {
	
		Ex10_Static_Method.smethod();
		smethod();
		//���Ϲ��Լ��� ���
		Ex10_Static_Method a = new Ex10_Static_Method();
		a.method();
        
	}


}