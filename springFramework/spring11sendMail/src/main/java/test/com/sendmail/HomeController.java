package test.com.sendmail;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

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
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	TestSendEmail testSendEmail;
	
	
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
		
		return "home";
	}
	@RequestMapping(value = "/sendMail.do", method = RequestMethod.GET)
	public String sendMail() {
		logger.info("Welcome sendMail.do");
		
		
		return "sendMail";
	}
	
	@RequestMapping(value = "/sendMailOK.do", method = RequestMethod.POST)
	public String sendMailOK(EmailVO vo) {
		logger.info("Welcome sendMailOK.do");
		logger.info("{}",vo);
		
		String rt = "redirect:/";
		try {
			testSendEmail.sendEmail(vo);
			logger.info("successed...");
		} catch (Exception e) {
			logger.info("failed...");
			e.printStackTrace();
			rt = "redirect:sendMail.do";
		}
		
		return rt;
	}
	
}
