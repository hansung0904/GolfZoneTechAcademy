package test.com.tiles;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = {"/","/home.do"}, method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home.do!");
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return ".home";
	}
	
	@RequestMapping(value = "/insert.do", method = RequestMethod.GET)
	public String insert() {
		logger.info("Welcome insert.do");
		return ".insert";
	}
	@RequestMapping(value = "/update.do", method = RequestMethod.GET)
	public String update() {
		logger.info("Welcome update.do");
		return ".update";
	}
	@RequestMapping(value = "/delete.do", method = RequestMethod.GET)
	public String delete() {
		logger.info("Welcome delete.do");
		return ".delete";
	}
	@RequestMapping(value = "/selectOne.do", method = RequestMethod.GET)
	public String selectOne() {
		logger.info("Welcome selectOne.do");
		return ".selectOne";
	}
	@RequestMapping(value = "/selectAll.do", method = RequestMethod.GET)
	public String selectAll() {
		logger.info("Welcome selectAll.do");
		return ".selectAll";
	}
	@RequestMapping(value = "/test01.do", method = RequestMethod.GET)
	public String test01() {
		logger.info("Welcome test01.do");
		return ".test01";
	}
	@RequestMapping(value = "/test02.do", method = RequestMethod.GET)
	public String test02() {
		logger.info("Welcome test02.do");
		return ".test/test02";
	}
	
}
