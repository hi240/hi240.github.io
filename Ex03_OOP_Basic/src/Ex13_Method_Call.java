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
	static void scall(Data data) {           //Data��� Ÿ���� ���� [�ּҰ�]�� �޴´�. �ؿ� �ֿ� ���� �ָ�.
	    data.i=111;                          //Data��� ������ xx��� ����.	
	}
	static void vcall(int x) {               //���� �޴´�. call by value
		x=8888;
	}
}
