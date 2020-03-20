
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

class Buyer4{ //������
	int money;
	int bonuspoint;
	int index=0;
	Product4[] Cart;

	Buyer4(){
		this(1000,0);
	}
	Buyer4(int money,int bonuspoint){
		Cart = new Product4[10]; //default �����ڿ� �־��� �ϸ�, �� �ν��Ͻ��� ���� ���� �迭�� �������� �ʴ´�.
		this.money=money;
		this.bonuspoint=bonuspoint;
	}
	void Buy(Product4 product){
		if(this.money< product.price) {
            System.out.println("���� �ܾ��� �����մϴ�^^! "+this.money);
            return;
        }
		//Cart���� ����.
		if(this.index >= 10) { 
			System.out.println("���� �׸� �缼��");
			return;
		}
		//��ٱ��� ���
		Cart[index++]=product;		
        this.money -= product.price;
        this.bonuspoint += product.bonuspoint;

	}
    //���� (��ٱ���)
	//��ٱ��Ͽ� ��� ������ ���
	//������ �Ѿ�
	//������ ���  ���
	void Summary(){
		int totalprice= 0;
		int totalbonuspoint = 0;
		String productlist ="";
		for(int i=0;i<index;i++)		
	{  totalprice +=Cart[i].price;
		totalbonuspoint +=Cart[i].bonuspoint;
		productlist +=Cart[i].toString()+" "; }
	System.out.println("������ ���� �Ѿ�: "+totalprice);
	System.out.println("����Ʈ�Ѿ�: "+totalbonuspoint);
	System.out.println("������ ���� ���: "+productlist);
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
