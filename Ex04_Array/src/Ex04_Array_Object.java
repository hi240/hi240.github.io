class Person{
	String name;
	int age;
	void print() {
		System.out.println(this.name+"/"+this.age);
	}
}
public class Ex04_Array_Object {
	public static void main(String[] args) {
		//�� Ÿ�� �迭
		int[] intarr = new int[10];
		boolean[] boarr= new boolean[5];
		//�� Ÿ�� �迭�� ������ ���� default������ �ʱ�ȭ �ȴ�.	
		//����Ÿ�Թ迭!
		Person p=new Person();
		p.name= "ȫ�浿";
		p.age=100;		
		//���� Ÿ���� �⺻�� : null
		Person[] perobj = new Person[3];
		//person ��ü�� ���� �� �ִ� �游 ���� ��.
		System.out.println("perobj: "+perobj);
		System.out.println("perobj[0]: "+perobj[0]);		
		//**��ü�迭�� ���� ����� �۾��� ���� ä��� �۾��� ������.
		perobj[0]=new Person();
		perobj[0].name="ȫ�浿";
		perobj[0].age=2;
		System.out.println("perobj[0]: "+perobj[0]);
		System.out.println(perobj[0].name+"/"+perobj[0].age);
		
		System.out.println("perobj[1] "+perobj[1]);
		
		Person person = new Person();
		perobj[1]=person;
		perobj[2]=new Person();

		//for��
		for(int i=0;i<perobj.length;i++) {
			System.out.println("�ּҰ�"+perobj[i]);
		}
		
		//��ü �迭 (Today Point)
		//1. int[] arr = new int[5] ���� Ÿ���� 5���� ���� ����ϴ�.
		//��ü�� �ּҰ��� �����ν� �ʱ�ȭ�� ��ų �� �ִ�.
		//�ּҰ��� �����͸� �־�� �ʱ�ȭ�� �ϼ��� �ȴ�.	
		Person[] pa_array = new Person[5];
		for(int i=0;i<pa_array.length;i++) {
			pa_array[i]=new Person();
			System.out.println("�����̰�"+pa_array[i]);
		}		
		//2.int[] arr= new int[]{10,20,30}
		Person[] pa_array2 = new Person[] {new Person(),new Person(),new Person()};
		
		//3.int[] arr= {10,20,30}
		Person[] pa_array3= {new Person(),new Person(),new Person()};
		
		
	}

}