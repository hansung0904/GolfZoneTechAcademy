package test.com;

public class Test02Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hello");

		// 3. �񱳿��� ==, !=, >, <, >=, <=
		// System.out.println(5==5); literal�� ���� ���� ������ �̹� �˰� �ֱ⶧���� �ּ��� �����ϸ� ����� ���� ��
		int su1 = 5;
		int su2 = 5;
		System.out.println(su1 == su2);
		System.out.println(su1 != su2);
		System.out.println(su1 > su2);
		System.out.println(su1 < su2);
		System.out.println(su1 >= su2);
		System.out.println(su1 <= su2);

		// 4. ��Ʈ���� : �� &(���δ� ���̸�) |(�ϳ��� ���̸�) ^ , ���� ~
		System.out.println(10 & 3);
		// 1010
		// 0011
		// 0010 >>> 2 (false)
		System.out.println(10 | 3);
		// >>> 11
		System.out.println(10 ^ 3);
		System.out.println(~10);

		// 5. ��Ʈ���� : �̵�(Shift) >> , << , >>>(���������̵��ϵ� �����)
		// 0000 1000 : 8 >> 1 : 4
		// 1000 0000 : 128 >> 1 : 64
		System.out.println(8 >> 1);
		System.out.println(128 >> 1);
		System.out.println(8 >> 2);
		System.out.println(128 >> 2);
		System.out.println("======================");
		System.out.println(8 << 1);
		System.out.println(128 << 1);
		System.out.println(8 << 2);
		System.out.println(128 << 2);
		System.out.println("======================");
		System.out.println(128 >>> 1);
		System.out.println(-128 >>> 1);
		System.out.println("======================");

		// 6. ������ : &, |, &&, ||
		// true & false, 5==5 & Boolean.parseBoolean("true")
		System.out.println(true & false);
		System.out.println(true && false);
		System.out.println(false & true);
		System.out.println(false && true);
		System.out.println(false | true);
		System.out.println(false || true);

		// ���� ������ : ��������(++,--), ����(+,-), ����!
		int max = 10;
		max++;
		System.out.println(max); // 1���� >> max += 1; �̶� ���ٴ� �Ҹ� >> max = max + 1; ++�����ڴ� �տ��ٿ����ǰ� �ڿ� �ٿ����ȴ�.
		++max;
		System.out.println(max);
		// �ٸ� �����ڵ��̶� ������ ++�� �ڿ� �ٰԵǸ� �켱������ �������� �Ǿ �򰥸��� ����.
		System.out.println("======================");

		int top = ++max;
		System.out.println(top);
		System.out.println(max);

		System.out.println("======================");
		int top2 = max++;
		System.out.println(top2);
		System.out.println(max);

		// ��Ÿ : (), {}, [], Array, ����(boolean? ���϶� ��ȯ�� : �����϶� ��ȯ�� )
		System.out.println("======================");
		System.out.println(true ? 100 : 0);
		System.out.println(false ? 100 : 0);
		
		System.out.println("======================");
		boolean bool = true;
		System.out.println(bool ? 100 : 0);
		
		int min = 60;
		System.out.println(min<=60 ? "NO" : "GOOD");
		System.out.println("======================");
		
//		int total = 290;
//		double avg = total / 3.0; // 9x.xxx �̷������� �������� 
//		System.out.println(avg>=90 ? "A" : "B");
		
//		int total = 70+80+90; // B�� �������� �غ���
//		double avg = total / 3.0;  
//		System.out.println(avg>=90 ? "A" : "B");
		
		// ������ ���������
		
		int total = 70+80+80; // ����� ���� �÷�����
		double avg = total / 3.0;  
		System.out.println(avg>=90 ? "A" : 
								avg>=80 ? "B" : 
									avg>=70 ? "C" : "D");
		

	} // end main()

} // end class