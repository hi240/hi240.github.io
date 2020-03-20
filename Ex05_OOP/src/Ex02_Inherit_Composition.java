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
	void draw() {        //공통기능
		System.out.println("그리다");
	}
}
class Radiance{
	int r=10;
	Radiance(){
		this.r=10;
	}
}
class Point{
	int x;
	int y;
	Point(){
		this(10, 15);
	}
	Point(int x,int y){
		this.x=x;
		this.y=y;
	}
}
class Rectangle extends Shape{

	Point[] pointarray;   
	Rectangle(){
	//pointarray=new Point[] {new Point(10,10),new Point(10,19),new Point(20,20),new Point(29,29)};	-쌉가능
	this(new Point[] {new Point(10,10),new Point(10,19),new Point(20,20),new Point(29,29)});		
	}
	Rectangle(Point[] pointarray){ //우선, Point배열을 매개변수로 하는 인스턴스를 만들겠다. 
		this.pointarray=pointarray;
	}
}
class Triangle2 extends Shape{
	Point[] pointarray;
	Triangle2(){
//		pointarray=new Point[3];
//		pointarray[0]=new Point(10,20);
//		pointarray[1]=new Point(30,40);
//		pointarray[2]=new Point(50,60);	
   this(new Point[] {new Point(10,20),new Point(30,40),new Point(50,60)});
   //this(new Point[] {(10,20),(30,40),(50,60)}); 이게 안되는 이유는 
   //지금 위에꺼는 거의 int배열과 동일 하다. 값도 int로 해서 그 배열의 원소를 채우는 격! 그러나, 이 경우는..
   //Point라는 객체의 타입으로 배열을 만든 것이기 때문에, 각 원소로 객체라는 타입이 들어와야 하고, Point클래스 안에 오버로딩으로 초기화를
   //할 수 있는 생성자가 있기 때문에 그것을 사용해서 구체화 값까지 넣어준 것 이다.
	}
	Triangle2(Point[] pointarray){
		this.pointarray=pointarray;
	}
	void trianglePoint() {
    	for(Point point : this.pointarray) { 
    		//this를 쓴 이유는 pointarray가 지역변수로 새로 만들어지는거라 값이 없기때문이다.
    		//this.pointarray를 씀으로써 클래스에 있는 변수랑 같다는 의미를 통해 값을 넣어줄 수 있다...
    		System.out.printf("point: (%d,%d)\t",point.x,point.y);
			System.out.println();
    	}
    }
}
class Triangle extends Shape{
	Point x;
	Point y;
	Point z;
    Triangle(){
//    	x=new Point(10,20);
//    	y=new Point(30,40);
//    	z=new Point(20,60);
    	this(new Point(10,20),new Point(30,40),new Point(20,60));
    }
    Triangle(Point x,Point y,Point z){
    	this.x=x;
    	this.y=y;
    	this.z=z;
    }
    //구체화, 특수화
    //추가적인 기능
    void trianglePoint() {
    	System.out.printf("x: (%d,%d) \t",x.x,x.y);
    	System.out.printf("y: (%d,%d) \t",y.x,y.y);
    	System.out.printf("z: (%d,%d) \t",z.x,z.y);
    	System.out.println();
    }
}
class Circle extends Shape{    //도형이다.
	//Point point = new Point(); //점을 가지고 있따.	
	Point point; //왜 new 안썼지?써도 되는데 생성자 내에서 하자.(아까 배운거)
	//Radiance r = new Radiance(); //반지름을 가지고 있고, default값으로 10을 가진다.
	int r;
	Circle(){
		//this.r=10;
	    //this.point=new Point(10,15);
	    this(10,new Point(10,15));
	}
	Circle(int r,Point point){
		this.r=r;
		this.point=point;
	}
}


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
		
		Triangle triangle = new Triangle();
		
		triangle.trianglePoint();
		triangle.draw();
		//기본값아닌것
		Point[] pointarr= {new Point(11,21),new Point(31,42),new Point(52,62)};
		Triangle2 triangle2= new Triangle2(pointarr);
		triangle2.trianglePoint();
		//기본값
    //	Triangle2 triangle2= new Triangle2();
	//	triangle2.trianglePoint();
	}

}
