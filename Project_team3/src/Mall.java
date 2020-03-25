import java.util.Scanner;

public class Mall {

    Scanner sc = new Scanner(System.in);
    CustomerManager customerManager = new CustomerManager();
    ProductsManager productsManager = new ProductsManager();
    Admin admin = new Admin();

    void program() {
        while (true) {
            switch (MainMenu()) {
            case 1: {
                this.loginProgram();

                break;
            }
            case 2: {
                this.signinProgram();
                break;
            }
            case 3: {
                System.exit(0);
            }

            }

        }
    }

    // ȸ������
    void signinProgram() {
        System.out.println("**ȸ�� ����**");
        System.out.println("ID�� �Է����ּ���");
        String id = sc.nextLine();
        String pwd = id;
        String name = id;
        String tel = id;
        String address = id;
        customerManager.signUp(id, pwd, name, tel, address); // ������� customer ��ü�� ����
        System.out.println(customerManager.customerList.toString());
    } // ȸ������ ��ġ�� �α��� ���� ȭ������ �����ؾ� �Ѵ�

    // �α���
    void loginProgram() {

        System.out.println("**�α���**");
        System.out.println("ID�� �Է����ּ���");
        String id = sc.nextLine();
        System.out.println("��й�ȣ�� �Է����ּ���");
        String pwd = sc.nextLine();
        if (admin.getId().equals(id) && admin.getPwd().equals(pwd)) {
            System.out.println("������ �α���");
            AdminProgram();

        }else if (customerManager.login(id, pwd) != null) {
            CustomerProgram();

        }else {
            System.out.println("��ġ�ϴ� ������ �����ϴ�.");
        }
    }

    void CustomerProgram() {

        outer: while (true) {
            switch (this.CustomerMenu()) {
            case 1: {
                System.out.println("**��ǰ��ȸ**");
                productsManager.add();
                productsManager.productsList();

                break;
            }
            case 2: {
                System.out.println("**��ٱ���**");
                CartProgram();
                break;
            }
            case 3: {
                System.out.println("**����������**");
                MyPageProgram();

                break;
            }

            case 4: {
                break outer; // return�ϸ� �ش��ϴ� ���� ���� �޼��� ���� Ż��
            }
            case 5: {
                System.exit(0);
            }

            }

        }

    }

    void AdminProgram() {

            outer: while (true) {
                switch (this.AdminMenu()) {
                case 1: {
                    System.out.println("**��ǰ ����Ʈ ��ȸ**");
                    productsManager.add();
                    productsManager.productsList();

                    break;
                }
                case 2: {
                    System.out.println("**��ǰ �߰�**");

                    break;
                }
                case 3: {
                    System.out.println("**��ǰ ����**");


                    break;
                }
                case 4: {
                    System.out.println("**��ǰ ��� ����**");


                    break;
                }
                case 5: {
                    System.out.println("**ȸ�� ����Ʈ ��ȸ**");

                    break;
                }

                case 6: {
                    break outer; // return�ϸ� �ش��ϴ� ���� ���� �޼��� ���� Ż��
                }
                case 7: {
                    System.exit(0);
                }

                }

            }

    }
    void CartProgram() {

        outer: while (true) {
            switch (this.MyPageMenu()) {
            case 1: {
                System.out.println("**��ٱ��� ����Ʈ**");

                break;
            }
            case 2: {
                System.out.println("**��ǰ ����**");
                
                break;
            }
            case 3: {
                System.out.println("**��ǰ ����**");
                break;
            }

            case 4: {
                break outer; // return�ϸ� �ش��ϴ� ���� ���� �޼��� ���� Ż��
            }
            case 5: {
                System.exit(0);
            }

            }

        }

    }
    
    void MyPageProgram() {

        outer: while (true) {
            switch (this.MyPageMenu()) {
            case 1: {
                System.out.println("**ȸ�� ���� ��ȸ**");
                productsManager.add();
                productsManager.productsList();

                break;
            }
            case 2: {
                System.out.println("**�ֹ� ����**");

                break;
            }
            case 3: {
                System.out.println("**��ٱ���**");
                break;
            }

            case 4: {
                break outer; // return�ϸ� �ش��ϴ� ���� ���� �޼��� ���� Ż��
            }
            case 5: {
                System.exit(0);
            }

            }

        }

    }

    // �ʱ� �޴�

    int MainMenu() {
        int menu = 0;
        do {
            try {
                System.out.println();
                System.out.println("***************************");
                System.out.println("*******VIP ���ý����*******");
                System.out.println("***************************");
                System.out.println("1. �α���");
                System.out.println();
                System.out.println("2. ȸ�� ����");
                System.out.println();
                System.out.println("3. �ý��� ����");
                System.out.println();
                menu = Integer.parseInt(sc.nextLine());
                if (1 <= menu && menu <= 3) {
                    return menu;
                } else {
                    throw new Exception("�޴� ���� ��ȣ�� �߸� �Ǿ����ϴ�");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println("<�Է� ����>");
                System.out.println("1~3���� �޴� �� �ϳ��� �����ϼ���");
            }
        } while (true);

    }

    // ���� �޴� ȭ��
    int CustomerMenu() {
        int menu = 0;
        do {
            try {
                System.out.println();
                System.out.println("*********************************");
                System.out.println("*****�α��� �޴�*****");
                System.out.println("*********************************");
                System.out.println("1. ��ǰ ����Ʈ ��ȸ");
                System.out.println();
                System.out.println("2. ��ٱ���");
                System.out.println();
                System.out.println("3. ����������");
                System.out.println();
                System.out.println("4. ���� �޴���");
                System.out.println();
                System.out.println("5. �ý��� ����");
                System.out.println();
                menu = Integer.parseInt(sc.nextLine());
                if (1 <= menu && menu <= 5) {
                    return menu;
                } else {
                    throw new Exception("�޴� ���� ��ȣ�� �߸� �Ǿ����ϴ�");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println("<�Է� ����>");
                System.out.println("1~5���� �޴� �� �ϳ��� �����ϼ���");
            }
        } while (true);

    }

    // ������ �޴� ȭ��
    int AdminMenu() {
        int menu = 0;
        do {
            try {
                System.out.println();
                System.out.println("*********************************");
                System.out.println("*****�α��� �޴�*****");
                System.out.println("*********************************");
                System.out.println("1. ��ǰ ����Ʈ ��ȸ");
                System.out.println();
                System.out.println("2. ��ǰ �߰�");
                System.out.println();
                System.out.println("3. ��ǰ ����");
                System.out.println();
                System.out.println("4. ��ǰ ��� ����");
                System.out.println();
                System.out.println("5. ȸ�� ���� ��ȸ");
                System.out.println();
                System.out.println("6. ���� �޴���");
                System.out.println();
                System.out.println("7. �ý��� ����");
                System.out.println();
                menu = Integer.parseInt(sc.nextLine());
                if (1 <= menu && menu <= 7) {
                    return menu;
                } else {
                    throw new Exception("�޴� ���� ��ȣ�� �߸� �Ǿ����ϴ�");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println("<�Է� ����>");
                System.out.println("1~5���� �޴� �� �ϳ��� �����ϼ���");
            }
        } while (true);

    }

    // ���������� �޴� ȭ��
    int MyPageMenu() {
        int menu = 0;
        do {
            try {
                System.out.println();
                System.out.println("*********************************");
                System.out.println("*****���� ������ �޴�*****");
                System.out.println("*********************************");
                System.out.println("1. ȸ�� ���� ��ȸ");
                System.out.println();
                System.out.println("2. �ֹ� ����");
                System.out.println();
                System.out.println("3. ��ٱ���");
                System.out.println();
                System.out.println("4. ���� �޴���");
                System.out.println();
                System.out.println("5. �ý��� ����");
                System.out.println();
                menu = Integer.parseInt(sc.nextLine());
                if (1 <= menu && menu <= 5) {
                    return menu;
                } else {
                    throw new Exception("�޴� ���� ��ȣ�� �߸� �Ǿ����ϴ�");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println("<�Է� ����>");
                System.out.println("1~5���� �޴� �� �ϳ��� �����ϼ���");
            }
        } while (true);

    }

    public static void main(String[] args) {

        Mall mall = new Mall();

        mall.program();

    }

}