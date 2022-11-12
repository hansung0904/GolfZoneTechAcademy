package test.com.aop01;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Aspect
public class TestAfterAspect {
	private static final Logger logger = LoggerFactory.getLogger(TestAfterAspect.class);

	@After("execution(public * test..*TestDAO*.*select*(..))")
	public void testAfter(JoinPoint jp) {
		logger.info("testAfter()....After");
		logger.info("{}",jp);
		
		if(jp.getArgs().length>0) {
			logger.info("jp.getArgs() >>>>>>>>> {}",jp.getArgs());
		}
		
	}
	
}
