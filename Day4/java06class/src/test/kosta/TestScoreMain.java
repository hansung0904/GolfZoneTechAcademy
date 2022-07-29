package test.kosta;

// 다른패키지의 클래스를 사용시 반드시 선언 해주어야함..
import test.com.Score;

public class TestScoreMain {

	public static void main(String[] args) {
		
		Score s = new Score();
		System.out.println(s);
		System.out.println(s.eng);
		System.out.println(s.math);

	} // end main()

} // end class
