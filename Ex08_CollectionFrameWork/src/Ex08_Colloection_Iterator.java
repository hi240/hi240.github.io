import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/*Collection Framework
������ �ڿ��� ���ؼ� ���������� �����ؼ� ���� �����ϴ� ǥ���� ����
Iterator �������̽�
1.hasNext(),Next() �̷� �̸����� �����ض�..(����)
2.collection {public Iterator iterator();} > list�� ��ӹް�> ArrayList�� ����
hasNext(),Next(),remove(),iterator() �� �����Ǹ� ���� �����ߴ�.
3. ListIterator : �ڷ� �� �� �ִ�. ��椷�� ����..

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

	//Collection �̾߱��ϴ� ǥ��ȭ�� ��¹��
	Iterator it = list.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	ArrayList<Integer> intlist = new ArrayList<Integer>();
	intlist.add(44);
	intlist.add(55);
	intlist.add(66);
	
	Iterator<Integer> list2=intlist.iterator(); //�ݵ�� arraylist�� ������ Ÿ������ iterator��.

	while(list2.hasNext()) {
		System.out.println(list2.next());
	}
	for(int i=0;i<intlist.size();i++) {
		System.out.println(intlist.get(i));
	}
	//�Ϲ� for������ ������ ��� ����, ������ for���� �ȵ�!
	for(int i=intlist.size()-1;i>=0;i--) {
		System.out.println(intlist.get(i));
	}

    //Iterator�� ������ �Ұ���.
	
	//������ ��ȸ (����: ������ --> �ٽ� --> ������)
	//�߾Ƚ��..
	System.out.println("******");
	ListIterator<Integer> li2= intlist.listIterator();
	while(li2.hasNext()) {
		System.out.println(li2.next());
	}
	while(li2.hasPrevious()) {
		System.out.println(li2.previous());
	}
			//���� �߿����� �ʾƿ�..
	
	
	}
}
