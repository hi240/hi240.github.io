import java.util.ArrayList;
import java.util.Stack;

/*
Today Point

Collection 클래스들은 저장공간의 타입이 Object
1.Object타입에 대한 저항으로 타입강제하는 제너릭
2.타입 안정성 (타입을 강제)
3.형변환(casting) 하지 않고, (Car)obj 하지않고.

만드는 시점 : 클래스 설계할 때 타입을 강제하도록 설계

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
	void add(T obj) { //add라는 함수
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
		mygen.add("a");   //내가 객체를 생성할때 넣은 타입이 MyGen의 타입에 다 적용됨.
		String result = mygen.get();
		System.out.println("d   "+result);
		
		//Generic 미사용
		ArrayList list= new ArrayList();
		//저장하는 저장공간(Array의 타입은 default가 Object)
		list.add(10);
		list.add("fk");
		list.add(new Person());
		for(Object obj : list) { //타입이 Object니까 그대로 for문 생성해도!
			//System.out.println(obj);
			//System.out.println(Person.obj )등....
			//객체의 타입에 따라서 변환이 필요함..
			if(obj instanceof Person){
				Person p = (Person)(obj); //Person 타입으로 캐스팅
				System.out.println(p.age);
			}
			else {
				System.out.println(obj);
			} //즉 장점, 여러 타입을 불러올 수 있긴 하다.
		}
		
		//Generic 사용
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
		s.push("문자열");
		s.pop();
		

		
		
		

	}

}
