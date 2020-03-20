import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/*Collection Framework
나열된 자원에 대해서 순차적으로 접근해서 값을 리턴하는 표준을 정의
Iterator 인터페이스
1.hasNext(),Next() 이런 이름으로 구현해라..(강제)
2.collection {public Iterator iterator();} > list가 상속받고> ArrayList가 구현
hasNext(),Next(),remove(),iterator() 를 재정의를 통해 구현했다.
3. ListIterator : 뒤로 갈 수 있다. 양방ㅇ향 가능..

*/
public class Ex08_Colloection_Iterator {

	public static void main(String[] args) {
	ArrayList list = new ArrayList();
	list.add(100);
	list.add(200);
	list.add(300);
	for(int i=0;i<list.size();i++) {
		System.out.println(list.get(i));
	}

	//Collection 이야기하는 표준화된 출력방식
	Iterator it = list.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	ArrayList<Integer> intlist = new ArrayList<Integer>();
	intlist.add(44);
	intlist.add(55);
	intlist.add(66);
	
	Iterator<Integer> list2=intlist.iterator(); //반드시 arraylist의 강제한 타입으로 iterator도.

	while(list2.hasNext()) {
		System.out.println(list2.next());
	}
	for(int i=0;i<intlist.size();i++) {
		System.out.println(intlist.get(i));
	}
	//일반 for문으로 역방향 출력 가능, 개선된 for문은 안됨!
	for(int i=intlist.size()-1;i>=0;i--) {
		System.out.println(intlist.get(i));
	}

    //Iterator도 역방향 불가능.
	
	//역방향 조회 (조건: 순방향 --> 다시 --> 역방향)
	//잘안써요..
	System.out.println("******");
	ListIterator<Integer> li2= intlist.listIterator();
	while(li2.hasNext()) {
		System.out.println(li2.next());
	}
	while(li2.hasPrevious()) {
		System.out.println(li2.previous());
	}
			//별로 중요하진 않아요..
	
	
	}
}
