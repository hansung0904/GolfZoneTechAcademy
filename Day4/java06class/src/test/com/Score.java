package test.com;

public class Score {
	// 접근제한의 선언이 없으면 동일 패키지에 유효함.
	int num; // 0
	
	// 상속관계시 패키지가 달라도 접근 가능. 동일패키지에 당연히 유효.
	protected String name; // null
	
	// 소속된 클래스 내에서만 접근 가능.
	/* private */ int kor; // 0
	public int eng; // 0
	public int math; //0
	
	public Score() {
		System.out.println("Score()...");
	}
	
}
