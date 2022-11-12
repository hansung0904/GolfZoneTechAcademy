package test.com.message;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.support.MessageSourceAccessor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	MessageSource messageSource;
	
	@Autowired
	MessageSourceAccessor messageSourceAccessor;
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		///////////공통메세지 처리//////////////////////////////////////
		//공통 메세지를 변경할때 일일이 모든 소스파일의 각기능안에 바꿔면서 관리하지않고
		//설정된 properties 문서로 관리할수 있도록하는
		// MessageSource 혹은 MessageSourceAccessor 등을 
		//빈에 등록해서 사용하면 편리하다.
		String user_info = messageSource.getMessage(
				"user.info", 
				new String[] {"tester","hi2222","김군","02"}, 
				"해당 메세지 키가 없네요...", 
				locale);//locale.KOREA처리시 한글처리가능.
		//언어변환용 빈으로 관리가능
		//root-context >> localResolver를 등록할 수 있다.
		
		logger.info("messageSource >> user.info : {}",user_info);
		
		model.addAttribute("user_info",user_info);
		
		///messageSourceAccessor....
		user_info = messageSourceAccessor.getMessage(
				"user.info", 
				new String[] {"tester3","hi3333","김군3","033"}, 
				"해당 메세지 키가 없네요...3", 
				locale);
		logger.info("messageSourceAccessor >> user.info : {}",user_info);
		
		
		
		return "home";
	}
	@RequestMapping(value = "/insert.do", method = RequestMethod.GET)
	public String insert() {
		logger.info("Welcome insert.do");
		
		
		return "insert";
	}
	
}
