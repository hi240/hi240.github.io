import kr.or.bit.Emp;

public class Ex06_Array2_basic {
public static void main (String[] args)
{
    //2차원 행과열
	//ex_ 영화관 예약 좌석배치'
	//추후과제..
	
	int[][] score = new int[3][2];
	System.out.println(score[0][0]);
	score[0][0] = 100;
	score[0][1] = 200;
	
	score[1][0] = 300;
	score[1][1] = 400;
	
	score[2][0] = 500;
	score[2][1] = 600;
	
	//행의 개수는 배열이름.length >score.length
	//열의 개수 : 배열이름[i].length
	//배열이름[0].length >> 0행의 열의 개수(*******)
	//중첩for문이랑 짞꿍.
	//for(int i =0;i<score.length;i++) {
	//	for(int j=0;j<score[i].length;i++) {
	//		System.out.printf("score[%d][%d]=%d\n",i,j,score[i][j]);
	//	}
	//	System.out.println();
	//}
		//Today Point ^^
	//개선된 for문, 향상된 for문
	//JAVA: for(Type 변수명: 배열 or Collection {실행구문}
	//C#:for(Type 변수명 in 배열 or Collection {실행구문}
	//JavaScript:for(Type 변수명 in 배열 or Collection){실행구문}
	
	int[] arr3= {5,6,7,8,9};
	for(int i=0;i<arr3.length;i++) {
		System.out.println(arr3[i]);
	}
	for(int val : arr3) {
		System.out.println(val);
	}
	String[] strarr = {"A","B","C","D","FFFF"};
	for(String val : strarr) {
		System.out.println(val);
	}
	
	Emp[] list = {new Emp(1,"A"),new Emp(2,"B"),new Emp(3,"C")};
	//개선된 for문을 사용해서 사번,이름 출력
	for(Emp val : list) {
		val.empInfoPrint();
	}
	//모닝 커피 퀴즈(3분)
	int[][] score3=new int[][] {
		{11,12},
		{13,14},
		{15,16},
	};
	//개선된 for문을 사용해서 배열값출력.

	for(int[] col : score3) {
		for(int val:col) {
			System.out.println(val);
		}
	}
	/* 내가한거ㅠㅠ
	for(int val: score3[0]) {
		System.out.println(val);	
	}
	for(int val: score3[1]) {
		System.out.println(val);
	}
	for(int val: score3[2]) {
		System.out.println(val);		
	}*/
 }
}
