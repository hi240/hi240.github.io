/* ���� �ٸ� Ŭ������ �ϳ��� �θ�� �����ִ� ����
 */
interface Irepairable{ //..�� �� �ִ�
}
class Unit2{
	int hitpoint; //�⺻������
	final int MAX_HP; //�ʱ�ȭ�� ����ߵǴµ�, �ؿ� �������� �ʱ�ȭ�� ������ ��.
	Unit2(int hp){
		this.MAX_HP=hp;
	}
}

//���� ����
class GroundUnit extends Unit2{ //Tank2,Marine2,Scv
	GroundUnit(int hp){
		super(hp);
	}
}

//���� ����
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
	//repair���
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
	 * Scv repair �� Unit�� �����ϸ� ..... Unit������ŭ repair�Լ��� �߰���Ű�Ⱑ ��...
	 * ���: �ϳ��� repair �Լ��� ��� repair ������ unit�� ������ �� ������? Overloading
	 * ������- ��Ӱ��迡�� �θ�Ÿ�Ժ����� �θ�Ÿ���� �ڽİ�ü�� �ּҸ� ���� �� �ִ�.
	 * ��ũ�ϰ� scv�� repair�ϰ� �ʹ�!
	 */
		}
	//	void repair(GroundUnit unit) { //������ �۴� �ֵ���� repair���ְ� ����..
//		if(unit.hitpoint!=unit.MAX_HP) {
//			unit.hitpoint +=5;
//		}
//	}
	void repair(Irepairable repairunit) {
           /*repairunit ������ � ��ü�� �ּ� : Tank2,CommandCenter, Scv
	       CommandCenter�� ���� �� �� ������ ������ Tank�� Scvó�� hp�� �ƴϴ�...
	       repairunit�� �ڱ���� �ֳ���?.. �θ��� ������ �ϰ͵� �����..
	       Unit2 �� �ᱹ hitpoint�� MAX_HP�� ������ �ִ�.
	       tank2 �� ���� �θ� repairunit���� ������ �ڿ��� ����!! -> downcasting�� ����.
	       downcasting -> Tank2 tank = (Tank2)repairunit (���� Ÿ���� > ���� Ÿ������)
	       downcasting -> Scv scv = (Scv)repairunit
	       
	       ���!Tank2 > GroundUnit > Unit2
	        Scv   > GroundUnit > Unit2
	        ������ : Unit2
	        CommandCenter > Unit(X)
	       */
		//���� ������ unit�� parameter�� �޴µ�, �� unit�߿��� �ٸ� ����� ��������� �ִٸ�..
		if(repairunit instanceof Unit2){ //instanceof �ش� Ÿ���� �´��� Ȯ��. repairunit�� Unit2���,
	     Unit2 unit= (Unit2)repairunit; //unit2Ÿ���̸� ���������ϰ� �ϴ°Ű�,
	     if(unit.hitpoint != unit.MAX_HP) {
	    	 unit.hitpoint=unit.MAX_HP; }
        }
        	else { //Unit2�� �θ�� ������ ���� ������
	    	 System.out.println("Unit2�� �ƴϿ���! �ٸ� ������� repair�մϴ�.");
	        }		
	     }
	
	/*�ᱹ���� ���� �������� ��������..
	 * CommandCenter/Marine/tank/Scv ���������� ������ ���� ����..
	 * �ذ�� : Interface
	 * 1.���� �������� ���� Ŭ������ ���ؼ� �ϳ��� ���� ��� ���� (���� �θ�)
	 *   Interface�� �ᱹ���� �ϳ��� Ÿ������ ����..
	 *   
	 * 2.���ϴ� �ν��Ͻ��� implements Irepairable �� �ٿ������ν� ���輺�� �����!
	 */
}

public class Ex04_Interface {

	public static void main(String[] args) {

		Tank2 tank = new Tank2();
		Marine2 marine = new Marine2();
		Scv scv = new Scv();
		tank.hitpoint=20;
		System.out.println("��ũ "+tank.hitpoint);
		System.out.println("Scv ������û");
		scv.repair(tank);
		System.out.println("��ũ ���� �Ϸ� : "+tank.hitpoint);
		CommandCenter center = new CommandCenter();
		scv.repair(center);
		
	}

}
