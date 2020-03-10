class Data{
	int i;
}
public class Ex13_Method_Call {
	public static void main(String[] args) {
		Data d = new Data();         
		d.i=100;
		scall(d);              //111     
		vcall(d.i);            //8888     
		System.out.println(d.i);   //111
	}
	static void scall(Data data) {           //Data라는 타입을 갖는 [주소값]을 받는다. 밑에 애와 차이 주목.
	    data.i=111;                          //Data라는 변수도 xx라는 번지.	
	}
	static void vcall(int x) {               //값을 받는다. call by value
		x=8888;
	}
}
