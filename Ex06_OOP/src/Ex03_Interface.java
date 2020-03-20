/*
 * �߻�Ŭ���� : �������̽�(ǥ��,���,��Ģ,�Ծ� ����� ����)
 * 1.������ ��ü ���� �Ұ��� (new�����ڸ� ��� �Ұ���)
 *   �߻�Ŭ����(�̿ϼ�),�������̽�(��� ���� �߻� �ڿ�)
 * 2.���(extends), ����(implements)�� ���ؼ��� ��� ����.(heap�޸𸮿� ���簡 �����ϴ�.)
 * 3.�����Ǹ� ���� ������ ������ �����̴�.
 * 
 * �߻�Ŭ������ �������̽��� �ٸ���?
 * 1.�������̽��� ���� ������ �����ϴ�. (���(ǥ��) �۰� ������..����ȭ�� �� �ְ�): ���� ����� ��Ƹ�Ƽ� ũ�� �����.
 *   class Test extends Object implements Ia,Ib,Ic
 * 2.�߻�Ŭ������ ���� ����� ��Ģ(������ ����� ���ؼ��� ����)
 * 3.�߻�Ŭ������ �ϼ��� �ڵ�+�̿ϼ� �ڵ�
 * 4.�������̽��� ����� ������ �������� �̿ϼ�(�߻�)
 * 
 * �������̽� : ����Ʈ���� ���迡�� �ֻ����ܰ迡 ����.
 * *�ʱ� ������ ���忡��*
 * 1.�������̽��� [������] �������� ����. (�������̽��� �θ� Ÿ��)
 * 2.���� �������� ���� Ŭ������ �ϳ��� �����ִ� ����� �ϴ� ����(�θ� �����ϰ� ������)
 * 3.�������̽��� ������ �ʾƵ� Java API ���� ����..
 * 4.�������̽��� (~able) : �� �� �ִ�, ������ �� �ִ� (����)
 * 5.��ü���� ���� ��(��ü ���� ����)
 * 
 * ����Ʈ���� ����
 * 1.���ߴܰ��� �ֻ��� > �䱸���׿� ���� ���踦 ��.
 * 2.���� ǥ�ؿ� ���� ���� ����(����)> ������ �ǰ�.
 * 
 * Interface
 * 1.���� �����ΰ� ���� : ���� ���� ����. ���(�ý��ۿ��� �̵�:move, ��ǥ�� ����)
 *                                    void move(int x,int y); �߻�޼����.
 *                                    �������̽��� ��� �޼���� �߻��ڿ���.
 * JavaAPI (���߿� �ʿ��� �� ���� �������̽��� ���� : �������̽��� ������� ������ �� ���� Ŭ������ �ִ�.
 * Collection�̶�� �θ�.(�����迭) ���� 1�� ���ٰ� 3��.. �� ��������. Vector,ArrayList,HashSet,HashMap ��..
 * ǥ��ȭ�� ����� �����ϰ� �ִ� Class���̴�.
 * ���� ���� Interface ����..
 * 
 * �������
 * 1.���(final): public static final int VERSION=1;
 * ������ �������̽��� ����� ��� �ڿ��� public�ƴѰ���? > �׷��� int VERSION=1; �̷��� ª�� ���� ����.
 * 2.�Լ�(method): public abstract void run(); > void run(); �̷��� ª��.
 * 3.           : String move(int x, int y); > 
 * 
 * interface Ia{
 *    int VERSION=1;
 *    void run();
 *    String move(int x, int y);
 *    }
 * 
 */

//class Test implements Ia, Ib{
//	@Override
//	public void run() {
//	}
// }

interface Ia{
	int AGE=100; //public static final ����
	String GENDER="��";
	String print(); //public�̸鼭, abstract �ΰ� ����!
	void message(String str); //public abstract
}
interface Ib{
	int AGE=10;
	void info();
	String val(String s);
}
class Test2 extends Object implements Ia,Ib{ //Ia�� ���� ������ ���������� �����Ѵ�. �� �����.

	public String print() {
		return null;
	}
	
	public void message(String str) {
	}

	public void info() {
	}

	public String val(String s) {
		return null;
	}
}
public class Ex03_Interface {

	public static void main(String[] args) {		
     
	
     Test2 t=new Test2();
   //System.out.println(t.AGE); // ����. �� interface�� AGE �� � ������ �Ǵ� �ȵǱ� ����
     Ia ia=t; //������ - > ������ �θ�� �ڽĲ��� �����µ�, �ڽ��� ��ü�� �̽��������ν� �θ� �ڽ� �ڿ��� �����ϰ� �ȴ�.
     System.out.println(ia.AGE);
     Ib ib=t;
     System.out.println(ib.AGE);
	}

}
