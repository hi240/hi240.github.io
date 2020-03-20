/*
 * String Ŭ����
 * String str = new String ("ȫ�浿");
 * 8���� �⺻ Ÿ�԰� �����ϰ� ����� �� �ֵ��� ����
 * int i=100;
 * String str="ȫ�浿";
 * 
 * 1.String Ŭ����: �������� ���� ������ character�迭�̴�.char[]�迭����>[ȫ][��][��]�̷� ��..
 * String ename="ABC" >> char[]>>[A][B][C]
 * class String extends Object{
 *  char[]....
 *  void length(){}
 *  @Override
 *  String toString(){ 
 *  ������..  }
 *
 * }
 */
public class Ex05_String_Class {

	public static void main(String[] args) {

		String str="ȫ�浿";
		System.out.println(str.length());//���������� �迭�� ���ִ�.
		System.out.println(str); //str.toString()�� ���� toString�� �����Ǿ��..
		System.out.println(str.toString());
		//���������� �ּ� ���� ���;� ����. ��, str������ ���ÿ� ����, "ȫ�浿"�� heap�� ���������.
		String str1="AAA";
		String str2="AAA";
		System.out.println(System.identityHashCode("str1: "+str1));
        System.out.println(System.identityHashCode("str2: "+str2));
		System.out.println(str1==str2);//true
		//���ڿ� �񱳴� �ᱹ (�����ϴ� heap��) �ּҰ��� ���ϴ� ��("xx����"=="xx����")
		//��ġ�� ���ڿ��� ������ ���ٸ�? ���� heap�� �����Ѵ�.
		System.out.println(str1.equals(str2));
		//**������ heap�� �ִ� ���� �� ("AAA"=="AAA")
		String str3=new String("BBB"); //new�� ����ϸ�, ���ο� ��ü�� �����Ѵ�.
		String str4=new String("BBB");

		System.out.println(str3 == str4);//false xx���� ==yy���� �� ����� ��.
		System.out.println(str3.equals(str4));//true "BBB"=="BBB"  �Դϱ�
		System.out.println(System.identityHashCode("str3: "+str3));
        System.out.println(System.identityHashCode("str4: "+str4));
        System.out.println("str1: "+System.identityHashCode(str1));//���ڿ�stack�ּ�Ȯ��
        System.out.println("str2: "+System.identityHashCode(str2));
        System.out.println("str3: "+System.identityHashCode(str3));
        System.out.println("str4: "+System.identityHashCode(str4));
		String s="A";
		s+="B"; 
		s+="c"; 
		System.out.println(s);
		s="A";
		System.out.println(s);
		
	}

}
