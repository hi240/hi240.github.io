import kr.or.bit.Singleton;
public class Ex14_Singleton_main {

	public static void main(String[] args) {
        //Singleton singleton = new < 불가능
		Singleton single = Singleton.getInstance();
		System.out.println(single);
		Singleton single2 = Singleton.getInstance();
		System.out.println(single2);
		Singleton single3 = Singleton.getInstance();
		System.out.println(single3);
		
		
        //kr.or.bit.Singleton@15db9742 로 출력.
		
	}

}
