/*
 * ����
 * 1. ����(error): ��Ʈ��ũ ���, �޸�, �ϵ���� (������ �ڵ������� �ذ� �Ұ���)
 * 2. ����(Exception): �������� �ڵ忡 ���� �߻��ϰ�, �ڵ带 ���������ν� �ذ��� �� �ִ� ������..
 *    � ����? 0���� �����ų�? ���� �迭�� ���ٰų�? 
 *    ���ܰ� �߻��ϸ�, ���α׷��� ������ ����˴ϴ�.
 * 3. ����ó���ϴ� ��� : �׷���, ������ ����� �ڵ带 �����ϴ� �� �ƴϰ�, ���� �߻��� �������� ���Ḧ ���°ͻ�.
 * 
 */
//public class Ex01_Exception {
//
//	public static void main(String[] args) {
//	    try {
//	    	//������ �߻��� �� �ִ� �ڵ�! (�Ҿ��� �ڵ�...
//	    }
//	    catch (Exception e) {
//	    	//������ ����� catch ������ ���
//	    	//�����ڿ��� email �Ѵٴ��� �α����� ���� ���� ���
//	    	//�������Ḧ �켱 ���´�.
//	    }finally {
//	    	//������ �߻��ϴ�, �߻����� �ʴ� ������ ����Ǿ�� �� �ڵ�
//	    	//DB���� �ݱ�
//	    	
//	    }
//	}
//
//}
public class Ex01_Exception {

	public static void main(String[] args) {
	    System.out.println("main start");
	    try {
	    	System.out.println(0/0); //���� �߻� ������ �ڵ带�ִ´�...
	    }catch (Exception e) {
	    	System.out.println(e.getMessage());
	    }
	    System.out.println("main end");
	}

}