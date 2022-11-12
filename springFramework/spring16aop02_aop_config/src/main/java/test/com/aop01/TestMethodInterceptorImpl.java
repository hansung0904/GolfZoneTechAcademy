package test.com.aop01;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestMethodInterceptorImpl implements MethodInterceptor {
	private static final Logger logger = LoggerFactory.getLogger(TestMethodInterceptorImpl.class);

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		logger.info("invoke()....");
		logger.info("{}",invocation);
		
		String method_name = invocation.getMethod().getName();
		
		logger.info("before "+method_name+"()....");
		Object obj = invocation.proceed();//pointcut에 지정된 메소드를 실제로구현
		logger.info("after "+method_name+"()....");
		
		
		return obj;
	}

}
