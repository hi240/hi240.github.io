//�̿����� ����: �����ε��� parameter�� ���������� �� ���� �ִ�.
class Human2{
	String name;
	int age;

}
class Test{
	Human2 add(Human2 h) {
		h.name="������";
		h.age=240;
		return h; //���������� Human2�ϱ� ���� int���������� return int���� ��� ���������ϱ� return��������(��,�� �ּҰ�)
	}
	Human2 add(Human2 h,Human2 h2) {
		h2.name=h.name;
		h2.age=h.age;
		return h2;
	}
	
}
public class Ex15_Method_Overloading {

	public static void main(String[] args) {
		Test t = new Test();
		Human2 man = new Human2();
		Human2 man2= t.add(man);
		System.out.println(man2.name); //������
		System.out.println(man2.age);  //240
		
		System.out.println(man == man2); //�ּҰ��� ���� .. ����
		System.out.println(man.age+man.name);
		
		Human2 m2 = new Human2(); //�� ��5���� ���󵵵�..
		
		//Human2 m3=t.add(m,m2); 
		
	}

}