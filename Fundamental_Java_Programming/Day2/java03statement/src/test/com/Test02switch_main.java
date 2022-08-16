package test.com;

public class Test02switch_main {

	public static void main(String[] args) {
		// switch~case~break
		System.out.println("hello switch");

		int key = 6;
		switch (key) { // switch 문 안에는 integer,char,String만 들어갈 수 있음, boolean 값을 쓰고싶으면 if 문 사용해야함.
		case 0:
			System.out.println("0000");
			break; // if문을 제외한 가장 가까운 블럭을 빠져나간다. break를 빼버리면 밑에 default도 실행된다.

		case 1:
			System.out.println("1111");
			break;

		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
			System.out.println("23456");
			if(key/3 > 1) { 
				System.out.println("Big");
			}
			break;

		default:
			System.out.println("default");
			break;
		}
		
		

	} // end main()

} // end class
