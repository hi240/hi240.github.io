package kr.or.bit;

import java.util.Scanner;

/*
 * 기능,행위 만드는 방법
 * 함수 (function, method)
 * 함수(method): 행위 또는 기능의 최소단위
 * 먹잠 걷잠 먹웃 불가능! > 먹는다. 잔다. 웃는다.
 * 함수는 하나의 기능만 구현한다.
 * 클래스 : 필드 + 함수 + 생성자
 * ex) 게임방 : 게임기 동전놓고 ... 함수형태
 *     인형뽑기 동전놓고 인형을 받는 것 ... 함수형태
 * JAVA 함수의 종류는 크게 4가지
 * 1.void, parameter(X):void print(){실행코드} 지나가다가실행해보라네 그래서 막 실행하다가 끝나벌임 .
 * 2.void, parameter(0):void print(String str) {실행코드} 
 * 3.return Type, parameter(0): int print(int data){return 100;}
 * 4.return Type, parameter(X): int print(){return 200;}
 * void : 돌려주는 것이 없다. 조금더 유식하게 풀면, return value가 없다. 니가 아무리 기다려봐야 나오는거 없어.
 * return Type : 정수,실수 등 8가지의 기본 타입을 쓸 수있다.+String+ 참조타입 (class도 타입이다.)+Array+Collection+Interface 
 * ex) Car print(){return new Car();} //Car라는 변수를 만들고, return에서 그 함수의 주소값을 만들어서, 변수에 주소값을 할당한다.
 * ex) boolean print(){return true;}
 * parameter(인자,인수매개값,전달값):게임기의 동전 구멍.(1개일수도, 여러개일 수도 있따.)
 * 동전구멍2개면 2개다 동전 넣어야 실행이 되요. 동전구멍이 10개면 10개 다 넣어야 실행이 돼요.
 * ex)void print(int a, int b, int c, int d, int f) : print(10,20,30,"a") (x) 개수도 모자라고 int도 아니여서 안됨.
 *                                                  : print(10,10,10,10,10,) (0)
 * :getChannelNumber(),getEmpListByEmpno 함수이름을 봣을때 어느정도 유추할수있어야한다. 첫문자는 소문자. . . .
 * 함수라는 건 반드시 호출 되어야한다.
 * 
 * 
 * 
 */
public class Fclass {
     public int data;
     public void m() {
    	 System.out.println("일반함수:void ,parameter(x)");
     }
     public void m2(int i) {
    	 System.out.println("parameter value (scope : 함수내부) :"+i); //함수의 파라미터는 함수 내에서만 유효하다.
    	 System.out.println("일반함수 : void, parameter(0)");
     }
     public int m3() {
    	 return 100;
     }
     public int m4(int data) {
      return data+1;
     }   
     //확장
     public int sum(int i, int j,int k) {
    	 return i+j+k;
     }
     //접근자가 없음. default가 붙어있음. 즉, default int subSum()
     //다른 폴더에서 사용할 수 없다.
  /*   int subSum(int i) {
    	 return i+100;
     }*/
     //설계자의 의도: subSum 함수의 활용은 내부에 다른 함수를 도와주는 함수...
     
     //의도: subSum()객체 (참조변수가) 접근 못하게.. 내부에서 사용
     //다른 함수가 사용하는 공통함수
     private int subSum(int i) { //private함수는 class내부에서는 동등한입장이기에
    	 return i +100;          //보이지만, 다른함수에서는 직접호출할수없음.
     }
     public void CallSubSum() {
    	 int result= subSum(100);
    	 print(result);
     }
     //private [다른함수를 보조]하는 함수다. 
     private void print(int data) {
    	 System.out.println("data: "+data);
     }
     private int operationMethod(int data) {
    	 return data*200;
     }
     public int opSum(int data) {
    	 int result = operationMethod(data);
    	 if(result>0) {
    		 return 1;
    	 }else {
    		 return -1;
    	 }
     }
     public int max(int a, int b) {
  	   /*if (a>b)
  	     return a;
  	     else  
  		 return b;          30점짜리       return 을 반복하는 구문 매우 안좋은 구문이다....최대한 하나만나오게...................
  		 
  		 int result=0;
  		 if(a>b){
  		 result=a;}
  		 else {result=b;}
  		 return result;     60점짜리
  		 
  		 int max=(a>b)?a:b;
  		 return max;        90점짜리
  		 
  		 return (a>b)?a:b; 100점짜리

  		 */ 
  	    	 return (a>b)?a:b;         //삼항연산자를 아끼지 말고 쓰거라.
  	     }
     
     public String concat(String s, String s1, String s2) {
    	 // String result = ss+"/"+s1+"/"+s2;
    	 // return result;
    	 return s+"/"+s1+"/"+s2;    //위식과 이식은 동일함.
     }
     
     //클래스는 타입이다.......................
     /*
      * public int call(int i,int j){return i+j;}
      * public Tv call(){  } 
      * 클래스는 설계도이다...설계도는 타입이다... 타입은 변수앞에 쓸수있다.. 즉, int대신에도 들어갈 수 있어야..
      * 
      * 
      * return new Tv();             Tv타입과 같은 객체의 주소
      * Tv t = new Tv(); return t;
      * return null;
      */

     
     
     public Tv tcall() {
         return new Tv();
     }
     
     public Tv tcall2(Tv t) {       //이거랑 밑에꺼랑 같다.낯설어하지 않는 연습필요.
    	 t.brandname="a";
    	 return t;
     }
     
     public int tcall3(int i) {
    	 return i;
     }

     public Tv objMethod() {
    	 Tv tv= new Tv();
    	 return tv;
     }
     
     public Tv objMethod2() {
    	 return new Tv();
     }
     
     public Tv objMethod3(Tv t) { //Tv라는 타입을 갖는 객체의 주소값을 받겠다.
    	 return t;
     }
     /*
     main
     1. Tv t = new Tv();
     t.objMethod3();
     
     2. t.objMethod3(new Tv()); t라는 변수는 new Tv의 주소값을 받는다.
     
     
     */
     
     
}





