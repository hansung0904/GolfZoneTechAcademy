package test.com;

public class Test10break_continue {

	public static void main(String[] args) {
		// switch or �ݺ��������� ��� �ʿ��Ҷ�
		// �׸� >> break
		// -if���� ���� ������ ���� ����� ���� ����������.
		// ��ŵ(�ǳʶٱ�) >> continue
		// -if���� ���� ������ ���� ����� ���� ������ ����.

		// �Լ��� ���Ұ����� ���ư��� >> return�� void�� �ƴҶ� ������ �ʼ������� ������Ѵ�.
		// void �϶��� return�� �ᵵ�ǰ� �Ƚᵵ��.

		// 0123456789 �ܿ������� �׳� ����ó��.
		for (int i = 0; i < 10; i++) {
			if (i == 5) {
				break;
			}
			System.out.print(i);
		}
		System.out.println();

		// 5�� ��ŵ��~
		for (int i = 0; i < 10; i++) {
			if (i == 5) {
				continue;
			}
			System.out.print(i);
		}
		System.out.println();
		
		
	} // end main()

} // end class
