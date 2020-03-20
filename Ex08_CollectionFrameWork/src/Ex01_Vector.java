import java.util.Vector;

/*��
Collection Framework
[�ټ��� ������]�� �ٷ�� ǥ��ȭ�� �������̽��� �����ϰ� �ִ� Ŭ���� ����

Collection �������̽� <-List(���) <-----ArrayList(^^)...(����)
                   <-Set (���) <-----HashSet,TreeSet(����)
Map �������̽� (Key,Value) <-----HashMap(^^)...(����)
----------------------------------------------------------
List Interface(���� ���ÿ�)
:����(��ȣǥ),�ߺ�(���)>>���������δ� ������(�ڷ�,��ü)���� �迭�� �����Ѵ�. �迭[ȫ�浿][ȫ�浿][][]
1.Vector (������) > (��Ƽ������)ȯ�濡�� ����ȭ > Lock(��ȣ�� ����) > ���� ���� ������.. > �Ѱ� ȭ���
Tip! MultiThread ��? : �Լ� 10���� ���ÿ� ����ǰ� �ʹ�? Stack�� 10�� ������ ��. �װ� �ٷ� Multi Thread
2.ArrayList (�Ź���) > (��Ƽ������)ȯ�濡�� ����ȭ > Lock(�ɼ� ���)-> ������ ����ؼ� ����!Handling�����ϸ� ����,�ƴϸ� X

List�������̽��� ������ Ŭ���� :: Vector, ArrayList
1. �̵��� �ݱ⸦ �������, �迭�� ũ�⸦ �������� Ȯ���� �� �ִ�..Ȯ��� ��Ұ� ����> ����� �迭�� ���Ҵ�
2. ������ �����Ѵ�. ���������� index���. �ߺ��� ���
3. ���������δ� �迭�� ����Ѵ�.
Size�� ���缭 Capacity�� �ٽ� ���� �迭�� ä��� ��~~~~~~~~~~~~~
setSize �Լ��� �Ἥ Capacity�� n���� �ø���, ��״� Capacity�� 2n�� �ø���.
clear �Լ��� �Ἥ ���ҵ��� null�� �����.

 */
public class Ex01_Vector {

	public static void main(String[] args) {
		Vector v = new Vector();
		System.out.println("�ʱ� default �뷮: "+v.capacity());
		v.add("AA");
		v.add("BB");
		v.add("AA");
		v.add(100);                      //object�� ��� Ÿ���� �θ�Ÿ���̶� ��� Ÿ�� ĳ������.
		System.out.println(v.toString());
		
		//Array > length > �迭�� ����
		//List > size > ���� ���� 
		
		//Tip! ���� ������ ���� �Ⱦ��ϴ�.. �˾Ƹ� �� ��
		for(int i=0;i<v.size();i++) {
			//Array������ (Array : arr[i]..)
			System.out.println(v.get(i)); //get�Լ� �ܿ켼��~ ���� ���� �ɴϴ�. �迭�� �ε��� ��.
		}
	
		for(Object obj : v) {       //Vector�� ObjectŸ���̴�......
			System.out.println(obj);
		}
		//���ʸ� : Ÿ���� �����ؼ� �����ϴ� �迭! ex) String �� ���� �� �ִ� �׸�
		Vector<String> v2=new Vector<String>();
		v2.add("����0");
		v2.add("����1");
		v2.add("����2");
		for(String s: v2) {
			System.out.println(s); //����0����1����2
		}
		System.out.println(v2.toString()); //[����0,����1,����2]
		System.out.println(v2.get(2)); //����2
		System.out.println("size �����Ͱ���: "+v2.size()); //size �����Ͱ���:3
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
