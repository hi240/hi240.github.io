//static method �Լ��� ���������,���� new���� �ʰ� �� �Լ��� ����Ҽ� �ִ�(?) (O)
class StaticClass{
	static int cv;
	int iv;     
	 //�� iv�� heap�޸𸮿� �������� �״������. cv�� Class Area�� ����������, heap�޸𸮿��� �� Class Area�� ���� �ּҰ��� ����Ǿ�����.
	void m() {
		iv=100; //iv���� ������ ����ֵ�.
		//cv���� ������ ����ִ�.
		//static �ڿ��� �׻� �Ϲ��ڿ����� memory�� ���� �����ȴ�.
		StaticClass.cv=100; //��Ģ���ι��
		cv=200; //������ ���� Ŭ������ ������ �׳� cv�� ���� ����.
	}
	static void sm() { //static�Լ�
		//1.�Ϲݺ����� iv ���� ������ �� �� �ִ�.(x)
		//static�� �׻� �Ϲ� ��麸�� �켱�Ѵ�. memory�� �׻� ���� ���ִٰ� �����ϸ��.
		//iv=2; (x) ���� static�濡 ���������ִµ� �Ϲݳ��� �Ⱥ��̱� ������ ����� �� ����.... 
		//2.static ������ cv���� ������ �� �� �ִ�.(o)
		//memory���� ù��°�� ���� �� ����, �� ���� �Լ��� ���� ������ static������ �̹� ���� �� �ִ�.
		cv=200;
		//error��������, ���� ���� ��ƶ�. static�Լ��� static ������, �Ϲ��Լ��� �Ϲ� ������ ��ƶ�.
		//�� ��� ������ [�޸��� ��������]ſ�̶�� ���� ��.
	
		System.out.println("�� static �̾�");
		for(int i =0;i<100;i++) {
			System.out.println(i);
			//��� ������ ���౸���� stack����,,,,,,,,,,,,,,,
		}
	}
}
//�Լ��� static���� ���� ����.
//Math.Random()
//���� static �Լ��� �� �ٸ�, �ǵ��� ������?
//���� �Ἥ...................................

//static�Լ��� ��������? ��ġprint�Լ�ó��, ���� ���� ����ϱ� ������!~~
//�׷��ٰ� �ʹ� ���� �����ϸ�(���ÿ� �����Ҽ��ִ�) �׷���,
//�Ѱ� ȭ���ó�� �̹� ������ ���������ִ�.


public class Ex09_Static_Method {

	public static void main(String[] args) {

      //��Ģ���� ���
		//StaticClass sc=new StaticClass();
		//sc.�Լ��̸�...
		StaticClass.sm();
System.out.println(StaticClass.cv);
StaticClass sc = new StaticClass();
sc.m();
System.out.println(sc.iv);
System.out.println(sc.cv);

	}

}
