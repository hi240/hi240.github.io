/*����....
 * Ư���� ������ ��- �����κ��� �����Ǿ�����.
 * map �������̽��� ������ Ŭ����
 * Ư���� ������ map<String,String>(key,value)
 * ������Ų Ŭ����:Properties
 * ������
 *app��ü�� ����: ȯ�溯��: ���α׷��� ����:���ϰ��:���뺯��
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
	//������ ���� ����������
	System.out.println(prop.getProperty("master"));
	System.out.println(prop.getProperty("defaultpath"));
	
	
	}
	

}
