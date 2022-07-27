package test.com;

public class Test01if_main {

	public static void main(String[] args) {
		// if, if~else, if ~ else if ~ else if ~ else

		System.out.println("Hello If");

		// if(boolean결과가 항상 와야한다.) -if 문에 걸려서 동작하려면 참 일때만 동작한다.
		// if(true); 이러고 끝날수도 있고 보통은 if,{} 이런식으로 시작한다.
		if (true)
			System.out.println("OK");

		if (false)
			System.out.println("OK2"); // 출력이 안되겠지 왜 ? if는 true만 출력하기때문.

		double avg = 88.99;
		if (avg >= 90) {
			System.out.println("A");
			System.out.println("hello");
		} else if (avg >= 80) {
			System.out.println("B" + avg % 10); // else가 앞에 붙는 순간 첫번째 참인것만 실행됨
			if (avg % 10 > 0) {
				System.out.println("B2");
			}
		} else if (avg >= 70) {
			System.out.println("C");
		} else if (avg >= 60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}

	} // end main()

} // end class
