package test.com;

public class PrintThread extends Thread {

	@Override
	public void run() {
		while (true) {
			System.out.println(" while... ���� ��");
			// ���1. Thread.sleep()
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
				break;
			}
			// ���2. : Thread.interrupted()
//			if (Thread.interrupted()) {
//				break;
//			}
		}
		System.out.println("�ڿ� ����");
		System.out.println("���� ����");
	}

}
