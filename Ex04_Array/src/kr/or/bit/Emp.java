package kr.or.bit;

//설계도 new재사용
public class Emp {
 
	//캡슐화된 멤버필드
	private int empno;
	private String ename;
	
	public Emp() {}
	//오버로딩 생성자.
    //필요하다면 setter getter를 구현할 수 있다.
	public Emp(int empno, String ename) {
		this.empno= empno;
		this.ename= ename;
	}
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	//기능 -정보출력
	public void empInfoPrint() {
		System.out.println(this.empno+" / "+this.ename);
	}
	
	
	
}
