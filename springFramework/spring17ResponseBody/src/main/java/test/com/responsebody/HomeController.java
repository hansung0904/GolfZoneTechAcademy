package test.com.responsebody;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

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

		model.addAttribute("serverTime", formattedDate);

		return "home";
	}

	@RequestMapping(value = "/json_txtvo", method = RequestMethod.GET)
	public String json_txtvo(Model model) {
		logger.info("Welcome json_txtvo!");

		TestVO vo = new TestVO(11, "kim", 33);

		String txtvo = "{\"num\":" + vo.getNum() + ",\"name\":\"" + vo.getName() + "\",\"age\":" + vo.getAge() + "}";

		model.addAttribute("txtvo", txtvo);

		return "home";
	}

	@RequestMapping(value = "/json_insertOK.do", method = RequestMethod.GET)
	@ResponseBody
	public String json_insertOK() {
		logger.info("Welcome json_insertOK!");

		int result = 1;
		String txt = "{\"result\":" + result +"}";

		return txt;
	}
	
	@RequestMapping(value = "/json_insertOK2.do", method = RequestMethod.GET)
	@ResponseBody
	public Map<String, String> json_insertOK2(TestVO vo) {
		logger.info("Welcome json_insertOK2!");
		logger.info("{}",vo);//name=admin
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("result", "1");

		return map;
	}
	
	@RequestMapping(value = "/json_selectOne.do", method = RequestMethod.GET)
	@ResponseBody
	public String json_selectOne() {
		logger.info("Welcome json_selectOne!");
		
		TestVO vo = new TestVO(11, "kim", 33);

		String txtvo = "{\"num\":" + vo.getNum() + ",\"name\":\"" + vo.getName() + "\",\"age\":" + vo.getAge() + "}";

		
		return txtvo;
	}
	
	@RequestMapping(value = "/json_selectOne2.do", method = RequestMethod.GET)
	@ResponseBody
	public TestVO json_selectOne2() {
		logger.info("Welcome json_selectOne2!");
		
		
		TestVO vo2 = new TestVO(11, "kim", 33);
		
		return vo2;
	}
	
	@RequestMapping(value = "/json_selectAll.do", method = RequestMethod.GET)
	@ResponseBody
	public String json_selectAll() {
		logger.info("Welcome json_selectAll!");
		
		TestVO vo = new TestVO(11, "kim", 33);
		
		String txtvo = "[";
		txtvo += "{\"num\":" + vo.getNum() + ",\"name\":\"" + vo.getName() + "\",\"age\":" + vo.getAge() + "}";
		txtvo += ",";
		txtvo += "{\"num\":" + vo.getNum() + ",\"name\":\"" + vo.getName() + "\",\"age\":" + vo.getAge() + "}";
		txtvo += ",";
		txtvo += "{\"num\":" + vo.getNum() + ",\"name\":\"" + vo.getName() + "\",\"age\":" + vo.getAge() + "}";
		txtvo += "]";
		
		
		return txtvo;
	}
	
	@RequestMapping(value = "/json_selectAll2.do", method = RequestMethod.GET)
	@ResponseBody
	public List<TestVO> json_selectAll2() {
		logger.info("Welcome json_selectAll2!");
		
		List<TestVO> vos = new ArrayList<TestVO>();
		
		TestVO vo = new TestVO(11, "kim", 33);
		vos.add(vo);
		vos.add(vo);
		vos.add(vo);
		vos.add(vo);
		
		return vos;
	}
	@RequestMapping(value = "/json_selectMap.do", method = RequestMethod.GET)
	@ResponseBody
	public Map<String,List<TestVO>> json_selectMap() {
		logger.info("Welcome json_selectMap!");
		
		Map<String,List<TestVO>> map = new HashMap<String, List<TestVO>>();
		List<TestVO> vos = new ArrayList<TestVO>();
		
		TestVO vo = new TestVO(11, "kim", 33);
		vos.add(vo);
		vos.add(vo);
		vos.add(vo);
		vos.add(vo);
		
		map.put("vos", vos);
				
		
		return map;
	}
	
	
	@RequestMapping(value = "/json_selectMap3.do", method = RequestMethod.GET)
	@ResponseBody
	public Map json_selectMap3() {
		logger.info("Welcome json_selectMap3!");
		
		Map map = new HashMap();
		List<TestVO> vos = new ArrayList<TestVO>();
		
		TestVO vo = new TestVO(11, "kim", 33);
		vos.add(vo);
		vos.add(vo);
		vos.add(vo);
		vos.add(vo);
		
		map.put("vos", vos);
		map.put("vo", vo);
		
		
		return map;
	}
	
	@RequestMapping(value = "/json_selectMap4.do", method = RequestMethod.GET)
	@ResponseBody
	public Json_Map json_selectMap4() {
		logger.info("Welcome json_selectMap4!");
		//주의...Jackson변환시 getters/setters없으면..변환못시킴
		return new Json_Map();
	}
	
	
	@RequestMapping(value = "/json_selectMap2.do", method = RequestMethod.GET)
	@ResponseBody
	public Map<String,TestVO> json_selectMap2() {
		logger.info("Welcome json_selectMap2!");
		
		Map<String,TestVO> map = new HashMap<String, TestVO>();
		
		TestVO vo2 = new TestVO(11, "kim", 33);
		
		map.put("vo2", vo2);
		
		
		return map;
	}
	
	
	@RequestMapping(value = "/ModelAndView.do", method = RequestMethod.GET)
	public ModelAndView modelAndView(ModelAndView model) {
		logger.info("Welcome modelAndView.do!");
		
		model.setViewName("home");
		model.addObject("name", "yangssem");
		model.addObject("txtvo", new TestVO());
		
		return model;
	}
	
	@RequestMapping(value = "/json_ModelAndView.do", method = RequestMethod.GET)
	public ModelAndView json_ModelAndView() {
		logger.info("Welcome json_ModelAndView.do!");
		
		ModelAndView model = new ModelAndView();
		
		Map<String, TestVO> map = new HashMap<String, TestVO>();
		map.put("vo", new TestVO(33,"yang양샘",33));
		
		Map<String, List<TestVO>> map2 = new HashMap<String, List<TestVO>>();
		List<TestVO> vos = new ArrayList<TestVO>();
		vos.add(new TestVO(33,"yang양샘",33));
		map2.put("vos", vos);
		
		
		model.addObject("name", "yangssem양샘");
		model.addObject("txtvo", new TestVO());
		model.addAllObjects(map);
		model.addAllObjects(map2);
		model.setViewName("jsonView");
		
		return model;
	}
	@RequestMapping(value = "/json_Model.do", method = RequestMethod.GET)
	public String json_Model(Model model) {
		logger.info("Welcome json_Model.do!");
		
		Map<String, TestVO> map = new HashMap<String, TestVO>();
		map.put("vo", new TestVO(33,"yang양샘",33));
		
		Map<String, List<TestVO>> map2 = new HashMap<String, List<TestVO>>();
		List<TestVO> vos = new ArrayList<TestVO>();
		vos.add(new TestVO(33,"yang양샘",33));
		map2.put("vos", vos);
		
		model.addAttribute("name", "yangssem양샘");
		model.addAttribute("txtvo", new TestVO());
		model.addAttribute(map);
		model.addAttribute(map2);
		
		return "jsonView";
	}
	
	
	
	@RequestMapping(value = "/board_jqgrid.do", method = RequestMethod.GET)
	public String board(Locale locale, Model model) {
		logger.info("Welcome board! The client locale is {}.", locale);
		
		
		return "board";
	}
	
	
	@RequestMapping(value = "/board_jqgrid_json.do", method = RequestMethod.GET)
	public String board_json(Locale locale, Model model) {
		logger.info("Welcome board! The client locale is {}.", locale);
		Map<String,List<BoardDTO>> map = 
				new HashMap<String, List<BoardDTO>>();
		List<BoardDTO> list = new ArrayList<BoardDTO>();
		for (int i = 0; i < 30; i++) {
			list.add(new BoardDTO(1+i));
		}
		map.put("list", list);
		
		
		model.addAllAttributes(map);
		
		return "jsonView";
	}

}
