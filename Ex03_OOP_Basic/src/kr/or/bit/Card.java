package kr.or.bit;

	//ī�� 53���� ����.
	//ī��� �� ��ȣ�� ����� ������ �ִ�.
	//ī��� ũ�⸦ �����ִ�. ���̿� �ʺ� �ǹ��Ѵ�.
	//ī��� h=50,w=20
	//��� ī���� ���̿� �ʺ�µ���
	//ī���� ũ�⸦ ���߿� �����ش޶�� �ϸ�?
	//���赵�� �ٽ� �������� �ʰ� 53�� ī���� ũ�⸦ ������ �� ������?
	
public class Card {

	public int number;
    public String kind;
    public static int h = 50; 
    public static int w = 20;
    public void cardname(int a,String b) {
    	number=a;
    	kind=b;
    }
    public void cardInfo() {
    	System.out.println(number+kind+h+w);
    }
	
}
