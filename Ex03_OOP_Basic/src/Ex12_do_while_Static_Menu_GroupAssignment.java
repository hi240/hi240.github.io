import java.util.Scanner;
class FoodGroup {
    String group1, group2, group3;
    FoodGroup() {
        this("한식", "양식");
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
        this("김치찌개", 5000, "된장찌개", 5000);
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
    // 초기 메뉴 화면 함수
    static int displayMenu(String menu1, String menu2, String menu3) {
        System.out.println("****************");
        System.out.println("****점심 메뉴*****");
        System.out.println("1. " + menu1);
        System.out.println();
        System.out.println("2. " + menu2);
        System.out.println();
        System.out.println("3. " + menu3);
        System.out.println();
        System.out.println("4. 나가기");
        System.out.println();
        // return 0;
        int menu = 0;
        do {
            try {
                menu = Integer.parseInt(sc.nextLine());
                if (1 <= menu && menu <= 4) {
                    break; // while탈출( 1<= menu <=4)
                } else {
                    throw new Exception("메뉴 선택 번호가 잘못 되었습니다");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println("메뉴 1~4번까지 입력");
            }
        } while (true);
        return menu;
    }

    static int FMenu(String menuGruop, String menu1, String menu2, String menu3, String menu4) {
        System.out.println("****************");
        System.out.println("****" + menuGruop + "메뉴*****");
        System.out.println("1. " + menu1);
        System.out.println();
        System.out.println("2. " + menu2);
        System.out.println();
        System.out.println("3. " + menu3);
        System.out.println();
        System.out.println("4. " + menu4);
        System.out.println();
        System.out.println("5. 이전 메뉴로");
        System.out.println();
        System.out.println("6. 프로그램 종료");
        System.out.println();
        // return 0;
        int menu = 0;
        do {
            try {
                menu = Integer.parseInt(sc.nextLine());
                if (1 <= menu && menu <= 6) {
                    break;
                } else {
                    throw new Exception("메뉴 선택 번호가 잘못 되었습니다");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println("메뉴 1~6번까지 입력");
            }
        } while (true);
        // 여기가 실행됐다는 것은 사용자가 1~6까지 번호 중에서 하나를 선택한 것
        return menu;
    }

    public static void main(String[] args) {
        FoodGroup fGroup = new FoodGroup("한식", "양식", "중식");
        FoodMenu kMenu = new FoodMenu("김치찌개", 5000, "된장찌개", 5000, "돌솥비빔밥", 4500, "제육볶음", 6000);
        FoodMenu wMenu = new FoodMenu("돈까스", 6000, "피자", 10000, "스파게티", 8000, "햄버거", 5000);
        FoodMenu cMenu = new FoodMenu("짜장면", 5000, "짬뽕", 5000, "볶음밥", 7000, "유산슬", 20000);
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
                        System.out.println("초기 메뉴로 돌아갑니다");
                        break outer;
                    case 6: {
                        System.out.println("프로그램 종료");
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
                        System.out.println("초기 메뉴로 돌아갑니다");
                        break outer;
                    case 6: {
                        System.out.println("프로그램 종료");
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
                        System.out.println("초기 메뉴로 돌아갑니다");
                        break outer;
                    case 6: {
                        System.out.println("프로그램 종료");
                        System.exit(0);
                    }
                    }
                }
                break;
            }
            case 4:
                System.out.println("프로그램 종료");
                System.exit(0);
            }
        }
    }
    static int wFood() {
        System.out.println("****************");
        System.out.println("****양식 메뉴*****");
        System.out.println("1. 돈까스");
        System.out.println();
        System.out.println("2. 피자");
        System.out.println();
        System.out.println("3. 스파게티");
        System.out.println();
        System.out.println("4. 햄버거");
        System.out.println();
        System.out.println("5. 이전 메뉴로");
        System.out.println();
        System.out.println("6. 프로그램 종료");
        System.out.println();
        // return 0;
        int menu = 0;
        do {
            try {
                menu = Integer.parseInt(sc.nextLine());
                if (1 <= menu && menu <= 6) {
                    break;
                } else {
                    throw new Exception("메뉴 선택 번호가 잘못 되었습니다");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println("메뉴 1~6번까지 입력");
            }
        } while (true);
        // 여기가 실행됐다는 것은 사용자가 1~6까지 번호 중에서 하나를 선택한 것
        return menu;
    }
    static int cFood() {
        System.out.println("****************");
        System.out.println("****중식 메뉴*****");
        System.out.println("1. 짜장면");
        System.out.println();
        System.out.println("2. 짬뽕");
        System.out.println();
        System.out.println("3. 볶음밥");
        System.out.println();
        System.out.println("4. 유산슬");
        System.out.println();
        System.out.println("5. 이전 메뉴로");
        System.out.println();
        System.out.println("6. 프로그램 종료");
        System.out.println();
        // return 0;
        int menu = 0;
        do {
            try {
                menu = Integer.parseInt(sc.nextLine());
                if (1 <= menu && menu <= 6) {
                    break;
                } else {
                    throw new Exception("메뉴 선택 번호가 잘못 되었습니다");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println("메뉴 1~6번까지 입력");
            }
        } while (true);
        // 여기가 실행됐다는 것은 사용자가 1~6까지 번호 중에서 하나를 선택한 것
        return menu;
    }
    // 메뉴 선택 함수
    static void decision(String s, int p) {
        System.out.printf("%s은(는) %d원 입니다.\n", s, p);
        System.out.printf("%s을(를) 선택하시겠습니까?\n", s);
        System.out.println("네(1), 아니오(2) 입력해 주세요.");
        int d;
        do {
            try {
                d = Integer.parseInt(sc.nextLine());
                if (1 <= d && d <= 2) {
                    break; // while탈출( 1<= menu <=4)
                } else {
                    throw new Exception("번호가 잘못 되었습니다");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println("네(1), 아니오(2) 입력해 주세요.");
            }
        } while (true);
        if (d == 1) {
            System.out.printf("%s를 주문하셨습니다. 감사합니다.\n", s);
            System.exit(0);
        } else {
            System.out.println("메뉴를 다시 선택하세요.");
        }
    }
}