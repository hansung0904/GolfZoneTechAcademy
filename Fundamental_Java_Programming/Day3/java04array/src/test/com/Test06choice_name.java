package test.com;

import java.util.Random;

public class Test06choice_name {

	public static void main(String[] args) {
		// 
		String[] names = new String[] {
				"신유수","이찬형","김예은","최진실","전판근",
				"오령기","이재석","이동훈","박지연","정상윤",
				"최한성","강경석","김민경","최수연","최유연",
				"최현민","이주희","유창현","김연수","양성호"
		};
		

		// 이름을 5개 뽑아서 배열에 넣고 출력하기
		// 중복허용.
		
		// 내가 짠 코드
		
//		Random random = new Random();
//		int randNum = random.nextInt(names.length);
//		int [] nameArray = new int[5];
//		String[] nameArray = new String[5];
//		for(int i = 0; i<nameArray.length; i++) {
//			randNum = random.nextInt(names.length);
//			nameArray[i] = random.nextInt(20);
//			System.out.print("["+names[nameArray[i]]+"]" + " ");
//		}
		
		String[] choice_names = new String[5];
		
		Random randomObject = new Random();
		System.out.println(randomObject.nextInt(20));
//		System.out.println(randomObject.nextInt(20));
		
		for (int i = 0; i < choice_names.length; i++) {
//			double nanSu = Math.random();
//			int ranSu = (int)(nanSu*20); // 0 ~ 19
//			choice_names[i] = names[ranSu] ;
			choice_names[i] = names[randomObject.nextInt(20)] ;
		}
		
		for (String name : choice_names) {
			System.out.print("["+name+"]"+" ");
		}
		
		
		
		
	} // end main()

} // end class
