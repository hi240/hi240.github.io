import java.util.ArrayList;

import kr.or.bit.CopyEmp;
import kr.or.bit.Emp;

/*
 * 1 Array 배열을 사용해서 cart만들고 제품을 담으세요
 * 2 ArrayList를 사용해서 cart를 만들고 제품을 담으세요
 *    단,제너릭사용하세요
 *    제품의 이름을 출력하세요
 * 3 emp클래스를 사용해서 사원 3명을 만드세요
 * 단 ArrayList<>를 사용하세요
 * 4 사원의 정보(사번,이름,직종)을 개선된 for문을 사용해서 출력하세요
 * 단 toString()은 사용금지
 * 5 사원의 정보(사번,이름,직종)을 일반 for문을 사용해서 출력하세요
 * 
 * 6 kr.or.bit 에 copyemp 라는 클래스 만들고
 * job member field대신에
 * private int sal로 바꿔서 만들고 geter setter쓰세요
 * kr.or.bit.copyemp로 하세요
 * arraylist<> 제너릭사용해서 사원3명만드세요
 * 100,"김",1000
 * 7.200번 사원의 급여를 5000으로 수정해서 출력하세요(일반for문안에서..)
 * 8.300번 사원의 이름을 궁금해로 수정해서 출력하세요(개선된for문)
 */
public class Ex07_Generic_Quiz {

	public static void main(String[] args) {

		//1.Array 배열을 사용해서 cart만들고 제품을 담으세요
		Product[] cart=new Product[3];
		cart[0]=new KtTv();
		cart[1]=new Audio();
		cart[2]=new NoteBook();
		//2.ArrayList 를 사용해서 cart 를 만들고 제품을 담으세요
		ArrayList<Product> cart1= new ArrayList<Product>(); //cart에 product타입의 원소들을 담았다.
		cart1.add(new Audio());
		cart1.add(new KtTv());
		cart1.add(new NoteBook());
		//3 emp클래스를 사용해서 사원 3명을 만드세요
		 ArrayList<Emp> emp1 = new ArrayList<Emp>();
		 emp1.add(new Emp(1,"lee","artist"));
		 emp1.add(new Emp(2,"kee","sing"));
		 emp1.add(new Emp(3,"qee","paint"));
		//4 사원의 정보(사번,이름,직종)을 개선된 for문을 사용해서 출력하세요
		 for(Emp e : emp1) {
		 System.out.println(e.getEmpno()+e.getEname()+e.getJob());
		 }
		//5 사원의 정보(사번,이름,직종)을 일반 for문을 사용해서 출력하세요
		 for(int i=0;i<emp1.size();i++) {
			 System.out.println(emp1.get(i).getEmpno()+emp1.get(i).getEname()+emp1.get(i).getEname());
		 }
		 
//		 6. kr.or.bit 에 copyemp 라는 클래스 만들고
//		 * job member field대신에
//		 * private int sal로 바꿔서 만들고 geter setter쓰세요
//		 * kr.or.bit.copyemp로 하세요
//		 * arraylist<> 제너릭사용해서 사원3명만드세요
//		 * 100,"김",1000
		 
		 ArrayList<CopyEmp> why = new ArrayList<CopyEmp>();
		 why.add(new CopyEmp(100,"김",1000));
		 why.add(new CopyEmp(200,"김",1000));
		 why.add(new CopyEmp(300,"김",1000));
		 
		 //7.200번 사원의 급여를 5000으로 수정해서 출력하세요(일반for문안에서..)
		 for(int i =0;i<why.size();i++) {
			 if(why.get(i).getEmpno()==200) {
				 why.get(i).setSal(5000);
				 System.out.println("맞앙"+why.get(i));
			 }
		 }
		  
		 //8.300번 사원의 이름을 궁금해로 수정해서 출력하세요(개선된for문)
		for(CopyEmp emp : why) {
			if(emp.getEmpno()==300) {
				emp.setEname("궁금해");
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
		emp.add(new CopyEmp(100,"김",1000));
		emp.add(new CopyEmp(200,"이",2000));
		emp.add(new CopyEmp(300,"박",3000));
		//7. 2번째 녀석의 급여를 5000으로 수정출력. for문사용
	
		
		
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