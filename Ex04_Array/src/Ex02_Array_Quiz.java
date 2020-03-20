
public class Ex02_Array_Quiz {

	public static void main(String[] args) {

		// 수학과 학생들의 기말고사 시험점수..
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
		 * 제어문을 사용해서 max라는 변수에 시험접수 최대값을 넣고,min에 최소값을 넣으세용 출력되는 결과는 max=97,min=54
		 */

		System.out.println("max는" + max);
		System.out.println("min은" + min);

		int[] number = new int[10];
		// 10개 방의 값을 1~10까지 값으로 초기화 하세요.
		// number[0] >> 1 , number[9] >>10
		for (int i = 0; i < number.length; i++) {
			number[i] = i + 1;
			System.out.println(number[i]);
		}

		// 어느 학생의 시험점수 (5과목)
		// 1.총 과목 수를 구하세용.
		// 2.과목의 합을 구하세용.
		// 3.과목의 평균을 구하세용.
		// 4.단, 2번 3번 문제는 하나의 for문으로 해결하세용.

		int sum = 0;
		float average = 0f;
		int[] jumsu = { 100, 55, 90, 60, 78 };
		System.out.println("총 과목 수: " + jumsu.length);
		for (int i = 0; i < jumsu.length; i++) {
			sum += jumsu[i];
			if (i == jumsu.length - 1) {
				average = (float) sum / jumsu.length;
			}
		}
		System.out.println("과목의 합: " + sum + " 평균: " + average);

		// 랜덤수
		int[] lotto = new int[6]; // 배열

		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = (int) (Math.random() * 45 + 1); // 난수생성.
			for (int j = 0; j < i; j++) {
				if (lotto[i] == lotto[j]) {
					i--; // 이걸 이해할것! 다시 그 전 배열 칸으로 돌아가서, 난수를 다시 대입시킨다.
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
