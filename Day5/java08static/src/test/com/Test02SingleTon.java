package test.com;

public class Test02SingleTon {
	
	static Test02SingleTon singleTon = new Test02SingleTon();
	
	private Test02SingleTon() {
		
	}
	
	public static Test02SingleTon getInstance() {
		return singleTon;
	} 
}
