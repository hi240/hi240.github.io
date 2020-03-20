
class Product4{
	int price;
	int bonuspoint;
	Product4(int price) {
		this.price = price;
		this.bonuspoint = (int)(this.price/10.0);
	}
}

class KtTv4 extends Product4{
	KtTv4(){
		super(500);
	}
	@Override
	public String toString() {
		return "KtTv4";
	}
}

class Audio4 extends Product4{
	Audio4(){
		super(100);
	}
	@Override
	public String toString() {
		return "Audio4";
	}
}

class NoteBook4 extends Product4{
	NoteBook4(){
		super(150);
	}
	
	@Override
	public String toString() {
		return "NoteBook4";
	}
}

class Buyer4{ //구매자
	int money;
	int bonuspoint;
	int index=0;
	Product4[] Cart;

	Buyer4(){
		this(1000,0);
	}
	Buyer4(int money,int bonuspoint){
		Cart = new Product4[10]; //default 생성자에 있었다 하면, 이 인스턴스를 썼을 때는 배열이 생성되지 않는다.
		this.money=money;
		this.bonuspoint=bonuspoint;
	}
	void Buy(Product4 product){
		if(this.money< product.price) {
            System.out.println("고객님 잔액이 부족합니다^^! "+this.money);
            return;
        }
		//Cart범위 제한.
		if(this.index >= 10) { 
			System.out.println("고객님 그만 사세요");
			return;
		}
		//장바구니 담기
		Cart[index++]=product;		
        this.money -= product.price;
        this.bonuspoint += product.bonuspoint;

	}
    //계산대 (장바구니)
	//장바구니에 담긴 물건을 계산
	//물건의 총액
	//물건의 목록  출력
	void Summary(){
		int totalprice= 0;
		int totalbonuspoint = 0;
		String productlist ="";
		for(int i=0;i<index;i++)		
	{  totalprice +=Cart[i].price;
		totalbonuspoint +=Cart[i].bonuspoint;
		productlist +=Cart[i].toString()+" "; }
	System.out.println("구매한 물건 총액: "+totalprice);
	System.out.println("포인트총액: "+totalbonuspoint);
	System.out.println("구매한 물건 목록: "+productlist);
}
}
public class Ex13_Inherit_KeyPoint_Array {
	public static void main(String[] args) {
		KtTv4 kttv= new KtTv4();
		Audio4 audio = new Audio4();
		NoteBook4 notebook = new NoteBook4();
		Buyer4 buyer = new Buyer4(1000,2);
		buyer.Buy(kttv);
	    buyer.Buy(audio);
	    buyer.Buy(audio);
		buyer.Summary();
	}
}
