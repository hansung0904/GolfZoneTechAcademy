package test.com.aop01;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class MemberController {
	
	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	@Autowired
	MemberDAO m_dao;
	
	
	@RequestMapping(value = "/test.do", method = RequestMethod.GET)
	public String insert() {
		logger.info("Welcome insert.do!");
		
		m_dao.insertOK(new TestVO());//pointcut 대상>>어드바이스클래스 동작.
		m_dao.updateOK(new TestVO());//pointcut대상>>어드바이스클래스 동작.
		
		return "home";
	}
	
}
