package test.com;

public class Test01Main {

	public class Inner extends Thread {

		public Inner() {
			System.out.println("Inner()...");
		}

		@Override
		public void run() {
			TestThread tt = new TestThread();
			tt.sleep_for(50, 60, "Inner run()...", 500);
		}
	}

	public static void main(String[] args) {
		System.out.println("Hello Thread");
		TestThread tt = new TestThread();

		Thread main = Thread.currentThread();
		System.out.println("main: " + main.getName());

		// 1. Thread 클래스를 상속받아 스레처리하기
		// 오버라이딩 : run() method
		// 스레드실행명령 : start() <<- 객체생성한거에다가 .start()

		// 1-1.익명내부클래스로 상속처리

		Thread t = new Thread() { // anonymous inner 로 상속처리
			@Override
			public void run() {
				tt.sleep_for(10, 20, "run()..", 500);
//				System.out.println("run()...");
			}
		};
		t.start(); // start는 다 찍고 난 다음에 call이라서 main 종료후에 실행
		t.setName("Thread 1-1");
		System.out.println("t: " + t.getName());

		// 1-2. extends Thread
		ThreadEx tex = new ThreadEx();
		tex.start(); // start 되어지는 타이밍적으로는 아무래도 try catch문거보다는 늦을 수 밖에 없음.
		System.out.println("tex: " + tex.getName());
		// 1-3. Inner(inner class가) extends Thread implements runnable도 할 수 있긴함 근데 밑에서
		// 설명

		Inner inner = new Test01Main().new Inner();
		inner.start();

		// 2. Runnable 인터페이스를 상속받아 스레드 처리하기.
		// 오버라이딩 : run() method
		// 스레드 실행명령이 없음. start() 메소드 존재 x
		// Thread 생성자에 parameter로 전달 후
		// Thread 객체로 실행명령 : start()

		// 2-1. anonymous inner class Runnable
		Thread t3 = new Thread(new Runnable() {
			@Override
			public void run() {
				tt.sleep_for(1000, 1010, "Anonymous run()...", 700);
			}
		});
		t3.start();
		// 2-2. implements Runnable
		Bus b = new Bus();
		Thread t2 = new Thread(b);
		t2.start();

		tt.sleep_for(0, 10, "", 1000);

		System.out.println("end main...");
	} // end main

} // end class
