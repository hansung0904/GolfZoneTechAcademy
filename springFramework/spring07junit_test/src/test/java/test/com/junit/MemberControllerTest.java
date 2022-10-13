package test.com.junit;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:C:\\golfzon\\springFramework\\spring07junit_test\\src\\main\\webapp\\WEB-INF\\spring\\appServlet\\servlet-context.xml"})
public class MemberControllerTest {

	@Autowired
	MemberController mc;
	
	@Test
	public void testInsert() {
//		fail("Not yet implemented");
//		assertNull(mc);
		assertNotNull(mc);
		
//		assertEquals("member/insert", "member/insert");
		assertEquals("member/insert", mc.insert());
	}

	@Test
	public void testUpdate() {
//		fail("Not yet implemented");
		assertEquals("member/update", mc.update());
	}

	@Test
	public void testDelete() {
//		fail("Not yet implemented");
		assertEquals("member/delete", mc.delete());
	}

}
