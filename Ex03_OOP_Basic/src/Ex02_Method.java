import java.util.Scanner;

import kr.or.bit.Fclass;
import kr.or.bit.NoteBook;

public class Ex02_Method {

	public static void main(String[] args) {
Fclass fc = new Fclass();
fc.m();
fc.m2(10);
int result = fc.m3();
System.out.println(result);

result = fc.m4(100);
System.out.println(result);

fc.CallSubSum();                   //f3������ �Լ����������.

result = fc.opSum(-1);

NoteBook nb = new NoteBook();
nb.color="d";
nb.setYear(2020);
int rs= nb.getYear();
System.out.println(rs);
	
	

    int result2=fc.max(100,-50);
    System.out.println(fc.max(100,-50));
    

}
	}