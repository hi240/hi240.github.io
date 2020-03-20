import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/*Set인터페이스를 구현하는 클래스
 *Set은 원 안에 들어가세요.
 *데이터 순서 보장(X) 중복(X): 순서가 없고, 중복을 허락하지 않는 데이터 집합..set
 *구현하는 클래스: HashSet, TreeSet
 */
public class Ex09_Set_Interface {

	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(1); //.add함수를 써도 되는지 어떻게 알았냐? 표준화된 interface덕분에 재사용할 수 있었던것
		hs.add(100);
		boolean bo2 = hs.add(55);
		System.out.println(bo2);
		System.out.println(hs.toString());
		bo2=hs.add(1);          //set계열은 중복 불가 보장함.
		System.out.println(bo2);//false 문지기가 중복막음.
		System.out.println(hs.toString());
		hs.add(2);
		System.out.println(hs.toString()); //출력순서 보장 xxx
		
		HashSet<String> hs2=new HashSet<String>();
		hs2.add("b");
		hs2.add("A");
		hs2.add("F");
		hs2.add("c");
		hs2.add("z");
		hs2.add("A");
		hs2.add("A");
		hs2.add("A");
		System.out.println(hs2.toString());
		
		String[] obj= {"A","B","C","D","B","A"}; //배열을 hashSet에 넣기.
		HashSet<String> hs3= new HashSet<String>();
		for(int i=0;i<obj.length;i++) {
			hs3.add(obj[i]);
		}
		System.out.println(hs3.toString()); //[A,B,C,D]
		
		//HASHSET을 사용해서 1~45까지 난수  6개를 넣으세요.
		
		HashSet<Integer> lotto= new HashSet<Integer>();
		for(int i=0;lotto.size()<6;i++) {
			int j=(int)(Math.random() * 45) + 1;
			lotto.add(j);
		}
		System.out.println(lotto.toString());
		//while전환
		Set set2=new HashSet();   //set이라는 인터페이스도 iterator를 구현하고 있다.
		while(set2.size()<6) {
			int j=(int)(Math.random() * 45) + 1;
			set2.add(j);
		}
		System.out.println(set2.toString());
		
		HashSet<String> set3 = new HashSet<String>();
		set3.add("AA");
		set3.add("DD");
		set3.add("ABC");
		set3.add("FFFF");
		System.out.println("ㄴ"+set3.toString());
		
		Iterator<String> s= set3.iterator();
		while(s.hasNext()) {
			System.out.println("ㅈ"+s.next());
		}
		
		//몰라서 문제안돼요!
		//순서가 없는 set의 성질 상 순서를 만들라면 array로 바꿔줘야한다.
		//Collections.sort(List<T>);
		//sort 함수의 parameter로 List인터페이스를 구현한 객체만 올 수 있다.
		//Vector,Stack,Arraylist 등 !! 저장공간이 배열이기 때문에 정렬이 가능하다~
		//그러나! set 놈들은 순서가 없기 때문에 정렬이 안된다 그래서 못씀.
		List list = new ArrayList(set3); //Collection 부모가 자식객체인 hashSet객체의 주소를 주게된 것.
		System.out.println("before 무작위: "+list.toString());
		Collections.sort(list); //얘를 뽑아서 n번에 얘를 뽑아서 n번에 가 가능해짐.
		System.out.println("after 정렬 후: "+list.toString());
		Collections.reverse(list);
		System.out.println(list.toString());
		//총정리: set 인터페이스를 구현하고 있는 hashset은 순서가 없는, 중복되지 않는 데이터를 다룰수 있다.(ex:로또번호)
		
	}

}
