package test.com;

public class ScoreMain {

	public static void main(String[] args) {
		// ScoreVO ��ü ����, ���
		
		// �����ڿ��ٰ� ���� �����ϴ� �������
		// getter,setter�� ���ؼ� �����ϴ°� �� ����.
		
		// ScoreVO vo = new ScoreVO();
		ScoreVO vo = new ScoreVO(11,"yanssem",88,88,88); // �̷������� ������ �����ϰ� �Ǹ� getter,setter�� �ǹ̰� ������
		ScoreVO vo2 = new ScoreVO(11,"yanssem",88,88,88); // �̷������� ������ �����ϰ� �Ǹ� getter,setter�� �ǹ̰� ������
		System.out.println(vo.equals(vo2)); // �����Ͱ� ������ ������� true�� ��.
		
		System.out.println(vo);
		vo.setNum(2);
		vo.setName("lee");
		vo.setKor(99);
		vo.setEng(99);
		vo.setMath(99);
		System.out.println(vo);
		

	} // end main()

} // end class
