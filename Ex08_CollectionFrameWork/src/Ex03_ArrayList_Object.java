//1. 벡터말고 2.3. 예제는 다 외워야합니다^^~~~~~~~~~~~~~~~~~~~~~~~~아니면 집가지마세요
import java.util.ArrayList;

import kr.or.bit.Emp;

public class Ex03_ArrayList_Object {

	public static void main(String[] args) {
        //사원 1명을 만드세요.
		Emp emp =new Emp(100,"김유신","대통령");
		System.out.println(emp.toString());
		
		//Array 고정배열
		//사원 2명 만드세요.
		Emp[] emplist = {new Emp(100,"김씨","일반인"),new Emp(200,"박씨","학생")};
		for(Emp e : emplist) {
			System.out.println(e);
		}
		
		//한명이 입사를 더했네요. 추가시키세요.
		//Collection
		ArrayList list = new ArrayList();
		list.add(new Emp(1,"강씨","IT"));
		list.add(new Emp(2,"홍씨","IT"));
		System.out.println(list);
		System.out.println(list.toString());
		System.out.println(list.get(0));
	
		//toString 활용하지 말고 사원 출력해보세요
	    for(int i=0;i<list.size();i++) {
	    	//Object obj = list.get(i); //이거는 그냥 명시하려고 한 코드 줄이다.
	    	//System.out.println(obj);
	    	Emp e = (Emp)list.get(i); //부모타입의 주소를 자식타입에게 주려면 자식타입에 맞게 downcasting 해야한다.
	    	System.out.println("이"+e.getEmpno()+"/"+e.getEname()+"/"+e.getJob());	
	    }
	    //tostring 사용하지말고 개선된 for문으로 출력해보세요.
	    for(Object obj: list) {
	    	Emp e = (Emp)obj;   //다운캐스팅을 해서 불러와야 get함수를 쓸 수 있으니까
	    	System.out.println(e.getEmpno()+"/"+e.getEname()+"/"+e.getJob());
	    }
	    
	    //제너릭 Generic (타입을 강제하기)
	    //Object라는 범용성의 불편함을 해소하기 위해.
	    ArrayList<Emp> list2=new ArrayList<Emp>(); //내가 가지는 방의 타입은 emp 타입
	    list2.add(new Emp(1,"A","IT"));
	    for(Emp e : list2) {
	    	System.out.println(e.getEmpno()+"/"+e.getEname()+"/"+e.getJob());
	    }
	    list2.add(new Emp(2,"New","New"));
	    
	}

}
