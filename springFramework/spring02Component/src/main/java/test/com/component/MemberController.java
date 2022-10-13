package test.com.component;

import java.util.ArrayList;
import java.util.List;

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
public class MemberController {
	
	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	@Autowired
	MemberService service;
	
	public MemberController() {
		logger.info("MemberController()....");
	}
	
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
	@RequestMapping(value = "/insertOK.do", method = RequestMethod.POST)
	public String insertOK(MemberVO vo) {
		logger.info("Welcome insertOK....");
		
		int result = service.insertOK(vo);
		logger.info("result : {}",result);
		return "redirect:/";
	}
	
	/**
	 * 회원목록
	 */
	@RequestMapping(value = "/selectAll.do", 
			method = RequestMethod.GET)
	public String selectAll(Model model) {
		logger.info("Welcome selectAll");
		
		
		List<MemberVO> vos = service.selectAll();
		logger.info("vos.size():{}",vos.size());
		
		model.addAttribute("vos", vos);
		
		return "member/selectAll";
	}
	
	@RequestMapping(value = "/selectOne.do", 
			method = RequestMethod.GET)
	public String selectOne(MemberVO vo, Model model) {
		logger.info("Welcome selectOne");
		logger.info("{}",vo);
		
		MemberVO vo2 = service.selectOne(vo);
		model.addAttribute("vo2", vo2);
		
		return "member/selectOne";
	}
	
	@RequestMapping(value = "/update.do", 
			method = RequestMethod.GET)
	public String update(MemberVO vo, Model model) {
		logger.info("Welcome update");
		logger.info("{}",vo);
		
		MemberVO vo2 = service.selectOne(vo);
		model.addAttribute("vo2", vo2);
		
		return "member/update";
	}
	
	@RequestMapping(value = "/updateOK.do", 
			method = RequestMethod.POST)
	public String updateOK(MemberVO vo) {
		logger.info("Welcome updateOK");
		logger.info("{}",vo);
		
		int result = service.updateOK(vo);
		logger.info("result:{}",result);
		
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
		
		int result = service.deleteOK(vo);
		logger.info("result:{}",result);
		
		return "redirect:selectAll.do";
	}
	
	@RequestMapping(value = "/searchList.do", 
			method = RequestMethod.GET)
	public String searchList(Model model,
			String searchKey,String searchWord) {
		logger.info("Welcome selectAll");
		logger.info("searchKey:{}",searchKey);
		logger.info("searchWord:{}",searchWord);
		
		List<MemberVO> vos = 
				service.searchList(searchKey, searchWord);
		
		model.addAttribute("vos", vos);
		
		return "member/selectAll";
	}
	
}
