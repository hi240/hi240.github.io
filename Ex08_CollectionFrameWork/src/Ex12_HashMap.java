import java.util.HashMap;
import java.util.Scanner;

public class Ex12_HashMap {

	public static void main(String[] args) {
       //�ϻ��Ȱ���� ȸ�������ϰ� �α����� �� id/��� 
	    HashMap loginmap = new HashMap();
	    loginmap.put("kim","kim1004");
	    loginmap.put("scott","tiger");
	    loginmap.put("lee","kim1004");

	    Scanner sc= new Scanner(System.in);
	    
	    while(true) {
	    	System.out.println("ID,password �Է����ּ���");
	    	System.out.println("ID : ");
	    	String id=sc.nextLine().trim().toLowerCase();
	    	System.out.println("password : ");
	    	String pwd=sc.nextLine().trim();
	    	if(!loginmap.containsKey(id)) {
	    		System.out.println("���� id �Դϴ�.");
	    	}else {
	    	    //ID (O)
	    		if(loginmap.get(id).equals(pwd)) {
	    			System.out.println("�α��� �Ϸ�");
	    			break;//whileŻ��!
	    		}else {
	    			System.out.println("����� ��ġ���� �ʽ��ϴ�.");
	    		}
	    	}
	    
	    }
	    
	    HashMap login = new HashMap();
	    login.put("240240","240");
	    while(true) {
	    	String id=sc.nextLine();
	    	String pwd=sc.nextLine();
	    	if(!login.containsKey(id)) {
	    		System.out.println("�׷� ���̵�� �����ϴ�.");
	    	}else {
	    		if(login.get(id).equals(pwd)) {
	    			System.out.println("�α��μ���");
	    			break;
	    		}else {
	    			System.out.println("����� Ʋ�Ƚ��ϴ�.");
	    		}
	    	}
	    		
	    }
	    
	   
	    
	}

}
