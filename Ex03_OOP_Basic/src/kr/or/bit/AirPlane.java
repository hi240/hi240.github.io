package kr.or.bit;

/*
public class AirPlane {
/*
	public String name;
	public int number;
	public static int count;
		
	 public void airInfo() {
   	  System.out.printf("이름:%s,번호:%d\n",name,number);
     }
	 

	private String name;//캡슐화시킴으로써 다른곳에서 수정 못하게한다.
	private int number;
	private static int count;
	public void airInfo(String a,int b) {
		 name=a;
		 number=b;
     System.out.printf("항공기 넘버는 %s 번호는 %d \n",a,b);
     count++;
	}
	public int airCount() {
		return count;
	}
	
	
}
*/
public class AirPlane{


	private String name;
	private int number;
	private static int count;
	
	public AirPlane(String name,int number) { //당신은 반드시 a와 b를 넣어야한다고 강제하는 것. . . . . . . . .
	 this.name=name;
     this.number=number;
     System.out.printf("항공기 넘버는 %s 번호는 %d \n",name,number);
     count++;
	}
	
	public int airCount() {
		return count;
	}
}