package test.com;

public class Test10break_continue3 {

	public static void main(String[] args) {
		// switch or �ݺ��������� ��� �ʿ��Ҷ�
		// �׸� >> break
		// -if���� ���� ������ ���� ����� ���� ����������.
		// ��ŵ(�ǳʶٱ�) >> continue
		// -if���� ���� ������ ���� ����� ���� ������ ����.

		// �Լ��� ���Ұ����� ���ư��� >> return�� void�� �ƴҶ� ������ �ʼ������� ������Ѵ�.
		// void �϶��� return�� �ᵵ�ǰ� �Ƚᵵ��.

		f1: for (int x = 0; x < 5; x++) {
			System.out.print(x + ":");
			for (int i = 0; i < 10; i++) {
				if (i == 5)
					break f1;
				System.out.print(i);
			}
			System.out.println();
		}

		System.out.println("============");

		// 5�� ��ŵ��~
		f_x:for (int x = 0; x < 5; x++) {
			System.out.print(x + ":");
			for (int i = 0; i < 10; i++) {
				if (i == 5)
					continue f_x;
				System.out.print(i);
			}
			System.out.println();
		}

	} // end main()
} // end class