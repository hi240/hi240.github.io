
public class Ex05_Operation {

	public static void main(String[] args) {
		int result = 100 / 100;
		System.out.println(result);

		result = 13 / 2; // 몫
		System.out.println(result);

		// 나머지를 구하는 연산자(%)
		result = 13 % 2;
		System.out.println(result);

		// 증가, 감소 (증가감 연산자 : ++, --) 1씩 증가, 1씩 감소
		int i = 10;
		// i= i + 1;
		++i; // 전치증가
		System.out.println("전치 i : " + i);
		i++; // 후치증가
		System.out.println("후치 i : " + i);
		// 변수 혼자 (전치, 후치 의미 없다)

		// Point (연산자 전치, 후치 성질)
		int i2 = 5;
		int j2 = 4;

		int result2 = i2 + ++j2; // 전치 먼저 진행
		System.out.println("result2 : " + result2 + " j2 : " + j2);
		// result2 : 10 j2 : 5 i2=5

		result2 = i2 + j2++; // 앞에 + 먼저 진행하고 그 후에 후치
		System.out.println("result2 : " + result2 + " j2 : " + j2);
		// result2 : 10 j2 : 6 i2=5

		// Today Point
		// 자바의 연산 규칙
		// ****[정수]의 모든 연산은 [int] 변환 후 처리 됩니다.****
		// byte + byte => 컴파일러가 int + int 변환해서 =>
		byte b = 100; // -128 ~ 127
		byte c = 1;
		// byte d = b + c;
		// byte d = (byte)(b + c); //손실
		int d = b + c;
		System.out.println("d : " + d);

		// byte + short => 컴파일러가 int + int
		// char + char => 컴파일러가 int + int
		// 연산처리시
		// point : 정수연산에 int 보다 작은 타입은 int 변환 (long 제외)
		// (byte, char, short 연산 -> int)

		// byte + short -> int + int
		// char + int -> int + int
		// int + long -> long + long 큰 타입을 따라감

		// 정수 + 실수 > 타입크기와 상관없이 > 실수 승자

		long ll = 1000000000000L;
		float ff = 1.2f;
		// long fresult = (long)(ll + ff); 결과값 손실옴
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
		System.out.println("정수값만 출력 : " + result5);

		char c2 = '!'; // char 정수 타입
		char c3 = '!';

		int result6 = c2 + c3; // int + int
		System.out.println("result6 : " + result6);
		System.out.println((char) (result6)); // 66 값이 아스키 코드표 문자 > B

		// 제어문
		// 중소기업의 시험문제 (구구단 출력) >> 응용 별찍기 (삼각형)

		int sum = 0;
		// int j = 100; 같은 이름으로 선언x
		for (int j = 1; j <= 100; j++) {
			// System.out.println("j : " + j);
			if (j % 2 == 0) {
				// System.out.println(j);
				// sum = sum + j;
				sum += j; // 대입연산자
			}
		}
		System.out.println(sum);
		// System.out.println(j); for문 실행되면 생성되었다가 for문 끝나면 사라집니다...

		// == 연산자 (값을 비교하는 연산자)
		if (10 == 10.0f) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}

		// ! 부정 연산자
		if ('A' != 65) { // 같지 않니
			System.out.println("어 같지 않아");
		} else {
			System.out.println("어 같은 값이야"); //
		}

		// 암기하자 (Today Point)
		// 삼항 연산자
		int p = 10;
		int k = -10;
		int result8 = (p == k) ? p : k;
		System.out.println("result8 : " + result8);

		// 삼항 연산자는 제어문 if
		if (p == k) {
			result8 = p;
		} else {
			result8 = k;
		}
		System.out.println("result8 : " + result8);
		
		//진리표
		/*
		 논리연산
		 0 : false
		 1 : true
		 
		 0, 1 조합 할수 있는 가지수 4가지
		 	   OR	 AND
		 0 0    0     0
		 0 1    1     0
		 1 0    1     0
		 1 1    1     1
		 
		 Oracle (sql)
		 
		 select *
		 from emp
		 where empno = 1000 and sal > 2000;  //그리고 (둘다 참인 조건)
		 
		 select *
		 from emp
		 where empno = 1000 or sal > 2000;  //또는, 이거나 (둘중에 하나만 참이어도 만족)
		 
		 
		 연산자
		 |  or 연산자
		 &  and 연산자
		 
		 0 과 1 로 변환해서 bit 연산
		 
		 || 논리연산 (OR)
		 && 논리연산 (AND)		 
		 */
		int x = 3;
		int y = 5;
		System.out.println("x|y :" +(x|y)); // 7
		//십진수 -> 2진수 (0,1)
		//128 64 32 16 8 4 2 1
		//             0 0 1 1  >> 십진수 3은 2진수 0011
		//             0 1 0 1  >> 십진수 5는 2진수 0101
		//OR           0 1 1 1  >> 4 + 2 + 1 > 7
		//AND          0 0 0 1  >> 1 > 1
		System.out.println("x&y :" + (x&y)); //1     영상편집에선 중요하게 쓰이지만 웹에서는 쓸 이유 없다.
		
		//Today Point (&&(and), ||(or))
		//if(10 > 0 && -1 > 1 && 100 > 2 && 1 > -1 ... 10개) {실행문} 앞쪽만 보고 실행
		//if(10 > 0 || -1 > 1 || 100 > 2 || 1 > -1 ... 10개) {실행문} 앞쪽에서 하나만 true 나와도 끝남
	}

}
