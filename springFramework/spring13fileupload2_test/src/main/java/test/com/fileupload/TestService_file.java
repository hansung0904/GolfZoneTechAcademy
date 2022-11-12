package test.com.fileupload;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService_file {
	
	@Autowired
	TestMultipartFAO fao;
	
	public TestVO getVO(TestVO vo) {
		return fao.getVO(vo);
	}

}
