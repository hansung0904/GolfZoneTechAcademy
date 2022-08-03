package test.com;

public interface Mother {
	
	String POWER = "100¸¶·Â";
	
	public void play();
	
	public static void sleep() {
		System.out.println("sleep()...");
	}
	
	public default int waiting() {
		System.out.println("waiting()...");
		return 1;
	}
}
