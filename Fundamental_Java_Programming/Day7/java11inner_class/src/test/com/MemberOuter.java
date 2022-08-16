package test.com;

public class MemberOuter { // 클래스를 따로 만들면되는데 왜 굳이 inner class를 쓰는 이유는~
						  //  밖에 있는 함수라든지 전역변수에 대한 접근이 같은 소속에(this) 있어서 별도의 객체를
						 //	  생성하지 않고도 이용할 수 있다는 장점이 있기 때문..
						//    MemberOuter에서 inner거를 가져다 쓸 때에는 객체생성해서 써주어야함. 

	int su = 100;
	String name = "kim";

	public void test() {
		System.out.println("test()...");
		System.out.println(new Inner().num);
	}

	public class Inner { // static이 붙으려면 class 옆에도 static을 선언해주어야한다. interface & class 상속도 가능하다 왜 진짜 class이니까
		int num = 99;
		String str = "Hello";

		public Inner() {
			System.out.println("MemberOuter Inner()...");
			System.out.println(su);
			System.out.println(name);
//			test();
		}

		public void sum() { // static이 아닌 애들이 Member Inner가 되고, static을 가질 수 있는애들이 static Inner가된다.
			System.out.println("sum() ...");
			System.out.println(su);
			System.out.println(name);
//			test();
		}
	}

}
