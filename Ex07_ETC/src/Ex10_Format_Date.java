import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/*
 * 
 */
public class Ex10_Format_Date {

	public static void main(String[] args) throws ParseException {
		Date curdate= new Date();
		Calendar cal= Calendar.getInstance();
		System.out.println("Date: "+curdate); //formating ����.
		System.out.println("cal: "+cal); //�̹� �� ��ü�� ���ڿ�.
		System.out.println("cal getTime()"+cal.getTime()); //format
		
		String StringDate = "202012121212";
		
		SimpleDateFormat dateformat = new SimpleDateFormat("yyyy�� MM�� dd�� HH�� mm��");
		System.out.println(dateformat.format(curdate));
		System.out.println(dateformat.format(cal.getTime()));
       
//		//���ڿ� data�� ��¥�� �ٲ� �� �ִ�..?!
//		//��¥���ĸ°� ������� ���ڿ��� ��¥�� �ٲ� �� �ִ�.
//		Date stringdate= dateformat.parse(StringDate);
//		System.out.println("StirngDate:"+StringDate);
//		System.out.println("StirngDate:"+stringdate);
//		long datelong = stringdate.getTime();
//		System.out.println(datelong);
	}

}
