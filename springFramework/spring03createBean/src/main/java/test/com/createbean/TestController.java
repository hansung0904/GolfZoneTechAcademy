package test.com.createbean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
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
public class TestController {
	
	private static final Logger logger = LoggerFactory.getLogger(TestController.class);
	
	@Autowired
	ArrayList<String> alist;
	
	@Autowired
	ArrayList<String> blist;
	
	@Autowired
	ArrayList<String> names;
	
	@Autowired
	HashSet<String> aset;
	
	@Autowired
	HashMap<String,String> amap;
	
	@Autowired
	Car mcar;
	
	@Autowired
	Book mbook;
	
	@Autowired
	Store mstore;
	
	@Autowired
	Store2 mstore2;
	
	@Autowired
	Store tstore;
	
	@Autowired
	Store tstore2;
	
	@Autowired
	TestBean4 testbean4;
	
	@Autowired
	TestBean4 testbean4_alist;
	
	@Autowired
	TestBean5 testbean5_aset;
	
	@Autowired
	TestBean6 testbean6_amap;
	
	/**
	 * Simply selects the test view to render by returning its name.
	 */
	@RequestMapping(value = "/test.do", method = RequestMethod.GET)
	public String test(Locale locale, Model model) {
		logger.info("Welcome test!", locale);
		
		logger.info("alist.size:{}", alist.size());
		alist.add("lee1");
		alist.add("lee1");
		alist.add("lee1");
		for (String x : alist) {
			logger.info("{}", x);
		}
		logger.info("===============");
		logger.info("blist.size:{}", blist.size());
		blist.add("lee2");
		blist.add("lee2");
		blist.add("lee2");
		for (String x : blist) {
			logger.info("{}", x);
		}
		logger.info("===============");
		logger.info("names.size:{}", names.size());
		names.add("han");
		names.add("han");
		names.add("han");
		for (String x : names) {
			logger.info("{}", x);
		}
		
		logger.info("===============");
		logger.info("aset.size:{}", aset.size());
		
		for (String x : aset) {
			logger.info("{}", x);
		}
		logger.info("===============");
		logger.info("{}", amap.get("name"));
		logger.info("{}", amap.get("age"));
		logger.info("===============");
		logger.info("{}", mcar);
		logger.info("===============");
		logger.info("{}", mbook);
		logger.info("===============");
		logger.info("{}", mstore);
		
		logger.info("===============");
		logger.info("{}", mstore2);
		
		logger.info("===============");
		logger.info("{}", tstore);
		
		logger.info("===============");
		logger.info("{}", tstore2);
		
		
		logger.info("===============");
		logger.info("{}", testbean4);
		
		logger.info("===============");
		logger.info("{}", testbean4_alist);
		
		logger.info("===============");
		logger.info("{}", testbean5_aset);
		
		logger.info("===============");
		logger.info("{}", testbean6_amap);
		
		
		
		
		
		
		
		
		return "home";
	}
	
}
