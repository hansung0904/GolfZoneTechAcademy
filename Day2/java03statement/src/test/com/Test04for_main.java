package test.com;

public class Test04for_main {

	public static void main(String[] args) {
		// �ݺ����� �������� - for, while, do~while
		// for �ݺ��� : �󸶸�ŭ, ����, �Ⱓ, ����
		// i+=2 , i+=3 (2������ 3������ ...)
		// while�ݺ��� : ���ѹݺ����� Ư�� ��ȣ, ��Ȳ�϶� �ݺ��� ����. break;
		// Ư�� ��ȣ, ��Ȳ�϶� ��ŵ�� continue;

//		for (int i = 0; i < 10; i++) {
//			System.out.println("aaaa" + i);
//		}

//		for (int i = 0; i < 10; i++) {
//			System.out.printf("%d", i);
//		}

//		for (int i = 0; i < 10; i++) {
//			System.out.printf("<");
//			System.out.printf("i");
//			System.out.printf(">");
//		}

//		for (int i = 0; i < 10; i++) {
//			if(i%2==0) {
//				System.out.printf("<%d>\n", i);
//			}
//		}

		// 0123456789
		// 0123456789 �� ����ϰ������~
//		for (int i = 0; i < 10; i++) {
//			System.out.print(i);
//		}
//		System.out.println();

		for (int x = 0; x < 3; x++) {
			for (int i = 0; i < 10; i++) {
				System.out.print(i);
			}
			System.out.println();
		}
		System.out.println("======================");

		for (int y = 0; y < 2; y++) {
			for (int x = 0; x < 3; x++) {
				for (int i = 0; i < 10; i++) {
					System.out.print(i);
				}
				System.out.println();
			}

		}
		
		// 2*1 = 2 , 2*2 = 4, ...
		// 9*9=81 ����
		System.out.println("====������ ����====");
		for (int x = 2; x <= 9; x++) {
			for (int i = 1; i <= 9; i++) {
				System.out.println(x + " * " + i + " = " + (x*i));
			}
			System.out.println("==============");
		}
		
		
		
		
		

	} // end main()

} // end class
