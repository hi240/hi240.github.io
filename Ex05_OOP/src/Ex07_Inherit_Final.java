/*
 * ���� <->���
 * ���: �ѹ� ���� �ʱ�ȭ �Ǹ� ������ �Ұ����ϴ�.
 * ����ڿ� : ������(�ֹι�ȣ), �������� ��: ���̰�..
 * ����� ���������� [�빮��]
 * 
 * java : final int NUM=10;
 * C#   : const int NUM=10;
 * 
 * final Ű���� ��_���ݤ�_���ݤ�_���ݤ�_���ݤ�_���ݤ�_���ݤ�_���ݤ�_���ݤ�_���ݤ�_���ݤ�_���ݤ�_���ݤ�_���ݢ�����������������������������������������
 * Ŭ���� �տ� >> final class Car{}>>final Math>>��ӺҰ� ����������������������������������������������������������������������������������������������������������
 * �Լ� �տ� >> public final void print(){} >> ��Ӱ��迡�� ������ ��������.
 * ��� >> public final String KIND="heart"; //���
 * 
 */
class Vcard{ 
	final String KIND="heart"; //�ѹ� �ʱ�ȭ �� ���� ������ �Ұ��� �ϴ�.�ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ٢ݢݢݢݢܢۢݢܢۢݢܢ�
	final int NUM=10;
	
	void method() {
		//�ڹ� API �ý��� ��������������١ڡ٣�*'`"����*���������ڢ����������ڡ٣�*'`"����*���������ڡ١ڡ١ڡ٣�*'`"����*���������ڡ١ڡ١ڡ٣�*'`"����*�����������ڡ١�
		System.out.println(Math.PI);
	}
}
class Vcard2{
	final String KIND;
	final int NUM;
//	Vcard2(){
//		this.KIND="heart";
//		this.NUM=10;
//	}
	Vcard2(String kind,int num){
		this.KIND=kind;
		this.NUM=num;
	}
	@Override
	public String toString() { //��ü�� ���ڿ��� ��ȯ�� �� ���.
		return "Vcard2 [KIND=" + KIND + ", NUM=" + NUM + "]";
	}
}
//53���� ī�� kind �ٸ��� �����;�� ������ ��������� �ٲ����ʰ�...

public class Ex07_Inherit_Final {

	public static void main(String[] args) {
 
		Vcard2 c = new Vcard2("spade",1); 
		System.out.println(c.toString());
		Vcard2 c2 = new Vcard2("HEART",2);
		System.out.println(c2.toString());
		Vcard2 c3 = new Vcard2("STAR",3);
		System.out.println(c3.toString());
		
		// c.KIND="heart"; //�ѹ� �ʱ�ȭ �� ���� ������ �Ұ����ϴ�. [���]
		}

}
