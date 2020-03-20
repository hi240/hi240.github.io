/*
요구사항
카트 (Cart)
카트에는 매장에 있는 모든 전자제품을 담을 수 있다 
카트의 크기는 고정되어 있다 (10개) : 1개  , 2개 담을 수 있고 최대 10개까지 담을 수 있다
고객이 물건을 구매 하면 ... 카트에 담는다

계산대에 가면 전체 계산
계산기능이 필요
summary() 기능 추가해 주세요
당신이 구매한 물건이름 과 가격정보 나열
총 누적금액 계산 출력
호서
hint) 카트 물건을 담는 행위 (Buy())
hint) Buyer ..>> summary()  main 함수에서 계산할때

구매자는 default 금액을 가지고 있고 초기금액을 설정할 수 도 있다

*/
class Product2{
	int price;
	int bonuspoint;
	Product2(int price) {
		this.price = price;
		this.bonuspoint = (int)(this.price/10.0);
	}
}

class KtTv2 extends Product2{
	KtTv2(){
		super(500);
	}
	@Override
	public String toString() {
		return "KtTv2";
	}
}

class Audio2 extends Product2{
	Audio2(){
		super(100);
	}
	@Override
	public String toString() {
		return "Audio2";
	}
}

class NoteBook2 extends Product2{
	NoteBook2(){
		super(150);
	}
	
	@Override
	public String toString() {
		return "NoteBook2";
	}
}

class Buyer2{ //구매자
	int money=1000;
	int bonuspoint=0;
	int sum;
	int i=0;
	int ready=0;
    Product2 []cart = new Product2[10];   //10개를 담는 카트가 있음. 
	//구매기능 - 카트담아진다, 카트에는 최대 10개만 담을 수 있다.
	void Buy(Product2 product){
		if(this.money< product.price) {
            System.out.println("고객님 잔액이 부족합니다^^! "+this.money);
            return;
        }
		if (ready>10) {
	    	   System.out.println("더이상 물건을 담을 수 없습니다.");
	    	   return;
	       }
        this.money -= product.price;
        this.bonuspoint += product.bonuspoint;

        cart[i]=product; //cart[0]에 프로덕트를 담았음.         
        i++;
        ready=i;
	}
    //계산대 (장바구니)
	//장바구니에 담긴 물건을 계산
	//물건의 총액
	//물건의 목록  출력
	void Summary(){
		for(int i=0;i<ready;i++) {
		System.out.println("물건의 목록은: "+cart[i]);
		sum +=cart[i].price;
		}
		System.out.println("물건의 총액은: "+sum);
	}	
}
public class Ex13_Inherit_KeyPoint_Override {
	public static void main(String[] args) {
		KtTv2 kttv= new KtTv2();
		Audio2 audio = new Audio2();
		NoteBook2 notebook = new NoteBook2();
		Buyer2 buyer = new Buyer2();
		buyer.Buy(kttv);
	    buyer.Buy(audio);
	    buyer.Buy(audio);
		buyer.Summary();
		
	
		

	}

}
