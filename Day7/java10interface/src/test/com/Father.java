package test.com;

public interface Father {

	/* public static final�� �����Ǿ� ����. */
	String MAX_MONEY = "$1,000,000";

	public int work(); // abstract ��������

	public static String drink() {
		System.out.println("static drink()...");
		return "Beer";
	}
	
	public default double drive() {
		System.out.println("default drive()...");
		return 3000.0;
	}
	
	
}
