//import kr.or.bit.*; //�ش� ������ �ٺҷ��´�. �������� ��������.
//import kr.or.bit.a; //aŬ����
import kr.or.bit.BodyInfo;
import kr.or.bit.Emp;
import kr.or.bit.Person;

public class Ex01_Ref_Type {

	public static void main(String[] args) {
		

		//��Ÿ��(�������: �޸�)
		int i=100;
		i=200;
		System.out.println("i: "+i);

		//���� Ÿ��
		Person person; //���� �� ��.  ctrl + space������ �Ӽ�����.
		Person person1 = new Person(); //person1 ��� ������ �ּҰ��� �Ҵ�.
		System.out.println(person1); //kr.or.bit.Person@15db9742
		
		
		///�ʱⰪ�Ҵ�
		Person person2=null; //���̾���.null ���� ��ü�� �ʱⰪ���� ��.
		System.out.println(person2);//������ �ִ� �޸𸮸� ������ ���� �ʴ�
		//person2�� �޸𸮸� ���� ���.
		//person2=new Person(); <����Ʈ�� ���� �����޴� ���.
		//person2=person; <���� Ÿ���� �ٸ� �� �ּҸ� �Ҵ��ϴ� ���.
		person2=person1;
		System.out.println(person2==person1); //���� ����.
		//�츮�� ����� ��� ����� ������Ʈ�� ��ӹ޴´�. ��,
		//Object�ȿ� �ִ� �Լ� ���� �� �� �ִٴ� ��.
		person2.name="ȫ�浿";
		person2.age=100;
		person2.print();
		System.out.println(person1.name);
		
		Person myperson =new Person();
		myperson.name =  "�̼�";
		myperson.print();
		System.out.println(myperson.power);
		
		Emp emp= new Emp(); //Ŭ���� emp �ּҸ� �Ҵ������.

		emp.num=201523544;  //Ŭ���� �ּҿ� �ִ� �Ӽ��� ��üȭ���ش�.
		emp.name="������";
		emp.job="���";
		emp.money=20000000;
		BodyInfo bodyinfo = new BodyInfo();
		emp.bodyinfo=bodyinfo; //�ּҰ��Ҵ�
		bodyinfo.height=200;
		bodyinfo.weight=87;

		System.out.println(emp+"/"+emp.bodyinfo);
		System.out.println(emp.num+emp.bodyinfo.height);
		
	}

}