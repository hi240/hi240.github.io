
public class Ex10_Static_Method {
	public static void smethod() {
		System.out.println("나 static함수야");
		
	}
	public void method() {
	System.out.println("나일반함수야");	
	}
	
	public static void main(String[] args) {
	
		Ex10_Static_Method.smethod();
		smethod();
		//나일반함수야 출력
		Ex10_Static_Method a = new Ex10_Static_Method();
		a.method();
        
	}


}
