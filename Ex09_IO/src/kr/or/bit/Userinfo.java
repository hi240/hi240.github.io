package kr.or.bit;

import java.io.Serializable;

/*
��ü���
��ü(Car, Tv) ����� ��Ʈ��ũ�� ���ؼ� ����(txt ���� ��ü write,��ü read) / ���μ��� ���� ��� (a.class, b.class)
����ȭ: ��ü�� �����ؼ� ���� ���� ������ ����
������ȭ: ���ص� ��ü�� �ٽ� �����ϴ� ����
�ǽ�
��� >> ���� > ��ü�� ����ȭ���·� write
��� >> ���� > ��ü�� ������ȭ���·� read
��, ����� �ٿ����� �� ����ȭ �Ұ���
��� ����? ����ȭ ������ ��ǰ�� ���赵 ���� �ٸ���. Serializable�� implements��.

 */
public class Userinfo implements Serializable{ //�̰� ������ �� �ִ�.
	private String name;
	private String pwd;
	private int age;
	
	public Userinfo() {}
	public Userinfo(String name,String pwd,int age) {
		this.name=name;
		this.age=age;
		this.pwd=pwd;
	}
	
	@Override
	public String toString() {
		return "Userinfo [name=" + name + ", pwd=" + pwd + ", age=" + age + "]";
	}
	
}
