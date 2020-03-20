import java.util.HashMap;
import java.util.Scanner;

public class Ex12_HashMap {

	public static void main(String[] args) {
       //일상생활에서 회원가입하고 로그인할 때 id/비번 
	    HashMap loginmap = new HashMap();
	    loginmap.put("kim","kim1004");
	    loginmap.put("scott","tiger");
	    loginmap.put("lee","kim1004");

	    Scanner sc= new Scanner(System.in);
	    
	    while(true) {
	    	System.out.println("ID,password 입력해주세요");
	    	System.out.println("ID : ");
	    	String id=sc.nextLine().trim().toLowerCase();
	    	System.out.println("password : ");
	    	String pwd=sc.nextLine().trim();
	    	if(!loginmap.containsKey(id)) {
	    		System.out.println("없는 id 입니다.");
	    	}else {
	    	    //ID (O)
	    		if(loginmap.get(id).equals(pwd)) {
	    			System.out.println("로그인 완료");
	    			break;//while탈출!
	    		}else {
	    			System.out.println("비번이 일치하지 않습니다.");
	    		}
	    	}
	    
	    }
	    
	    HashMap login = new HashMap();
	    login.put("240240","240");
	    while(true) {
	    	String id=sc.nextLine();
	    	String pwd=sc.nextLine();
	    	if(!login.containsKey(id)) {
	    		System.out.println("그런 아이디는 없습니다.");
	    	}else {
	    		if(login.get(id).equals(pwd)) {
	    			System.out.println("로그인성공");
	    			break;
	    		}else {
	    			System.out.println("비번이 틀렸습니다.");
	    		}
	    	}
	    		
	    }
	    
	   
	    
	}

}
