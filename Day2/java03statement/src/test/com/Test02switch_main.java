package test.com;

public class Test02switch_main {

	public static void main(String[] args) {
		// switch~case~break
		System.out.println("hello switch");

		int key = 6;
		switch (key) { // switch �� �ȿ��� integer,char,String�� �� �� ����, boolean ���� ��������� if �� ����ؾ���.
		case 0:
			System.out.println("0000");
			break; // if���� ������ ���� ����� ���� ����������. break�� �������� �ؿ� default�� ����ȴ�.

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
