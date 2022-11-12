package test.com.member;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class LoginInterceptor extends HandlerInterceptorAdapter {
	private static final Logger logger = LoggerFactory.getLogger(LoginInterceptor.class);

	
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
		
		if(sPath.equals("/selectAll.do")  ||  sPath.equals("/insert.do")
				  ||  sPath.equals("/insertOK.do")
				  ||  sPath.equals("/update.do")
				  ||  sPath.equals("/updateOK.do")
				  ||  sPath.equals("/delete.do")
				  ||  sPath.equals("/deleteOK.do")
				  ||  sPath.equals("/selectOne.do")
				  ||  sPath.equals("/searchList.do")) {
			
			if(user_id == null) {
				response.sendRedirect("login.do");
				return false;
			}
			
		}
		
		return true;
	}
	
	
	

}
