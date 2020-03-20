import java.util.Stack;

import kr.or.bit.Coin;
import kr.or.bit.MyStack;

public class Ex05_Stack_Collection {

	public static void main(String[] args) {

		Stack stack=new Stack();
		stack.push("A");
		stack.push("B");
		System.out.println(stack.pop()); //B
		System.out.println(stack.pop()); //A
		System.out.println(stack.isEmpty()); //true ´Ù²ôÁý¾î³ÂÀ¸´Ï±î
		

		//Mystack ¸¸µé±â
		MyStack my = new MyStack(5);
		System.out.println(my.full());
		my.push(10);
		my.push(20);
		my.push(30);
		System.out.println(my.full());
		System.out.println(my.pop());//30
		System.out.println(my.pop());//20
		System.out.println(my.pop());//10
		System.out.println(my.isEmpty());
		
		Stack<Coin> coinbox=new Stack<Coin>();
		coinbox.push(new Coin(100));
		coinbox.push(new Coin(50));
		coinbox.push(new Coin(500));
		coinbox.push(new Coin(10));
		while(!coinbox.isEmpty()) {
			Coin coin = coinbox.pop();
			System.out.println("²¨³½ µ¿Àü "+coin.getValue());
		}
	
		System.out.println("²ËÃ¡³ª¿µ"+my.full());
	}

}
