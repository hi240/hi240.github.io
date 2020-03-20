//1. ���͸��� 2.3. ������ �� �ܿ����մϴ�^^~~~~~~~~~~~~~~~~~~~~~~~~�ƴϸ� ������������
import java.util.ArrayList;

import kr.or.bit.Emp;

public class Ex03_ArrayList_Object {

	public static void main(String[] args) {
        //��� 1���� ���弼��.
		Emp emp =new Emp(100,"������","�����");
		System.out.println(emp.toString());
		
		//Array �����迭
		//��� 2�� ���弼��.
		Emp[] emplist = {new Emp(100,"�达","�Ϲ���"),new Emp(200,"�ھ�","�л�")};
		for(Emp e : emplist) {
			System.out.println(e);
		}
		
		//�Ѹ��� �Ի縦 ���߳׿�. �߰���Ű����.
		//Collection
		ArrayList list = new ArrayList();
		list.add(new Emp(1,"����","IT"));
		list.add(new Emp(2,"ȫ��","IT"));
		System.out.println(list);
		System.out.println(list.toString());
		System.out.println(list.get(0));
	
		//toString Ȱ������ ���� ��� ����غ�����
	    for(int i=0;i<list.size();i++) {
	    	//Object obj = list.get(i); //�̰Ŵ� �׳� ����Ϸ��� �� �ڵ� ���̴�.
	    	//System.out.println(obj);
	    	Emp e = (Emp)list.get(i); //�θ�Ÿ���� �ּҸ� �ڽ�Ÿ�Կ��� �ַ��� �ڽ�Ÿ�Կ� �°� downcasting �ؾ��Ѵ�.
	    	System.out.println("��"+e.getEmpno()+"/"+e.getEname()+"/"+e.getJob());	
	    }
	    //tostring ����������� ������ for������ ����غ�����.
	    for(Object obj: list) {
	    	Emp e = (Emp)obj;   //�ٿ�ĳ������ �ؼ� �ҷ��;� get�Լ��� �� �� �����ϱ�
	    	System.out.println(e.getEmpno()+"/"+e.getEname()+"/"+e.getJob());
	    }
	    
	    //���ʸ� Generic (Ÿ���� �����ϱ�)
	    //Object��� ���뼺�� �������� �ؼ��ϱ� ����.
	    ArrayList<Emp> list2=new ArrayList<Emp>(); //���� ������ ���� Ÿ���� emp Ÿ��
	    list2.add(new Emp(1,"A","IT"));
	    for(Emp e : list2) {
	    	System.out.println(e.getEmpno()+"/"+e.getEname()+"/"+e.getJob());
	    }
	    list2.add(new Emp(2,"New","New"));
	    
	}

}
