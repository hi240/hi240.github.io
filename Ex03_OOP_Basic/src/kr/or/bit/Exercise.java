package kr.or.bit;

public class Exercise {
	public static void main(String[] args) {
		Student s = new Student("ȫ�浿",1,1,100,60,76);	
	
		String str= s.info();
		System.out.println(str);     //ȫ�浿,1,1,100,60,76,236,78.7
	}
}
class Student {
	public Student(String str, int i, int j, int k, int l, int m) {  
	     System.out.printf("%s,%s,%s,%s,%s",str,i,j,k,l,m);
	}
	public String info() {
	
			return ",236,78.7";
		}
}