package test.com;

public class CMS {

	private Car car;
	private MemberVO member;
	private ScoreVO score;

	public CMS() {
		car = new Car();
		member = new MemberVO();
		score = new ScoreVO();
	}

	public CMS(Car car, MemberVO member, ScoreVO score) {
		super();
		this.car = car;
		this.member = member;
		this.score = score;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public MemberVO getMember() {
		return member;
	}

	public void setMember(MemberVO member) {
		this.member = member;
	}

	public ScoreVO getScore() {
		return score;
	}

	public void setScore(ScoreVO score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "CMS [car=" + car + ", member=" + member + ", score=" + score + "]";
	}

}
