import kr.or.bit.Emp;

class Test2{
	void print() {
		System.out.println("부모함수 test2");
	}
}
class Test3 extends Test2{
	@Override //내가 override 잘 하고 있는지 검사맞는다.
	void print() {
		System.out.println("자식이 부모함수 재정의");
	}
	//오버로딩 (상속과 무관)
	void print(String str) {
		System.out.println("나 오버로딩함수야"+str);
	}
}
public class Ex05_Inherit_override {

	public static void main(String[] args) {
		Emp emp=new Emp(1000,"김유신");
		System.out.println(emp.toString()); 
		//Object가 갖고 있는 toStirng 객체의 주소를 리턴하는구나..
		System.out.println(emp);//tostring default값 // kr.or.bit.Emp@15dg9742

		Test3 test3 = new Test3();
		test3.print();
		test3.print("오버로딩");
	}

}
