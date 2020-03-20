/*
 * �߻�Ŭ���� 
 * >>�̿ϼ� Ŭ���� (�̿ϼ��� ���赵)
 * 1.�ϼ��� �ڵ� + �̿ϼ� �ڵ�
 * 2.�ϼ�(�Լ�) ������� �ִ� �Լ� + �̿ϼ� (�Լ�) ������� ���� �Լ�public void run(); >> {}X 
 * 3.�ϼ�/�̿ϼ��� ���̴� new ��ü ������ ����. new ��ü ����(�ϼ�), ��ü ���� �Ұ���(�̿ϼ�)
 * 
 * ����
 * 1.�߻�Ŭ����(�̿ϼ�) ������ ��ü ���� �Ұ� (new ��� �Ұ���)
 * 2.�߻�Ŭ������ �ᱹ �ϼ��� Ŭ������ �Ǵ� ���� ����.
 * 3.�߻�Ŭ������ �ϼ��� Ŭ������ �Ǳ� ���� ���? ���. ���� ����� ����.
 * 4.��Ӱ��迡�� �̿ϼ��� �ڿ� (�߻��ڿ�)�ϼ��ض�. (����) >> ������ �ض�. override
 * 
 * ������ ���忡��
 * ���� �߻�Ŭ������ ����ٸ� .. ������? ������ ������ �������� �Ѵ�. (�����ǿ� ���� �������� �ο�)
 * �ڼ�Ŭ������ ��ӹ��� �߻�Ŭ������ �ϼ����Ѿ� �Ѵ�.
 * 
 * ����� ������ �߻�Ŭ������ ���� �� ����. ��? ����� �ؾ߸� �߻�Ŭ���� ��밡��.
 */
abstract class ABclass{
	//�߻�Ŭ������ �߻��ڿ��� ��������.
	int pos=0;
	//�ϼ��ڵ�
	void run() {
		pos++;
	}
	//�̿ϼ��ڵ�
	abstract void stop(); //{}�� ������ ����.
}
class Child extends ABclass{
	void stop() { //������� ����. ������ ��� ����!
		this.pos=0;
		System.out.println("stop: "+this.pos);
	}
}
class Child1 extends ABclass{
	void stop() { //������� ����. ������ ��� ����!
		this.pos=-1;
		System.out.println("stop: "+this.pos);
	}
}
public class Ex01_abstract_class {
	public static void main(String[] args) {
		//ABclass ab= new ABclass(); �Ұ�...
		Child ch= new Child();
		ch.run();
		ch.run();
		System.out.println(ch.pos);
		ch.stop();
		
		Child1 ch2 = new Child1();
		ch2.run();
		ch2.run();
		ch2.stop();
		System.out.println(ch2.pos);
		
		//������
		ABclass ab= ch; //�θ�Ÿ���� ���������� �ڽ�Ÿ���� �ּҸ� ���� �� �ִ�. (������!!!)
		                //�θ�� �ڽ��� Ÿ���ڿ��鸸 Ȱ��
		                //**�θ�� �����ϴ���, �� �ڿ��� ������ �Ǿ��ִٸ�, [�ڽ� �ڿ�]���� �����ϰ� �ȴ�..**
		System.out.println("g"+ch.pos);
		ab.run();
		ab.stop();
		System.out.println(ch.pos);
		//�׷��� ���� �θ��ڿ��� ���� �ʹٸ�, super�� �Ἥ �̿��ؾ� �Ѵ�...
		
	}

}
