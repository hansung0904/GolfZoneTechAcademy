package test.com;

public class Test01if_main {

	public static void main(String[] args) {
		// if, if~else, if ~ else if ~ else if ~ else

		System.out.println("Hello If");

		// if(boolean����� �׻� �;��Ѵ�.) -if ���� �ɷ��� �����Ϸ��� �� �϶��� �����Ѵ�.
		// if(true); �̷��� �������� �ְ� ������ if,{} �̷������� �����Ѵ�.
		if (true)
			System.out.println("OK");

		if (false)
			System.out.println("OK2"); // ����� �ȵǰ��� �� ? if�� true�� ����ϱ⶧��.

		double avg = 88.99;
		if (avg >= 90) {
			System.out.println("A");
			System.out.println("hello");
		} else if (avg >= 80) {
			System.out.println("B" + avg % 10); // else�� �տ� �ٴ� ���� ù��° ���ΰ͸� �����
			if (avg % 10 > 0) {
				System.out.println("B2");
			}
		} else if (avg >= 70) {
			System.out.println("C");
		} else if (avg >= 60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}

	} // end main()

} // end class
