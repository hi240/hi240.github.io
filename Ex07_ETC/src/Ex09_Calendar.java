import java.util.Calendar;
import kr.or.bit.utils.Edu_Date;
public class Ex09_Calendar {
	public static void main(String[] args) {
		Calendar cal= Calendar.getInstance(); //new GregorianCalendar();
    	System.out.println("D"+cal.toString());

		//���� �ʿ��� ������ �����ؼ� �����ؼ� ���
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH)+1);
		System.out.println(cal.get(Calendar.DATE));

		System.out.println("�̴��� ��°��: "+cal.get(Calendar.WEEK_OF_MONTH));
		
		System.out.println(cal.get(Calendar.HOUR));
		System.out.println(cal.get(Calendar.MINUTE));
		System.out.println(cal.get(Calendar.SECOND));

		/*
		 * �л���� �ý���
		 * ������ ���� 200page. 150page ��¥��..
		 * 1page=2020.03.19
		 * 2page=2020.03.19 ....
		 * �䱸������ 2020��03��19�� �̷��� ����..
		 * �ѹ� �����ϸ� 150�� page�� ��¥�� ����Ǿ��...
		 * ��¥���õ� Ŭ����< �Լ��� 150pageȣ��..
		 * class EduDate { static String todate(){��¥��������} }
		 * 1page > EduDate.todate()
		 */
		String date = Edu_Date.DateStirng(Calendar.getInstance(),"/");
		System.out.println(date);
				
		String date4=Edu_Date.monthFormat_DateString(Calendar.getInstance());
		System.out.println(date4);
		
	}

}
