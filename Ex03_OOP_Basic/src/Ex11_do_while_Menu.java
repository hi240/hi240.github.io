import java.util.Scanner;

public class Ex11_do_while_Menu {
	Scanner sc = new Scanner(System.in); //��ǰ (����:Ŭ����)	
    //���
	void inputRecord() {
		System.out.println("���������� �Է�: ");
	}
	void deleteRecord() {
		System.out.println("���������� ����: ");
	}
	void sortRecord() {
		System.out.println("���������� ����: ");
	}	
	int displayMenu() {
		System.out.println("****************");
		System.out.println("*****��������*****");
		System.out.println("1. �л����� �Է��ϱ�");
		System.out.println();
		System.out.println("2. �л����� �����ϱ�");
		System.out.println();
		System.out.println("3. �л����� �̸��� �����ϱ�");
		System.out.println();
		System.out.println("4. ���α׷� ����");
		System.out.println();			
		int menu=0;
		do {
			try {         //trycatch ������ ����ó���Ҷ� �����̴�. ���ܰ� ������, ���α׷��� ��� ����� �� �ְ�....
				menu =Integer.parseInt(sc.nextLine());
			if(menu>=1&&menu<=4) {   //do while�� Ż�� (1~4���� ���̸�,)
				break; 
			}else {
				//1���� �۰ų� 4���� ū��. ���α׷����� ������ �ƴϴ�. �׷��� ���� ��������� �ϰڴ�.
				//System.out.println("�߸��Է��ϼ̽��ϴ�");
				throw new Exception("�޴� ���� ��ȣ�� �߸��Ǿ����ϴ�.");
			}
			}catch(Exception e) {
			System.out.println(e.getMessage());//����ڰ� ���� ���������͸� �Ѹ���.��, Exception�̶�� �޸𸮿� ����ִ� ������ ȣ���ϴ� �Լ�.
			System.out.println("�޴� ���� ���� �߻�");
			System.out.println("�޴� 1~4������ �Է�");
			}
			
		}while(true); //���� ���ϴ� ���� ���Ë� ���� ��� �Է¹��� �� �ִ� �������ִ�.
		//���� : ����ڰ� 1~4������ ��ȣ�߿��� �ϳ�������
		return menu;
	}
	
	public static void main(String[] args) {
		Ex11_do_while_Menu ex11=new Ex11_do_while_Menu();
		while(true) {
			switch(ex11.displayMenu()) {
			case 1:ex11.inputRecord();
			break;
			case 2:ex11.deleteRecord();
				break;
			case 3:ex11.sortRecord();
				break;
			case 4:System.out.println("���α׷� ����");
			          //return; �����Լ��� ����...(����������)
			          System.exit(0); //���α׷� ��ü�� ���������ϴ� �Լ�.
				}
		}

	}

}