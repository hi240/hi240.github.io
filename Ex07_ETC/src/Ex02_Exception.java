
public class Ex02_Exception {

	public static void main(String[] args) {
        int num = 100;
        int result = 0;
        try {
        	for(int i=0;i<10;i++) {
        		result =num/(int)(Math.random()*10);
        		System.out.println("result: "+result+", i: "+i);
        	}
        }catch(ArithmeticException e) { //�����ݢ����ݢ����ݿ��꿹�� �갡 ���
        	 //������ �߻��ϸ� �� ���ܿ� �´� ��ü�� �ڵ� �����ȴ�. ��ü�� ������ �����ִ�.
        	System.out.println("���꿹�� �߻�! [�����ڿ��� �̸���]");
        	e.getMessage();
         	e.printStackTrace();
   	//������ �߻��Ǹ� ���������� new ArithmeticExeption() ��ü���ٰ� ������ ��� �� > �� �ּҸ� e ������ ����
        }catch(NullPointerException e) { //�����ݢ����ݢ���Null�� ���� �갡 ���
        	
        }
        catch(Exception e) { //�����ݢ����ݢ����ݸ�� ���� �갡 ��´�.
        	//Exception e �� �������ܷ�, �긦 �� �������� ����ߵȴ�. (������)	
        	
        }
        System.out.println("main end");
	}

}
