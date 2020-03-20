/*포기....
 * 특수한 목적의 맵- 일정부분이 설정되어있음.
 * map 인터페이스르 구현한 클래스
 * 특수한 목적의 map<String,String>(key,value)
 * 고정시킨 클래스:Properties
 * 사용목적
 *app전체를 관리: 환경변수: 프로그램의 버전:파일경로:공통변수
 *
 *ex)
 *config.properties;
 * 
 */
package kr.or.bit;

import java.util.Properties;

public class Ex15_Properties {

	public static void main(String[] args) {
	Properties prop = new Properties();
	prop.setProperty("master","bit@bit.or.kr");
	prop.setProperty("version","1.x.x.x");
	prop.setProperty("deault","c://temp//image");
	//각각의 개발 페이지에서
	System.out.println(prop.getProperty("master"));
	System.out.println(prop.getProperty("defaultpath"));
	
	
	}
	

}
