package test.com.aop01;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Aspect
public class TestPointcutAspect {
	private static final Logger logger = LoggerFactory.getLogger(TestPointcutAspect.class);

	@Pointcut("execution(public * test..*TestDAO*.*delete*(..))")
	public void testPointcut() {
	}
	
	@Before("testPointcut()")
	public void testBeforeDelete() {
		logger.info("testBeforeDelete()...");
	}
	
	@After("testPointcut()")
	public void testAfterDelete() {
		logger.info("testAfterDelete()...");
	}
	
	/////////////////////////////////
	//within : 클래스명으로 접근가능.
	@Pointcut("within(TestDAOimpl)")
	public void testPointcut_within() {
	}
	
	@Around("testPointcut_within()")
	public Object testAroundDAO(ProceedingJoinPoint pjp) throws Throwable {
		logger.info("testAroundDAO()...before");
		Object obj = pjp.proceed();
		
		logger.info("testAroundDAO()...after");
		return obj;
	}
	
	///////Pointcut bean테스트시 위에 작성한 포인트컷과 충돌나니 주석하고 할것.//////////////////////////
	@Pointcut("bean(dao2)")
	public void testPointcut_bean() {
	}
	
	@Around("testPointcut_bean()")
	public Object testAroundBean(ProceedingJoinPoint pjp) throws Throwable {
		logger.info("testAroundBean()...before");
		Object obj = pjp.proceed();
		
		logger.info("testAroundBean()...after");
		return obj;
	}

}
