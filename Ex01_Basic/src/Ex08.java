
public class Ex08 {
	public static void main(String[] args) {
		/*
		우리는 백화점 경품 시스템을 만들려고 한다
		경품 시스템은 나오는 점수에 따라 경품을 지급하는 시스템이다
		경품 추첨시 1000 점수가 나오면
		경품으로 TV , NoteBook , 냉장고 , 한우세트 , 휴지
		경품 추첨시 900 점수가 나오면
		경품으로  NoteBook , 냉장고 , 한우세트 , 휴지
		경품 추첨시 800 점수가 나오면
		경품으로  냉장고 , 한우세트 , 휴지
		경품 추첨시 700 점수가 나오면
		경품으로  한우세트 , 휴지
		경품 추첨시 600 점수가 나오면
		경품으로  휴지
		그외 점수는 100 ~ 500 까지는 칫솔 
		경품시스템의 점수 범위는 100 ~ 1000 점까지 한정되어 있다
		사용자가 경품 시스템을 사용시 랜덤하게 100 ~ 1000까지의 값이 나오게 되어 있습니다.
		*/
	/*	
		int number = (int)(Math.random() * 10 + 1)*100;
		System.out.println("추첨번호 : " + number);
		String gift = "";
		gift += "고객님의 점수는 "+ number +" 경품은 ";
		switch (number) {
		case 1000: gift += "TV ";
		case 900: gift += "NoteBook ";
		case 800: gift += "냉장고 ";
		case 700: gift += "한우세트 ";
		case 600: gift += "휴지 ";
		break;
		default: gift += "칫솔";
		
		
		
		}
		System.out.println(gift);
		
	*/	
		//구구단 2~9단

	/*	for (int f=2;f<=9;f++);
		{
			for(int n=1;n<=9;n++) {
				int f=0;
				System.out.printf("%d * %d = %d\t",f,n,f*n);
			}
	}
	*/
		
		
		
	}
}
