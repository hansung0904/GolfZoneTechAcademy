package test.com;

import java.util.LinkedList;
import java.util.Queue;

public class QueueMain {
	public static void main(String[] args) {
		System.out.println("Hello Queue");

		Message msg1 = new Message("sendMail", "Hong");
		Message msg2 = new Message("sendSMS", "Shin");
		Message msg3 = new Message("sendKatok", "Yang");
		Queue<Message> q = new LinkedList<Message>();
		q.offer(msg1);
		q.offer(msg2);
		q.offer(msg3);

//		System.out.println(q.poll()); // Queue�� ���� ó�� ������ ����.
//		System.out.println(q.poll());
//		System.out.println(q.peek()); // �� �ֳ� Ȯ���Ҷ�.. ������� ���� Stack���� �ߴ��Ͱ� ����.

		while (!q.isEmpty()) {
			Message m = q.poll();
//			Message m = q.peek(); // �������ü��������� ���ѷ���
			
			switch (m.command) {
			case "sendMail":
				System.out.println(m.to + ">> ���� ������");
				break;

			case "sendSMS":
				System.out.println(m.to + ">> ���� ������");
				break;

			case "sendKatok":
				System.out.println(m.to + ">> ī�� ������");
				break;
			}
		}

		System.out.println("=================================");

		for (Message m : q) {
			System.out.println(m);
		}

	} // end main

} // end class
