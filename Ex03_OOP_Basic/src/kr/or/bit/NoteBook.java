package kr.or.bit;

public class NoteBook {

	public String color;  //�����Ҵ�!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	private String name; // private�� �� �ǵ��� ����..?????????????????????????????????????????????????????????????????????
	private int year; //
	//���� �Ҵ��� ���� �����Ҵ��� ���ؼ� �ڷḦ ��ȣ�ϰڴ�........,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,
	
	public void setYear(int y) {              //year write�� ����ϴ� �Լ�..
		if(y<0) {
			year=1999;          //�����Ҵ�!!!! ��, ������ ����, �������� �Ҵ����ش�!
		}else {                 //�ٷ� �̰� [ĸ��ȭ]!
			year =y;
		}		
		}	
public int getYear() {                 //��ȣ�� �ڿ��� read �ϴ� �Լ�.
	return year;                       //setter getter �Լ��� Ư���� ������ �����Լ� (private�� �������ְ�!)
}                                      //���콺������-source-generate getter setter�� ������ֵ�.

public int max(int a, int b) {
	   /*if (a>b)
	     return a;
	     else  
		 return b;          30��¥��       return �� �ݺ��ϴ� ���� �ſ� ������ �����̴�....�ִ��� �ϳ���������...................
		 
		 int result=0;
		 if(a>b){
		 result=a;}
		 else {result=b;}
		 return result;     60��¥��
		 
		 int max=(a>b)?a:b;
		 return max;        90��¥��
		 
		 return (a>b)?a:b; 100��¥��
		 

		 */ 
	    	 return (a>b)?a:b;
}	     
public Mouse handle(Mouse m) {  //point m>>mouse�� �ּҰ��� ����.
	m.x=100;
    m.y=200;                  //int a �Ҷ� a�� 10 �̶�� �����ϵ���, Mouse m �� ������, Mouse�� �ּҰ��� �ڷ����̶�� �����ϸ�ȴ�.
    return m;                //�׷��� �ּҰ��� �Է��ϴ� ����� new()�� �ּҸ� �Ҵ��ϴ� ���̴�. ��,Mouse Ÿ���� �ּҰ� m�� �����ٰ� ����.
}


}