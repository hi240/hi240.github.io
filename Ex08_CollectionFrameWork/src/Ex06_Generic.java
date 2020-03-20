import java.util.ArrayList;
import java.util.Stack;

/*
Today Point

Collection Ŭ�������� ��������� Ÿ���� Object
1.ObjectŸ�Կ� ���� �������� Ÿ�԰����ϴ� ���ʸ�
2.Ÿ�� ������ (Ÿ���� ����)
3.����ȯ(casting) ���� �ʰ�, (Car)obj �����ʰ�.

����� ���� : Ŭ���� ������ �� Ÿ���� �����ϵ��� ����

 */
class MyGen<T>{ //Type parameter
	T obj;
	void add(T obj) {
		this.obj=obj;
	}
	T get() {
		return this.obj;
	}	
}
class MyGen1<T>{
	T obj;
	void add(T obj) { //add��� �Լ�
		this.obj= obj;
	}
	T get() {
		return this.obj;
	}
}
class Person extends Object{
	int age=100;
}

public class Ex06_Generic {
	public static void main(String[] args) {
		MyGen<String> mygen = new MyGen<String>();
		mygen.add("a");   //���� ��ü�� �����Ҷ� ���� Ÿ���� MyGen�� Ÿ�Կ� �� �����.
		String result = mygen.get();
		System.out.println("d   "+result);
		
		//Generic �̻��
		ArrayList list= new ArrayList();
		//�����ϴ� �������(Array�� Ÿ���� default�� Object)
		list.add(10);
		list.add("fk");
		list.add(new Person());
		for(Object obj : list) { //Ÿ���� Object�ϱ� �״�� for�� �����ص�!
			//System.out.println(obj);
			//System.out.println(Person.obj )��....
			//��ü�� Ÿ�Կ� ���� ��ȯ�� �ʿ���..
			if(obj instanceof Person){
				Person p = (Person)(obj); //Person Ÿ������ ĳ����
				System.out.println(p.age);
			}
			else {
				System.out.println(obj);
			} //�� ����, ���� Ÿ���� �ҷ��� �� �ֱ� �ϴ�.
		}
		
		//Generic ���
		ArrayList<Person> plist = new ArrayList<Person>();
		plist.add(new Person());
		plist.add(new Person());
		for(Person p:plist) {
			System.out.println(p.age);
		}
		

		MyGen<Person> myobj=new MyGen<Person>();
		myobj.add(new Person());
		Person pe= myobj.get();
		System.out.println(pe.age);		
		Stack<String> s= new Stack<String>();
		s.push("���ڿ�");
		s.pop();
		

		
		
		

	}

}
