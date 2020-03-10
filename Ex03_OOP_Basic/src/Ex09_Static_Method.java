//static method 함수를 만들었으면,굳이 new하지 않고도 그 함수를 사용할수 있다(?) (O)
class StaticClass{
	static int cv;
	int iv;     
	 //즉 iv는 heap메모리에 변수값이 그대로저장. cv는 Class Area에 변수값저장, heap메모리에는 그 Class Area로 가는 주소값이 저장되어있음.
	void m() {
		iv=100; //iv값을 가지고 놀수있따.
		//cv값을 가지고 놀수있다.
		//static 자원은 항상 일반자원보다 memory가 먼저 생성된다.
		StaticClass.cv=100; //원칙적인방법
		cv=200; //하지만 같은 클래스에 있으니 그냥 cv도 문제 없다.
	}
	static void sm() { //static함수
		//1.일반변수인 iv 값을 가지고 놀 수 있다.(x)
		//static은 항상 일반 놈들보다 우선한다. memory에 항상 먼저 들어가있다고 생각하면됨.
		//iv=2; (x) 내가 static방에 먼저들어와있는데 일반놈은 안보이기 때문에 사용할 수 없다.... 
		//2.static 변수인 cv값을 가지고 놀 수 있다.(o)
		//memory에는 첫번째로 변수 가 들어가고, 그 다음 함수가 들어가기 때문에 static변수는 이미 만날 수 있다.
		cv=200;
		//error없으려면, 끼리 끼리 놀아라. static함수는 static 변수랑, 일반함수는 일반 변수랑 놀아라.
		//즉 모든 문제는 [메모리의 생성시점]탓이라고 보면 됨.
	
		System.out.println("나 static 이야");
		for(int i =0;i<100;i++) {
			System.out.println(i);
			//모든 구문의 실행구문은 stack에서,,,,,,,,,,,,,,,
		}
	}
}
//함수를 static으로 쓸떄 장점.
//Math.Random()
//내가 static 함수를 쓴 다면, 의도의 장점은?
//많이 써서...................................

//static함수를 만든이유? 마치print함수처럼, 많이 자주 사용하기 때문에!~~
//그렇다고 너무 많이 남용하면(동시에 접근할수있다) 그러나,
//한강 화장실처럼 이미 휴지가 동날수도있다.


public class Ex09_Static_Method {

	public static void main(String[] args) {

      //원칙적인 방법
		//StaticClass sc=new StaticClass();
		//sc.함수이름...
		StaticClass.sm();
System.out.println(StaticClass.cv);
StaticClass sc = new StaticClass();
sc.m();
System.out.println(sc.iv);
System.out.println(sc.cv);

	}

}
