
public class Ex02_Exception {

	public static void main(String[] args) {
        int num = 100;
        int result = 0;
        try {
        	for(int i=0;i<10;i++) {
        		result =num/(int)(Math.random()*10);
        		System.out.println("result: "+result+", i: "+i);
        	}
        }catch(ArithmeticException e) { //♥♡♬♥♡♬♥♡♬연산예외 얘가 잡고
        	 //문제가 발생하면 그 예외에 맞는 객체가 자동 생성된다. 객체가 정보를 갖고있다.
        	System.out.println("연산예외 발생! [관리자에게 이메일]");
        	e.getMessage();
         	e.printStackTrace();
   	//문제가 발생되면 내부적으로 new ArithmeticExeption() 객체에다가 정보를 담는 것 > 이 주소를 e 변수가 받음
        }catch(NullPointerException e) { //♥♡♬♥♡♬♥♡Null값 예외 얘가 잡고
        	
        }
        catch(Exception e) { //♥♡♬♥♡♬♥♡♬모든 예외 얘가 잡는다.
        	//Exception e 는 상위예외로, 얘를 맨 마지막에 써줘야된다. (다형성)	
        	
        }
        System.out.println("main end");
	}

}
