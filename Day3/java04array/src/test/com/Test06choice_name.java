package test.com;

import java.util.Random;

public class Test06choice_name {

	public static void main(String[] args) {
		// 
		String[] names = new String[] {
				"������","������","�迹��","������","���Ǳ�",
				"���ɱ�","���缮","�̵���","������","������",
				"���Ѽ�","���漮","��ΰ�","�ּ���","������",
				"������","������","��â��","�迬��","�缺ȣ"
		};
		

		// �̸��� 5�� �̾Ƽ� �迭�� �ְ� ����ϱ�
		// �ߺ����.
		
		// ���� § �ڵ�
		
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
