package kr.or.bit;

public class NoteBook {

	public String color;  //직접할당!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	private String name; // private을 쓴 의도가 뭘까..?????????????????????????????????????????????????????????????????????
	private int year; //
	//직접 할당을 막고 간접할당을 통해서 자료를 보호하겠다........,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,
	
	public void setYear(int y) {              //year write를 담당하는 함수..
		if(y<0) {
			year=1999;          //간접할당!!!! 즉, 음수는 빼고, 나머지를 할당해준다!
		}else {                 //바로 이게 [캡슐화]!
			year =y;
		}		
		}	
public int getYear() {                 //보호된 자원을 read 하는 함수.
	return year;                       //setter getter 함수는 특정한 목적을 가진함수 (private을 읽을수있게!)
}                                      //마우스오른쪽-source-generate getter setter로 만들수있따.

public int max(int a, int b) {
	   /*if (a>b)
	     return a;
	     else  
		 return b;          30점짜리       return 을 반복하는 구문 매우 안좋은 구문이다....최대한 하나만나오게...................
		 
		 int result=0;
		 if(a>b){
		 result=a;}
		 else {result=b;}
		 return result;     60점짜리
		 
		 int max=(a>b)?a:b;
		 return max;        90점짜리
		 
		 return (a>b)?a:b; 100점짜리
		 

		 */ 
	    	 return (a>b)?a:b;
}	     
public Mouse handle(Mouse m) {  //point m>>mouse의 주소값이 들어옴.
	m.x=100;
    m.y=200;                  //int a 할때 a를 10 이라고 생각하듯이, Mouse m 이 있으면, Mouse는 주소값의 자료형이라고 생각하면된다.
    return m;                //그래서 주소값을 입력하는 방법은 new()로 주소를 할당하는 것이다. 즉,Mouse 타입의 주소값 m을 가진다고 생각.
}


}
