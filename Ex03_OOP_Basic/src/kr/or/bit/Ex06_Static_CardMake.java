package kr.or.bit;

public class Ex06_Static_CardMake {

	public static void main(String[] args) {
     
		//53�� �����Ͽ�����,
		//���� �䱸 ����: ũ�Ⱑ �̰� �ƴѵ���
		//h=70 w=50
		//���赵�� �ٽ� �����ؾߵǰ�, 53���� �ٽ� �����ؾ� �ȴ�..........
		//������ ī���� ���̿�.....���̸� �ٲٶ�

		Card card = new Card();
		card.cardname(1,"heart");
        Card.h=70;
        Card.w=50;
        card.h=30;
		card.cardInfo();
		card.cardname(2,"spade");
		card.cardInfo(); //ī���������.
		
	}

}