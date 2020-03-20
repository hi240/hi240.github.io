/*
 * oop 3�� Ư¡
 * ��� ĸ��ȭ ������
 * Polymorphism �������̶�?
 * (��Ӱ��迡�� ����)
 * 
 * C#  :������(overloading, override) �ɷ�
 * java:[��Ӱ���]���� [�ϳ��� ��������]�� [�������� Ÿ��]�� ���� �� �ִ� �ɷ�
 *      ��, �ϳ��� ���������� [�θ�Ÿ��] �̾�� �Ѵ�.
 * �θ� Ŭ���� Ÿ���� ���������� ���� ���� �ڽ� Ŭ���� ��ü��  ���� �� �� �ִ�.
 * 
 * ������: ���ǰ� �ݴ�� �ڽ��� �θ𿡰� ���Ǿ��� �ش�.
 */
class Tv2{ //�θ� (�Ϲ�ȭ,�߻�ȭ) �����ڿ�
	boolean power;
	int ch;
	void power() {
		this.power=!this.power;
	}
	void chUp() {
		this.ch++;
	}
	void chDown() {
		this.ch--;
	}
}
class Captv extends Tv2{ //capTv Ư��ȭ, ��üȭ�ǰ� ������ ǥ��..
	String text;
	String captionText() {
		return this.text="���� �ڸ� ó����..";
	}
}
public class Ex10_Inherit_Poly {

	public static void main(String[] args) {
		Captv captv=new Captv();
		captv.power();
		System.out.println("����: "+captv.power);
		captv.chUp();
		System.out.println("ä������: "+captv.ch);
		System.out.println("�ڸ�ó��: "+captv.captionText());
        //���� ��� ����
		//���� Ÿ�� ������ �Ҵ��� �����߾���..
		//Car c = new Car();
		//Car c2= c; <-�̷� ������ �Ҵ��߾���...
		Tv2 tv2=captv;
		/*[��Ӱ���]���� [�θ�Ÿ��]�� [�ڽ�Ÿ��]�� �ּҸ� ���� �� �ִ�.(������)
		�� �θ�� �ڽ��� ��ü�� �� �� �ִ�.
		�� �����Ǹ� �����ϰ�.
		Tv2 tv = new Tv2(); (X) */
		System.out.println(tv2.toString());
		System.out.println(captv.toString());
		//tv2.captionText();// (X) >>�ڽ��� ��ü��>>�ڽ��� �ڿ� ���� �Ұ�..
        
		
	}
	
}
