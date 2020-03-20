import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex02_ArrayList {

	public static void main(String[] args) {

		ArrayList arraylist = new ArrayList();		
		arraylist.add(100);
		arraylist.add(200);
		arraylist.add(300);
		for(int i=0;i<arraylist.size();i++) {
			System.out.println(arraylist.get(i));
		}
		System.out.println(arraylist.toString());
		System.out.println("Ư�� �濡 �ִ� ��: "+arraylist.get(0));
		//add ���������� ������ �ֱ�.
		//arraylist.add �����ε� �Ǿ��־ index�� element������ �������� �� �ִ�.
		arraylist.add(0,111); //�о�� �߰�.. 0��° �濡 111�� �ִ´�.0��° ���ķ� �ִ� �ֵ��� �ڷ� �и�.
		System.out.println(arraylist.toString());
		//�����͸� �߰��� �����ִ°Ÿ�[��������� ������ �߰�]��� �θ���. ������ �����Ͱ� �̵��ؾ� �Ǳ⶧��..
		//arraylist�� ��� [��������] ������ �߰�/������ ��ȣ�Ѵ�.
		//������ ����
		//arraylist.remove(index)
		//arraylist.add(index,element);

		System.out.println(arraylist.contains(200)); //contains() ���Կ��θ� �˷��ִ� �Լ�
		System.out.println(arraylist.isEmpty()); //false
		arraylist.clear();
		System.out.println(arraylist.isEmpty()); //true
		arraylist.add(101);
		arraylist.add(102);
		arraylist.add(103);
		System.out.println(arraylist.toString());
		
		//remove() �����Լ�
		System.out.println("������: "+arraylist.size());
	    Object value = arraylist.remove(0); //0��° ������ �����Ұǵ�, �� ���� ���� ����.
	    System.out.println("������ ������: "+value);
	    System.out.println(arraylist.toString());
	    
	    //Point
	    //�����ڵ��� �ϻ�ٹݻ�� ���� �ڵ�
	    List li = new ArrayList(); //arraylist�� list�� implements�� �ϰ� �ִ�. �� �������� ���� �θ� �ڽ� �ڿ��� ���°�!
	    //�������� �̿��� Ȯ�强, �������� Ȯ���ߴ�!
	    li.add("��");
	    li.add("��");
	    li.add("��");
	    li.add("��");
	    List li4 = li.subList(0,2); //0���� 1����
	    //List�� �����ϱ�,sublist�� ������ִ� �����Ͱ� �ᱹ���� ������ �ִ� ����������..
	    System.out.println("Ȯ��"+li4.toString());
    
	    ArrayList alist = new ArrayList();
	    alist.add(50);
	    alist.add(1);
	    alist.add(7);
	    alist.add(40);
	    alist.add(45);
	    alist.add(3);
	    alist.add(15);
	    
	    //Arrays.sort(a); 
	    //Collections �ʺ� �����ڴ� ���� �� ��.
	    System.out.println("before: "+alist.toString()); //[50, 1, 7, 40, 45, 3, 15]
	    Collections.sort(alist); //sort�� ������ �ʿ��ϱ� ������ List�� ��밡���ϴ�.
	    System.out.println("after: "+alist.toString()); //[1, 3, 7, 15, 40, 45, 50] sort()�����ϴ� �Լ�
	    Collections.reverse(alist);
	    System.out.println("after: "+alist.toString()); //[50, 45, 40, 15, 7, 3, 1] reverse()������ �Լ�
	
	}

}
