import kr.or.bit.Emp;

class Test2{
	void print() {
		System.out.println("�θ��Լ� test2");
	}
}
class Test3 extends Test2{
	@Override //���� override �� �ϰ� �ִ��� �˻�´´�.
	void print() {
		System.out.println("�ڽ��� �θ��Լ� ������");
	}
	//�����ε� (��Ӱ� ����)
	void print(String str) {
		System.out.println("�� �����ε��Լ���"+str);
	}
}
public class Ex05_Inherit_override {

	public static void main(String[] args) {
		Emp emp=new Emp(1000,"������");
		System.out.println(emp.toString()); 
		//Object�� ���� �ִ� toStirng ��ü�� �ּҸ� �����ϴ±���..
		System.out.println(emp);//tostring default�� // kr.or.bit.Emp@15dg9742

		Test3 test3 = new Test3();
		test3.print();
		test3.print("�����ε�");
	}

}
