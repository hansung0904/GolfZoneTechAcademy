package test.com;

public class ScoreMain {

	public static void main(String[] args) {
		// ScoreVO 객체 생성, 출력
		
		// 생성자에다가 직접 전달하는 방법보단
		// getter,setter를 통해서 전달하는게 더 나음.
		
		// ScoreVO vo = new ScoreVO();
		ScoreVO vo = new ScoreVO(11,"yanssem",88,88,88); // 이런식으로 데이터 전달하게 되면 getter,setter는 의미가 없어짐
		ScoreVO vo2 = new ScoreVO(11,"yanssem",88,88,88); // 이런식으로 데이터 전달하게 되면 getter,setter는 의미가 없어짐
		System.out.println(vo.equals(vo2)); // 데이터가 같으면 결과값이 true로 뜸.
		
		System.out.println(vo);
		vo.setNum(2);
		vo.setName("lee");
		vo.setKor(99);
		vo.setEng(99);
		vo.setMath(99);
		System.out.println(vo);
		

	} // end main()

} // end class
