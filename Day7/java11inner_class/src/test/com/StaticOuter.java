package test.com;

public class StaticOuter {
	static int su = 1000;
	static String name = "kim";

	public void test() {
		System.out.println("test()...");
		System.out.println(new Inner().num);
	}

	public static class Inner {

		int num = 99;
		static String str = "Hello";

		public Inner() {
			System.out.println("StaticOuter Inner()...");
			System.out.println(su);
			System.out.println(name);
//			test();
		}

		public static void sum() {
			System.out.println("sum() ...");
			System.out.println(su);
			System.out.println(name);
//			test();
		}

		public void plus() {
			System.out.println("plus()...");
		}
	}
}
