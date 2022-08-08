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
		
		
		
		System.out.println(cs.pop()); // ��ü �̱� ��ü�� ���ÿ��� ����. 
		System.out.println(cs.pop());
		System.out.println(cs.pop());
		System.out.println(cs.peek()); // ��ü �ϳ��� �������µ�, ��ü�� ���ÿ��� �������� ����.

		System.out.println("================================"); // 16��° �ٿ��� pop���� �̾ƹ��ȱ⶧���� �ؿ� 103�� �ϳ� �����.

		for (Coin c : cs) {
			System.out.println(c);
		}

	} // end main

} // end class
