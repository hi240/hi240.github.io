
public class Ex06_Operation {

	public static void main(String[] args) {
		int sum = 0;
		// ���Կ����� : += -=, *=, ....
		sum += 1;// sum = sum + 1;
		sum -= 1;// sum = sum - 1;
		System.out.println("sum:" + sum);

		// ������ ���� ����
		// ���� : A+ A- B+ B- .... F
		// ������ ���� : 94��

		// �Ǵܱ��� : 90�̻��̳� ... A
		// �׷��� 95�̻��̳� ... A+
		// �ƴѵ� ... A-

		int score = 92;
		String grade = ""; // ���ڿ��� �ʱ�ȭ
		System.out.println("����� ������ : " + score);

		// ������� ����
		if (score >= 90) {
			grade = "A";
			/*
			 * if(score >= 95) { grade += "+"; //grade = grade + "+"; }else { grade += "-";
			 * //grade = grade + "-"; }
			 */
			grade = (score >= 95) ? (grade += "+") : (grade += "-");
		} else if (score >= 80) {
			grade = "B";
			if (score >= 85) {
				grade += "+"; // grade = grade + "+";
			} else {
				grade += "-"; // grade = grade + "-";
			}
		} else if (score >= 70) {
			grade = "C";
			if (score >= 75) {
				grade += "+"; // grade = grade + "+";
			} else {
				grade += "-"; // grade = grade + "-";
			}
		} else {
			grade = "F";
		}
		System.out.println("����� ������ : " + grade);

		// syso + Ctrl + space �ڵ��ϼ�

		// �ҽ� �����ϱ�
		// Ctrl + A >> Ctrl + shift + F (�ڵ�����)

		int data = 80;
		switch (data) {
		case 100:
			System.out.println("100�Դϴ�");
			break;
		case 90:
			System.out.println("90�Դϴ�");
			break;
		case 80:
			System.out.println("80�Դϴ�");
			break;
		default:
			System.out.println("default");
		}

		// break ���� ���� �Դϱ�.... (�ʿ信 ���� ����ϼ���)
		// break ���� �����ϴ� �� ���ĺ��� ��� ����

		data = 80;
		switch (data) {
		case 100:
			System.out.println("100�Դϴ�");
		case 90:
			System.out.println("90�Դϴ�");
		case 80:
			System.out.println("80�Դϴ�");
		default:
			System.out.println("default");

		}
		
		int month = 2;
		String res ="";
		switch(month) {
		case 1: 
		case 3: 
		case 5: 
		case 7: 
		case 8: 
		case 10: 
		case 12: res="31";
			break;  // �ϳ� �ϳ� �� res ���̰� break �ٿ��� ������ �ߺ��� �Ⱦ �̷��� ����
		
		case 4:
		case 6:
		case 9:
		case 11: res="30";
			break;
		
		case 2: res="29";
			break;
		default: res="�� �����Ͱ� �ƴմϴ�";			
		}
		System.out.println(month + "���� �ϼ��� " + res);
		
		//���� (������ : ������ ���Ⱚ)
		//https://docs.oracle.com/javase/8/docs/api/index.html
		//�˻�
		//java.lang.Math (Math Ŭ����)
		//Math.Random() �Լ� : ȣ�⿡ ���ؼ� ����
		//java ���������� default ������� ������ �־�� (java.lang) >> ���� >> import java.lang.*
		//Math.random();
		//static : ��ü �������� �ʾƵ� ��� ���� (�Լ�)
		// greater than or equal to 0.0 and less than 1.0
		//��� : double �Ǽ� : 0.0 <= random < 1.0
		//kr.or.bit.Emp ��Ģ������
		System.out.println("Math.random() : " + Math.random());
		System.out.println("Math.random() * 10 : " + Math.random() * 10);
		//0~9������ ������
		System.out.println("(int)(Math.random() * 10) : " + (int)(Math.random() * 10));
		//1~10������ ������
		System.out.println("(int)(Math.random() * 10) : " + (((int)(Math.random() * 10) +1)*100));
	
		
		
	
		
			
		
		
		
		
		
		
	}
}
