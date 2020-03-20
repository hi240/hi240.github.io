/*G A M E > unit
unit�� ������ (�̵���ǥ,�̵�,�����)
unit���� �̵� ����� �ٸ���...
abstract class �̸�{abstract �̵�();}�� ���� ���� �����ϰ� �ϰ�ʹ�.
 */
abstract class Unit{ //1.�߻�Ŭ����
	int x,y; 
	void stop() {
		System.out.println("Unit stop");
	}
	//�̵� (����)
	abstract void move(int x, int y); //2.�߻�޼��� ����.
	
}
class Tank extends Unit{
	void move(int x, int y) { //3.�߻�޼��� ������.
		this.x=x;
		this.y=y;
		System.out.println("Tank �̵�: "+this.x+","+this.y);
	}
	//Tank�� ������ Ư�� ���.
	void changeMode() {
		System.out.println("��ũ ��ȯ ���");
	}
}
class Marine extends Unit{
	void move(int x,int y) {
		this.x=x;
		this.y=y;
		System.out.println("Tank �̵�: "+this.x+","+this.y);
	}
	void stimpack(){
		System.out.println("�����ѱ��");
	}
	
}
class Dropship extends Unit{
	void move(int x,int y) {
		this.x=x;
		this.y=y;
		System.out.println("Tank �̵�: "+this.x+","+this.y);
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
		//1. ��ũ 3�븦 �����, [���� ��ǥ]�� �̵���Ű���� (33,44)
		Tank[] tanklist = {new Tank(),new Tank(),new Tank()};
		for(Tank tank : tanklist) {
			tank.move(33, 44);
		}
		
		//2. ���� ���� Unit(Tank1, Marine1, Dropship1)�� ���� ��ǥ�� �̵���Ű����.
		Unit[] unit= {new Tank(),new Marine(),new Dropship()}; //unit �ϳ��� Ÿ���̱⶧����
		for(Unit u : unit) {
			u.move(33,44);
		}
		
	}

}
