import java.util.Arrays;

/*�迭��(Array) ��ü��
1.�迭�� ��ü�� (new���ؼ� ����)
2.new heap �޸𸮿� �����ȴ�.
3.�����迭(�����迭)�迭�� ũ��� �ѹ� �������� �����ȴ�.
4.�ڷᱸ���� �⺻�Դϴ�..
*/
public class Ex01_Array_Basic {

	public static void main(String[] args) {
		int s,s1,s2,s3;
		int[] score= new int[3];//���ȣ (÷��,index)
		System.out.println(score[0]);
		score[0]=101; //������ �濡 (index)�� ����ؼ� 
		score[1]=20;
		score[2]=300;
		System.out.println(score[0]);
		
		//���� ������ �׻� index������ 1 ũ��..(n-1�� ������ �ε��� ��)
		
		//score[3]=40;
		//java.lang.ArrayIndexOutOfBoundsException:
		//���ܰ��߻��߾��
		//�׷��� �����Ϸ��� ������ ���α׷��� ����.
		//������ �߻��������� �ұ��ϰ� �ϴ� �����Ű�� ���� try catch ������ ���
		//try catch�� ������ �ذ��ϴ°� �ƴϰ�, ���α׷��� ���� ����Ǵ� �͸� �����ش�.
		//Array �迭(������ for���̶� �߸���)
		for(int i=0;i<3;i++) {
			System.out.printf("[%d]=%d\t",i,score[i]);
		}
		System.out.println();
		for(int i=0;i<score.length;i++) {
			System.out.printf("[%d]=%d\t",i,score[i]);
		}
		System.out.println();
		//Tip Array �����ִ� Ŭ����
		String result = Arrays.toString(score); //������ ���� ������.
		System.out.println(result);
		
		Arrays.sort(score); //�ڵ����� ����. ������ ���� ������.
		result = Arrays.toString(score);
		System.out.println(result);
		//Today Point
		//�迭 3����
		int[] arr = new int[5]; //�⺻ (���� ����)
		int[] arr2= new int[] {100,200,300}; //�ʱⰪ�� ���ؼ� ���� ����� ���� �ʱ�ȭ
		int[] arr3= {11,22,33,44,55}; //�����Ϸ��� �˾Ƽ� new �ڵ� ����
		//javascript : let cararr = [];
		
		for(int i=0;i<arr3.length;i++) {
			System.out.println(arr3[i]);
		}
		//�迭�� ��ü��. �迭�� �޸𸮴� heap�̴�.
		int[] arr4;
		arr4 = new int[] {2,3,4,2,5};
		System.out.println("arr4: "+arr4);
		int[] arr5 =arr4;
		System.out.println(arr5==arr4);
		
		String[] strarr = new String[] {"2","3","��"};

		char[] ch = new char[10]; //���� '\u0000'
		for(int i=0;i<ch.length;i++) {
			System.out.println(">"+ch[i]+"<");
		}
		//8���� �⺻Ÿ�԰� string Ÿ���� > Array Ÿ�԰���
		//*Ŭ���� Ÿ�� > Array Ÿ�� ����
		//Car c = new Car();
		//Car c2 = new Car();
		//Car[] cars = new Car[10];
		
		
	}
}




