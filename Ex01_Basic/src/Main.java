import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
int n=0;
System.out.println("������ ������?");
int length= Integer.parseInt(sc.nextLine()); //�迭�� ���� �Է¹���.
int[] array = new int[length]; //���̸�ũ�� �迭����
System.out.println("���ڵ���?");
for(int i=0;i<=length;i++) {
	array [i]= sc.nextInt();  //���ڸ� �ϳ��� �迭�� ����.
	for(int j=0;j<=length;j++) {
	if(j>=1) {
//    if (array[i]<array[i-1])
 //       min=array[i];
 //   else if (array[i]<array[i-1])
//    	max=array[i];
	}
	}
//	System.out.printf("%d %d",max,min);
		
        }
	
	}
}