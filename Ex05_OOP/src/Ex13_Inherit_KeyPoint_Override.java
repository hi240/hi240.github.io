/*
�䱸����
īƮ (Cart)
īƮ���� ���忡 �ִ� ��� ������ǰ�� ���� �� �ִ� 
īƮ�� ũ��� �����Ǿ� �ִ� (10��) : 1��  , 2�� ���� �� �ְ� �ִ� 10������ ���� �� �ִ�
���� ������ ���� �ϸ� ... īƮ�� ��´�

���뿡 ���� ��ü ���
������� �ʿ�
summary() ��� �߰��� �ּ���
����� ������ �����̸� �� �������� ����
�� �����ݾ� ��� ���
ȣ��
hint) īƮ ������ ��� ���� (Buy())
hint) Buyer ..>> summary()  main �Լ����� ����Ҷ�

�����ڴ� default �ݾ��� ������ �ְ� �ʱ�ݾ��� ������ �� �� �ִ�

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

class Buyer2{ //������
	int money=1000;
	int bonuspoint=0;
	int sum;
	int i=0;
	int ready=0;
    Product2 []cart = new Product2[10];   //10���� ��� īƮ�� ����. 
	//���ű�� - īƮ�������, īƮ���� �ִ� 10���� ���� �� �ִ�.
	void Buy(Product2 product){
		if(this.money< product.price) {
            System.out.println("���� �ܾ��� �����մϴ�^^! "+this.money);
            return;
        }
		if (ready>10) {
	    	   System.out.println("���̻� ������ ���� �� �����ϴ�.");
	    	   return;
	       }
        this.money -= product.price;
        this.bonuspoint += product.bonuspoint;

        cart[i]=product; //cart[0]�� ���δ�Ʈ�� �����.         
        i++;
        ready=i;
	}
    //���� (��ٱ���)
	//��ٱ��Ͽ� ��� ������ ���
	//������ �Ѿ�
	//������ ���  ���
	void Summary(){
		for(int i=0;i<ready;i++) {
		System.out.println("������ �����: "+cart[i]);
		sum +=cart[i].price;
		}
		System.out.println("������ �Ѿ���: "+sum);
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
