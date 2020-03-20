import java.util.StringTokenizer;

/*StringŬ����(���ڿ�)
 * ������ �Լ�.. ���ڿ� �ڸ��� ��ġ�� �̾Ƴ���
 * String : static �Լ� + �Ϲ� �Լ�
 10���ϱ�
 */
public class Ex06_String_Function {

	public static void main(String[] args) {
		String str=""; //���ڿ��� �ʱ�ȭ,null��
		//int�� doubleó�� ����ϼ���
		String[] strarr= {"aaa","bbb","ccc"};
				for(String s:strarr) {
					System.out.println(s);
				}
				String ss="hello";
				String concatstr=ss.concat("world");
				System.out.println(concatstr);
				
				boolean bo=ss.contains("hel"); //������� �ִ��� Ȯ��
				System.out.println(bo);//true
				
				bo=ss.contains("helo");
				System.out.println(bo);//false
				
				bo=ss.contentEquals("helo");
				System.out.println(bo);
				
				bo=ss.contentEquals("hello");
				System.out.println("bo: "+bo);
				
				String ss2="a b c d";//heap [a][][b][][c][][d]
				System.out.println(ss2.length());
				
				String filename="hello java world";
				System.out.println(filename.indexOf("h")); //index �迭���� ÷�ڰ�
				System.out.println(filename.indexOf("java")); //6
				System.out.println(filename.indexOf("����")); //ã�°� ������? -1
				if(filename.indexOf("world")!=-1) {
					System.out.println("world ���ڿ��� ���ԵǾ� �ִ�.");
				}
				System.out.println(filename.lastIndexOf("o")); //o�� ������ ���ڴ� ��� �ֳ���?
				//length(),indexOf(),subStirng(),replace(),split()
				String result = "superman";
				System.out.println(result.substring(0));//���۰� ���� ��θ� ���.
				System.out.println(result.substring(2));//perman �����Ϥ����������Ϥ����K�����������K���Ϥ��Ф����������İ���;�
				System.out.println(result.substring(1,2));//endIndex -1//up�� �ƴϰ� u ��,(1,1)
				System.out.println(result.substring(1,1));

				//Quiz
				String filename2="1.txt";
				//���ϸ�� Ȯ���ڸ� �и��ؼ� ����ϼ���
				//indexof/length/substring�� ���.
				int a=filename2.lastIndexOf(".");
				System.out.println("���ϸ� "+filename2.substring(0,a)); //�����̸������
				System.out.println("Ȯ���� "+filename2.substring(++a)); //Ȯ���ڸ����

				//replace (ġȯ�Լ�)
				String s4="ABCDADDDDDA";
				String result4=s4.replace("DDDDD", "������ �ݿ��� �Դϴٸ�");
				result4 = s4.replace("A", "a");
				System.out.println("result4: "+result4);
				
				//���� ������ �˰��־ �Ǵ� �Լ�
				System.out.println(s4.charAt(0)); //A
				System.out.println(s4.charAt(3)); //D
				System.out.println(s4.endsWith("DDDA")); //�ڿ������� ��ġ�� ������ true
				System.out.println(s4.equalsIgnoreCase("abcdADDDDDA"));//��ҹ��� ������� ���ؼ� true
				
				//Today Point (split) Ư�� ���� �������� ������ �迭�� �ִ´�.
				String s6="���۸�,��Ƽ,�����,����,����";
				String[] namearray = s6.split(",");
				for(String s: namearray) {
					System.out.println(s);
				}
				/*����ǥ����(java) �������� ��Ģ
				Ư���� ���ڷ� ���� ���� > ������ ���Ĵ�� �ԷµǴ��� ����....
				�ֹι�ȣ ����6�ڸ�-����7�ڸ�>ǥ��>����� �Է��� �ֹι�ȣ�� �̸� ������ ���ϰ� ��ġ
				��ȭ��ȣ, �ڵ�����ȣ,������ȣ
				010-{/d4}-0000 ����ǥ��
				010-4444-0000
				. < ����ǥ���� ������. �׷��� /.�� ����ߵǴµ� �ڹٿ��� �νĽ�Ű�� ���� //.
				*/
				String filename3="bit.hwp";
				String[] filearray= filename3.split("\\."); //���� �������� ������ ���.
				for(String s: filearray) {
					System.out.println(s);
				}
				//�߿����� ������, �����ϴ�.. ����!
				String s7 = "a/b,c.d-f"; 
				StringTokenizer sto =new StringTokenizer(s7,"/,.-");
				while(sto.hasMoreTokens()){
				System.out.println(sto.nextToken());	
				}
				
				String s8="ȫ             ��            ��";
				//"ȫ�浿" �̷��� �����ϰ� �;�. ������� ������ּ���.
				//�����ѹ��
				StringTokenizer st = new StringTokenizer(s8," ");
				while(st.hasMoreTokens()) {
					System.out.print(st.nextToken());
				}
				System.out.println();
				//�������ѹ��
				//System.out.println(s8.replace(" ",""));
				String s9="       ȫ�浿            ";
				System.out.println(">"+s9.trim()+"<"); //trim() �ٱ��� ���� ���� �Լ�.
				
				String s10="       ȫ      ��          ��              ";
				System.out.println(s10.trim());
				System.out.println(s10.replace(" ","")); //������ ����Դϴ�.
				
				// ���� ���� �Լ��� �����ؼ� ��� (method chain ���)
				s10.trim().replace(" ","").substring(2); //���� �Լ��� ���ÿ� �����ؼ� ���. �ٱ����� �����ϰ�,���� ���ְ�, 3��° ���ڸ� ���ͼ� ���.
				
				//Quiz1 
				//�迭�� ���ڰ��� sum�� ��Ƽ� ��� ��� 15
				int sum=0;
				String[] numarr= {"1","2","3","4","5"}; //���ڿ��� ���ڷ� �ٲ㼭.
				for(String s: numarr) {
					   sum+=Integer.parseInt(s);
				}
				System.out.println(sum);
				
				//Quiz2 �ֹ��� �ձ��ϱ�
				String jumin="123456-1234567";
				
				
				//1
				int sum2=0;
				for(int i=0;i<jumin.length();i++) {
					String numstr=jumin.substring(i,i+1);
					if(numstr.equals("-")) continue;
					sum2+= Integer.parseInt(numstr);        //���ڿ��� int��
				}
				System.out.println(sum2);
				
				//2
				String[] numarr2=jumin.replace("-", "").split("");
				   int sum5=0;
				   for(String i : numarr2) {
					  sum5+= Integer.parseInt(i);
				}
				
				//�����Ѱ�
				String[] juminarray= jumin.split("-"); 
				for(String s: juminarray) {
					System.out.println(s);
				}
				int sumer=0;
				for(int i=0;i<juminarray[0].length();i++) {
				sumer+=(int)(juminarray[0].charAt(i));
				}
				for(int i=0;i<juminarray[1].length();i++) {
				sumer+=(int)(juminarray[1].charAt(i));
				}
				System.out.println(sumer);
				
		}
	}


