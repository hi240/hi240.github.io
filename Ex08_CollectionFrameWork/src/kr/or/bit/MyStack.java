package kr.or.bit;
/*내가 직접! 만드는 자료구조~! (Stack)
데이터의 저장 공간으로 배열을 사용! Object[] stackarr
저장소 값이 있는 위치 정보(index)
기능 : push넣기,pop뽑아내기,empty,full찼는지확인

*/
public class MyStack {
    private Object[] stackarr; //저장소 생성.
    private int maxsize; //최대 크기 강제.
    private int top; //배열에 index값 .. 위치 정보 파악
    
    public MyStack(int maxsize) {
        this.maxsize=maxsize;	
        stackarr=new Object[maxsize];      //stackarr배열에 maxsize만한 배열생성
        top= -1; //배열에 값은 없어. 라는 뜻으로 쓰는 관용구
    }
 
    public boolean isEmpty() {        //stackarr 배열에 뭐가 들어있나요?
//방법1   for(int i=0;i<maxsize;i++) {
//       if(this.stackarr[i]==null) return true;	
//       else return false;
//       }
       return(top==-1); //방법2
    }

    public boolean full() {
//    	 for(int i=0;i<maxsize;i++) {
//      	   if(this.stackarr[i]!=null) return true;	
//            	else return false;
//         }
    	return(top==maxsize-1);
    }

    public void push(Object i) { //object에 값을 넣을 때마다,
    	if(full()) {             
    		System.out.println("stack full");
    	}else {
    		stackarr[++top]=i;  //안차있으면, stackarr[++top]=i stackarr[0]=i를 넣고, going on....
    	}
    }

    public Object pop() {
    	Object value=null;
    	if(isEmpty()) {
    		System.out.println("stack empty");
    	}else {
    		value = stackarr[top];
    		top--;
    	}
    	return null;
    }

	public static void main(String[] args) {  //메인함수
	MyStack my = new MyStack(2);    //별의미없는 실행구문들임 밑으로 
	my.stackarr[0]=2;
		System.out.println(my.isEmpty());
		System.out.println(my.stackarr[0]);
    }
}
