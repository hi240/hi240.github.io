import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 * HashMap<k,v>
 * HashMap<String,String>
 * HashMap<Integer,String>
 * HashMap<String,Emp>
 * put("hong",new Emp())
 */

class Student{
	int kor=100;
	int math=50;
	int eng=20;
	String name;
	Student(String name,int kor, int math, int eng){
		this.name=name;
		this.kor=kor;
		this.math=math;
		this.eng=eng;
	}
}
//map으로 학생들 성적 관리하기.
//generic사용
public class Ex13_HashMap_Generic {
	public static void main(String[] args) {
		HashMap<String,Student> wow= new HashMap<String,Student>();
		wow.put("써",new Student("이서",90,100,95)); //이걸 출력해야되는데
		System.out.println("a"+wow);
	    Student aha= wow.get("써");
	    System.out.println("헝"+aha);
		
		
    HashMap<String,Student> sts=new HashMap<String, Student>();
    sts.put("hong",new Student("홍길동",100,50,30)); //출력해야될게 value녀석.
    sts.put("kim",new Student("김유신",50,100,60)); 
    Student std = sts.get("hong"); //해당하는 key값을 출력하려는데, 그에 맞는 타입에 넣어야 출력이 가능해서 Student!
    System.out.println(std.kor);
    System.out.println(std.math);

    //Tip 예외적으로,
    //Map안에 있는 key,value 모든 같이 출력
    Set set = sts.entrySet(); //key+"="+value를 조합해주는 함수이다.
    Iterator it = set.iterator();
    while(it.hasNext()) {
    	System.out.println(it.next()); //hong=Student@15db9742
    }
    //만약에 value가 Object라면..
    //외우세요그냥 이해하려하지마세요
    //Map.Entry라는 인터페이스 타입으로 반환받으면, getKey(),getValue() 제공받아요
    for(Map.Entry m : sts.entrySet()) {
    	System.out.println(m.getKey()+"/"+((Student)m.getValue()).name);
    }


	}

}






