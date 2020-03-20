import kr.or.bit.Bird;

/* protected 접근자 상속관계에서만 
 * 목적:상속관계에서 재정의
 * 당신이 나를 상속한다면, 이 자원(함수)은 재정의를 했으면 좋겠다..
 */
class Ostrich extends Bird{
	//타조의 구체화,특수화 된 능력?
	void run(){
		System.out.println("runnnn");
	}
	@Override
	protected void moveFast() {
		run();
	}
	//protected 제어자는 오버라이딩을 해야 자손클래스에서 부모클래스꺼를 사용할수있다.
}

class Bi extends Bird{
	@Override
	protected void moveFast() {
		super.moveFast();
	}
}
public class Ex09_Inherit_Protected {

	public static void main(String[] args) {
		Ostrich ostrich = new Ostrich();
        ostrich.run();
        ostrich.moveFast();
        Bi bi=new Bi();
        bi.fly();
        bi.moveFast();
        ostrich.moveFast();
   
      
	}

}
