import kr.or.bit.Pclass;

/*
modifier 
public,default,private,�ڡ١ڢݻ�Ӱ���١ڢݿ����� ���̴� protected
��鼺 (public�� default)
�١ڢݻ���� ���� Ŭ���� �ȿ��� protected �����ڴ� default�� ����.
�١ڢݿ�? ����� ���� ��Ȳ������ protected �����ڴ� �ǹ̰� ����.
*/

class Dclass{
	public int j;
	private int o;
	int p; //default
	protected int k;
}
class Child2 extends Pclass{
	void method() {
		this.k=2000; //��Ӱ��迡�� �ڽ��� �θ��� protected ������ �ڿ��� public ó�� ���.
		System.out.println(this.k);
	}
}
public class Ex08_Inherit_Protected {

	public static void main(String[] args) {
		Dclass dc=new Dclass();
      /*dc.j > public �̱� ������ ���Ⱑ��
		dc.p > default�� ���� ���������� ����.
		dc.k > protected ���� ���� �ȿ����� default�� �Ȱ��� ȿ��.>��Ӱ��迡���� �ǹ̰� �ִ�.
		dc.o > private�̶� �Ⱥ���. */
		
	  //�ٸ� ���� (package)
		Pclass pc=new Pclass();
	  /*pc.j > ����
	    pc.p > �Ұ�
	    pc.k > �Ұ�
	    pc.o > �Ұ�   */
	   
		Child2 ch = new Child2();
		ch.method();
	}

}
