package kr.or.bit;

//사원이라는 설계도

//사원의 정보를 담고 출력을 담당하는 함수를 가지는 설계
//class 155th { }

public class Emp { // class라고 붙으면 설계도라고 한다
	public int empno;
	// 정보를 담는 변수, 사원은 사번을 가지고 있다 (사번 : 숫자 데이터)

	public String ename; // 이름
	public String job; // 직종

	// 변수 > 정보(고유값)를 담을 수 있다 > 변화 (값) > instance variable -> member field
	private int data;
	// 캡슐화 : 자원을 보호하겠다
	// 직접할당을 막고 간접할당을 통해서 데이터 보호

	// 기능, 행위 정보 > 함수 > method > read
	public int getData() { //getter
		return data; // data 하는 member field 가 가지는 값을 돌려 줄거야
	}

	// 기능 > method > write
	public void setData(int input) { //setter    값만 넣어주고 끝남
		if (input < 0) {
			data = 0;
		} else {
			data = input;
		}

	}
	
	//캡슐화된 자원에 대해서 read, write (getter, setter) 함수를 생성한다
	
	//출력하는 기능(행위 정보 > 함수 > method)
	//함수는 반드시 호출에 의해서만 동작...
	public void getEmpInfo() {
		System.out.println(empno + "/" + ename + "/" + job);
	}

}

