import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/*Set�������̽��� �����ϴ� Ŭ����
 *Set�� �� �ȿ� ������.
 *������ ���� ����(X) �ߺ�(X): ������ ����, �ߺ��� ������� �ʴ� ������ ����..set
 *�����ϴ� Ŭ����: HashSet, TreeSet
 */
public class Ex09_Set_Interface {

	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(1); //.add�Լ��� �ᵵ �Ǵ��� ��� �˾ҳ�? ǥ��ȭ�� interface���п� ������ �� �־�����
		hs.add(100);
		boolean bo2 = hs.add(55);
		System.out.println(bo2);
		System.out.println(hs.toString());
		bo2=hs.add(1);          //set�迭�� �ߺ� �Ұ� ������.
		System.out.println(bo2);//false �����Ⱑ �ߺ�����.
		System.out.println(hs.toString());
		hs.add(2);
		System.out.println(hs.toString()); //��¼��� ���� xxx
		
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
		
		String[] obj= {"A","B","C","D","B","A"}; //�迭�� hashSet�� �ֱ�.
		HashSet<String> hs3= new HashSet<String>();
		for(int i=0;i<obj.length;i++) {
			hs3.add(obj[i]);
		}
		System.out.println(hs3.toString()); //[A,B,C,D]
		
		//HASHSET�� ����ؼ� 1~45���� ����  6���� ��������.
		
		HashSet<Integer> lotto= new HashSet<Integer>();
		for(int i=0;lotto.size()<6;i++) {
			int j=(int)(Math.random() * 45) + 1;
			lotto.add(j);
		}
		System.out.println(lotto.toString());
		//while��ȯ
		Set set2=new HashSet();   //set�̶�� �������̽��� iterator�� �����ϰ� �ִ�.
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
		System.out.println("��"+set3.toString());
		
		Iterator<String> s= set3.iterator();
		while(s.hasNext()) {
			System.out.println("��"+s.next());
		}
		
		//���� �����ȵſ�!
		//������ ���� set�� ���� �� ������ ������ array�� �ٲ�����Ѵ�.
		//Collections.sort(List<T>);
		//sort �Լ��� parameter�� List�������̽��� ������ ��ü�� �� �� �ִ�.
		//Vector,Stack,Arraylist �� !! ��������� �迭�̱� ������ ������ �����ϴ�~
		//�׷���! set ����� ������ ���� ������ ������ �ȵȴ� �׷��� ����.
		List list = new ArrayList(set3); //Collection �θ� �ڽİ�ü�� hashSet��ü�� �ּҸ� �ְԵ� ��.
		System.out.println("before ������: "+list.toString());
		Collections.sort(list); //�긦 �̾Ƽ� n���� �긦 �̾Ƽ� n���� �� ��������.
		System.out.println("after ���� ��: "+list.toString());
		Collections.reverse(list);
		System.out.println(list.toString());
		//������: set �������̽��� �����ϰ� �ִ� hashset�� ������ ����, �ߺ����� �ʴ� �����͸� �ٷ�� �ִ�.(ex:�ζǹ�ȣ)
		
	}

}
