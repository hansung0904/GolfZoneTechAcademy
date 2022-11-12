package test.com.junit;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class MemberService {
	
	public int insertOK() {
		return 1;
	}
	
	public List<TestVO> selectAll(){
		List<TestVO> vos = new ArrayList<TestVO>();
		
		TestVO vo = new TestVO();
		vo.setName("yangssem");
		vo.setAge(33);
		vos.add(vo);
		
		vo = new TestVO();
		vo.setName("yangssem44");
		vo.setAge(44);
		vos.add(vo);
		
		return vos;
	}

}
