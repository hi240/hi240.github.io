package kr.or.bit;
//디자인패턴 (생성패턴) >> new >>객체를 만드는 방법
//객체 하나를 만들어서 공유..
//회사 : 공유프린터,

//Singleton을 쓰면서 내가 받을 수 있는 보장은 : 객체의 주소가 항상 동일하다.

//활용 : JDBC에서 해볼 것입니다. java<(JDBC)>database DB랑 이어주는 인터페이스임. 

//main함수
//Singleton singleton = new Singleton(); 생성자 호출. ->생성자가 보여야 호출이 가능해서 그동안 public인 생성자였음.
//면접에서 singleton 코드 짜세요 단골임.
public class Singleton {
   private static Singleton p;
   private Singleton(){     //직접 객체생성 불가능. 14_singleton에서 new로 못만듬.
	   //생성자를 막음으로써 마음대로 생성자를 못만듬.
   }
   public static Singleton getInstance() {
	   if(p==null) {          //생성자때 초기화 된게 없다면,
		   p=new Singleton(); //이제서야, 여기 초기화에서 생성자를 만들 수 있게됨.
	   }
	   return p; //private Singleton을 돌려주는게 목표였으니까 이렇게.
   }
}
//다시 한번 써보고 꼭 외우기.

 
 
 