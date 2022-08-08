package test.com;

import java.util.Stack;

public class StackMain {
	public static void main(String[] args) {
		System.out.println("Hello Stack");

		Stack<Coin> cs = new Stack<Coin>();
		for (int i = 0; i < 4; i++) {
			Coin c = new Coin();
			c.setValue(100 + i);
			cs.push(c);
		}
		
		
		
		System.out.println(cs.pop()); // 객체 뽑기 객체를 스택에서 삭제. 
		System.out.println(cs.pop());
		System.out.println(cs.pop());
		System.out.println(cs.peek()); // 객체 하나를 가져오는데, 객체를 스택에서 제거하지 않음.

		System.out.println("================================"); // 16번째 줄에서 pop으로 뽑아버렸기때문에 밑에 103이 하나 사라짐.

		for (Coin c : cs) {
			System.out.println(c);
		}

	} // end main

} // end class
