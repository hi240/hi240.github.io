import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/*
 * Map 인터페이스
 * (key와 값)의 쌍의 구조를 갖는 배열
 * ex)차은우와 나, 서울 02
 * key: 중복(X)
 * value: 중복(O)
 * 
 * generic 쌉가능
 * map이라는 인터페이스를 구현하는 클래스는
 * 구버전:HashTable(요새안씁니다)(동기화보장)
 * 신버전:HashMap(동기화를 강제하지 않아요) : 성능을 고려
 * 지금까지는 Thread를 배우지 않으면 동기화는 의미가 없다.
 */
public class Ex11_Map_Interface {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("Tiger","1004");
		map.put("scott","1004");
		map.put("superman","1004");
		
		System.out.println(map.containsKey("scott")); //(O)
		System.out.println(map.containsKey("Tiger")); //대소문자 구별합니다. false
		System.out.println(map.containsValue(1004));  //(O)
		
		//Key 제공하면 value값 얻는다.
		System.out.println(map.get("Tiger")); //value : 1004
		System.out.println(map.get("hong"));  //해당되는 key가없으면 null 반환
		System.out.println("d"+map.get(1004));
		
		map.put("Tige","1004"); // Tiger의 값을 바꾸려고 하는구나?
		System.out.println("q"+map.get("Tige"));//key가 같으면 value를 replace 한다.
		System.out.println(map.size());
		Object value = map.remove("superman");
		System.out.println("value: "+value);
		System.out.println(map.toString());

		Set set = map.keySet();//key의 집합인 map은 순서도 없고,중복값도 허용하지 않으니까, set타입으로 받는다....
		Iterator it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
				
		Collection vlist = map.values();
		System.out.println(vlist);
		

		
	}

}
