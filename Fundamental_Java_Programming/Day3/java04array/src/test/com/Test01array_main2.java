package test.com;

public class Test01array_main2 {
	public static void main(String[] args) {
		// 배열
		System.out.println("Hello array");

		// 2. 배열의 정적할당
		// 배열의 길이를 먼저 정의
		// 배열을 생성할때 정적으로 할당할건지~ 동적으로 할당할건지 선택을 해야한다~

		int[] sus = new int[5];
//		sus[0] = 100;
//		sus[1] = 1000;
//		sus[2] = 10000;
//		sus[3] = 100000;
//		sus[4] = 1000000;
// 		sus[-1] = 1000000; <-- java언어에서 -1번방 같은 배열 문법은 없음. arrayIndexOutofBounds exception 발생

		for (int i = 0; i < sus.length; i++) {
			sus[i] = (int) (10 * Math.pow(10, i + 1));
		}

		System.out.println("sus.length: " + sus.length);

		for (int i = 0; i < sus.length; i++) {
			System.out.println(sus[i]);
		}

		System.out.println("===============================");

		double[] ds = new double[50];
		for (int i = 0; i < ds.length; i++) {
			if (i % 2 == 0) {
				ds[i] = Math.PI;
			}
		}
		for (int i = 0; i < ds.length; i++) {
			System.out.println(ds[i]);
		}
		System.out.println("===============================");

		// boolean데이터가 3개 들어있는 배열을 만들어보세요~
		boolean[] bb = new boolean[3];
		for (int i = 0; i < bb.length; i++) {
			bb[i] = true;
		}

		for (int i = 0; i < bb.length; i++) {
			System.out.println(bb[i]); // 타입의 기본값인 false false false 출력
		}
		System.out.println("===============================");
		// foreach문 활용사례1
		for (boolean b : bb) {
			System.out.println(b);
		}
		System.out.println("===============================");
		// 이름이 3개들어있는 문자열 배열을 생성해보세요~
		String[] name = new String[3]; // 기본값인 null, null, null 이 들어가 있다
		for (int i = 0; i < name.length; i++) {
			name[i] = "kim" + i;
		}
		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i]);
		}
		System.out.println("===============================");

		// foreach문 활용사례2 - 사용 단점 : 몇 번째것만 꺼내서 출력 불가능.
		for (String x : name) {
			System.out.println(x);
		}
		System.out.println("===============================");
		
		String[][] namess = new String[2][];
		System.out.println(namess[0]);
		for (String[] names : namess) {
			for(String a:names) {
				System.out.println(a);
			}
		}

	} // end main()

} // end class