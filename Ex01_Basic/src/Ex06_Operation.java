
public class Ex06_Operation {

	public static void main(String[] args) {
		int sum = 0;
		// 대입연산자 : += -=, *=, ....
		sum += 1;// sum = sum + 1;
		sum -= 1;// sum = sum - 1;
		System.out.println("sum:" + sum);

		// 간단한 학점 계산기
		// 학점 : A+ A- B+ B- .... F
		// 데이터 점수 : 94점

		// 판단기준 : 90이상이냐 ... A
		// 그런데 95이상이냐 ... A+
		// 아닌데 ... A-

		int score = 92;
		String grade = ""; // 문자열의 초기화
		System.out.println("당신의 점수는 : " + score);

		// 학점계산 로직
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
		System.out.println("당신의 학점은 : " + grade);

		// syso + Ctrl + space 자동완성

		// 소스 정렬하기
		// Ctrl + A >> Ctrl + shift + F (자동정렬)

		int data = 80;
		switch (data) {
		case 100:
			System.out.println("100입니다");
			break;
		case 90:
			System.out.println("90입니다");
			break;
		case 80:
			System.out.println("80입니다");
			break;
		default:
			System.out.println("default");
		}

		// break 강제 사항 입니까.... (필요에 따라서 사용하세요)
		// break 조건 만족하는 그 이후부터 모두 실행

		data = 80;
		switch (data) {
		case 100:
			System.out.println("100입니다");
		case 90:
			System.out.println("90입니다");
		case 80:
			System.out.println("80입니다");
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
			break;  // 하나 하나 다 res 붙이고 break 붙여도 되지만 중복이 싫어서 이렇게 쓴다
		
		case 4:
		case 6:
		case 9:
		case 11: res="30";
			break;
		
		case 2: res="29";
			break;
		default: res="월 데이터가 아닙니다";			
		}
		System.out.println(month + "달의 일수는 " + res);
		
		//난수 (랜덤값 : 임의의 추출값)
		//https://docs.oracle.com/javase/8/docs/api/index.html
		//검색
		//java.lang.Math (Math 클래스)
		//Math.Random() 함수 : 호출에 의해서 실행
		//java 페이지에서 default 열어놓은 폴더가 있어요 (java.lang) >> 생략 >> import java.lang.*
		//Math.random();
		//static : 객체 생성하지 않아도 사용 가능 (함수)
		// greater than or equal to 0.0 and less than 1.0
		//결과 : double 실수 : 0.0 <= random < 1.0
		//kr.or.bit.Emp 원칙적으로
		System.out.println("Math.random() : " + Math.random());
		System.out.println("Math.random() * 10 : " + Math.random() * 10);
		//0~9까지의 정수만
		System.out.println("(int)(Math.random() * 10) : " + (int)(Math.random() * 10));
		//1~10까지의 정수만
		System.out.println("(int)(Math.random() * 10) : " + (((int)(Math.random() * 10) +1)*100));
	
		
		
	
		
			
		
		
		
		
		
		
	}
}
