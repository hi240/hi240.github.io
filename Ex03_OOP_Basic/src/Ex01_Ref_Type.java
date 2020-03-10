//import kr.or.bit.*; //해당 폴더를 다불러온다. 가독성이 떨어진다.
//import kr.or.bit.a; //a클래스
import kr.or.bit.BodyInfo;
import kr.or.bit.Emp;
import kr.or.bit.Person;

public class Ex01_Ref_Type {

	public static void main(String[] args) {
		

		//값타입(저장공간: 메모리)
		int i=100;
		i=200;
		System.out.println("i: "+i);

		//참조 타입
		Person person; //선언만 한 것.  ctrl + space누르면 속성나옴.
		Person person1 = new Person(); //person1 라는 변수에 주소값을 할당.
		System.out.println(person1); //kr.or.bit.Person@15db9742
		
		
		///초기값할당
		Person person2=null; //값이없다.null 보통 객체의 초기값으로 씀.
		System.out.println(person2);//변수는 있는 메모리를 가지고 있찌 않다
		//person2가 메모리를 가즌 방법.
		//person2=new Person(); <아파트를 지어 배정받는 방법.
		//person2=person; <같은 타입의 다른 애 주소를 할당하는 방법.
		person2=person1;
		System.out.println(person2==person1); //값도 같네.
		//우리가 만드는 모든 상수는 오브젝트를 상속받는다. 즉,
		//Object안에 있는 함수 같이 쓸 수 있다는 뜻.
		person2.name="홍길동";
		person2.age=100;
		person2.print();
		System.out.println(person1.name);
		
		Person myperson =new Person();
		myperson.name =  "이서";
		myperson.print();
		System.out.println(myperson.power);
		
		Emp emp= new Emp(); //클래스 emp 주소를 할당해줬다.

		emp.num=201523544;  //클래스 주소에 있는 속성을 구체화해준다.
		emp.name="차은우";
		emp.job="농부";
		emp.money=20000000;
		BodyInfo bodyinfo = new BodyInfo();
		emp.bodyinfo=bodyinfo; //주소값할당
		bodyinfo.height=200;
		bodyinfo.weight=87;

		System.out.println(emp+"/"+emp.bodyinfo);
		System.out.println(emp.num+emp.bodyinfo.height);
		
	}

}
