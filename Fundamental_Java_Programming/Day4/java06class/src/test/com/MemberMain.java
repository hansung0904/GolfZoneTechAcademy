package test.com;

public class MemberMain {

	public static void main(String[] args) {
		
		MemberVO vo = new MemberVO(1,"chs","123","hanseong","010_4717_7329");
		MemberVO vo2 = new MemberVO(1,"chs","1234","hanseong","010_4717_7329");
		MemberVO vo3 = new MemberVO(1,"yj","1234","yjyj","010_1234-1234");
		MemberVO vo4 = new MemberVO(1,"chs2","1234","hihi","010_4571-2323");
		
		System.out.println(vo.equals(vo2));
		
		System.out.println(vo);
		vo.setNum(1);
		vo.setName("hanseong");
		vo.setPw("123");
		vo.setTel("010_4717_7329");
		
		vo2.setNum(2);
		vo2.setName("yj");
		vo2.setPw("1616");
		vo2.setTel("010_1234_5555");
		
		vo3.setNum(3);
		vo3.setName("han");
		vo3.setPw("1515");
		vo3.setTel("010_4232_1511");
		
		vo4.setNum(4);
		vo4.setName("seong");
		vo4.setPw("123");
		vo4.setTel("010_1616_5543");


		System.out.println(vo);
		System.out.print(vo.getName() + " ");
		System.out.print(vo.getId()+ " ");
		System.out.print(vo.getNum()+ " ");
		System.out.print(vo.getTel()+ " ");
		
		System.out.println();
		System.out.println("========================================");
		
		// ���� �ֺ��� ��ü�� ���鸸�� ����� �����Ͻð�
		// Ŭ������ ���������� 5�� ����.
		
		// ���δٸ� ȸ��4���� ������ ��� ȸ���迭���� �� ����ϼ���
		
		MemberVO[] members =  new MemberVO[4];
		for (int i = 0; i < members.length; i++) {
			vo = new MemberVO();
			vo.setNum(i+1);
			vo.setName("hanseong"+(i+1));
			vo.setPw("123"+(i+1));
			vo.setTel("010_4717_7329"+(i+1));
			members[i] = vo;
	
		}
		
		
		for (MemberVO x : members) {
			System.out.println(x);
		}
		
	} // end main()

} // end class