package kr.or.bit;
//클래스>>목적>>DTO(data transfer object), VO(value object), DOMAIN(업무)
public class Emp { //class Emp extends Object
    private int empno;
    private String ename;
    
    public Emp(int empno,String ename) {
    	this.empno=empno;
    	this.ename=ename;
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
	//toString() 함수 주인은 Object
	//상속관계에서.. toStirng() 내멋대로하고시퍼요
	//Object >> public String toString()
	//야 니가 필요하다면 재정의 해!
	@Override
	public String toString() {
		return "Emp [empno=" + empno + ", ename=" + ename + "]";
	}
	
	
    
}
