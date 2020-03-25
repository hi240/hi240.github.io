import java.util.HashMap;

public class CustomerManager implements Manager {
    HashMap<String, User> customerList = new HashMap<String, User>();

    
    
    //회원 가입
    Customer signUp(String id, String pwd, String name, String tel, String address) {
        
        Customer customer = new Customer(id, pwd, name, tel, address);
        customer.setId(id);
        customer.setPwd(pwd);
        customer.setName(name);
        customer.setTel(tel);
        customer.setAddress(address);

        customerList.put(id,customer);
        return customer;       
    }
  
    Customer login(String id, String pwd) {
        if(customerList.containsKey(id)&&
                ((customerList.get(id).getPwd()).equals(pwd))) {

            System.out.println("로그인 성공");
            return (Customer) customerList.get(id);
        }else {
            System.out.println("로그인 실패");
            return null;
        }       
    }
    
    
    void watchProductList() {
        
    }

    void buy() {
        
    }

    

    @Override
    public void add() {
    }

    @Override
    public void remove() {
    }

    void watchBuyHistory() {

    }

    void searchUserInfo() {

    }

    public String toString() {
        return null;
    }



}