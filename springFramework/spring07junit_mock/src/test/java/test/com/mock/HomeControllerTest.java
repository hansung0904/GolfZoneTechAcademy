package test.com.mock;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.mock.web.MockHttpSession;
import org.springframework.mock.web.MockServletConfig;
import org.springframework.mock.web.MockServletContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:C:\\golfzon\\springFramework\\spring07junit_mock\\src\\main\\webapp\\WEB-INF\\spring\\appServlet\\servlet-context.xml"})
public class HomeControllerTest {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeControllerTest.class);

	
	@Autowired
	MemberService service;

	@Test
	public void test() {
//		fail("Not yet implemented");
	}
	
	@Test
	public void insertOK() {
		
		MockHttpServletRequest request = new MockHttpServletRequest();
		request.setParameter("name", "yangssem");
		request.setParameter("age", "33");
		
		TestVO vo = new TestVO();
		vo.setName(request.getParameter("name"));
		vo.setAge(Integer.parseInt(request.getParameter("age")));
		
		assertEquals(1, service.insertOK(vo));
		
	}
	
	@Test
	public void testResponse() {
		MockHttpServletResponse response = new MockHttpServletResponse();
		response.setHeader("name", "kim");
		response.addHeader("age", "44");
		
		logger.info("{}",response.getHeader("name"));
		logger.info("{}",response.getHeader("age"));
		assertEquals("kim", response.getHeader("name"));
		assertEquals("44", response.getHeader("age"));
		
	}
	
	
	@Test
	public void testSession() {
		MockHttpSession session  = new MockHttpSession();
		session.setAttribute("user_id", "admin");
		
		logger.info("{}",session.getAttribute("user_id"));
		assertEquals("admin", session.getAttribute("user_id"));
		
	}
	
	@Test
	public void testConfig() {
		//서블릿단위의 초기값설정
		MockServletConfig config  = new MockServletConfig();
		config.addInitParameter("name", "lee");
		
		logger.info("{}",config.getInitParameter("name"));
		assertEquals("lee", config.getInitParameter("name"));
		
	}
	
	
	@Test
	public void testContext() {
		//컨테이너 단위의 값세팅
		MockServletContext context  = new MockServletContext();
		context.setAttribute("ctx_user_id", "admin");
		
		logger.info("{}",context.getAttribute("ctx_user_id"));
		assertEquals("admin", context.getAttribute("ctx_user_id"));
		
	}
	
	

}
