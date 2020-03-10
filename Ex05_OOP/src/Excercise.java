import java.util.Scanner;

public class Excercise {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("¸î °ú¸ñ?");
	int n=sc.nextInt();
		int[] subject= new int[n];
		System.out.println(subject.length);
		
		for(int i=0;i<subject.length;i++) {
			subject[i]=sc.nextInt();
		}

	}

}
