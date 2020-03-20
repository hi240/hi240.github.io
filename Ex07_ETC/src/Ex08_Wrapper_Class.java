import java.util.ArrayList;

/*
 * 8가지 기본 타입(값타입): java api 제공
 * 8가지 기본 타입에 대해서 객체 형태로 사용가능하도록 만든 것을 Wrapper Class라고 통칭.
 * 기본타입 대로는 객체 형태로 다루어져야..
 * 1.매개변수로 객체가 요구될 때.
 * 2.기본형 값이 아닌 객체로 저장되어야 할 때.
 * 3.객체간 값비교가 필요할 때.
 * 4.타입 변환시 처리하기 위해.
 */
public class Ex08_Wrapper_Class {

	public static void main(String[] args) {
		int i=100;
		Integer n = new Integer(500);
		System.out.println("n: "+ n );//주소값.. 내부 toString을 재정의 오버라이딩 했을 것.
		System.out.println(n.MAX_VALUE);
		System.out.println(n.MIN_VALUE);
		
		//Point활용
		//parameter활용
		//generic
		ArrayList<Integer> li = new ArrayList<Integer>();
		li.add(100);
		li.add(200);
		for(int value : li) {
			System.out.println(value);
		}
		Integer i2=new Integer(100); //굳이 차이가 있다면,
		Integer i3=new Integer(100);
		System.out.println(i2==i3); //"=="의 의미 주소값을 비교합니다.false 
		System.out.println(i2.equals(i3)); //실제 값을 비교. true
		
		int i4=100;
		int i5=100;
		System.out.println(i4==i5);//true
		
		Integer t =new Integer(500);
		intMethod(t); //t라는 참조변수가 가지는 값을 넘김.
		integerMethod(t); //t라는 참조변수의 주소값을 넘김.
		
	}   //때로 parameter를 참조타입으로 쓸 때도 있다.
	static void integerMethod(Integer i) {
		System.out.println("integer param: "+i); //toString 재정의 값 출력..
		System.out.println(i.MAX_VALUE);
		
	}   
	static void intMethod(int i) {
		System.out.println("int param : "+i);
	}
} //몰라도 상관없다. 슬쩍 넘어가는 단원임..
