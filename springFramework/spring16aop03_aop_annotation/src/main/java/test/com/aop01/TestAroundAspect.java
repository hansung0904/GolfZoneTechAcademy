package test.com.aop01;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Aspect
public class TestAroundAspect {
	private static final Logger logger = LoggerFactory.getLogger(TestAroundAspect.class);

	@Around("execution(public * test..*TestDAO*.*(..))")
	public Object testAroundAspect(ProceedingJoinPoint pjp) {
		logger.info("testAroundAspect()....before");
		logger.info("{}",pjp);
		
		if(pjp.getArgs().length>0) {
			logger.info("pjp.getArgs() >>>>>>>>> {}",pjp.getArgs());
		}
		
		
		
		Object obj = null;
		try {
			obj = pjp.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		
		logger.info("testAroundAspect()....after");
		return obj;
	}
	
}
