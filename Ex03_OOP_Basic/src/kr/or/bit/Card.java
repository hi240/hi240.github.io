package kr.or.bit;

	//카드 53장을 제작.
	//카드는 각 번호와 모양을 가지고 있다.
	//카드는 크기를 갖고있다. 높이와 너비를 의미한다.
	//카드는 h=50,w=20
	//모든 카드의 높이와 너비는동일
	//카드의 크기를 나중에 변경해달라고 하면?
	//설계도를 다시 변경하지 않고 53장 카드의 크기를 변경할 수 없을까?
	
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

