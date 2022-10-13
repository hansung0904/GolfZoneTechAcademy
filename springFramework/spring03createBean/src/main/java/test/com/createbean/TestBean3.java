package test.com.createbean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestBean3 {
	private static final Logger logger = LoggerFactory.getLogger(TestBean3.class);

	private int kor;
	private int eng;
	private int math;

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getKor() {
		return kor;
	}

	public TestBean3() {
		logger.info("TestBean3()...");
	}

	public void setKor(int kor) {
		this.kor = kor;
	}
	
	
	

	@Override
	public String toString() {
		return "TestBean3 [kor=" + kor + ", eng=" + eng + ", math=" + math + "]";
	}

	

}
