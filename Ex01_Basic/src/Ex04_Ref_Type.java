/*
Ŭ������ ���赵�̴� , Ŭ������ Ÿ���̴�
Ŭ���� == ���赵 == Ÿ��
Ŭ������ ��üȭ (���� ���� ����) ���ؼ� ���
���α׷� ���迡�� ���� ���� ���� new �����ڸ� ���ؼ� memory >> ��ü(�ν��Ͻ�)

 ���赵
Ŭ���� 2����
1. main �Լ��� ������ ���赵 >> ������ ���� ����
2. main �Լ� ���� ���赵 >> �����ִ� ���� > ���̺귯�� (lib)
   
*/
class Apt2 {  //���������� Ŭ���� �ȿ� Ŭ���� �ȸ��� //The type Apt is already defined
	          // �ϳ��� �ڹ� ���Ͽ��� ���µ� Ŭ������ �ϳ� �ۿ� ������Ѵ�. public�� �ϳ���
	int door = 10;
	int window = 20;
}


public class Ex04_Ref_Type {

	public static void main(String[] args) {
		//Apt2 ���赵 >> ��üȭ >> �޸� �÷��� (new ������)
		Apt2 lgapt = new Apt2();
		//lgapt ���� (��������, ��ü���� (�ּҸ� ������ �ִ� ����))
		System.out.println("lgapt : " + lgapt);
		
		Apt2 ssapt = lgapt; //�Ҵ絵 �ּҸ� ������ ����߿� �ϳ�
		ssapt.door = 555;
	}

}
