import kr.or.bit.Emp;

public class Ex05_Array_Object {

	public static void main(String[] args) {
		//1. 사원 3명을 만드세요. (단 배열을 사용하세요)
		//1000, "홍길동"
		//2000,"김유신"
		//3000,"유관순"
		Emp[] emp = new Emp[3];

		emp[0]=new Emp();
		emp[0].setEmpno(1000);
		emp[0].setEname("홍길동");
		emp[1]=new Emp();
		emp[1].setEmpno(2000);
		emp[1].setEname("김유신");
		emp[2]=new Emp();
		emp[2].setEmpno(3000);
		emp[2].setEname("유관순");
		
		//2.사원3명의 사번과 이름을 출력하세요.

//		int[] arr = new int[] {new Emp(2,"d"),new Emp(3,"e")};
		for(int i=0;i<emp.length;i++)
		{
			emp[i].empInfoPrint();
		}
		//int[] arr= {10,20}
		Emp [] emp3= {new Emp(3,"발"),new Emp(4,"r")};
		for(int i=0;i<emp3.length;i++)
		{
			emp3[i].empInfoPrint();
		}
		
		
	}

}
