package test.com;

public class Test01array_main {

	int[] su = { 1, 2, 3, 4, 5, 6 };

	public Test01array_main() {
		su = new int[] { 1, 2, 3, 4, 5, 6, 0 };
	}

	public static void main(String[] args) {
		// 배열타입은 참조타입 참조타입은 객체의 번지를 참조하는 타입 즉 주소를 만들어~라는 명령이 빠져있는 상태에서도 에러가 안난다.
		System.out.println("Hello array");
		// 명확한 변수명이 필요한 경우에는 변수가 500개여도 만들어주어야한다. 아래의 주석처럼
//		String user_name = "kim";
//		String product_name = "ss_nb004";
//		String model_name = "car_911";
//		String store_name = "ms_app";

		// new 연산자를 통해서 타입을 정해주지 않는 습관을 들이지 않으면 새롭게 주소를 할당에서 쓸때 error 발생
		// 그래서 new 연산자를 통해서 타입을 정해주는 습관을 들이자.
		// 1.배열의 동적할당.

		String[] name = new String[] { "kim", "chs", "kim", "kim", null }; // new String[] 이렇게 적어주는것이 정석이나 로컬에선 생략이 가능.
		System.out.println(name[0]);
		System.out.println(name[1]);
		int[] su = new int[] { 1, 2, 3, 4, 5, 6 };
		System.out.println(su[0]);
		System.out.println(su[5]);
		System.out.println(su.length - 1);
		System.out.println(su.length);

		double[] dd = new double[] { 0.1, 0.2, 0.3, 0.0 }; // 0.0을 넣어야 하는거지 primitive type에는 null값이 들어갈 수 없다.
		dd = new double[] { 0.1, 0.2, 0.3, 0.0, 0.2, 0.3, 0.0 };
		for (int i = 0; i < dd.length; i++) {
			System.out.println(dd[i]);
		}
		boolean[] bb = new boolean[] { true, false }; // 0에 해당하는 false가 기본값이다~
		bb = new boolean[] { true, true, false, true };
		for (int i = 0; i < bb.length; i++) {
			System.out.println(bb[i]);
		}

		Test01array_main[] tm = new Test01array_main[] { null, new Test01array_main() }; // 클래스도 타입이기 때문에 배열로 만들어 쓸 수 있다는 것을 보여줌.

		int[] scores = new int[] { 0, 0, 0, 0, 0 };

		// 주소가 없게 하고 싶으면~ 데이터를 넣고싶으면 50번째 줄처럼 데이터를 입력해주어야한다. (동적할당할때)
		int[] scores2 = null;
		scores2 = new int[] {11,22,33};

	} // end main()

} // end class