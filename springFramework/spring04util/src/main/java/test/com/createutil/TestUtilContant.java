package test.com.createutil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestUtilContant {
	private static final Logger logger = LoggerFactory.getLogger(TestUtilContant.class);

	private int max_value;
	private int count;
	
	public TestUtilContant() {
		// TODO Auto-generated constructor stub
	}
	public TestUtilContant(int max_value,int count) {
		logger.info("TestUtilContant(int max_value)...");
		logger.info("max_value : {}",max_value);//2147483647
		logger.info("count : {}",count);//12345678
		this.max_value = max_value;
		this.count = count;
	}

}
