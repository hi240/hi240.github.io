
public class Ex02_Array_Quiz {

	public static void main(String[] args) {

		// ���а� �л����� �⸻���� ��������..
		int[] score = new int[] { 79, 88, 97, 54, 56, 95 };
		int max = score[0]; // max=79
		int min = score[0]; // min=79

		for (int i = 0; i < score.length; i++) {
			if (score[i] > max) {
				max = score[i];
			} else if (score[i] < min) {
				min = score[i];
			}

		}
		// max=(score[i] > max)? score[i]:max;
		// min=(score[i] < min)? score[i]:min;

		/*
		 * ����� ����ؼ� max��� ������ �������� �ִ밪�� �ְ�,min�� �ּҰ��� �������� ��µǴ� ����� max=97,min=54
		 */

		System.out.println("max��" + max);
		System.out.println("min��" + min);

		int[] number = new int[10];
		// 10�� ���� ���� 1~10���� ������ �ʱ�ȭ �ϼ���.
		// number[0] >> 1 , number[9] >>10
		for (int i = 0; i < number.length; i++) {
			number[i] = i + 1;
			System.out.println(number[i]);
		}

		// ��� �л��� �������� (5����)
		// 1.�� ���� ���� ���ϼ���.
		// 2.������ ���� ���ϼ���.
		// 3.������ ����� ���ϼ���.
		// 4.��, 2�� 3�� ������ �ϳ��� for������ �ذ��ϼ���.

		int sum = 0;
		float average = 0f;
		int[] jumsu = { 100, 55, 90, 60, 78 };
		System.out.println("�� ���� ��: " + jumsu.length);
		for (int i = 0; i < jumsu.length; i++) {
			sum += jumsu[i];
			if (i == jumsu.length - 1) {
				average = (float) sum / jumsu.length;
			}
		}
		System.out.println("������ ��: " + sum + " ���: " + average);

		// ������
		int[] lotto = new int[6]; // �迭

		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = (int) (Math.random() * 45 + 1); // ��������.
			for (int j = 0; j < i; j++) {
				if (lotto[i] == lotto[j]) {
					i--; // �̰� �����Ұ�! �ٽ� �� �� �迭 ĭ���� ���ư���, ������ �ٽ� ���Խ�Ų��.
					break;
				}
			}
		}

		for (int i = 0; i < lotto.length; i++) {
			for (int j = i + 1; j < lotto.length; j++) {
				if (lotto[i] < lotto[j]) {
					int tmp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = tmp;
				}
			}

		}
		for (int i = 0; i < lotto.length; i++) {
			System.out.printf(lotto[i] + " ");
		}
		System.out.println();
		// ���� �ߺ� �ȵǰ�, ������������ ����.
		int[] eunwoo = new int[5];
		for (int i = 0; i < eunwoo.length; i++) {
			eunwoo[i] = (int) (Math.random() * 40 + 1);
			for (int j = 0; j < i; j++) {
				if (eunwoo[j] == eunwoo[i]) {
					i--;
					break;
				}
			}
		}
		for (int i = 0; i < eunwoo.length; i++) {
		for (int j = i + 1; j < eunwoo.length; j++) {
				if (eunwoo[i] > eunwoo[j]) {
					int temp = eunwoo[i];
					eunwoo[i] = eunwoo[j];
					eunwoo[j] = temp;
				}
			}
		}
		for (int i = 0; i < eunwoo.length; i++) {
			System.out.printf(eunwoo[i] + " ");
		}

	}
}