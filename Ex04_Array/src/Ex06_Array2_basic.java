import kr.or.bit.Emp;

public class Ex06_Array2_basic {
public static void main (String[] args)
{
    //2���� �����
	//ex_ ��ȭ�� ���� �¼���ġ'
	//���İ���..
	
	int[][] score = new int[3][2];
	System.out.println(score[0][0]);
	score[0][0] = 100;
	score[0][1] = 200;
	
	score[1][0] = 300;
	score[1][1] = 400;
	
	score[2][0] = 500;
	score[2][1] = 600;
	
	//���� ������ �迭�̸�.length >score.length
	//���� ���� : �迭�̸�[i].length
	//�迭�̸�[0].length >> 0���� ���� ����(*******)
	//��øfor���̶� �A��.
	//for(int i =0;i<score.length;i++) {
	//	for(int j=0;j<score[i].length;i++) {
	//		System.out.printf("score[%d][%d]=%d\n",i,j,score[i][j]);
	//	}
	//	System.out.println();
	//}
		//Today Point ^^
	//������ for��, ���� for��
	//JAVA: for(Type ������: �迭 or Collection {���౸��}
	//C#:for(Type ������ in �迭 or Collection {���౸��}
	//JavaScript:for(Type ������ in �迭 or Collection){���౸��}
	
	int[] arr3= {5,6,7,8,9};
	for(int i=0;i<arr3.length;i++) {
		System.out.println(arr3[i]);
	}
	for(int val : arr3) {
		System.out.println(val);
	}
	String[] strarr = {"A","B","C","D","FFFF"};
	for(String val : strarr) {
		System.out.println(val);
	}
	
	Emp[] list = {new Emp(1,"A"),new Emp(2,"B"),new Emp(3,"C")};
	//������ for���� ����ؼ� ���,�̸� ���
	for(Emp val : list) {
		val.empInfoPrint();
	}
	//��� Ŀ�� ����(3��)
	int[][] score3=new int[][] {
		{11,12},
		{13,14},
		{15,16},
	};
	//������ for���� ����ؼ� �迭�����.

	for(int[] col : score3) {
		for(int val:col) {
			System.out.println(val);
		}
	}
	/* �����ѰŤФ�
	for(int val: score3[0]) {
		System.out.println(val);	
	}
	for(int val: score3[1]) {
		System.out.println(val);
	}
	for(int val: score3[2]) {
		System.out.println(val);		
	}*/
 }
}