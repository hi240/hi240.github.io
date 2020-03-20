import java.util.ArrayList;

import kr.or.bit.CopyEmp;
import kr.or.bit.Emp;

/*
 * 1 Array �迭�� ����ؼ� cart����� ��ǰ�� ��������
 * 2 ArrayList�� ����ؼ� cart�� ����� ��ǰ�� ��������
 *    ��,���ʸ�����ϼ���
 *    ��ǰ�� �̸��� ����ϼ���
 * 3 empŬ������ ����ؼ� ��� 3���� ���弼��
 * �� ArrayList<>�� ����ϼ���
 * 4 ����� ����(���,�̸�,����)�� ������ for���� ����ؼ� ����ϼ���
 * �� toString()�� ������
 * 5 ����� ����(���,�̸�,����)�� �Ϲ� for���� ����ؼ� ����ϼ���
 * 
 * 6 kr.or.bit �� copyemp ��� Ŭ���� �����
 * job member field��ſ�
 * private int sal�� �ٲ㼭 ����� geter setter������
 * kr.or.bit.copyemp�� �ϼ���
 * arraylist<> ���ʸ�����ؼ� ���3���弼��
 * 100,"��",1000
 * 7.200�� ����� �޿��� 5000���� �����ؼ� ����ϼ���(�Ϲ�for���ȿ���..)
 * 8.300�� ����� �̸��� �ñ��ط� �����ؼ� ����ϼ���(������for��)
 */
public class Ex07_Generic_Quiz {

	public static void main(String[] args) {

		//1.Array �迭�� ����ؼ� cart����� ��ǰ�� ��������
		Product[] cart=new Product[3];
		cart[0]=new KtTv();
		cart[1]=new Audio();
		cart[2]=new NoteBook();
		//2.ArrayList �� ����ؼ� cart �� ����� ��ǰ�� ��������
		ArrayList<Product> cart1= new ArrayList<Product>(); //cart�� productŸ���� ���ҵ��� ��Ҵ�.
		cart1.add(new Audio());
		cart1.add(new KtTv());
		cart1.add(new NoteBook());
		//3 empŬ������ ����ؼ� ��� 3���� ���弼��
		 ArrayList<Emp> emp1 = new ArrayList<Emp>();
		 emp1.add(new Emp(1,"lee","artist"));
		 emp1.add(new Emp(2,"kee","sing"));
		 emp1.add(new Emp(3,"qee","paint"));
		//4 ����� ����(���,�̸�,����)�� ������ for���� ����ؼ� ����ϼ���
		 for(Emp e : emp1) {
		 System.out.println(e.getEmpno()+e.getEname()+e.getJob());
		 }
		//5 ����� ����(���,�̸�,����)�� �Ϲ� for���� ����ؼ� ����ϼ���
		 for(int i=0;i<emp1.size();i++) {
			 System.out.println(emp1.get(i).getEmpno()+emp1.get(i).getEname()+emp1.get(i).getEname());
		 }
		 
//		 6. kr.or.bit �� copyemp ��� Ŭ���� �����
//		 * job member field��ſ�
//		 * private int sal�� �ٲ㼭 ����� geter setter������
//		 * kr.or.bit.copyemp�� �ϼ���
//		 * arraylist<> ���ʸ�����ؼ� ���3���弼��
//		 * 100,"��",1000
		 
		 ArrayList<CopyEmp> why = new ArrayList<CopyEmp>();
		 why.add(new CopyEmp(100,"��",1000));
		 why.add(new CopyEmp(200,"��",1000));
		 why.add(new CopyEmp(300,"��",1000));
		 
		 //7.200�� ����� �޿��� 5000���� �����ؼ� ����ϼ���(�Ϲ�for���ȿ���..)
		 for(int i =0;i<why.size();i++) {
			 if(why.get(i).getEmpno()==200) {
				 why.get(i).setSal(5000);
				 System.out.println("�¾�"+why.get(i));
			 }
		 }
		  
		 //8.300�� ����� �̸��� �ñ��ط� �����ؼ� ����ϼ���(������for��)
		for(CopyEmp emp : why) {
			if(emp.getEmpno()==300) {
				emp.setEname("�ñ���");
			}
			System.out.println(emp.getEmpno()+emp.getEname()+emp.getSal());
		}
		 
		 
		 
		 
		for(Object obj : cart) { 
			if(obj instanceof Product){
				Product p = (Product)(obj); 
	//			System.out.println(p.bonuspoint.);
			}
			else {
				System.out.println(obj);
			} 
		}
		//2.
		ArrayList<Product> pcart = new ArrayList<Product>();
		pcart.add(new Audio());
		pcart.add(new KtTv());
		pcart.add(new NoteBook());
		
		//6.
		ArrayList<CopyEmp> emp= new ArrayList<CopyEmp>();
		emp.add(new CopyEmp(100,"��",1000));
		emp.add(new CopyEmp(200,"��",2000));
		emp.add(new CopyEmp(300,"��",3000));
		//7. 2��° �༮�� �޿��� 5000���� �������. for�����
	
		
		
	}

}


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