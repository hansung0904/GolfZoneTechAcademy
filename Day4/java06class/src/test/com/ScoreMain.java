package test.com;

public class ScoreMain {

	public static void main(String[] args) {
		// ScoreVO 객체 생성, 출력

		// 생성자에다가 직접 전달하는 방법보단
		// getter,setter를 통해서 전달하는게 더 나음.

		// ScoreVO vo = new ScoreVO();
		ScoreVO vo = new ScoreVO(11, "yanssem", 88, 88, 88); // 이런식으로 데이터 전달하게 되면 getter,setter는 의미가 없어짐
		ScoreVO vo2 = new ScoreVO(11, "yanssem", 88, 88, 88); // 이런식으로 데이터 전달하게 되면 getter,setter는 의미가 없어짐
		System.out.println(vo.equals(vo2)); // 데이터가 같으면 결과값이 true로 뜸.
		System.out.println(vo);
		vo.setNum(2);
		vo.setName("lee");
		vo.setKor(99);
		vo.setEng(99);
		vo.setMath(99);
		System.out.println(vo);

		// 학생성적 3개 처리하는 배열을 만들고 출력하세요
		// setter 사용. 출력시 getter 사용하시고 총점평균 등급도 출력.

//		vo.getEng();
//		vo.getKor();
//		vo.getMath();
//		vo.getNum();
//		System.out.println(vo.getEng());

		System.out.println("====================");

//		System.out.println(avg);

		ScoreVO[] vos = new ScoreVO[3];
		for (int i = 0; i < vos.length; i++) {
			ScoreVO x = new ScoreVO();
			x.setNum(i + 1);
			x.setKor(90 + i);
			x.setEng(80 + i);
			x.setMath(70 + i);
			System.out.println(vo);
			vos[i] = x;
		}

		for (ScoreVO x : vos) {
			int kor = x.getKor();
			int eng = x.getEng();
			int math = x.getMath();
			int total2 = x.getKor() + x.getEng() + x.getMath();
			double avg2 = total2 / 3.0;
			String grade = "a";
			if (avg2 >= 90) {
				grade = "a";
			} else if (avg2 >= 80) {
				grade = "B";
			} else if (avg2 >= 70) {
				grade = "c";
			} else if (avg2 >= 60) {
				grade = "d";
			} else if (avg2 >= 50) {
				grade = "e";
			} else {
				grade = "f";
			}

			System.out
					.println(x.getNum() + "," + kor + "," + eng + "," + math + "," + total2 + "," + avg2 + "," + grade);

		} // end for

	} // end main()

} // end class
