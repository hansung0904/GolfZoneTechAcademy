package test.com.lombok;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
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
		
		TestVO_default vo_default = new TestVO_default();
		vo_default.setNum(11);
		vo_default.setName("default");
		vo_default.setAge(111);
		vo_default.setImgName("default.png");
		
		logger.info("{}",vo_default);
		model.addAttribute("vo_default", vo_default );
		
		
		TestVO_lombok vo_lombok = new TestVO_lombok();
		vo_lombok.setNum(33);
		vo_lombok.setName("TestVO_lombok");
		vo_lombok.setAge(333);
		vo_lombok.setImgName("vo_lombok.png");
		
		logger.info("{}",vo_lombok);
		model.addAttribute("vo_lombok", vo_lombok );
		
		
		TestVO_lombok_data vo_data = new TestVO_lombok_data();
		vo_data.setNum(44);
		vo_data.setName("vo_data");
		vo_data.setAge(44);
		vo_data.setImgName("vo_data.png");
		
		logger.info("{}",vo_data);
		model.addAttribute("vo_data", vo_data );
		
		return "home";
	}
	
	@ResponseBody
	@RequestMapping(value = "/json_default.do", method = RequestMethod.GET)
	public String json_default() {
		logger.info("Welcome json_default.do");
		
		
		TestVO_default vo_default = new TestVO_default();
		vo_default.setNum(11);
		vo_default.setName("default");
		vo_default.setAge(111);
		vo_default.setImgName("default.png");
		
		return vo_default.toString();
	}
	@ResponseBody
	@RequestMapping(value = "/json_lombok.do", method = RequestMethod.GET)
	public String json_lombok() {
		logger.info("Welcome json_lombok.do");
		
		
		
		TestVO_lombok vo_lombok = new TestVO_lombok();
		vo_lombok.setNum(33);
		vo_lombok.setName("TestVO_lombok");
		vo_lombok.setAge(333);
		vo_lombok.setImgName("vo_lombok.png");
		
		
		return vo_lombok.toString();
	}
	@ResponseBody
	@RequestMapping(value = "/json_data.do", method = RequestMethod.GET)
	public String json_data() {
		logger.info("Welcome json_data.do");
		
		
		
		TestVO_lombok_data vo_data = new TestVO_lombok_data();
		vo_data.setNum(44);
		vo_data.setName("vo_data");
		vo_data.setAge(44);
		vo_data.setImgName("vo_data.png");
		
		logger.info("{}",vo_data);
		
		return vo_data.toString();
	}
	
}
