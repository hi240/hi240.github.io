package kr.or.bit;
/*클래스=설계도=타입
설계도는 종이쪼가리에 지나지않는다
구체화 된것 > 객체,인스턴스
설계도 기본적인 구성요소 (필드+함수)+생성자
class Car{} >> default class car {} //>현재 폴더에서만사용가능
public class Car{ public String color; int door}



*/
public class Person {
     public String name;   //member field >>instance variable 
                            //초기화를 하지 않아도 된다.
                            //생성되는 객체(사람)마다 다른 이름을 가지기 떄문에..
                            //Person p = new Person(); p.name="홍길동"
                            //Person p2 = new Person(); p2.name="dd"
                            //default 값을 가진다.
                            //public int age;    default가 0
                            //public boolean power;  default가 false
     public int age;
     //기능(행위) -메서드
     public void print3(int coin) {   //()는 동전 구멍. 그러나 void 라서 출력되는게 없음. 
     }
     public String print1(int coin1) {
    	 return "ㅎㅇ";               // 동전을 넣으면, String값을 반환해줌.
     }
     public void print() {
    	 System.out.println(name+age);            
     }
     public boolean power;  //boolean은 기본값이 false
     //String은 기본값이 null임.
     Tv stv= new Tv();
 //    stv.brandname="";
    
    //  System.out.println("현재채널 정보:"+stv.ch);
      //ch값,brandname값을 출력하느 ㄴ기능 추가
      

     
     
}
