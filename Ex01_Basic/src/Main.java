import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
int n=0;
System.out.println("정수의 갯수는?");
int length= Integer.parseInt(sc.nextLine()); //배열의 길이 입력받음.
int[] array = new int[length]; //길이만크의 배열만듬
System.out.println("숫자들은?");
for(int i=0;i<=length;i++) {
	array [i]= sc.nextInt();  //숫자를 하나씩 배열에 넣음.
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
