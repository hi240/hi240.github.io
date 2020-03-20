/* 서로 다른 클래스를 하나의 부모로 묶어주는 역할
 */
interface Irepairable{ //..할 수 있는
}
class Unit2{
	int hitpoint; //기본에너지
	final int MAX_HP; //초기화를 해줘야되는데, 밑에 구문으로 초기화를 강제할 것.
	Unit2(int hp){
		this.MAX_HP=hp;
	}
}

//지상 유닛
class GroundUnit extends Unit2{ //Tank2,Marine2,Scv
	GroundUnit(int hp){
		super(hp);
	}
}

//공중 유닛
class AirUnit extends Unit2{
	AirUnit(int hp){
		super(hp);
	}
}
class CommandCenter implements Irepairable{
}
class Tank2 extends GroundUnit implements Irepairable{
	Tank2(){
		super(50);
		this.hitpoint=this.MAX_HP;
	}
	@Override
	public String toString() {
		return "Tank2";
	}
}

class Marine2 extends GroundUnit{
	Marine2(){
		super(50);
		this.hitpoint=this.MAX_HP;
	}
	@Override
	public String toString() {
		return "Marine2";
	}
}
class Scv extends GroundUnit implements Irepairable{
	Scv(){
		super(60);
		this.hitpoint=this.MAX_HP;
	}
	@Override
	public String toString() {
		return "Scv";
	}
	//repair기능
	void repair(Tank2 tank) {
		if(tank.hitpoint != tank.MAX_HP) {
			tank.hitpoint +=5;
		}
	}
	void repair(Scv scv) {
		if(scv.hitpoint!=scv.MAX_HP) {
			scv.hitpoint +=5;
		}

	/*
	 * Scv repair 할 Unit이 증가하면 ..... Unit개수만큼 repair함수를 추가시키기가 좀...
	 * 고민: 하나의 repair 함수가 모든 repair 가능한 unit을 수리할 수 없을까? Overloading
	 * 다형성- 상속관계에서 부모타입변수가 부모타입은 자식객체의 주소를 가질 수 있다.
	 * 탱크하고 scv만 repair하고 싶다!
	 */
		}
	//	void repair(GroundUnit unit) { //원하지 앟는 애들까지 repair해주게 생김..
//		if(unit.hitpoint!=unit.MAX_HP) {
//			unit.hitpoint +=5;
//		}
//	}
	void repair(Irepairable repairunit) {
           /*repairunit 변수는 어떤 객체의 주소 : Tank2,CommandCenter, Scv
	       CommandCenter도 물론 올 수 있지만 재질이 Tank랑 Scv처럼 hp가 아니다...
	       repairunit은 자기것이 있나요?.. 부모일 뿐이지 암것도 없어요..
	       Unit2 이 결국 hitpoint와 MAX_HP를 가지고 있다.
	       tank2 의 높은 부모 repairunit에는 쓸만한 자원이 없다!! -> downcasting을 하자.
	       downcasting -> Tank2 tank = (Tank2)repairunit (상위 타입을 > 하위 타입으로)
	       downcasting -> Scv scv = (Scv)repairunit
	       
	       요약!Tank2 > GroundUnit > Unit2
	        Scv   > GroundUnit > Unit2
	        공통점 : Unit2
	        CommandCenter > Unit(X)
	       */
		//수리 가능한 unit만 parameter로 받는데, 그 unit중에서 다른 방식의 충전방식이 있다면..
		if(repairunit instanceof Unit2){ //instanceof 해당 타입이 맞는지 확인. repairunit이 Unit2라면,
	     Unit2 unit= (Unit2)repairunit; //unit2타입이면 충전가능하게 하는거고,
	     if(unit.hitpoint != unit.MAX_HP) {
	    	 unit.hitpoint=unit.MAX_HP; }
        }
        	else { //Unit2를 부모로 가지고 있지 않으면
	    	 System.out.println("Unit2가 아니에요! 다른 방식으로 repair합니다.");
	        }		
	     }
	
	/*결국에는 서로 연관성이 떨어지네..
	 * CommandCenter/Marine/tank/Scv 독자적으로 리필할 수가 없네..
	 * 해결사 : Interface
	 * 1.서로 연관성이 없는 클래스에 대해서 하나로 묶는 기능 제공 (상위 부모)
	 *   Interface도 결국에는 하나의 타입으로 보자..
	 *   
	 * 2.원하는 인스턴스에 implements Irepairable 를 붙여줌으로써 관계성이 생겼다!
	 */
}

public class Ex04_Interface {

	public static void main(String[] args) {

		Tank2 tank = new Tank2();
		Marine2 marine = new Marine2();
		Scv scv = new Scv();
		tank.hitpoint=20;
		System.out.println("탱크 "+tank.hitpoint);
		System.out.println("Scv 수리요청");
		scv.repair(tank);
		System.out.println("탱크 수리 완료 : "+tank.hitpoint);
		CommandCenter center = new CommandCenter();
		scv.repair(center);
		
	}

}
