class Person{
	String name;
	int age;
	void print() {
		System.out.println(this.name+"/"+this.age);
	}
}
public class Ex04_Array_Object {
	public static void main(String[] args) {
		//값 타입 배열
		int[] intarr = new int[10];
		boolean[] boarr= new boolean[5];
		//값 타입 배열은 각각의 방이 default값으로 초기화 된다.	
		//참조타입배열!
		Person p=new Person();
		p.name= "홍길동";
		p.age=100;		
		//참조 타입의 기본값 : null
		Person[] perobj = new Person[3];
		//person 객체를 담을 수 있는 방만 만든 것.
		System.out.println("perobj: "+perobj);
		System.out.println("perobj[0]: "+perobj[0]);		
		//**객체배열은 방을 만드는 작업과 방을 채우는 작업은 별도다.
		perobj[0]=new Person();
		perobj[0].name="홍길동";
		perobj[0].age=2;
		System.out.println("perobj[0]: "+perobj[0]);
		System.out.println(perobj[0].name+"/"+perobj[0].age);
		
		System.out.println("perobj[1] "+perobj[1]);
		
		Person person = new Person();
		perobj[1]=person;
		perobj[2]=new Person();

		//for문
		for(int i=0;i<perobj.length;i++) {
			System.out.println("주소값"+perobj[i]);
		}
		
		//객체 배열 (Today Point)
		//1. int[] arr = new int[5] 정수 타입인 5개의 방을 만듭니다.
		//객체의 주소값을 줌으로써 초기화를 시킬 수 있다.
		//주소값에 데이터를 넣어야 초기화가 완성이 된다.	
		Person[] pa_array = new Person[5];
		for(int i=0;i<pa_array.length;i++) {
			pa_array[i]=new Person();
			System.out.println("뭐야이건"+pa_array[i]);
		}		
		//2.int[] arr= new int[]{10,20,30}
		Person[] pa_array2 = new Person[] {new Person(),new Person(),new Person()};
		
		//3.int[] arr= {10,20,30}
		Person[] pa_array3= {new Person(),new Person(),new Person()};
		
		
	}

}
