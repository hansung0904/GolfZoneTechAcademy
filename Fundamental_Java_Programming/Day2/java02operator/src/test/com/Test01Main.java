package test.com;

public class Test01Main {

	public static void main(String[] args) {
		System.out.println("Hello");

		// 1. 산술연산
		System.out.println(10 + 3);
		System.out.println(10 - 3);
		System.out.println(10 * 3);
		System.out.println(10 / 3);
		System.out.println(10 % 3);
		System.out.println("==============");

		// 2. 대입,할당 할당연산은 무조건 오른쪽에 와야함 ex) += 는 =+과 결과값이 다름 = 을 무조건 오른쪽에 준다고 생각하자
		// =+ 하면 컴파일 오류가 안날 수 있는데 주의할 것.
		int su = 100;
		System.out.println(su);

		int result = su + 100;
		System.out.println(result);

		su = su + 1000;
		System.out.println(su);

		su += 1000;
		System.out.println(su);

		su += 1000;
		System.out.println(su);

		su -= 1;
		System.out.println(su);

		su = 10;
		su ^= 3;
		System.out.println(su);

		// &=, |=, <<=, >>= 이런것들도 가능하다

	}

}