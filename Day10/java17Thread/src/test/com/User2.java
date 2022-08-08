package test.com;

public class User2 extends Thread {
	
	private Calculator cal;
	
	public void setCal(Calculator cal) {
		setName("User2...");
		this.cal = cal;
	}
	
	@Override
	public void run() {
		System.out.println("User2 run()...");
		cal.setMemory(50);
	}
}
