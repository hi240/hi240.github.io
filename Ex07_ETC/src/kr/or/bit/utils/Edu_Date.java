package kr.or.bit.utils;

import java.util.Calendar;

//��� �ϸ� ����ڰ� ���ϰ� �� �� ������?
//���� ����ϰ� �� �� ������? > static

public class Edu_Date {
    public static String DateStirng(Calendar date) {
    	return (date.get(Calendar.YEAR)+"��"+
    			 date.get(Calendar.MONTH)+"��"+
    			 date.get(Calendar.DATE)+"��");
    }
    public static String DateStirng(Calendar date, String opr ) {
    	return (date.get(Calendar.YEAR)+opr+
    			 date.get(Calendar.MONTH)+opr+
    			 date.get(Calendar.DATE));
    }
    
    //�䱸���� 2020-3-19 ����� 1~9�������� �տ� 0�� �ٿ���.
    
    public static String monthFormat_DateString(Calendar date) {
    	String month="";
      if(date.get(Calendar.MONTH)+1<=9) {
 	    month="0"+date.get(Calendar.MONTH);
        }
      else {month=String.valueOf(date.get(Calendar.MONTH)+1);}
    	return (date.get(Calendar.YEAR)+"��"+
    			 month+"��"+date.get(Calendar.DATE)+"��"
    			 );
    }
}
