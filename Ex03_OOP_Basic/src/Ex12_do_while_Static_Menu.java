import java.util.Scanner;

//���� ���� �޴��� ����...

public class Ex12_do_while_Static_Menu {
    static int kind;
    static int menu;
    static int print;
	static Scanner sc = new Scanner(System.in); 
    
	public static void main(String[] args) {	
		System.out.println("�԰����� ����");
		System.out.println("1.���");
		System.out.println("2.�߽�");
		System.out.println("3.�ѽ�");
		System.out.println("4.�Ͻ�");
	
		do {menu =Integer.parseInt(sc.nextLine());
			try {         
			if(menu>=1&&menu<=4) {  
				break; 
			}else {
				throw new Exception("�޴� ���� ��ȣ�� �߸��Ǿ����ϴ�.");
			}
			}catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println("�޴� ���� ���� �߻�");
			System.out.println("�޴� 1~4������ �Է�");
			}
			
		}while(true);
		while(true) {	
			switch(menu) {
			case 1:
				System.out.println("1.�ܹ���");
				System.out.println("2.����");
				print =Integer.parseInt(sc.nextLine());
				if (print==1) {
					System.out.println("�ܹ��Ÿ� �����ϼ̽��ϴ�.");
				System.exit(0);
				}
				else {System.out.println("���ڸ� �����ϼ̽��ϴ�.");
				System.exit(0);
				}
			break;
			case 2:
				System.out.println("1.¥���");
				System.out.println("2.«��");
				print =Integer.parseInt(sc.nextLine());
				if (print==1) 
				{System.out.println("¥����� �����ϼ̽��ϴ�.");
				System.exit(0);
			    }
				else {System.out.println("«���� �����ϼ̽��ϴ�.");
				System.exit(0);
				}
				
				break;
			  case 3:
				System.out.println("1.�����");
				System.out.println("2.��ġ�");
				print =Integer.parseInt(sc.nextLine());
				if (print==1) {System.out.println("������� �����ϼ̽��ϴ�.");
				System.exit(0);
				}
				else {System.out.println("��ġ��� �����ϼ̽��ϴ�.");
				System.exit(0);
				}
				break;
			 case 4:
				System.out.println("1.����");
				System.out.println("2.�ҹ�");
				print =Integer.parseInt(sc.nextLine());
				if (print==1) {System.out.println("���ø� �����ϼ̽��ϴ�.");System.exit(0);
				}
				else {System.out.println("�ҹٸ� �����ϼ̽��ϴ�.");System.exit(0);
				}
				break;
				}
				}
		}

	}

