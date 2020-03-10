import kr.or.bin.common.Car;

/*
 * 
 * 클래스== 설계도==타입
 * 
 * 클래스 구성요소: [필드+함수] +생성자
 * *필드(field) >> 고유정보, 상태정보, 참조(부품)정보 지원>> 변수
 * *함수(function) >> 기능 (행위정보)
 * 생성자 : 필드의 초기화를 목적으로 하는 함수
 * 
 * 클래스,필드,생성자,함수:자신의 영역(범위) 정의(접근자,한정자,수정자=modifier)
 * >>public ,protected, private, default : 접근제한자
 * 
 * 1.public class Test{}
 * 2.class Test{} >> 컴파일러가 내부적으로 default 접근자를 붙여서 사용.
 * 내부적으로 컴파일러가 실행하는 코드: default class Test{}
 * default 개발자가 직접 작성하지 않음.
 * *default 접근자는 같은 폴더에서 접근 가능하다, [다른 폴더에 있으면 서로 접근 불가.]
 * *default 접근자는 같은 폴더에서(package)내에서 [연습 목적]으로 
 * 
 * 
 * 3.하나의 물리적인 자바파일은 여러개의 클래스를 가질 수 있다.(Test.java) (0)
 * 단, public 클래스는 하나만 존재해야 된다. 나머지는 default 
 * 
 * 
 * 
 * Src 폴더 아래에는 Ex01_main 클래스가 있고,
 * kr.or.Bit.common>>public Car
 * kr.or.Bit.common>(default)Car
 * 
 * 
 */
//앞에 무조건 default가 생략되어있따.
//같은 폴더 내에서만 접근 가능하고,다른 폴더 접근 불가하다.
//
class Test{ //default class니까 같은 폴더에서만 사용가능. 
	int d_iv; //컴파일러가 자동으로 default int d_iv 해석
	public int p_iv; //public은 어디에서나 공유가능.
	private int prei_iv; //private은 감추어짐.
}
public class Ex01_main {

	public static void main(String[] args) {

		//kr.or.bit.common.Car ;
		Car car = new Car();
    //    car.door =10; //왜 car.door 변수에 접근이 안될까................
		Test t = new Test();
		t.d_iv = 100; //default
		t.p_iv = 200; //public
		//private 자원 접근 불가.
		
		
	}

}
