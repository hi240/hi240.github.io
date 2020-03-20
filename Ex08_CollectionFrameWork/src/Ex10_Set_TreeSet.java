import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Ex10_Set_TreeSet {

	public static void main(String[] args) {
		//Set 순서유지(x),중복(x)
		HashSet<String>hs = new HashSet<String>();
		hs.add("B");
		hs.add("A");
		hs.add("F");
		hs.add("K");
		hs.add("G");
		hs.add("D");
		hs.add("P");
		hs.add("A");	
		System.out.println(hs.toString());
		
		//HashSet *순서유지에 탁월한*
		//HashSet 확장 > LinkedHashSet(순서유지) > Linked(주소:node)
		Set <String> hs2=new LinkedHashSet<String>();//다형성 보여주려고..앞으로도 부모클래스 많이 받을거임.
		hs2.add("B");
		hs2.add("A");
		hs2.add("F");
		hs2.add("K");
		hs2.add("G");
		hs2.add("D");
		hs2.add("P");
		hs2.add("A");		
		System.out.println(hs2.toString()); //입력 순서에 맞게 출력.
		//정렬된다 (내림차순, 오름차순)와 순서가 유지된다 (입력하는 순서)는 다르다.
		
		/*
		TreeSet *정렬에 탁월*
		자료구조 모양: 순서(X),중복(X),정렬(O)
		검색하거나 정렬을 필요로 하는 데이터 집합
		ex)로또
		1.이진트리 구조를 가지고 있다.
		2.데이터가 저장될 때 이미 정렬된다.
		*/
		Set<Integer> lotto=new TreeSet<Integer>();
		for(int i=0;lotto.size()<6;i++) {
			lotto.add((int)(Math.random()*45+1));
		}
		Iterator<Integer> lo =lotto.iterator();
		while(lo.hasNext()) {
			System.out.println(lo.next());
		}

	}

}
