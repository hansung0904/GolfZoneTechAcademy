package test.com.responsebody;

import java.util.ArrayList;
import java.util.List;

public class Json_Map {

	List<TestVO> vos = new ArrayList<TestVO>();

	TestVO vo = new TestVO(22, "kim2", 22);

	public Json_Map() {
		TestVO vo = new TestVO(11, "kim", 33);
		vos.add(vo);
		vos.add(vo);
		vos.add(vo);
		vos.add(vo);
	}

	public List<TestVO> getVos() {
		return vos;
	}

	public void setVos(List<TestVO> vos) {
		this.vos = vos;
	}

	public TestVO getVo() {
		return vo;
	}

	public void setVo(TestVO vo) {
		this.vo = vo;
	}

	

}
