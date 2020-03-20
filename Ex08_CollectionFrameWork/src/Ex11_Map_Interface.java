import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/*
 * Map �������̽�
 * (key�� ��)�� ���� ������ ���� �迭
 * ex)������� ��, ���� 02
 * key: �ߺ�(X)
 * value: �ߺ�(O)
 * 
 * generic �԰���
 * map�̶�� �������̽��� �����ϴ� Ŭ������
 * ������:HashTable(����Ⱦ��ϴ�)(����ȭ����)
 * �Ź���:HashMap(����ȭ�� �������� �ʾƿ�) : ������ ���
 * ���ݱ����� Thread�� ����� ������ ����ȭ�� �ǹ̰� ����.
 */
public class Ex11_Map_Interface {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("Tiger","1004");
		map.put("scott","1004");
		map.put("superman","1004");
		
		System.out.println(map.containsKey("scott")); //(O)
		System.out.println(map.containsKey("Tiger")); //��ҹ��� �����մϴ�. false
		System.out.println(map.containsValue(1004));  //(O)
		
		//Key �����ϸ� value�� ��´�.
		System.out.println(map.get("Tiger")); //value : 1004
		System.out.println(map.get("hong"));  //�ش�Ǵ� key�������� null ��ȯ
		System.out.println("d"+map.get(1004));
		
		map.put("Tige","1004"); // Tiger�� ���� �ٲٷ��� �ϴ±���?
		System.out.println("q"+map.get("Tige"));//key�� ������ value�� replace �Ѵ�.
		System.out.println(map.size());
		Object value = map.remove("superman");
		System.out.println("value: "+value);
		System.out.println(map.toString());

		Set set = map.keySet();//key�� ������ map�� ������ ����,�ߺ����� ������� �����ϱ�, setŸ������ �޴´�....
		Iterator it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
				
		Collection vlist = map.values();
		System.out.println(vlist);
		

		
	}

}
