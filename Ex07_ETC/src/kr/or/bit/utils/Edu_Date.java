package kr.or.bit.utils;

import java.util.Calendar;

//어떻게 하면 사용자가 편하게 쓸 수 있을까?
//마니 사용하게 할 수 있을까? > static

public class Edu_Date {
    public static String DateStirng(Calendar date) {
    	return (date.get(Calendar.YEAR)+"년"+
    			 date.get(Calendar.MONTH)+"월"+
    			 date.get(Calendar.DATE)+"일");
    }
    public static String DateStirng(Calendar date, String opr ) {
    	return (date.get(Calendar.YEAR)+opr+
    			 date.get(Calendar.MONTH)+opr+
    			 date.get(Calendar.DATE));
    }
    
    //요구사항 2020-3-19 별루야 1~9월까지는 앞에 0을 붙여줘.
    
    public static String monthFormat_DateString(Calendar date) {
    	String month="";
      if(date.get(Calendar.MONTH)+1<=9) {
 	    month="0"+date.get(Calendar.MONTH);
        }
      else {month=String.valueOf(date.get(Calendar.MONTH)+1);}
    	return (date.get(Calendar.YEAR)+"년"+
    			 month+"월"+date.get(Calendar.DATE)+"일"
    			 );
    }
}
