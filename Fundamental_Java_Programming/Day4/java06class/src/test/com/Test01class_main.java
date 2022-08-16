package test.com;

public class Test01class_main {

	public static void main(String[] args) {
		// 객체를 생성(속성을 초기화 할 literal)하고 사용하는 함수.
		// 서로 다른타입을 한번에 넣기 좋은장점을 가지고 있는게 Object 타입임.
		// 속성에 대한 것들만 가지고 있느냐 or 기능에 대한 것들만 가지고 있느냐로만 생각을 하자.

		String name = new String("kim"); // 객체로 String을 쳐다본다면 String은 많은걸 받을 준비가 되어 있다~
		System.out.println(name.length());

		Score s = new Score();
		System.out.println(s);
		s.num = 1;
		s.name = "kim";
		s.kor = 99;
		s.eng = 88;
		s.math = 77;
		System.out.println(s.num);
		System.out.println(s.name);
		System.out.println(s.kor);
		System.out.println(s.eng);
		System.out.println(s.math);
	} // end main()

} // end class