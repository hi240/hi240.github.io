/*
 * 1.객체 자신을 가르키는 this(앞으로 생성될 객체의 주소를 담을 곳이라고 가정)
 * 2.this 객체 자신 (생성자 호출, 자기가 자기 생성자 호출):원칙적으로, 생성자는 객체가 만들어질때, 한개만 호출됨.
     그러나 예외적으로 this를 활용하면, 여러 개의 생성자를 호출할 수 있음....★today point★
 */
/* class Test6{
	int i;
	int j;
	Test6(){ //default constructor
	}
	//설계자 입장에서 Test6(int k, int p){ 문제점은 없다. 그러나 가독성이..
	//되도록이면,,,, parameter이름은... 당신이 할당하려고 하는 instance 변수명과 동일하게 하면 어떨까?
	//개발 의미있는 변수명 >> 가독성>> 유지보수가 편하다.. 코드를 봤을 때 유추가 되는게 있음..
	//[그래서 이 인스턴스 변수를 parameter로 받는 i 와 j 랑 다르다는 것을 알려주겠다.]를 위해 this를 씀.
	Test6(int i, int j){
		//this.i >>Test6이 가지고 있는 member
		this.i=i; //this. i 의 i 는 instance의 변수다. 즉 맨위에있는 변수 i 다.
		this.j=j;
	}
}
class Book2{
	String bname;
	Book2(String bname){
		this.bname=bname;
	}
}*/

//Today Point
class SoCar{
	String color;
	String geartype;
     int door;
	
	SoCar(){ //기본타입
		this("red","auto",3);
		System.out.println(this.color+"/"+this.geartype+"/"+this.door);
	}
	SoCar(String color,String geartype,int door){
		this.color=color;
		this.geartype=geartype;
		this.door=door;
		System.out.println(this.color+"/"+this.geartype+"/"+this.door);
	}
 }
public class Ex18_this {

	public static void main(String[] args) {

		SoCar socar = new SoCar();
		//socar.print();
		SoCar socar2=new SoCar("pink","auto",6);
	   //socar2.print();
	}
}
