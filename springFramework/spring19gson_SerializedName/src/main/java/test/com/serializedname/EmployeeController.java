package test.com.serializedname;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Handles requests for the application home page.
 */
@Controller
public class EmployeeController {

	private static final Logger logger = LoggerFactory.getLogger(EmployeeController.class);

	Gson gson = new GsonBuilder().setPrettyPrinting().create();
	
	@Autowired
	Employee employee;
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	
	
	
	@ResponseBody
	@RequestMapping(value = "/employee01.do", method = RequestMethod.GET)
	public String employee01() {
		logger.info("Welcome employee01.do");
		
		// employee 를 JSON문자열로 변환
		String jsonTestVO = gson.toJson(employee);
		logger.info(jsonTestVO);

		return jsonTestVO;
	}
	
	
	@ResponseBody
	@RequestMapping(value = "/employee02.do", method = RequestMethod.GET)
	public String employee02() {
		logger.info("Welcome employee02.do");
		
		List<Employee> vos = new ArrayList<Employee>();
		vos.add(employee);
		vos.add(employee);
		vos.add(employee);
		
		// vos 를 JSON문자열로 변환
		String jsonTestVO = gson.toJson(vos);
		logger.info(jsonTestVO);
		
		return jsonTestVO;
	}
	
	@ResponseBody
	@RequestMapping(value = "/employee03.do", method = RequestMethod.GET)
	public String employee03(@RequestParam(value = "txt_json") String txt_json) {
		logger.info("Welcome employee03.do");
		logger.info("{}",txt_json);
		
		//객체 역직렬화
		Employee vo_gson = gson.fromJson(txt_json, Employee.class);
		
		
		logger.info(vo_gson.toString());
		
		return "{\"result\":\"successed employee03\"}";
	}
	
	@ResponseBody
	@RequestMapping(value = "/employee04.do", method = RequestMethod.GET)
	public String employee04(@RequestParam(value = "txt_json") String txt_json) {
		logger.info("Welcome employee04.do");
		logger.info("{}",txt_json);
		
		//배열 객체 역직렬화
		Employee[] vo_gsons = gson.fromJson(txt_json, Employee[].class);
		
		for (Employee vo : vo_gsons) {
			logger.info(vo.toString());
		}
		
		logger.info("================================");
		
		//컬렉션변환.
		List<Employee> vos = Arrays.asList(vo_gsons);
		for (Employee vo : vos) {
			logger.info(vo.toString());
		}
		
		return "{\"result\":\"successed employee04\"}";
	}
	
	
	

}
