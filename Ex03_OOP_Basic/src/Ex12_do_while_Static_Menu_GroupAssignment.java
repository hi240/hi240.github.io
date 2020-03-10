import java.util.Scanner;
class FoodGroup {
    String group1, group2, group3;
    FoodGroup() {
        this("�ѽ�", "���");
    }
    FoodGroup(String group1, String group2) {
        this.group1 = group1;
        this.group2 = group2;
    }
    FoodGroup(String group1, String group2, String group3) {
        this.group1 = group1;
        this.group2 = group2;
        this.group3 = group3;
    }
}
class FoodMenu {
    String menuName1, menuName2, menuName3, menuName4;
    int menuPrice1, menuPrice2, menuPrice3, menuPrice4;
    FoodMenu() {
        this("��ġ�", 5000, "�����", 5000);
    }
    FoodMenu(String menuName1, int menuPrice1, String menuName2, int menuPrice2) {
        this.menuName1 = menuName1;
        this.menuPrice1 = menuPrice1;
        this.menuName2 = menuName2;
        this.menuPrice2 = menuPrice2;
    }
    FoodMenu(String menuName1, int menuPrice1, String menuName2, int menuPrice2, String menuName3, int menuPrice3,
            String menuName4, int menuPrice4) {
        this.menuName1 = menuName1;
        this.menuPrice1 = menuPrice1;
        this.menuName2 = menuName2;
        this.menuPrice2 = menuPrice2;
        this.menuName3 = menuName3;
        this.menuPrice3 = menuPrice3;
        this.menuName4 = menuName4;
        this.menuPrice4 = menuPrice4;
    }
}
public class Ex12_do_while_Static_Menu_GroupAssignment {
    static Scanner sc = new Scanner(System.in);
    // �ʱ� �޴� ȭ�� �Լ�
    static int displayMenu(String menu1, String menu2, String menu3) {
        System.out.println("****************");
        System.out.println("****���� �޴�*****");
        System.out.println("1. " + menu1);
        System.out.println();
        System.out.println("2. " + menu2);
        System.out.println();
        System.out.println("3. " + menu3);
        System.out.println();
        System.out.println("4. ������");
        System.out.println();
        // return 0;
        int menu = 0;
        do {
            try {
                menu = Integer.parseInt(sc.nextLine());
                if (1 <= menu && menu <= 4) {
                    break; // whileŻ��( 1<= menu <=4)
                } else {
                    throw new Exception("�޴� ���� ��ȣ�� �߸� �Ǿ����ϴ�");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println("�޴� 1~4������ �Է�");
            }
        } while (true);
        return menu;
    }

    static int FMenu(String menuGruop, String menu1, String menu2, String menu3, String menu4) {
        System.out.println("****************");
        System.out.println("****" + menuGruop + "�޴�*****");
        System.out.println("1. " + menu1);
        System.out.println();
        System.out.println("2. " + menu2);
        System.out.println();
        System.out.println("3. " + menu3);
        System.out.println();
        System.out.println("4. " + menu4);
        System.out.println();
        System.out.println("5. ���� �޴���");
        System.out.println();
        System.out.println("6. ���α׷� ����");
        System.out.println();
        // return 0;
        int menu = 0;
        do {
            try {
                menu = Integer.parseInt(sc.nextLine());
                if (1 <= menu && menu <= 6) {
                    break;
                } else {
                    throw new Exception("�޴� ���� ��ȣ�� �߸� �Ǿ����ϴ�");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println("�޴� 1~6������ �Է�");
            }
        } while (true);
        // ���Ⱑ ����ƴٴ� ���� ����ڰ� 1~6���� ��ȣ �߿��� �ϳ��� ������ ��
        return menu;
    }

    public static void main(String[] args) {
        FoodGroup fGroup = new FoodGroup("�ѽ�", "���", "�߽�");
        FoodMenu kMenu = new FoodMenu("��ġ�", 5000, "�����", 5000, "���ܺ����", 4500, "��������", 6000);
        FoodMenu wMenu = new FoodMenu("���", 6000, "����", 10000, "���İ�Ƽ", 8000, "�ܹ���", 5000);
        FoodMenu cMenu = new FoodMenu("¥���", 5000, "«��", 5000, "������", 7000, "���꽽", 20000);
        while (true) {
            switch (Ex12_do_while_Static_Menu_GroupAssignment.displayMenu(fGroup.group1, fGroup.group2,
                    fGroup.group3)) {
            case 1: {
                outer: while (true) {
                    switch (FMenu(fGroup.group1, kMenu.menuName1,
                            kMenu.menuName2, kMenu.menuName3, kMenu.menuName4)) {
                    case 1:
                        decision(kMenu.menuName1, kMenu.menuPrice1);
                        break;
                    case 2:
                       decision(kMenu.menuName2, kMenu.menuPrice2);
                        break;
                    case 3:
                        decision(kMenu.menuName3, kMenu.menuPrice3);
                        break;
                    case 4:
                        decision(kMenu.menuName4, kMenu.menuPrice4);
                        break;
                    case 5:
                        System.out.println("�ʱ� �޴��� ���ư��ϴ�");
                        break outer;
                    case 6: {
                        System.out.println("���α׷� ����");
                        System.exit(0);
                    }
                    }
                }
                break;
            }
            case 2: {
                outer: while (true) {
                    switch (Ex12_do_while_Static_Menu_GroupAssignment.FMenu(fGroup.group2, wMenu.menuName1,
                            wMenu.menuName2, wMenu.menuName3, wMenu.menuName4)) {
                    case 1:
                        decision(wMenu.menuName1, wMenu.menuPrice1);
                        break;
                    case 2:
                        decision(wMenu.menuName2, wMenu.menuPrice2);
                        break;
                    case 3:
                        decision(wMenu.menuName3, wMenu.menuPrice3);
                        break;
                    case 4:
                        decision(wMenu.menuName4, wMenu.menuPrice4);
                        break;
                    case 5:
                        System.out.println("�ʱ� �޴��� ���ư��ϴ�");
                        break outer;
                    case 6: {
                        System.out.println("���α׷� ����");
                        System.exit(0);
                    }
                    }
                }
                break;
            }
            case 3: {
                outer: while (true) {
                    switch (Ex12_do_while_Static_Menu_GroupAssignment.FMenu(fGroup.group3, cMenu.menuName1,
                            cMenu.menuName2, cMenu.menuName3, cMenu.menuName4)) {
                    case 1:
                        decision(cMenu.menuName1, cMenu.menuPrice1);
                        break;
                    case 2:
                        decision(cMenu.menuName2, cMenu.menuPrice2);
                        break;
                    case 3:
                        decision(cMenu.menuName3, cMenu.menuPrice3);
                        break;
                    case 4:
                        decision(cMenu.menuName4, cMenu.menuPrice4);
                        break;
                    case 5:
                        System.out.println("�ʱ� �޴��� ���ư��ϴ�");
                        break outer;
                    case 6: {
                        System.out.println("���α׷� ����");
                        System.exit(0);
                    }
                    }
                }
                break;
            }
            case 4:
                System.out.println("���α׷� ����");
                System.exit(0);
            }
        }
    }
    static int wFood() {
        System.out.println("****************");
        System.out.println("****��� �޴�*****");
        System.out.println("1. ���");
        System.out.println();
        System.out.println("2. ����");
        System.out.println();
        System.out.println("3. ���İ�Ƽ");
        System.out.println();
        System.out.println("4. �ܹ���");
        System.out.println();
        System.out.println("5. ���� �޴���");
        System.out.println();
        System.out.println("6. ���α׷� ����");
        System.out.println();
        // return 0;
        int menu = 0;
        do {
            try {
                menu = Integer.parseInt(sc.nextLine());
                if (1 <= menu && menu <= 6) {
                    break;
                } else {
                    throw new Exception("�޴� ���� ��ȣ�� �߸� �Ǿ����ϴ�");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println("�޴� 1~6������ �Է�");
            }
        } while (true);
        // ���Ⱑ ����ƴٴ� ���� ����ڰ� 1~6���� ��ȣ �߿��� �ϳ��� ������ ��
        return menu;
    }
    static int cFood() {
        System.out.println("****************");
        System.out.println("****�߽� �޴�*****");
        System.out.println("1. ¥���");
        System.out.println();
        System.out.println("2. «��");
        System.out.println();
        System.out.println("3. ������");
        System.out.println();
        System.out.println("4. ���꽽");
        System.out.println();
        System.out.println("5. ���� �޴���");
        System.out.println();
        System.out.println("6. ���α׷� ����");
        System.out.println();
        // return 0;
        int menu = 0;
        do {
            try {
                menu = Integer.parseInt(sc.nextLine());
                if (1 <= menu && menu <= 6) {
                    break;
                } else {
                    throw new Exception("�޴� ���� ��ȣ�� �߸� �Ǿ����ϴ�");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println("�޴� 1~6������ �Է�");
            }
        } while (true);
        // ���Ⱑ ����ƴٴ� ���� ����ڰ� 1~6���� ��ȣ �߿��� �ϳ��� ������ ��
        return menu;
    }
    // �޴� ���� �Լ�
    static void decision(String s, int p) {
        System.out.printf("%s��(��) %d�� �Դϴ�.\n", s, p);
        System.out.printf("%s��(��) �����Ͻðڽ��ϱ�?\n", s);
        System.out.println("��(1), �ƴϿ�(2) �Է��� �ּ���.");
        int d;
        do {
            try {
                d = Integer.parseInt(sc.nextLine());
                if (1 <= d && d <= 2) {
                    break; // whileŻ��( 1<= menu <=4)
                } else {
                    throw new Exception("��ȣ�� �߸� �Ǿ����ϴ�");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println("��(1), �ƴϿ�(2) �Է��� �ּ���.");
            }
        } while (true);
        if (d == 1) {
            System.out.printf("%s�� �ֹ��ϼ̽��ϴ�. �����մϴ�.\n", s);
            System.exit(0);
        } else {
            System.out.println("�޴��� �ٽ� �����ϼ���.");
        }
    }
}