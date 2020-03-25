import java.util.ArrayList;


public class ProductsManager implements Manager{
    
    ArrayList<Product> productsArray = new ArrayList<Product>();//상품products array
    
    
	//상품내역 보여주기
	public void productsList() {
		for(Object d: productsArray) { //product array를 보여주고 싶다.
		System.out.println(d);
		}
	}	
	//구매내역 ********user 클래스 필요*******
	public void buyHistory() {
	
		}
	//구매자 정보불러오기 ******user 클래스 필요*****
	public void userInfo() {
		
	}
	//수량변경
	public void changeQuantity(Product product,int num) {
		product.setQuantity(num);
		System.out.println(product.getPname()+"의 수량을"+num+"으로 변경하였습니다.");
	}	

	public void add() {
	    productsArray.add(new Product("아이폰",210321,2000,10));
	    productsArray.add(new Product("아이폰1",210321,2000,10));
	    productsArray.add(new Product("아이폰2",210321,2000,10)); //product array에 product 추가. 
	    
	}
	public void remove() {	
	}
	
}


