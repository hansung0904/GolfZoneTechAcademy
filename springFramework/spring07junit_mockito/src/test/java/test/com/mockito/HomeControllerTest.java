package test.com.mockito;

import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.hamcrest.Matchers.*;
import java.util.List;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HomeControllerTest {
	private static final Logger logger = LoggerFactory.getLogger(HomeControllerTest.class);

	@Test
	public void test() {
//		fail("Not yet implemented");
		
		List<String> mockList = mock(List.class);
		mockList.add("lee1");
		mockList.add("lee2");
		mockList.add("lee3");
		
		logger.info("{}",mockList.get(0));//null
		
		verify(mockList).add("lee1");//정상동작하는지만 검증

//		logger.info("{}",mockList.size());//0
//		assertThat("Not greaterThan 0", mockList.size(), greaterThan(0));
		
	}
	
	
	@Test
	public void test_when_then() {
//		fail("Not yet implemented");
		
		List<String> mockList = mock(List.class);
		mockList.add("lee1");
		mockList.add("lee2");
		mockList.add("lee3");
		
		//리턴값세팅
		when(mockList.get(0)).thenReturn("kim");
		when(mockList.get(1)).thenReturn("yang");
		logger.info("{}",mockList.get(0));//kim
		logger.info("{}",mockList.get(1));//yang
		logger.info("{}",mockList.get(2));//null << 리턴값세팅없이는 널값만 반환됨.
		
		logger.info("{}",mockList.size());//0 설정전
		when(mockList.size()).thenReturn(5);//size함수호출시 리턴값을 5로 설정
		logger.info("{}",mockList.size());//5 설정후
		
//		when(mockList.size()).thenThrow(new RuntimeException());//size함수호출시 예외발생설정
//		logger.info("{}",mockList.size());//size함수호출시 예외발생
		
		//첫번째 아이템 획득시 예외발생 시켜보세요.
		when(mockList.get(1)).thenThrow(new RuntimeException());
		logger.info("{}",mockList.get(1));//함수호출시 예외발생
	}

}
