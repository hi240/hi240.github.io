import java.util.Scanner;

public class Excercise {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n=sc.nextInt();
	double sum=0;	
	double max=0;
	double[] subject= new double[n]; 
	for(int i=0;i<n;i++) {
	subject[i]=sc.nextInt();
	}
	
	for(int i=0;i<n;i++) {
          if(subject[i]>max)
        	  max=subject[i];
		} 

		for(int i=0;i<n;i++) {
			subject[i]=subject[i]/max*100;
			sum+=subject[i];
		}	
	     System.out.println(sum/n);
	}
	
}
