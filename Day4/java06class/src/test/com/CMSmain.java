package test.com;

public class CMSmain {

	public static void main(String[] args) {
		System.out.println("Hello CMS");
		
		CMS cms = new CMS();
		System.out.println(cms);
		
		
		Car car = new Car("Benz","Black",200);
		
		MemberVO member = new MemberVO();
		member.setNum(1);
		member.setName("hanseong");
		member.setPw("123");
		member.setTel("010_4717_7329");
		
		ScoreVO score = new ScoreVO();
		score.setEng(98);
		score.setKor(99);
		score.setMath(100);
		score.setName("chs");
		score.setNum(1);
		
		System.out.println("===========================================");
		
		CMS cms2 = new CMS(car,member,score);
		System.out.print(cms2.getCar().getModel() + " ");
		System.out.print(cms2.getCar().getColor() + " ");
		System.out.print(cms2.getCar().getMaxSpeed() + " ");
		System.out.println();
		System.out.print(cms2.getMember().getNum()+" ");
		System.out.print(cms2.getMember().getId()+" ");
		System.out.print(cms2.getMember().getName()+" ");
		System.out.print(cms2.getMember().getPw()+" ");
		System.out.print(cms2.getMember().getTel()+" ");
		System.out.println();
		System.out.print(cms2.getScore().getNum() + " ");
		System.out.print(cms2.getScore().getKor()+ " ");
		System.out.print(cms2.getScore().getEng()+ " ");
		System.out.print(cms2.getScore().getMath()+ " ");
		System.out.println();
		

	} // end main()

} // end class
