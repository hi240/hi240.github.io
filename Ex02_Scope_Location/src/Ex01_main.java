import kr.or.bin.common.Car;

/*
 * 
 * Ŭ����== ���赵==Ÿ��
 * 
 * Ŭ���� �������: [�ʵ�+�Լ�] +������
 * *�ʵ�(field) >> ��������, ��������, ����(��ǰ)���� ����>> ����
 * *�Լ�(function) >> ��� (��������)
 * ������ : �ʵ��� �ʱ�ȭ�� �������� �ϴ� �Լ�
 * 
 * Ŭ����,�ʵ�,������,�Լ�:�ڽ��� ����(����) ����(������,������,������=modifier)
 * >>public ,protected, private, default : ����������
 * 
 * 1.public class Test{}
 * 2.class Test{} >> �����Ϸ��� ���������� default �����ڸ� �ٿ��� ���.
 * ���������� �����Ϸ��� �����ϴ� �ڵ�: default class Test{}
 * default �����ڰ� ���� �ۼ����� ����.
 * *default �����ڴ� ���� �������� ���� �����ϴ�, [�ٸ� ������ ������ ���� ���� �Ұ�.]
 * *default �����ڴ� ���� ��������(package)������ [���� ����]���� 
 * 
 * 
 * 3.�ϳ��� �������� �ڹ������� �������� Ŭ������ ���� �� �ִ�.(Test.java) (0)
 * ��, public Ŭ������ �ϳ��� �����ؾ� �ȴ�. �������� default 
 * 
 * 
 * 
 * Src ���� �Ʒ����� Ex01_main Ŭ������ �ְ�,
 * kr.or.Bit.common>>public Car
 * kr.or.Bit.common>(default)Car
 * 
 * 
 */
//�տ� ������ default�� �����Ǿ��ֵ�.
//���� ���� �������� ���� �����ϰ�,�ٸ� ���� ���� �Ұ��ϴ�.
//
class Test{ //default class�ϱ� ���� ���������� ��밡��. 
	int d_iv; //�����Ϸ��� �ڵ����� default int d_iv �ؼ�
	public int p_iv; //public�� ��𿡼��� ��������.
	private int prei_iv; //private�� ���߾���.
}
public class Ex01_main {

	public static void main(String[] args) {

		//kr.or.bit.common.Car ;
		Car car = new Car();
    //    car.door =10; //�� car.door ������ ������ �ȵɱ�................
		Test t = new Test();
		t.d_iv = 100; //default
		t.p_iv = 200; //public
		//private �ڿ� ���� �Ұ�.
		
		
	}

}
