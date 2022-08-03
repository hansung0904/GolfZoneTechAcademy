package test.com;

import test.com.MemberOuter.Inner;

public class Test01Main {

	public static void main(String[] args) {
		System.out.println("Hello inner class");

		// 4종세트
		// 1. member inner
		MemberOuter outer = new MemberOuter();
		outer.test();
		Inner inner = outer.new Inner();
		inner.sum();

		// 2. static inner
		System.out.println(test.com.StaticOuter.Inner.str);
		StaticOuter.Inner.sum();
		new StaticOuter.Inner().plus();

		/* final */ int su = 100;
		/* final */ String name = "kim";

		@SuppressWarnings("unused")
		// 3. local inner --> method 나 생성자안에 들어가게되면 local inner 로컬의 범위는 밖에 있는 범위보다 좁아져야함
		class Inner_local {
			int num = 99;
			String str = "hello";

			public Inner_local() {
				System.out.println("Inner_local()...");
				System.out.println(su);
				System.out.println(name);
			}

			public void minus() {
				System.out.println("minus() ...");
			}
		} // end Inner_local
		Inner_local local = new Inner_local();
		local.minus();

		// 4. anonymous inner --> 일종의 local inner도 될 수 있음.
		Mother m = new Mother() {
			double d = Math.PI * 10000;
			
			@Override
			public void play() {
				System.out.println(su);
				System.out.println(name);
				System.out.println(d);
			}
		};
		m.play();
	} // end main

} // end class
