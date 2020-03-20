//자바의 다형성 (상속)
class Pbase{
	int p=100;
}
class Cbase extends Pbase{
	int c=200;
}
class Dbase extends Pbase{
	
}

public class Ex11_Inherit_Poly {

	public static void main(String[] args) {
	Cbase cbase=new Cbase();
	System.out.println(cbase.toString());
	Pbase p =cbase; //다형성
	//부모타입의 참조변수 p는 자식타입의 참조변수 cbase의 주소값을 받을 수 있다.
	//부모타입의 참조변수 p는 생성된 부모 객체만 접근 가능하고 자식객체는 접근 불가능하다.
	Dbase dbase = new Dbase();
	p=dbase; //가능 dbase는 pbase의 자식이고, 
	//부모타입 p는 자식타입 cbase의 주소도, dbase의 주소도 가질 수 있다.
	//p는 여러 개의 자식 타입의 주소를 가질 수 있다.
	//하나의 부모타입은 여러 개의 자식 타입의 주소를 가질 수 있다.
	
	}

}
