
//static 변수는 객체마다 같은 값을 가진다.
//instance변수는 객체마다 다른 값을 가진다.
	class InitTest{
		static int cv=10;
		int iv=1;
		static{                  //static 초기자: static 변수를 초기화(실행시점)
			 cv=20;             //논리적인 코드를 사용하고 싶을때 필요..
	//		cv2=cv+10;
		}
	                        	//초기자(static memberfield나 memberfield의 값을 초기화 한다.)
		{                       //{} <-초기자.메모리에 iv라는 변수가 올라가고 나서 바로 실행...
			iv=3;
		}
		}

public class Ex08_Static_init {		
	public static void main(String[] args){
      System.out.println(InitTest.cv);        //System.out.println(init.iv);위에서부터 여기까지는 안됨. 밑에 new생성해야됨.   
 //     System.out.println(InitTest.iv);         안되는이유..??!! 인스턴스변수는 new 메모리를 설계하지 않고는 사용할 수 없음.
   //   InitTest init= new InitTest();   static은 method memory에 저장되기 때문에, 바로 불러올 수 있찌만,
     // System.out.println(init.iv);     instance 변수는 heap에 저장된 새 값을 불러와야 하기 때문에 new 연산자를 설계하지 않고는 사용할 수 없다.
}
}