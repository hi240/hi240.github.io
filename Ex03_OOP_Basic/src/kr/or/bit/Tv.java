package kr.or.bit;
/*
 * tv���赵 �䱸���� ����
 * tv�� ä�� ������ �������ִ�.(ex 1��~200���� �����������մ�)
 * tv�� �귣���̸��� �������ֵ�. (LG,SAMSUNG)
 * tv�� ä����ȯ ����� �������մ�.  tv�� �� ä�ξ��� �ӵ��̰����ϴ�.
 * ä���� ������Ű�� ����� ���������մ�.
 * ä���� ���ҽ�Ű�±���� �������մ�.
 * 
 */
public class Tv {
//����� �Ƽ��� �ƶ�ƃ� �ƶ�ƶ� �Ƽ���...................
	public int ch;
	public String brandname="";
	
    public void ch_up() {
    ch++;
    }

    
	public void ch_down(){
	ch--;
	}
    public void tvPrint() {
  	  System.out.printf("[%s],[%d] \n,",brandname,ch);
    }
}