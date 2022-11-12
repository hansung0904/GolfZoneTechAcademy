package test.com.interceptor;

import java.text.DateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class TestInterceptor extends HandlerInterceptorAdapter {
	private static final Logger logger = LoggerFactory.getLogger(TestInterceptor.class);

	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, 
			Object handler)
			throws Exception {
		//서블릿 패스가 요청되고 나서 서블릿 함수 호출전 동작
		String sPath = request.getServletPath();
		logger.info("preHandle : {}", sPath);
		
		HttpSession session = request.getSession();
		String user_id = (String)session.getAttribute("user_id");
		logger.info("session user_id : {}", user_id);
		
		if(sPath.equals("/selectAll.do")  ||  sPath.equals("/insert.do")) {
			
			if(user_id == null) {
				response.sendRedirect("login.do");
				return false;
			}
			
		}
		
		//미션 : spring10mybatis 프로젝트와 똑같이 spring12interceptor_member프로젝트에 구현하시고
		//		방금 학습한 인터셉터 기능을 추가하여 로그인처리가 되도록 구현하세요
		//		/home.do 를 제외한 모든 서블릿패스를 검수하도록 하세요.
		
		return true;
	}
	
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, 
			Object handler,
			ModelAndView modelAndView) throws Exception {
		//서블릿 패스가 요청, 서블릿 함수 동작후  동작
		String sPath = request.getServletPath();
		logger.info("postHandle : {}", sPath);
		
		Date date = new Date();
		
		modelAndView.addObject("serverTime", date);
		modelAndView.addObject("post_data", "yangssem");
		
	}
	
	

}
