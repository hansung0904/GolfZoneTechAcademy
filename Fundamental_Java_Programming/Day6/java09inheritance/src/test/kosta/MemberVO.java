package test.kosta;

import java.util.Objects;

public class MemberVO {
	
	// 1. 번호 num,아이디 id,비번 pw,이름 name,폰번tel 속성 은닉해서 선언
	
	// 2. 매개변수없는 생성자 1개 만들고
	
	// 모든 속성을 매개변수로 하는 생성자 1개 추가
	
	// getter , setter 만들고
	
	// toString 재정의
	
	// 데이터클래스용 함수 재정의 hashcode & equals 2개
	
	private int num;
	private String id;
	private String pw;
	private String name;
	private String tel;
	
	public MemberVO() {
		System.out.println("MemberVO()...");
		num = 0;
		id = "chs";
		pw = "1234";
		name = "hanseong";
		tel = "010_4717_7329";
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public MemberVO(int num, String id, String pw, String name, String tel) {
		super();
		this.num = num;
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.tel = tel;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, num, pw, tel);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MemberVO other = (MemberVO) obj;
		return Objects.equals(id, other.id) && Objects.equals(name, other.name) && num == other.num
				&& Objects.equals(pw, other.pw) && Objects.equals(tel, other.tel);
	}

	@Override
	public String toString() {
		return "MemberVO [num=" + num + ", id=" + id + ", pw=" + pw + ", name=" + name + ", tel=" + tel + "]";
	}
	

}