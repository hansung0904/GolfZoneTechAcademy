package test.com;

public class MemberMain {

	public static void main(String[] args) {
		
		MemberVO vo = new MemberVO(1,"chs","123","hanseong","010_4717_7329");
		MemberVO vo2 = new MemberVO(1,"chs","123","hanseong","010_4717_7329");
		System.out.println(vo.equals(vo2));
		
		System.out.println(vo);
		vo.setNum(1);
		vo.setName("hanseong");
		vo.setPw("123");
		vo.setTel("010_4717_7329");
		System.out.println(vo);
		System.out.print(vo.getName() + " ");
		System.out.print(vo.getId()+ " ");
		System.out.print(vo.getNum()+ " ");
		System.out.print(vo.getTel()+ " ");
		
		//  ���� �ֺ��� ��ü�� ���鸸�� ����� �����Ͻð�
		// Ŭ������ ���������� 5�� ����.
		
	} // end main()

} // end class