import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex02_ArrayList {

	public static void main(String[] args) {

		ArrayList arraylist = new ArrayList();		
		arraylist.add(100);
		arraylist.add(200);
		arraylist.add(300);
		for(int i=0;i<arraylist.size();i++) {
			System.out.println(arraylist.get(i));
		}
		System.out.println(arraylist.toString());
		System.out.println("특정 방에 있는 값: "+arraylist.get(0));
		//add 순차적으로 데이터 넣기.
		//arraylist.add 오버로딩 되어있어서 index와 element값으로 끼워넣을 수 있다.
		arraylist.add(0,111); //밀어내서 추가.. 0번째 방에 111을 넣는다.0번째 이후로 있는 애들은 뒤로 밀림.
		System.out.println(arraylist.toString());
		//데이터를 중간에 끼워넣는거를[비순차적인 데이터 추가]라고 부른다. 나머지 데이터가 이동해야 되기때문..
		//arraylist는 사실 [순차적인] 데이터 추가/삭제를 선호한다.
		//데이터 삭제
		//arraylist.remove(index)
		//arraylist.add(index,element);

		System.out.println(arraylist.contains(200)); //contains() 포함여부를 알려주는 함수
		System.out.println(arraylist.isEmpty()); //false
		arraylist.clear();
		System.out.println(arraylist.isEmpty()); //true
		arraylist.add(101);
		arraylist.add(102);
		arraylist.add(103);
		System.out.println(arraylist.toString());
		
		//remove() 삭제함수
		System.out.println("삭제전: "+arraylist.size());
	    Object value = arraylist.remove(0); //0번째 데이터 삭제할건데, 그 전에 여기 보관.
	    System.out.println("삭제된 데이터: "+value);
	    System.out.println(arraylist.toString());
	    
	    //Point
	    //개발자들은 일상다반사로 쓰는 코드
	    List li = new ArrayList(); //arraylist는 list를 implements를 하고 있다. 즉 다형성에 의해 부모가 자식 자원을 쓰는거!
	    //다형성을 이용해 확장성, 유연성을 확보했다!
	    li.add("가");
	    li.add("나");
	    li.add("다");
	    li.add("라");
	    List li4 = li.subList(0,2); //0에서 1까지
	    //List가 있으니까,sublist가 만들어주는 데이터가 결국에는 순서가 있는 데이터집합..
	    System.out.println("확인"+li4.toString());
    
	    ArrayList alist = new ArrayList();
	    alist.add(50);
	    alist.add(1);
	    alist.add(7);
	    alist.add(40);
	    alist.add(45);
	    alist.add(3);
	    alist.add(15);
	    
	    //Arrays.sort(a); 
	    //Collections 초보 개발자는 쓰지 말 것.
	    System.out.println("before: "+alist.toString()); //[50, 1, 7, 40, 45, 3, 15]
	    Collections.sort(alist); //sort는 순서가 필요하기 때문에 List만 사용가능하다.
	    System.out.println("after: "+alist.toString()); //[1, 3, 7, 15, 40, 45, 50] sort()정렬하는 함수
	    Collections.reverse(alist);
	    System.out.println("after: "+alist.toString()); //[50, 45, 40, 15, 7, 3, 1] reverse()뒤집는 함수
	
	}

}
