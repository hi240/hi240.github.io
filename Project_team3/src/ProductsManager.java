import java.util.ArrayList;


public class ProductsManager implements Manager{
    
    ArrayList<Product> productsArray = new ArrayList<Product>();//��ǰproducts array
    
    
	//��ǰ���� �����ֱ�
	public void productsList() {
		for(Object d: productsArray) { //product array�� �����ְ� �ʹ�.
		System.out.println(d);
		}
	}	
	//���ų��� ********user Ŭ���� �ʿ�*******
	public void buyHistory() {
	
		}
	//������ �����ҷ����� ******user Ŭ���� �ʿ�*****
	public void userInfo() {
		
	}
	//��������
	public void changeQuantity(Product product,int num) {
		product.setQuantity(num);
		System.out.println(product.getPname()+"�� ������"+num+"���� �����Ͽ����ϴ�.");
	}	

	public void add() {
	    productsArray.add(new Product("������",210321,2000,10));
	    productsArray.add(new Product("������1",210321,2000,10));
	    productsArray.add(new Product("������2",210321,2000,10)); //product array�� product �߰�. 
	    
	}
	public void remove() {	
	}
	
}


