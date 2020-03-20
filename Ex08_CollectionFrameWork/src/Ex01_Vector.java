import java.util.Vector;

/*ㅊ
Collection Framework
[다수의 데이터]를 다루는 표준화된 인터페이스를 구현하고 있는 클래스 집합

Collection 인터페이스 <-List(상속) <-----ArrayList(^^)...(구현)
                   <-Set (상속) <-----HashSet,TreeSet(구현)
Map 인터페이스 (Key,Value) <-----HashMap(^^)...(구현)
----------------------------------------------------------
List Interface(줄을 서시오)
:순서(번호표),중복(허용)>>내부적으로는 데이터(자료,객체)들을 배열로 관리한다. 배열[홍길동][홍길동][][]
1.Vector (구버전) > (멀티쓰레드)환경에서 동기화 > Lock(보호를 위해) > 성능 조금 떨어짐.. > 한강 화장실
Tip! MultiThread 란? : 함수 10개가 동시에 실행되고 싶다? Stack이 10개 있으면 됨. 그게 바로 Multi Thread
2.ArrayList (신버전) > (멀티쓰레드)환경에서 동기화 > Lock(옵션 기능)-> 성능을 고려해서 선택!Handling가능하면 진행,아니면 X

List인터페이스를 구현한 클래스 :: Vector, ArrayList
1. 이들은 반기를 들기위해, 배열의 크기를 동적으로 확장할 수 있다..확장과 축소가 가능> 사실은 배열의 재할당
2. 순서를 유지한다. 순서값으로 index사용. 중복값 허용
3. 내부적으로는 배열을 사용한다.
Size에 맞춰서 Capacity를 다시 만들어서 배열을 채우는 거~~~~~~~~~~~~~
setSize 함수를 써서 Capacity를 n개로 늘리면, 얘네는 Capacity를 2n로 늘린다.
clear 함수를 써서 원소들을 null로 만든다.

 */
public class Ex01_Vector {

	public static void main(String[] args) {
		Vector v = new Vector();
		System.out.println("초기 default 용량: "+v.capacity());
		v.add("AA");
		v.add("BB");
		v.add("AA");
		v.add(100);                      //object는 모든 타입의 부모타입이라 모든 타입 캐리가능.
		System.out.println(v.toString());
		
		//Array > length > 배열의 길이
		//List > size > 값의 길이 
		
		//Tip! 벡터 요즘은 별로 안씁니다.. 알아만 둘 것
		for(int i=0;i<v.size();i++) {
			//Array에서는 (Array : arr[i]..)
			System.out.println(v.get(i)); //get함수 외우세요~ 값을 갖고 옵니다. 배열의 인덱스 격.
		}
	
		for(Object obj : v) {       //Vector은 Object타입이다......
			System.out.println(obj);
		}
		//제너릭 : 타입을 강제해서 저장하는 배열! ex) String 만 담을 수 있는 그릇
		Vector<String> v2=new Vector<String>();
		v2.add("하이0");
		v2.add("하이1");
		v2.add("하이2");
		for(String s: v2) {
			System.out.println(s); //하이0하이1하이2
		}
		System.out.println(v2.toString()); //[하이0,하이1,하이2]
		System.out.println(v2.get(2)); //하이2
		System.out.println("size 데이터개수: "+v2.size()); //size 데이터개수:3
		System.out.println("Capacity: "+v2.capacity()); //Capacity:10
		
		Vector v3 = new Vector();
		System.out.println("Capacity: "+v3.capacity()); //Capacity:10
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		System.out.println("Capacity: "+v3.capacity());//Capacity:20
		System.out.println(v3.size());
		
		
	}
}
