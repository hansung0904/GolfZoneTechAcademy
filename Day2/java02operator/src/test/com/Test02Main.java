package test.com;

public class Test02Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hello");

		// 3. 비교연산 ==, !=, >, <, >=, <=
		// System.out.println(5==5); literal은 서로 같은 값인지 이미 알고 있기때문에 주석을 해제하면 노란색 줄이 뜸
		int su1 = 5;
		int su2 = 5;
		System.out.println(su1 == su2);
		System.out.println(su1 != su2);
		System.out.println(su1 > su2);
		System.out.println(su1 < su2);
		System.out.println(su1 >= su2);
		System.out.println(su1 <= su2);

		// 4. 비트연산 : 논리 &(전부다 참이면) |(하나만 참이면) ^ , 반전 ~
		System.out.println(10 & 3);
		// 1010
		// 0011
		// 0010 >>> 2 (false)
		System.out.println(10 | 3);
		// >>> 11
		System.out.println(10 ^ 3);
		System.out.println(~10);

		// 5. 비트연산 : 이동(Shift) >> , << , >>>(우측으로이동하되 양수만)
		// 0000 1000 : 8 >> 1 : 4
		// 1000 0000 : 128 >> 1 : 64
		System.out.println(8 >> 1);
		System.out.println(128 >> 1);
		System.out.println(8 >> 2);
		System.out.println(128 >> 2);
		System.out.println("======================");
		System.out.println(8 << 1);
		System.out.println(128 << 1);
		System.out.println(8 << 2);
		System.out.println(128 << 2);
		System.out.println("======================");
		System.out.println(128 >>> 1);
		System.out.println(-128 >>> 1);
		System.out.println("======================");

		// 6. 논리연산 : &, |, &&, ||
		// true & false, 5==5 & Boolean.parseBoolean("true")
		System.out.println(true & false);
		System.out.println(true && false);
		System.out.println(false & true);
		System.out.println(false && true);
		System.out.println(false | true);
		System.out.println(false || true);

		// 단항 연산자 : 증감연산(++,--), 음양(+,-), 부정!
		int max = 10;
		max++;
		System.out.println(max); // 1증가 >> max += 1; 이랑 같다는 소리 >> max = max + 1; ++연산자는 앞에붙여도되고 뒤에 붙여도된다.
		++max;
		System.out.println(max);
		// 다른 연산자들이랑 섞여서 ++가 뒤에 붙게되면 우선순위가 떨어지게 되어서 헷갈리지 말자.
		System.out.println("======================");

		int top = ++max;
		System.out.println(top);
		System.out.println(max);

		System.out.println("======================");
		int top2 = max++;
		System.out.println(top2);
		System.out.println(max);

		// 기타 : (), {}, [], Array, 삼항(boolean? 참일때 반환값 : 거짓일때 반환값 )
		System.out.println("======================");
		System.out.println(true ? 100 : 0);
		System.out.println(false ? 100 : 0);
		
		System.out.println("======================");
		boolean bool = true;
		System.out.println(bool ? 100 : 0);
		
		int min = 60;
		System.out.println(min<=60 ? "NO" : "GOOD");
		System.out.println("======================");
		
//		int total = 290;
//		double avg = total / 3.0; // 9x.xxx 이런식으로 나오겠지 
//		System.out.println(avg>=90 ? "A" : "B");
		
//		int total = 70+80+90; // B가 나오도록 해보자
//		double avg = total / 3.0;  
//		System.out.println(avg>=90 ? "A" : "B");
		
		// 조건이 여러개라면
		
		int total = 70+80+80; // 경우의 수를 늘려보자
		double avg = total / 3.0;  
		System.out.println(avg>=90 ? "A" : 
								avg>=80 ? "B" : 
									avg>=70 ? "C" : "D");
		

	} // end main()

} // end class