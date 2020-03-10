
public class Ex05_Operation {

	public static void main(String[] args) {
		int result = 100 / 100;
		System.out.println(result);

		result = 13 / 2; // ��
		System.out.println(result);

		// �������� ���ϴ� ������(%)
		result = 13 % 2;
		System.out.println(result);

		// ����, ���� (������ ������ : ++, --) 1�� ����, 1�� ����
		int i = 10;
		// i= i + 1;
		++i; // ��ġ����
		System.out.println("��ġ i : " + i);
		i++; // ��ġ����
		System.out.println("��ġ i : " + i);
		// ���� ȥ�� (��ġ, ��ġ �ǹ� ����)

		// Point (������ ��ġ, ��ġ ����)
		int i2 = 5;
		int j2 = 4;

		int result2 = i2 + ++j2; // ��ġ ���� ����
		System.out.println("result2 : " + result2 + " j2 : " + j2);
		// result2 : 10 j2 : 5 i2=5

		result2 = i2 + j2++; // �տ� + ���� �����ϰ� �� �Ŀ� ��ġ
		System.out.println("result2 : " + result2 + " j2 : " + j2);
		// result2 : 10 j2 : 6 i2=5

		// Today Point
		// �ڹ��� ���� ��Ģ
		// ****[����]�� ��� ������ [int] ��ȯ �� ó�� �˴ϴ�.****
		// byte + byte => �����Ϸ��� int + int ��ȯ�ؼ� =>
		byte b = 100; // -128 ~ 127
		byte c = 1;
		// byte d = b + c;
		// byte d = (byte)(b + c); //�ս�
		int d = b + c;
		System.out.println("d : " + d);

		// byte + short => �����Ϸ��� int + int
		// char + char => �����Ϸ��� int + int
		// ����ó����
		// point : �������꿡 int ���� ���� Ÿ���� int ��ȯ (long ����)
		// (byte, char, short ���� -> int)

		// byte + short -> int + int
		// char + int -> int + int
		// int + long -> long + long ū Ÿ���� ����

		// ���� + �Ǽ� > Ÿ��ũ��� ������� > �Ǽ� ����

		long ll = 1000000000000L;
		float ff = 1.2f;
		// long fresult = (long)(ll + ff); ����� �սǿ�
		// System.out.println(fresult);
		float fresult = ll + ff;
		System.out.println(fresult);

		float num2 = 10.45f;
		int num3 = 20;
		// num2 + num3
		// float + int >> float + float

		// float result5 = num2 + num3;
		// System.out.println(result5);

		int result5 = (int) (num2 + num3);
		System.out.println("�������� ��� : " + result5);

		char c2 = '!'; // char ���� Ÿ��
		char c3 = '!';

		int result6 = c2 + c3; // int + int
		System.out.println("result6 : " + result6);
		System.out.println((char) (result6)); // 66 ���� �ƽ�Ű �ڵ�ǥ ���� > B

		// ���
		// �߼ұ���� ���蹮�� (������ ���) >> ���� ����� (�ﰢ��)

		int sum = 0;
		// int j = 100; ���� �̸����� ����x
		for (int j = 1; j <= 100; j++) {
			// System.out.println("j : " + j);
			if (j % 2 == 0) {
				// System.out.println(j);
				// sum = sum + j;
				sum += j; // ���Կ�����
			}
		}
		System.out.println(sum);
		// System.out.println(j); for�� ����Ǹ� �����Ǿ��ٰ� for�� ������ ������ϴ�...

		// == ������ (���� ���ϴ� ������)
		if (10 == 10.0f) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}

		// ! ���� ������
		if ('A' != 65) { // ���� �ʴ�
			System.out.println("�� ���� �ʾ�");
		} else {
			System.out.println("�� ���� ���̾�"); //
		}

		// �ϱ����� (Today Point)
		// ���� ������
		int p = 10;
		int k = -10;
		int result8 = (p == k) ? p : k;
		System.out.println("result8 : " + result8);

		// ���� �����ڴ� ��� if
		if (p == k) {
			result8 = p;
		} else {
			result8 = k;
		}
		System.out.println("result8 : " + result8);
		
		//����ǥ
		/*
		 ������
		 0 : false
		 1 : true
		 
		 0, 1 ���� �Ҽ� �ִ� ������ 4����
		 	   OR	 AND
		 0 0    0     0
		 0 1    1     0
		 1 0    1     0
		 1 1    1     1
		 
		 Oracle (sql)
		 
		 select *
		 from emp
		 where empno = 1000 and sal > 2000;  //�׸��� (�Ѵ� ���� ����)
		 
		 select *
		 from emp
		 where empno = 1000 or sal > 2000;  //�Ǵ�, �̰ų� (���߿� �ϳ��� ���̾ ����)
		 
		 
		 ������
		 |  or ������
		 &  and ������
		 
		 0 �� 1 �� ��ȯ�ؼ� bit ����
		 
		 || ������ (OR)
		 && ������ (AND)		 
		 */
		int x = 3;
		int y = 5;
		System.out.println("x|y :" +(x|y)); // 7
		//������ -> 2���� (0,1)
		//128 64 32 16 8 4 2 1
		//             0 0 1 1  >> ������ 3�� 2���� 0011
		//             0 1 0 1  >> ������ 5�� 2���� 0101
		//OR           0 1 1 1  >> 4 + 2 + 1 > 7
		//AND          0 0 0 1  >> 1 > 1
		System.out.println("x&y :" + (x&y)); //1     ������������ �߿��ϰ� �������� �������� �� ���� ����.
		
		//Today Point (&&(and), ||(or))
		//if(10 > 0 && -1 > 1 && 100 > 2 && 1 > -1 ... 10��) {���๮} ���ʸ� ���� ����
		//if(10 > 0 || -1 > 1 || 100 > 2 || 1 > -1 ... 10��) {���๮} ���ʿ��� �ϳ��� true ���͵� ����
	}

}
