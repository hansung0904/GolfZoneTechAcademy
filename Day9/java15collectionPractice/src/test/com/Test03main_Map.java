package test.com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

import test.com.member.MemberVO;

public class Test03main_Map {
	public static void main(String[] args) {
		System.out.println("Hello Map");
		// key , value 로 데이터를 여러 개 저장합니다.
		// key ,value로 짝지어서 저장하는것들을 Mapping한다 , binding한다~
		// 대표적인 맵핑 바인딩 함수들 : put(K,V) , put***(K,V), setAttribute***(K,V) 이런 형식들이 자주
		// 보인다.
		Map<Integer, Integer> m = new HashMap<Integer, Integer>();
		m.put(0, 111);
		m.put(0, 1111); // key는 중복허용안함.(Set 또한) 13번의 데이터를 14번에서 1111로 바꿔버림
		m.put(1, 1111);
		m.put(2, 11111);
		System.out.println(m.size());

		System.out.println(m.get(0));
		System.out.println(m.get(1));
		System.out.println(m.get(2));

		System.out.println("=========================");
		Map<String, Double> m2 = new Hashtable<String, Double>();
		m2.put("pi", 3.14);
		m2.put("avg", 99.99);
		m2.put("ball_speed", 74.5);
		System.out.println(m2.size());
		System.out.println(m2.get("pi"));
		System.out.println(m2.get("avg"));
		System.out.println(m2.get("ball_speed"));

//		m2.clear();
		m2.remove("pi");
		m2.put("ball_speed", 68.8);
		for (String key : m2.keySet()) {
			System.out.println(key + ":" + m2.get(key));
		}
		System.out.println(m2.values());
		for (Double x : m2.values()) {
			System.out.println(x);
		}

		System.out.println("=========================");
		Map<String, MemberVO> m3 = new HashMap<String, MemberVO>();
		m3.put("vo1", new MemberVO());
		m3.put("vo2", new MemberVO(22, "ad1004", "ad1212", "adkim", "080"));
		MemberVO vo = new MemberVO();
		vo.setNum(33);
		vo.setId("ad33");
		vo.setPw("hi3333");
		vo.setName("lee33");
		vo.setTel("033");
		m3.put("vo3", vo);

		System.out.println("=========================");
		Map<String, List<MemberVO>> m4 = new HashMap<String, List<MemberVO>>();
		List<MemberVO> vos = new ArrayList<MemberVO>(); // 주소가 다름 new 남발
		vos.add(new MemberVO());
		vos.add(new MemberVO());

		m4.put("vos", vos);
		for (MemberVO x : m4.get("vos")) {
			System.out.println(x);
		}
		
		

	} // end main
} // end class
