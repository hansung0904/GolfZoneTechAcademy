package test.com.member;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class LoginController {
	
	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);
	
	@Autowired
	MemberService service;
	
	@Autowired
	HttpSession session;
	
	public LoginController() {
		logger.info("MemberController()....");
	}
	
	/**
	 * 로그인 폼페이지 요청
	 */
	@RequestMapping(value = "/login.do", method = RequestMethod.GET)
	public String login() {
		logger.info("Welcome login");
		
		
		return "member/login";
	}
	
	/**
	 * 로그인 처리용
	 */
	@RequestMapping(value = "/loginOK.do", method = RequestMethod.POST)
	public String loginOK(MemberVO vo) {
		logger.info("Welcome loginOK....");
		logger.info("{}",vo);
		
		MemberVO vo2 = service.loginOK(vo);
		logger.info("vo2 : {}",vo2);
		
		if(vo2!=null) {
			session.setAttribute("user_id", vo2.getId());
			
			return "redirect:selectAll.do";
		}else {
			return "redirect:/";
		}
		
	}
	@RequestMapping(value = "/logout.do", method = RequestMethod.GET)
	public String logout() {
		logger.info("Welcome loginOK....");
		
		session.removeAttribute("user_id");
//		session.invalidate();
		
		return "redirect:/";
		
	}
	
	
}
