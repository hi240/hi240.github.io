//이예제의 목적: 오버로딩의 parameter로 참조변수가 올 수도 있다.
class Human2{
	String name;
	int age;

}
class Test{
	Human2 add(Human2 h) {
		h.name="떠영희";
		h.age=240;
		return h; //참조변수가 Human2니까 원래 int참조변수면 return int지만 얘는 참조변수니까 return참조변수(즉,그 주소값)
	}
	Human2 add(Human2 h,Human2 h2) {
		h2.name=h.name;
		h2.age=h.age;
		return h2;
	}
	
}
public class Ex15_Method_Overloading {

	public static void main(String[] args) {
		Test t = new Test();
		Human2 man = new Human2();
		Human2 man2= t.add(man);
		System.out.println(man2.name); //더영희
		System.out.println(man2.age);  //240
		
		System.out.println(man == man2); //주소값은 같다 .. 왜지
		System.out.println(man.age+man.name);
		
		Human2 m2 = new Human2(); //이 밑5줄은 몰라도됨..
		
		//Human2 m3=t.add(m,m2); 
		
	}

}
