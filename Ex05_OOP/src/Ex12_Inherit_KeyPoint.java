/*
�ó�����(�䱸����)
����� ������ǰ ���� �ַ���� �����ϴ� ������Դϴ�
A��� ������ǰ ������ ���µǸ� 
[Ŭ���̾�Ʈ �䱸����]
������ǰ��  ��ǰ�� ���� , ��ǰ�� ����Ʈ ������ ���������� ������ �ֽ��ϴ�
������ ������ǰ�� ��ǰ�� ������ �̸��� ������ �ִ�

ex)
�������� ������ǰ�� �̸��� ������ �ִ�(ex: Tv , Audio , Computer)
�������� ������ǰ�� �ٸ� ������ ������ �ִ�(Tv:5000, Audio:6000 ....)
����ǰ�� ����Ʈ�� ������ 10% �����Ѵ� 
�ùķ��̼� �ó�����
������ : ��ǰ�� �����ϱ� ���� �ݾ����� , ����Ʈ ������ ������ �ִ� 
���� ��� : 10����  , ����Ʈ 0
�����ڴ� ��ǰ�� ������ �� �ִ� , ���������� �ϰԵǸ� ������ �ִ� ����  �����ϰ� ����Ʈ�� �ö󰣴�
�����ڴ� ó�� �ʱ� �ݾ��� ���� �� �ִ�
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
	//��������(��� �ܾ� ����, ����Ʈ��������)
	//�����ڴ� ���忡�մ� ��� ������ �����Ҽ��մ�.
	
	/*�Ͽ��� �ް�..^^
	���忡 1000���� �ٸ� ��ǰ�� �߰�.
	1. ���忡�� ������ 997���� ��ǰ�� �Ǹ��� �� �������?
	   (X)������ 997���� ��ǰ�� ������ �� �ִ� ����� ������ �ʾƼ�.
	2. ����>>���ͳ�>>���߼�������>>�ް�>>997���� �Լ��� �����..
	      �ް� END...
	��ſ� �ް��� ������ ���� ����� �����ϼ���.
	*/
//	void kttvBuy(KtTv n) { //�Լ��� ��ǰ ��ü�� parameter�� �޾Ƽ� ���ݰ� ����Ʈ������ �̾�..
//	   if(this.money<n.price) {
//		   System.out.println("����.. �ܾ��� �����մϴ�.. "+this.money);
//	   return; //�Լ��� ����.... kttbBuy �Լ��� ��������(���� ���� ����)
//	   }
//	   //�� ��������
//	   this.money -= n.price;
//	   this.bonuspoint += n.bonuspoint;
//	   System.out.println("������ ������: "+n.toString());
//	}
//	void audioBuy(Audio n) { 
//		   if(this.money<n.price) {
//			   System.out.println("����.. �ܾ��� �����մϴ�.. "+this.money);
//		   return; 
//		   }
//		   this.money -= n.price;
//		   this.bonuspoint += n.bonuspoint;
//		   System.out.println("������ ������: "+n.toString());
//		}
//	void notebookBuy(NoteBook n) { 
//		   if(this.money<n.price) {
//			   System.out.println("����.. �ܾ��� �����մϴ�.. "+this.money);
//		   return; 
//		   }
//		   this.money -= n.price;
//		   this.bonuspoint += n.bonuspoint;
//		   System.out.println("������ ������: "+n.toString());
//		}
/*2�� �ڵ� ����(�����丵)
 * [�ϳ��� �̸�]���� �������� ���..
 */
//	void Buy(KtTv kttv) { 
//		   if(this.money<kttv.price) {
//			   System.out.println("����.. �ܾ��� �����մϴ�.. "+this.money);
//		   return; 
//		   }
//		   this.money -= kttv.price;
//		   this.bonuspoint += kttv.bonuspoint;
//		   System.out.println("������ ������: "+kttv.toString());
//		}
//	void Buy(Audio n) { 
//		   if(this.money<n.price) {
//			   System.out.println("����.. �ܾ��� �����մϴ�.. "+this.money);
//		   return; 
//		   }
//		   this.money -= n.price;
//		   this.bonuspoint += n.bonuspoint;
//		   System.out.println("������ ������: "+n.toString());
//		}
	/*3�� �ڵ尳�� �ߺ�����
	Key Point : ��� ��ǰ�� Product�� ����ϰ� �ִ�.
	��� ��ǰ�� �θ�� product
	Product P;
	Audio audio = new Audio();
	P= audio;
	NoteBook notebook = new NoteBook();
	P= notebook; <<***
	��, �θ�� �ڽŰ͸� ���� ����.
	toString() �ڽ��� ������... �θ�Ÿ������ �����ϴ��� ������ ������ �Ѿ��..	
	*/
	void buy(Product n) {
		//tv, audio ���� product�� �ڼ��̰�, product�� tv,audio�� �ּҰ��� ������ �ִ�.
		//���� n�� ���������� ������ product Ÿ���� ����  �������� �����,
		//�ڼյ��� �ּ� ���� �ҷ��ͼ��� �� �� �ִ�. 
        if(this.money< n.price) {
            System.out.println("���� �ܾ��� �����մϴ�^^! "+this.money);
            return;
        }    
        this.money -= n.price;
        this.bonuspoint += n.bonuspoint;
        System.out.println("������ ������: "+n.toString()); 
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
		
		System.out.println("�����ܾ���: "+buyer.money);
		System.out.println("�ܿ� ����Ʈ��: "+buyer.bonuspoint);
		
	}

}


