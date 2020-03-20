import kr.or.bit.Pclass;

/*
modifier 
public,default,private,★☆★♬상속관계☆★♬에서만 쓰이는 protected
양면성 (public과 default)
☆★♬상속이 없는 클래스 안에서 protected 접근자는 default와 같다.
☆★♬왜? 상속이 없는 상황에서는 protected 접근자는 의미가 없다.
*/

class Dclass{
	public int j;
	private int o;
	int p; //default
	protected int k;
}
class Child2 extends Pclass{
	void method() {
		this.k=2000; //상속관계에서 자식은 부모의 protected 접근자 자원을 public 처럼 사용.
		System.out.println(this.k);
	}
}
public class Ex08_Inherit_Protected {

	public static void main(String[] args) {
		Dclass dc=new Dclass();
      /*dc.j > public 이기 때문에 노출가능
		dc.p > default는 같은 폴더에서는 보임.
		dc.k > protected 같은 폴더 안에서는 default랑 똑같은 효과.>상속관계에서만 의미가 있다.
		dc.o > private이라 안보임. */
		
	  //다른 폴더 (package)
		Pclass pc=new Pclass();
	  /*pc.j > 가능
	    pc.p > 불가
	    pc.k > 불가
	    pc.o > 불가   */
	   
		Child2 ch = new Child2();
		ch.method();
	}

}
