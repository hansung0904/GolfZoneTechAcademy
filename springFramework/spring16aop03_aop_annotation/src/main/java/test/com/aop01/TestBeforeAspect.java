package test.com.aop01;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Aspect
public class TestBeforeAspect {
	private static final Logger logger = LoggerFactory.getLogger(TestBeforeAspect.class);

	@Before("execution(public * test..*TestDAO*.*update*(..))")
	public void testBefore(JoinPoint jp) {
		logger.info("testBefore()....before");
		logger.info("{}",jp);
		
		if(jp.getArgs().length>0) {
			logger.info("jp.getArgs() >>>>>>>>> {}",jp.getArgs());
		}
		
	}
	
}
