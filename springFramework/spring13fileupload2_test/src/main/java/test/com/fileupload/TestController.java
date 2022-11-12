package test.com.fileupload;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;
import javax.servlet.ServletContext;

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
	private TestService service;
	
	@Autowired
	private TestService_file service_file;

	

	public TestController() {
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
	 * 입력 처리용
	 */
	@RequestMapping(value = "/insertOK.do", method = RequestMethod.POST)
	public String insertOK(TestVO vo) {
		logger.info("Welcome insertOK....");
		logger.info("{}",vo);
		
		vo = service_file.getVO(vo);
		logger.info("{}",vo);

		int result = service.insertOK(vo);
		logger.info("result : {}", result);
		return "redirect:selectAll.do";
	}

	/**
	 * 목록
	 */
	@RequestMapping(value = "/selectAll.do", method = RequestMethod.GET)
	public String selectAll(Model model) {
		logger.info("Welcome selectAll");

		List<TestVO> vos = service.selectAll();
		logger.info("vos.size():{}", vos.size());

		model.addAttribute("vos", vos);

		return "member/selectAll";
	}

	@RequestMapping(value = "/selectOne.do", method = RequestMethod.GET)
	public String selectOne(TestVO vo, Model model) {
		logger.info("Welcome selectOne");
		logger.info("{}", vo);

		TestVO vo2 = service.selectOne(vo);
		model.addAttribute("vo2", vo2);

		return "member/selectOne";
	}

	@RequestMapping(value = "/update.do", method = RequestMethod.GET)
	public String update(TestVO vo, Model model) {
		logger.info("Welcome update");
		logger.info("{}", vo);

		TestVO vo2 = service.selectOne(vo);
		model.addAttribute("vo2", vo2);

		return "member/update";
	}

	@RequestMapping(value = "/updateOK.do", method = RequestMethod.POST)
	public String updateOK(TestVO vo) {
		logger.info("Welcome updateOK");
		logger.info("{}", vo);
		
		vo = service_file.getVO(vo);
		logger.info("{}", vo);

		int result = service.updateOK(vo);
		logger.info("result:{}", result);

		return "redirect:selectAll.do";
	}

	@RequestMapping(value = "/delete.do", method = RequestMethod.GET)
	public String delete() {
		logger.info("Welcome delete");

		return "member/delete";
	}

	@RequestMapping(value = "/deleteOK.do", method = RequestMethod.GET)
	public String deleteOK(TestVO vo) {
		logger.info("Welcome deleteOK");
		logger.info("{}", vo);

		int result = service.deleteOK(vo);
		logger.info("result:{}", result);

		return "redirect:selectAll.do";
	}

	@RequestMapping(value = "/searchList.do", method = RequestMethod.GET)
	public String searchList(Model model, String searchKey, String searchWord) {
		logger.info("Welcome selectAll");
		logger.info("searchKey:{}", searchKey);
		logger.info("searchWord:{}", searchWord);

		List<TestVO> vos = service.searchList(searchKey, searchWord);

		model.addAttribute("vos", vos);

		return "member/selectAll";
	}

}