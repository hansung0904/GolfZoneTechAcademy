package test.com.createbean;

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
	TestBean tb01;
	
	@Autowired
	TestBean tb02;
	
	@Autowired
	TestBean3 tb03;
	
	@Autowired
	Car car;
	
	@Autowired
	Book book;
	
	@Autowired
	Store store;
	
	@Autowired
	Store2 store02;
	
	@Autowired
	TestBean4 tb04;
	
	@Autowired
	TestBean5 tb05;
	
	@Autowired
	TestBean6 tb06;
	
	@Autowired
	TestBean7 tb07;
	
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
		
		logger.info("{}",tb01);
		logger.info("{}",tb02);
		logger.info("{}",tb03);
		
		logger.info("{}",car);
		logger.info("{}",book);
		
		logger.info("{}",store);
		logger.info("{}",store02);
		
		logger.info("{}",tb04.names.size());
		for (String name : tb04.names) {
			logger.info("{}",name);
		}
		logger.info("=========");
		logger.info("{}",tb05.names.size());
		for (String name : tb05.names) {
			logger.info("{}",name);
		}
		
		logger.info("=========");
		logger.info("{}",tb06.map.size());
		logger.info("{}",tb06.map.get("name"));
		logger.info("{}",tb06.map.get("age"));
		logger.info("=========");
		for (String key : tb06.map.keySet()) {
			logger.info("{}",tb06.map.get(key));
		}
		
		
		logger.info("=========");
		logger.info("tb07.list : {}",tb07.list.size());
		logger.info("tb07.set : {}",tb07.set.size());
		logger.info("tb07.map : {}",tb07.map.size());
		
		return "home";
	}
	
}
