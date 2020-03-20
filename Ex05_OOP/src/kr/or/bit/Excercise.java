package kr.or.bit;
class Product{
	int price;
	int bonuspoint;
	int sum;
	Product(int price){
		this.price=price;
		this.bonuspoint=(int)(price*0.01);
	}
	Product(){		
	}
}
//카트를
class Audio extends Product{
	Audio(){
		super(200);
	}
	@Override
	public String toString() {
		return "Audio";
	}	
}
class Tv extends Product{
	Tv(){
		super(200);
	}
	@Override
	public String toString() {
		return "Tv";
	}
}
class Notebook extends Product{
	Notebook(){
		super(200);
	}
	@Override
	public String toString() {
		return "Notebook";
	}
}
class Buyer extends Product{
	int money;
	int bonuspoint;
	int index=0;   //몇 개 샀는지 세는 용도이다.
	Product[] cart;
	Buyer(){
		this(2000,0);
	}
	Buyer(int money,int bonuspoint){
		cart = new Product[10];
		this.money=money;
		this.bonuspoint=bonuspoint;
	}
	void buy(Product p) {
		if (money<p.price) {
			System.out.println("돈이 없어 구매할 수 없습니다..");
			return;
		}
		if (index>10) {
			System.out.println("고객님 그만 사세요.. 카트가 부족합니다.");
			return;
		}
		this.money -= p.price;
		this.bonuspoint += p.bonuspoint;
		sum +=p.price;
		cart[index++]=p;
		System.out.println("잔액은: "+this.money);
	}
	void summary() {
		//내 방법
		System.out.println("구매한 물건 총액: "+sum);
		System.out.println("포인트 총액: "+sum*0.01);
		System.out.print("구매한 물건 목록은: ");
		for(int i=0;i<index;i++) {
			System.out.print(cart[i]+", ");}
		
		//강사님 방법
			int totalprice= 0;
			int totalbonuspoint = 0;
			String productlist ="";
			for(int i=0;i<index;i++) {
				totalprice +=cart[i].price;
				totalbonuspoint +=cart[i].bonuspoint;
				productlist +=cart[i]+" ";
			}
			System.out.println("구매한 물건 총액: "+totalprice);
			System.out.println("포인트 총액: "+totalbonuspoint);
			System.out.print("구매한 물건 목록은: "+productlist);
	}
}
public class Excercise {
	public static void main(String[] args) {
		Audio audio = new Audio();
		Tv tv = new Tv();
		Notebook notebook = new Notebook();
		Buyer buyer = new Buyer(2000,0);
		
		buyer.buy(tv);
		buyer.buy(audio);
		buyer.buy(notebook);
		buyer.summary();
	
		}
		
	
}
