import java.util.ArrayList;

class EmpData{
	private String name;
	private int[] numbers;
	private ArrayList elist;
	
	EmpData(){
		this.name="아무개";
		//초기화 (메모리를 갖는 것 : heap에 만들어진 객체의 주소)
		this.numbers=new int[10];
		elist = new ArrayList();
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int[] getNumbers() {
		return this.numbers;
	}
	public void setNumbers(int[] numbers) {
		this.numbers=numbers;
	}
	public ArrayList getElist() {
		return this.elist;
	}
	public void setElist(ArrayList elist) {
		this.elist = elist;
	}
}
public class Ex04_ArrayList_Parameter {

	public static void main(String[] args) {

		EmpData empdata = new EmpData();
		System.out.println(empdata.toString());
		System.out.println(empdata.getElist().toString());
		
		ArrayList li = new ArrayList();
		li.add(100);
		li.add(200);
		
		empdata.setElist(li);
		System.out.println(empdata.getElist().toString());

		//array list의 단점을 극복하기 위해 만들어진 LinkedList.
		//array list의 단점? 중간녀석에 삽입/삭제 할 경우 성능이 떨어지는 것..........
		//즉, arraylist는 순차적에 유리. linkedlist는 비순차적에 유리
		//비순차적인 나열을 위해쓰기 딱좋은 LinkedList . 중간녀석이 죽을 때, 자신의 다음 주소를 넘기고 죽음.
		//앞으로만 이동함.
		//그래서 뒤로도 가고 싶기때문에 double Linked List 가 생성됨.
		//마지막 주소에 첫주소, 두번째 list에 첫주소에 마지막 주소를 넣으면 순환이 되겠지?
		//그래서 doubly linked list가 생김.
		
	}

}
