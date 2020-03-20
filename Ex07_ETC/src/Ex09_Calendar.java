import java.util.Calendar;
import kr.or.bit.utils.Edu_Date;
public class Ex09_Calendar {
	public static void main(String[] args) {
		Calendar cal= Calendar.getInstance(); //new GregorianCalendar();
    	System.out.println("D"+cal.toString());

		//내가 필요한 형식을 추출해서 조합해서 사용
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH)+1);
		System.out.println(cal.get(Calendar.DATE));

		System.out.println("이달의 몇째주: "+cal.get(Calendar.WEEK_OF_MONTH));
		
		System.out.println(cal.get(Calendar.HOUR));
		System.out.println(cal.get(Calendar.MINUTE));
		System.out.println(cal.get(Calendar.SECOND));

		/*
		 * 학사관리 시스템
		 * 페이지 수가 200page. 150page 날짜가..
		 * 1page=2020.03.19
		 * 2page=2020.03.19 ....
		 * 요구사항이 2020년03월19일 이렇게 해줘..
		 * 한번 수정하면 150개 page에 날짜가 변경되어야...
		 * 날짜관련된 클래스< 함수를 150page호출..
		 * class EduDate { static String todate(){날짜생성리턴} }
		 * 1page > EduDate.todate()
		 */
		String date = Edu_Date.DateStirng(Calendar.getInstance(),"/");
		System.out.println(date);
				
		String date4=Edu_Date.monthFormat_DateString(Calendar.getInstance());
		System.out.println(date4);
		
	}

}
