package test.com.junit;


import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.Arrays;

import org.hamcrest.Matchers;
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
	
	@Autowired
	MemberService service;
	
	@Test
	public void testInsert() {
//		fail("Not yet implemented");
//		assertNull(mc);
		assertNotNull(mc);
		
//		assertEquals("member/insert", "member/insert");
		assertEquals("member/insert", mc.insert());
//		assertThat("not 0", service.insertOK(), not(0));
//		assertThat("not equalTo array", new String[] {"aaa","bbb"}, equalTo(new String[] {"aaa","bbb"}));
//		assertThat("not equalTo list", Arrays.asList(11,22), equalTo(Arrays.asList(11,22,33)));
		//여기까지는 기본 햄크래스트 기능.
		
		
		//다양한 햄크래스트 기능.
		//기존 JUnit4 Build Path에서 제거 후 pom.xml 에서도 제거,그리고나서 아래 디펜던시 2개추가.
		//임포트 자동으로 안될때.
		//import static org.hamcrest.Matchers.*; 추가.
//		<!-- https://mvnrepository.com/artifact/junit/junit -->
//			<dependency>
//				<groupId>junit</groupId>
//				<artifactId>junit</artifactId>
//				<version>4.11</version>
//				<scope>test</scope>
//			</dependency>
		
//		<!-- https://mvnrepository.com/artifact/org.hamcrest/hamcrest-all -->
//			<dependency>
//			    <groupId>org.hamcrest</groupId>
//			    <artifactId>hamcrest-all</artifactId>
//			    <version>1.3</version>
//			    <scope>test</scope>
//			</dependency>
		assertThat("Not greaterThan 0", service.insertOK(), greaterThan(0));//크냐
//		assertThat("Not greaterThanOrEqualTo 0", service.insertOK(), greaterThanOrEqualTo(0));//이상이냐
//		assertThat("Not lessThan 0", service.insertOK(), lessThan(0));//작냐
//		assertThat("Not lessThanOrEqualTo 0", service.insertOK(), lessThanOrEqualTo(0));//이하냐
	
	
	}

	@Test
	public void testUpdate() {
//		fail("Not yet implemented");
		assertEquals("member/update", mc.update());
		assertThat("Not equalTo 0", mc.update(), equalTo("member/update"));//문자열비교
		assertThat("Not equalToIgnoringWhiteSpace", mc.update(), equalToIgnoringWhiteSpace("member/update "));//공백문자 무시 문자열비교
//		assertThat("Not emptyArray", new String[] {"11"}, emptyArray());//배열이 비었는가?
		assertThat("Not empty list", new ArrayList<String>(), empty());//List 가 비었는가?
		assertThat("Not is(notNullValue())", new String[] {"11"}, is(notNullValue()));//not null 체크
		assertThat("Not containsString(\"naver\"))", "daum naver google", containsString("naver"));//포함문자 체크
		assertThat("Not startsWith(\"daum\"))", "daum naver google", startsWith("daum"));//시작문자 체크
		assertThat("Not endsWith(\"google\"))", "daum naver google", endsWith("google"));//끝문자 체크
		assertThat("Not equalToIgnoringCase(\"google\"))", "Google", equalToIgnoringCase("google"));//대소문자 무시 문자비교
		
	
	}

	@Test
	public void testDelete() {
//		fail("Not yet implemented");
		assertEquals("member/delete", mc.delete());
		
		assertThat("Not Matchers.<TestVO>hasItem", 
				service.selectAll(), 
				Matchers.<TestVO>hasItem(hasProperty("name", is("yangssem"))));
		
		assertThat("Not Matchers.<TestVO>hasItem", 
				service.selectAll().get(0), 
				hasProperty("name", is("yangssem")));
		
		
		
	}

}
