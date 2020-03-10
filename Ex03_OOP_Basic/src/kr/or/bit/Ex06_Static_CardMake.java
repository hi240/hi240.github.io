package kr.or.bit;

public class Ex06_Static_CardMake {

	public static void main(String[] args) {
     
		//53개 제작하였으나,
		//고객 요구 사항: 크기가 이게 아닌데요
		//h=70 w=50
		//설계도를 다시 변경해야되고, 53장을 다시 제작해야 된다..........
		//각각의 카드의 높이와.....넓이를 바꾸라

		Card card = new Card();
		card.cardname(1,"heart");
        Card.h=70;
        Card.w=50;
        card.h=30;
		card.cardInfo();
		card.cardname(2,"spade");
		card.cardInfo(); //카드정보출력.
		
	}

}
