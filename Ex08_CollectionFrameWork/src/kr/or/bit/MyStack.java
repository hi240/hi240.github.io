package kr.or.bit;
/*���� ����! ����� �ڷᱸ��~! (Stack)
�������� ���� �������� �迭�� ���! Object[] stackarr
����� ���� �ִ� ��ġ ����(index)
��� : push�ֱ�,pop�̾Ƴ���,empty,fullá����Ȯ��

*/
public class MyStack {
    private Object[] stackarr; //����� ����.
    private int maxsize; //�ִ� ũ�� ����.
    private int top; //�迭�� index�� .. ��ġ ���� �ľ�
    
    public MyStack(int maxsize) {
        this.maxsize=maxsize;	
        stackarr=new Object[maxsize];      //stackarr�迭�� maxsize���� �迭����
        top= -1; //�迭�� ���� ����. ��� ������ ���� ���뱸
    }
 
    public boolean isEmpty() {        //stackarr �迭�� ���� ����ֳ���?
//���1   for(int i=0;i<maxsize;i++) {
//       if(this.stackarr[i]==null) return true;	
//       else return false;
//       }
       return(top==-1); //���2
    }

    public boolean full() {
//    	 for(int i=0;i<maxsize;i++) {
//      	   if(this.stackarr[i]!=null) return true;	
//            	else return false;
//         }
    	return(top==maxsize-1);
    }

    public void push(Object i) { //object�� ���� ���� ������,
    	if(full()) {             
    		System.out.println("stack full");
    	}else {
    		stackarr[++top]=i;  //����������, stackarr[++top]=i stackarr[0]=i�� �ְ�, going on....
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

	public static void main(String[] args) {  //�����Լ�
	MyStack my = new MyStack(2);    //���ǹ̾��� ���౸������ ������ 
	my.stackarr[0]=2;
		System.out.println(my.isEmpty());
		System.out.println(my.stackarr[0]);
    }
}
