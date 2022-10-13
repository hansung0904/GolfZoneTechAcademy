package test.com.createutil;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestBean6 {
	private static final Logger logger = LoggerFactory.getLogger(TestBean6.class);

	public Map<String, String> map;

	// map.put("name","kim");
	// map.put("age","33");

	public TestBean6() {
		logger.info("TestBean6()...");
	}

	public TestBean6(Map<String, String> map) {
		logger.info("TestBean6(Map<String, String> map)...");
		this.map = map;
	}

	@Override
	public String toString() {
		return "TestBean6 [map=" + map + "]";
	}

}
