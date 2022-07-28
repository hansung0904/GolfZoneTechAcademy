package test.com;

public class Test03Dice {

	public static void main(String[] args) {
		// 주사위 프로그램
		double nanSu = Math.random();
		System.out.println(nanSu);
		System.out.println(nanSu * 6);
		System.out.println((int) (nanSu * 6));
		System.out.println((int) (nanSu * 6 + 1));

		int ranSu = (int) (nanSu * 6);
		int ju4up = ranSu + 1;
		System.out.println("ju4up: " + ju4up);
		String msg = "";

		switch (ju4up) {
		case 1:
			msg = ju4up + "번이 나옴.1111";
			break;
		case 2:
			msg = ju4up + "번이 나옴.2222";
			break;
		case 3:
			msg = ju4up + "번이 나옴.3333";
			break;
		case 4:
			msg = ju4up + "번이 나옴.4444";
			break;
		case 5:
			msg = ju4up + "번이 나옴.5555";
			break;
		case 6:
			msg = ju4up + "번이 나옴.6666";
			break;
		default:
			msg = "주사위가 모서리로 섰음";
			break;
		}
		System.out.println(msg);

	} // end main()

} // end class
