//�ڹ��� ������ (���)
class Pbase{
	int p=100;
}
class Cbase extends Pbase{
	int c=200;
}
class Dbase extends Pbase{
	
}

public class Ex11_Inherit_Poly {

	public static void main(String[] args) {
	Cbase cbase=new Cbase();
	System.out.println(cbase.toString());
	Pbase p =cbase; //������
	//�θ�Ÿ���� �������� p�� �ڽ�Ÿ���� �������� cbase�� �ּҰ��� ���� �� �ִ�.
	//�θ�Ÿ���� �������� p�� ������ �θ� ��ü�� ���� �����ϰ� �ڽİ�ü�� ���� �Ұ����ϴ�.
	Dbase dbase = new Dbase();
	p=dbase; //���� dbase�� pbase�� �ڽ��̰�, 
	//�θ�Ÿ�� p�� �ڽ�Ÿ�� cbase�� �ּҵ�, dbase�� �ּҵ� ���� �� �ִ�.
	//p�� ���� ���� �ڽ� Ÿ���� �ּҸ� ���� �� �ִ�.
	//�ϳ��� �θ�Ÿ���� ���� ���� �ڽ� Ÿ���� �ּҸ� ���� �� �ִ�.
	
	}

}
