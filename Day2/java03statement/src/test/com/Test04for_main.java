package test.com;

public class Test04for_main {

	public static void main(String[] args) {
		// 반복문의 종류에는 - for, while, do~while
		// for 반복문 : 얼마만큼, 길이, 기간, 등등등
		// i+=2 , i+=3 (2씩증가 3씩증가 ...)
		// while반복문 : 무한반복에서 특정 신호, 상황일때 반복을 멈춤. break;
		// 특정 신호, 상황일때 스킵해 continue;

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
		// 0123456789 를 출력하고싶으면~
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
		// 9*9=81 까지
		System.out.println("====구구단 연습====");
		for (int x = 2; x <= 9; x++) {
			for (int i = 1; i <= 9; i++) {
				System.out.println(x + " * " + i + " = " + (x*i));
			}
			System.out.println("==============");
		}
		
		
		
		
		

	} // end main()

} // end class
