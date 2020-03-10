/*
 * 설계도 1개.. 업무가 복잡하지 않으면
 * 업무가 복잡해 지면... 1개 이상의 설계도 제작.
 * 고민>쇼핑몰 관련해서 설계도가 5장이 나왔음..(회원관리,주문관리,배송관리 등)
 * **기준점** 여러 개의 설계도를 (관계)를 맺어주는 것.
 * 1.상속관계(is ~a) 은 ~이다.
 * 2.포함관계(has ~a)은 ~를 가지고 있다.
 * 
 * 예)
 * 원클래스  도형클래스
 * 원은 도형이다.
 * 원 extends 도형 [상속관계]
 * 
 * 원클래스 점클래스
 * 원은 점을 가지고 있다. [포함관계]
 * 필요한 자원을 member field로 만들면 됨.
 * class 원 {점 변수명}
 * 
 * 경찰클래스 권총클래스
 * 경찰은 권총을 가지고 있다. [포함관계]
 * class 경찰 {권총 변수}
 * 
 * 원은 도형이다.
 * 삼각형은 도형이다.
 * 사각형은 도형이다.
 * 
 * 도형 : 추상화, 일반화 (그리다,색상)>>공통자원 뽑는 것임.
 * 원 : 구체화, 특수화(반지름, 점)>>본인만이 가지는 특징
 * 점 : 좌표값(x,y)
 * 원은 점을 가지고 있다.
 * 삼각형은 점을 가지고 있다.
 * 사각형은 점을 가지고 있다.
 * class Shape : 일반화,추상,공통(그리다,색상) > 상속관계
 * class Point : 점 > 포함관계
 * 구체화, 특수화 : Circle, triangle 

 * 추상화, 일반화, 공통
 */
class Shape{
	String color="gold"; //공통속성
	void draw() { //공통기능
		System.out.println("그리다");
	}
}
class Point{
	int x;
	int y;
	Point(){
		//this.x=1;
		//this.y=1;
		this(10, 15);
	}
	Point(int x,int y){
		this.x=x;
		this.y=y;
	}
}
class Radiance{
	int r=10;
	Radiance(){
		this.r=10;
	}
}
//문제 원을 만드세요... 
/* 원은 도형이다.
 * 원은 점을 갖고 있다.
 * 원은 반지름을 가지고 있다.
 * 원의 반지름은 default값으로 10을 가진다
 * 점의 x,y좌표는 default로 10,15
 * 기본값을 설정하지 않으면 반지름과 점의 값을 입력받을 수 있다. (원이 만들어 질 때)
 */
class Circle extends Shape{    //도형이다.
	//Point point = new Point(); //점을 가지고 있따.	
	Point point; //왜 new 안썼지?
	//Radiance r = new Radiance(); //반지름을 가지고 있고, default값으로 10을 가진다.
	int r;
	Circle(){
		//this.r=10;
	//	this.point=new Point(10,15);
	    this(10,new Point(10,15));
	}
	Circle(int r,Point point){
		this.r=r;
		this.point=point;
		
	}
}
//Circle circle = new Circle();

public class Ex02_Inherit_Composition {

	public static void main(String[] args) {

		Circle circle=new Circle();
		System.out.println(circle.r);
		System.out.println("부모: "+circle.color);
		System.out.println("x좌표: "+circle.point.x);
		System.out.println("y좌표: "+circle.point.y);
		circle.draw();
		Circle circle2=new Circle(20,new Point(2,5));
		System.out.println(circle2.r);
		System.out.println("부모: "+circle2.color);
		System.out.println("x좌표: "+circle2.point.x);
		System.out.println("y좌표: "+circle2.point.y);
		circle2.draw();
	}

}
