package test.com.hello;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application 회원가입 처리 page.
 */
@Controller
public class MemberController {
	
	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	/**
	 * 회원가입 폼페이지 요청
	 */
	@RequestMapping(value = "/insert.do", method = RequestMethod.GET)
	public String insert() {
		logger.info("Welcome insert");
		
		
		return "member/insert";
	}
	
	/**
	 * 회원가입 처리용
	 */
	@RequestMapping(value = "/insertOK.do", 
			method = RequestMethod.POST)
	public String insertOK(MemberVO vo) {
		logger.info("Welcome insertOK");
		logger.info("{}",vo);
		
		
		return "redirect:home.do";
	}
	
	@RequestMapping(value = "/selectOne.do", 
			method = RequestMethod.GET)
	public String selectOne(MemberVO vo, Model model) {
		logger.info("Welcome selectOne");
		logger.info("{}",vo);
		
		MemberVO vo2 = 
			new MemberVO(11,"admin11","hi1111","kim11","011");
		model.addAttribute("vo2", vo2);
		
		return "member/selectOne";
	}
	
	@RequestMapping(value = "/selectAll.do", 
			method = RequestMethod.GET)
	public String selectAll(Model model) {
		logger.info("Welcome selectAll");
		
		MemberVO vo2 = 
				new MemberVO(11,"admin11","hi1111","kim11","011");
		
		List<MemberVO> vos = new ArrayList<MemberVO>();
		vos.add(vo2);
		vos.add(vo2);
		vos.add(vo2);
		vos.add(vo2);
		vos.add(vo2);
		model.addAttribute("vos", vos);
		
		return "member/selectAll";
	}
	
	@RequestMapping(value = "/searchList.do", 
			method = RequestMethod.GET)
	public String searchList(Model model,
			String searchKey,String searchWord) {
		logger.info("Welcome selectAll");
		logger.info("searchKey:{}",searchKey);
		logger.info("searchWord:{}",searchWord);
		
		MemberVO vo2 = 
				new MemberVO(11,"admin11","hi1111","kim11","011");
		
		List<MemberVO> vos = new ArrayList<MemberVO>();
		vos.add(vo2);
		vos.add(vo2);
		vos.add(vo2);
		
		model.addAttribute("vos", vos);
		
		return "member/selectAll";
	}
	
	@RequestMapping(value = "/update.do", 
			method = RequestMethod.GET)
	public String update(MemberVO vo, Model model) {
		logger.info("Welcome update");
		logger.info("{}",vo);
		
		MemberVO vo2 = 
			new MemberVO(11,"admin11","hi1111","kim11","011");
		model.addAttribute("vo2", vo2);
		
		return "member/update";
	}
	@RequestMapping(value = "/updateOK.do", 
			method = RequestMethod.POST)
	public String updateOK(MemberVO vo) {
		logger.info("Welcome updateOK");
		logger.info("{}",vo);
		
		
		return "redirect:selectAll.do";
	}
	
	@RequestMapping(value = "/delete.do", 
			method = RequestMethod.GET)
	public String delete() {
		logger.info("Welcome delete");
		
		return "member/delete";
	}
	
	@RequestMapping(value = "/deleteOK.do", 
			method = RequestMethod.GET)
	public String deleteOK(MemberVO vo) {
		logger.info("Welcome deleteOK");
		logger.info("{}",vo);
		
		
		return "redirect:selectAll.do";
	}
	
}
