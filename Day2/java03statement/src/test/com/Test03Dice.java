package test.com;

public class Test03Dice {

	public static void main(String[] args) {
		// 주사위 프로그램
		double nanSu = Math.random();
		System.out.println(nanSu);
		System.out.println(nanSu * 6);
		System.out.println((int)(nanSu * 6));
		System.out.println((int)(nanSu * 6 + 1));
		
		int ranSu = (int)(nanSu*6);
		int ju4up = ranSu+1;
		System.out.println("ju4up: " + ju4up);
		
		switch (ju4up) {
		case 0:

		default:
			System.out.println("xx번이 나왔습니다.");
			break;
		}
		
		

	} // end main()

} // end class
