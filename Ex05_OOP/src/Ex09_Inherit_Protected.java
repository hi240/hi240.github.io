import kr.or.bit.Bird;

/* protected ������ ��Ӱ��迡���� 
 * ����:��Ӱ��迡�� ������
 * ����� ���� ����Ѵٸ�, �� �ڿ�(�Լ�)�� �����Ǹ� ������ ���ڴ�..
 */
class Ostrich extends Bird{
	//Ÿ���� ��üȭ,Ư��ȭ �� �ɷ�?
	void run(){
		System.out.println("runnnn");
	}
	@Override
	protected void moveFast() {
		run();
	}
	//protected �����ڴ� �������̵��� �ؾ� �ڼ�Ŭ�������� �θ�Ŭ�������� ����Ҽ��ִ�.
}

class Bi extends Bird{
	@Override
	protected void moveFast() {
		super.moveFast();
	}
}
public class Ex09_Inherit_Protected {

	public static void main(String[] args) {
		Ostrich ostrich = new Ostrich();
        ostrich.run();
        ostrich.moveFast();
        Bi bi=new Bi();
        bi.fly();
        bi.moveFast();
        ostrich.moveFast();
   
      
	}

}
