package test.com.tiles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestMultipartService {
	
	@Autowired
	TestMultipartFAO fao;
	
	public TestVO getVO(TestVO vo) {
		return fao.getVO(vo);
	}

}
