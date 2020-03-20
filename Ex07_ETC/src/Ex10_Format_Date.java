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
		System.out.println("Date: "+curdate); //formating 가능.
		System.out.println("cal: "+cal); //이미 이 자체가 문자열.
		System.out.println("cal getTime()"+cal.getTime()); //format
		
		String StringDate = "202012121212";
		
		SimpleDateFormat dateformat = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분");
		System.out.println(dateformat.format(curdate));
		System.out.println(dateformat.format(cal.getTime()));
       
//		//문자열 data를 날짜로 바꿀 수 있다..?!
//		//날짜형식맞게 만들어진 문자열을 날짜로 바꿀 수 있다.
//		Date stringdate= dateformat.parse(StringDate);
//		System.out.println("StirngDate:"+StringDate);
//		System.out.println("StirngDate:"+stringdate);
//		long datelong = stringdate.getTime();
//		System.out.println(datelong);
	}

}
