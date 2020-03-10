/*
 * 객체 자신을 가르키는 this
 * this를 사용하는 다른 생성자를 호출
 * 원칙:생성자는 객체생성시 1개만 호출
 * this.한번에 여러 개의 생성자를 호출할 수 있다.
 */
//Zcar car=new Zcar();
//Zcar car=new Zcar("blue","auto",4);

    class ZCar{
	String color;
	String geartype;
	int door;
	
	ZCar(){ //기본타입
		//this.color="red";
		//this.geartype="auto";
		//this.door=2;
		//나를 다시부르네?
		//Zcar("red", "auto", 2);
		this("red", "auto", 2);
		System.out.println("default constructor");
	}
	ZCar(String color,String geartype,int door){
		this.color=color;
		this.geartype=geartype;
		this.door=door;
		System.out.println("Overloading constructor");
	}
	void print(){
		System.out.println(this.color+"/"+this.geartype+"/"+this.door);
	}
}
    //코드량감소 ( 생성자와 this활용)
   class Zcar2{
    	String color;
    	String geartype;
    	int door;
     	
     	Zcar2(){
    		this("red", 2);
    		System.out.println("red,2");     //출력3등
    	}

    	Zcar2(String color,int door){
    		this(color,"auto",door);
    		System.out.println("color,auto,door"); //츨력2등
    	}
     	Zcar2(String color,String geartype,int door){
    		this.color=color;
    		this.geartype=geartype;
    		this.door=door;
    		System.out.println("color,geartype,door"); //출력1등
    	}
 	//생성자는 멤버필드 초기화 담당 < 글자만 보고도 이해할 정도로 다시 복습.
    	void print(){
    		System.out.println(this.color+"/"+this.geartype+"/"+this.door);
    	}
    }
public class Ex19_this_Constructor {

	public static void main(String[] args) {
	
        Zcar2 z=new Zcar2();
        z.print();
   
        Zcar2 z2=new Zcar2("pink",10);
        z2.print();
	}
}
