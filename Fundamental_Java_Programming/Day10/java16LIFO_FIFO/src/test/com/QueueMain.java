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

//		System.out.println(q.poll()); // Queue라서 제일 처음 넣은게 빠짐.
//		System.out.println(q.poll());
//		System.out.println(q.peek()); // 뭐 있나 확인할때.. 사라지지 않음 Stack에서 했던것과 동일.

		while (!q.isEmpty()) {
			Message m = q.poll();
//			Message m = q.peek(); // 빠져나올수가없으니 무한루프
			
			switch (m.command) {
			case "sendMail":
				System.out.println(m.to + ">> 메일 보내기");
				break;

			case "sendSMS":
				System.out.println(m.to + ">> 문자 보내기");
				break;

			case "sendKatok":
				System.out.println(m.to + ">> 카톡 보내기");
				break;
			}
		}

		System.out.println("=================================");

		for (Message m : q) {
			System.out.println(m);
		}

	} // end main

} // end class
