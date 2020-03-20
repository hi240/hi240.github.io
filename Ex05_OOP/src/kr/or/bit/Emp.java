package kr.or.bit;
//Ŭ����>>����>>DTO(data transfer object), VO(value object), DOMAIN(����)
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
	//toString() �Լ� ������ Object
	//��Ӱ��迡��.. toStirng() ���ڴ���ϰ���ۿ�
	//Object >> public String toString()
	//�� �ϰ� �ʿ��ϴٸ� ������ ��!
	@Override
	public String toString() {
		return "Emp [empno=" + empno + ", ename=" + ename + "]";
	}
	
	
    
}
