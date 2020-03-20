import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Ex10_Set_TreeSet {

	public static void main(String[] args) {
		//Set ��������(x),�ߺ�(x)
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
		
		//HashSet *���������� Ź����*
		//HashSet Ȯ�� > LinkedHashSet(��������) > Linked(�ּ�:node)
		Set <String> hs2=new LinkedHashSet<String>();//������ �����ַ���..�����ε� �θ�Ŭ���� ���� ��������.
		hs2.add("B");
		hs2.add("A");
		hs2.add("F");
		hs2.add("K");
		hs2.add("G");
		hs2.add("D");
		hs2.add("P");
		hs2.add("A");		
		System.out.println(hs2.toString()); //�Է� ������ �°� ���.
		//���ĵȴ� (��������, ��������)�� ������ �����ȴ� (�Է��ϴ� ����)�� �ٸ���.
		
		/*
		TreeSet *���Ŀ� Ź��*
		�ڷᱸ�� ���: ����(X),�ߺ�(X),����(O)
		�˻��ϰų� ������ �ʿ�� �ϴ� ������ ����
		ex)�ζ�
		1.����Ʈ�� ������ ������ �ִ�.
		2.�����Ͱ� ����� �� �̹� ���ĵȴ�.
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
