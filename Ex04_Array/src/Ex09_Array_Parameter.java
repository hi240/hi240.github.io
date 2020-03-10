class Human{
	String name;
}
class OverTest{
	int add(int i,int j) {
		return i+j;
	}
	void add(Human human) {
		System.out.println(human.name);
	}
	
	//Point : 배열도 타입이다.
	
	int[] add(int[] param) {
		int[] target=new int[param.length];
		for(int i=0;i<param.length;i++) {
			target[i] = param[i]+1;
		}
		return target;
	}
	int[] add(int[] so,int[]so2) {
		//error없이 동작가능..................
		int length = (so.length>so2.length)? so.length:so2.length;
		int[] resultarray=new int[length];		
		for(int i =0;i<resultarray.length;i++) {
			resultarray[i]=so[i]+so2[i];
		}
		return so;
	}
}

public class Ex09_Array_Parameter {

	public static void main(String[] args) {
	OverTest ot=new OverTest();
	//int[] add(int[] param) { 함수를 사용해보자.
	int[] source= {10,20,30,40,50};
	int[] target=ot.add(source);
	for(int ta : target) {
		System.out.print(ta);
	}
	System.out.println();
	int[] eunwoo= {9,5,2,3,4};
	int[] love=ot.add(eunwoo,source);
	for(int lo : love) {
		System.out.print(lo);
	}
	}

}
