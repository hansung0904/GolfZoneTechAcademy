package test.com;

public class Test03Dice {

	public static void main(String[] args) {
		// �ֻ��� ���α׷�
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
			System.out.println("xx���� ���Խ��ϴ�.");
			break;
		}
		
		

	} // end main()

} // end class
