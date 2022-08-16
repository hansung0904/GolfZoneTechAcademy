package test.com;

public class Test02Main {
	public static void main(String[] args) {
		System.out.println("Hello interface...");

		Mother m = new Me_class(); // <<- new Mother 이렇게는 생성 불가
		m.play();
		Mother.sleep();
		m.waiting();

		Me_class me = new Me_class();
		me.play();
		me.waiting();

		Mother m2 = new Mother() {

			@Override
			public void play() {
				System.out.println("anonymous inner play()...");

			}
		};
//		m2.play();
//		m2.waiting();
		Test02Main main = new Test02Main();
		main.test(m2);
		System.out.println("====================================");
		main.test(new Mother() {
			@Override
			public void play() {
				System.out.println("2. anonymous inner play()");
			}
		});
		
		Mother m3 = /*Test02Main.*/test3();
		m3.play();
		m3.waiting();
		
		
		
	} // end main
	
	private static Mother test3() {
		
		return new Mother() {
			@Override
			public void play() {
				System.out.println("3. anonymous inner play()");
			}
		};
	}
	
	public  void test(Mother m2) {
		m2.play();
		m2.waiting();
	}

} // end class
