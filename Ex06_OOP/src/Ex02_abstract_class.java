/*G A M E > unit
unit의 공통기능 (이동좌표,이동,멈춘다)
unit마다 이동 방법이 다르다...
abstract class 이름{abstract 이동();}를 만들어서 강제 구현하게 하고싶다.
 */
abstract class Unit{ //1.추상클래스
	int x,y; 
	void stop() {
		System.out.println("Unit stop");
	}
	//이동 (강제)
	abstract void move(int x, int y); //2.추상메서드 생성.
	
}
class Tank extends Unit{
	void move(int x, int y) { //3.추상메서드 재정의.
		this.x=x;
		this.y=y;
		System.out.println("Tank 이동: "+this.x+","+this.y);
	}
	//Tank가 가지는 특수 기능.
	void changeMode() {
		System.out.println("탱크 변환 모드");
	}
}
class Marine extends Unit{
	void move(int x,int y) {
		this.x=x;
		this.y=y;
		System.out.println("Tank 이동: "+this.x+","+this.y);
	}
	void stimpack(){
		System.out.println("스팀팩기능");
	}
	
}
class Dropship extends Unit{
	void move(int x,int y) {
		this.x=x;
		this.y=y;
		System.out.println("Tank 이동: "+this.x+","+this.y);
	}
	void load(){
		System.out.println("Unit load");
	}
	void unload(){
		System.out.println("Unit unload");
	}
	
}
public class Ex02_abstract_class {

	public static void main(String[] args) {
		Tank t = new Tank();
		t.move(33, 44);
		Marine m = new Marine();
		m.move(33, 44);
		Dropship d = new Dropship();
		d.move(33, 44);
					
		Tank []p = {new Tank(),new Tank(),new Tank()};
		for(Tank ta : p){
			ta.move(22,33);
		}
		//1. 탱크 3대를 만들고, [같은 좌표]로 이동시키세여 (33,44)
		Tank[] tanklist = {new Tank(),new Tank(),new Tank()};
		for(Tank tank : tanklist) {
			tank.move(33, 44);
		}
		
		//2. 여러 개의 Unit(Tank1, Marine1, Dropship1)을 같은 좌표로 이동시키세요.
		Unit[] unit= {new Tank(),new Marine(),new Dropship()}; //unit 하나의 타입이기때문에
		for(Unit u : unit) {
			u.move(33,44);
		}
		
	}

}
