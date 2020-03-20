/*
시나리오(요구사항)
저희는 가전제품 매장 솔루션을 개발하는 사업팀입니다
A라는 전자제품 매장이 오픈되면 
[클라이언트 요구사항]
가전제품은  제품의 가격 , 제품의 포인트 정보를 공통적으로 가지고 있습니다
각각의 가전제품은 제품별 고유한 이름을 가지고 있다

ex)
ㅇ각각의 전자제품은 이름을 가지고 있다(ex: Tv , Audio , Computer)
ㅇ각각의 전자제품은 다른 가격을 가지고 있다(Tv:5000, Audio:6000 ....)
ㅇ제품의 포인트는 가격의 10% 적용한다 
시뮬레이션 시나리오
구매자 : 제품을 구매하기 위한 금액정보 , 포인트 정보를 가지고 있다 
예를 들면 : 10만원  , 포인트 0
구매자는 제품을 구매할 수 있다 , 구매행위를 하게되면 가지고 있는 돈은  감소하고 포인트는 올라간다
구매자는 처음 초기 금액을 가질 수 있다
*/
class Product{
	int price;
	int bonuspoint;
	Product(int price){
		this.price=price;
		this.bonuspoint=(int)(this.price/10.0);
	}
}
class KtTv extends Product{
	KtTv(){
		super(500);
	}
	@Override
	public String toString() {
		return "KtTv";
	}
}
class Audio extends Product{
	Audio(){
		super(600);
	}
	@Override
	public String toString() {
		return "Audio";
	}
}
class NoteBook extends Product{
	NoteBook(){
		super(150);
	}
	@Override
	public String toString() {
		return "NoteBook";
	}
}
class Buyer{
	int money=10000;
	int bonuspoint=0;
	//구매행위(기능 잔액 감소, 포인트정보갱신)
	//구매자는 매장에잇는 모든 물건을 구매할수잇다.
	
	/*하와이 휴가..^^
	매장에 1000개의 다른 제품이 추가.
	1. 매장에서 나머지 997개의 제품을 판매할 수 있을까요?
	   (X)나머지 997개의 제품을 구매할 수 있는 기능을 만들지 않아서.
	2. 난리>>인터넷>>개발서버접속>>휴가>>997개의 함수를 만들어..
	      휴가 END...
	즐거운 휴가를 보내기 위한 방법을 제시하세요.
	*/
//	void kttvBuy(KtTv n) { //함수가 제품 객체를 parameter로 받아서 가격과 포인트정보를 뽑아..
//	   if(this.money<n.price) {
//		   System.out.println("고객님.. 잔액이 부족합니다.. "+this.money);
//	   return; //함수를 종료.... kttbBuy 함수를 빠져나감(구매 행위 종료)
//	   }
//	   //실 구매행위
//	   this.money -= n.price;
//	   this.bonuspoint += n.bonuspoint;
//	   System.out.println("구매한 물건은: "+n.toString());
//	}
//	void audioBuy(Audio n) { 
//		   if(this.money<n.price) {
//			   System.out.println("고객님.. 잔액이 부족합니다.. "+this.money);
//		   return; 
//		   }
//		   this.money -= n.price;
//		   this.bonuspoint += n.bonuspoint;
//		   System.out.println("구매한 물건은: "+n.toString());
//		}
//	void notebookBuy(NoteBook n) { 
//		   if(this.money<n.price) {
//			   System.out.println("고객님.. 잔액이 부족합니다.. "+this.money);
//		   return; 
//		   }
//		   this.money -= n.price;
//		   this.bonuspoint += n.bonuspoint;
//		   System.out.println("구매한 물건은: "+n.toString());
//		}
/*2차 코드 개선(리펙토링)
 * [하나의 이름]으로 여러가지 기능..
 */
//	void Buy(KtTv kttv) { 
//		   if(this.money<kttv.price) {
//			   System.out.println("고객님.. 잔액이 부족합니다.. "+this.money);
//		   return; 
//		   }
//		   this.money -= kttv.price;
//		   this.bonuspoint += kttv.bonuspoint;
//		   System.out.println("구매한 물건은: "+kttv.toString());
//		}
//	void Buy(Audio n) { 
//		   if(this.money<n.price) {
//			   System.out.println("고객님.. 잔액이 부족합니다.. "+this.money);
//		   return; 
//		   }
//		   this.money -= n.price;
//		   this.bonuspoint += n.bonuspoint;
//		   System.out.println("구매한 물건은: "+n.toString());
//		}
	/*3차 코드개선 중복제거
	Key Point : 모든 제품은 Product를 상속하고 있다.
	모든 제품의 부모는 product
	Product P;
	Audio audio = new Audio();
	P= audio;
	NoteBook notebook = new NoteBook();
	P= notebook; <<***
	단, 부모는 자신것만 접근 가능.
	toString() 자식이 재정의... 부모타입으로 접근하더라도 재정의 쪽으로 넘어간다..	
	*/
	void buy(Product n) {
		//tv, audio 등은 product의 자손이고, product는 tv,audio의 주소값을 가지고 있다.
		//여기 n의 참조변수를 예전에 product 타입을 가진  변수들을 썼듯이,
		//자손들의 주소 값을 불러와서도 쓸 수 있다. 
        if(this.money< n.price) {
            System.out.println("고객님 잔액이 부족합니다^^! "+this.money);
            return;
        }    
        this.money -= n.price;
        this.bonuspoint += n.bonuspoint;
        System.out.println("구매한 물건은: "+n.toString()); 
}
}

public class Ex12_Inherit_KeyPoint {

	public static void main(String[] args) {
		
		
		KtTv kttv=new KtTv();
		System.out.println(kttv.toString());
		
		Audio audio=new Audio();
		System.out.println(audio.toString());
		
		NoteBook notebook=new NoteBook();
		System.out.println(notebook.toString());

		Buyer buyer = new Buyer();
		
		buyer.buy(kttv);
		buyer.buy(audio);
		
		System.out.println("남은잔액은: "+buyer.money);
		System.out.println("잔여 포인트는: "+buyer.bonuspoint);
		
	}

}


