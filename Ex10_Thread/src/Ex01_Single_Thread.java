/*
 * ���α׷� >> ���μ��� >> ������ (�ּ� ���� ����)
 * ���ݱ��� �̱� ���μ����� �̱� ������� ���α׷� ¥����..(main�Լ��� �̱� ������)
 * JVM : call Stack ���� �Լ� ���۽�Ŵ.
 * ���� ���μ����� stack �ϳ��� ������ �ֱ� ��������
 * �Լ��� 10���� �ѹ��� �ϳ��� �Լ��� ����.
 * ������ ����(Sequential�� ���α׷���)
 */
public class Ex01_Single_Thread {

	public static void main(String[] args) {
		System.out.println("�����ϲ�");
		worker();
		worker2(); //���� ���ÿ� ������ �ȵ�. -> ������ ����Ǵ� ��...
		System.out.println("�����ϲ�����");
	}
      static void worker () {
    	  System.out.println("1���ϲ�");
      }
      static void worker2 () {
    	  System.out.println("2���ϲ�");
      }

}
