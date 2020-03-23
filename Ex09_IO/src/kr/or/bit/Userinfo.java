package kr.or.bit;

import java.io.Serializable;

/*
객체통신
객체(Car, Tv) 연결된 네트워크를 통해서 파일(txt 파일 객체 write,객체 read) / 프로세스 간의 통신 (a.class, b.class)
직렬화: 객체를 분해해서 줄을 세워 보내는 과정
역직렬화: 분해된 객체를 다시 조립하는 과정
실습
대상 >> 파일 > 객체를 직렬화형태로 write
대상 >> 파일 > 객체를 역직렬화형태로 read
단, 본드로 붙여놓은 건 직렬화 불가능
어떻게 알지? 직렬화 가능한 제품은 설계도 부터 다르다. Serializable을 implements함.

 */
public class Userinfo implements Serializable{ //이건 조립할 수 있다.
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
