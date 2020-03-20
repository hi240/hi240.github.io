import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 * HashMap<k,v>
 * HashMap<String,String>
 * HashMap<Integer,String>
 * HashMap<String,Emp>
 * put("hong",new Emp())
 */

class Student{
	int kor=100;
	int math=50;
	int eng=20;
	String name;
	Student(String name,int kor, int math, int eng){
		this.name=name;
		this.kor=kor;
		this.math=math;
		this.eng=eng;
	}
}
//map���� �л��� ���� �����ϱ�.
//generic���
public class Ex13_HashMap_Generic {
	public static void main(String[] args) {
		HashMap<String,Student> wow= new HashMap<String,Student>();
		wow.put("��",new Student("�̼�",90,100,95)); //�̰� ����ؾߵǴµ�
		System.out.println("a"+wow);
	    Student aha= wow.get("��");
	    System.out.println("��"+aha);
		
		
    HashMap<String,Student> sts=new HashMap<String, Student>();
    sts.put("hong",new Student("ȫ�浿",100,50,30)); //����ؾߵɰ� value�༮.
    sts.put("kim",new Student("������",50,100,60)); 
    Student std = sts.get("hong"); //�ش��ϴ� key���� ����Ϸ��µ�, �׿� �´� Ÿ�Կ� �־�� ����� �����ؼ� Student!
    System.out.println(std.kor);
    System.out.println(std.math);

    //Tip ����������,
    //Map�ȿ� �ִ� key,value ��� ���� ���
    Set set = sts.entrySet(); //key+"="+value�� �������ִ� �Լ��̴�.
    Iterator it = set.iterator();
    while(it.hasNext()) {
    	System.out.println(it.next()); //hong=Student@15db9742
    }
    //���࿡ value�� Object���..
    //�ܿ켼��׳� �����Ϸ�����������
    //Map.Entry��� �������̽� Ÿ������ ��ȯ������, getKey(),getValue() �����޾ƿ�
    for(Map.Entry m : sts.entrySet()) {
    	System.out.println(m.getKey()+"/"+((Student)m.getValue()).name);
    }


	}

}






