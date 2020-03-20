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
//īƮ��
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
	int index=0;   //�� �� ����� ���� �뵵�̴�.
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
			System.out.println("���� ���� ������ �� �����ϴ�..");
			return;
		}
		if (index>10) {
			System.out.println("���� �׸� �缼��.. īƮ�� �����մϴ�.");
			return;
		}
		this.money -= p.price;
		this.bonuspoint += p.bonuspoint;
		sum +=p.price;
		cart[index++]=p;
		System.out.println("�ܾ���: "+this.money);
	}
	void summary() {
		//�� ���
		System.out.println("������ ���� �Ѿ�: "+sum);
		System.out.println("����Ʈ �Ѿ�: "+sum*0.01);
		System.out.print("������ ���� �����: ");
		for(int i=0;i<index;i++) {
			System.out.print(cart[i]+", ");}
		
		//����� ���
			int totalprice= 0;
			int totalbonuspoint = 0;
			String productlist ="";
			for(int i=0;i<index;i++) {
				totalprice +=cart[i].price;
				totalbonuspoint +=cart[i].bonuspoint;
				productlist +=cart[i]+" ";
			}
			System.out.println("������ ���� �Ѿ�: "+totalprice);
			System.out.println("����Ʈ �Ѿ�: "+totalbonuspoint);
			System.out.print("������ ���� �����: "+productlist);
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
