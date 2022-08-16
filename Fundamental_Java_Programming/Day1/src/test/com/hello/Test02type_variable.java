package test.com.hello;

public class Test02type_variable {
	
	/* final */ byte b = 0; // �������� - �������� �϶��� �⺻������ �˾Ƽ� �Ҵ�
			// ���������� ����� �ƴҶ��� �ʱ�ȭ���� ������ �⺻�����Ҵ��.
			// ���� : final����ô� �ݵ�� �ʱ�ȭ �������.

	public static void main(String[] args) {
		// Ÿ�԰� ����
		// Ÿ������ : �⺻Ÿ��(primitive type) ,����Ÿ��(reference type ��ü, �迭)
		// ���� : �ҹ��ڷ� �����ϴ� ��� ����.
		//		: ��������, ��������
		// ���� �޼��� �ۿ� �ִ� ������ ���� ����
		// ���� �޼��� �ȿ� �ִ� ������ ���� ����
		// final ǥ��� ������ȴ�.(�Һ��� ���� ����) , readonly ���� (�б������� �ǹ�)
		// �⺻Ÿ�� : 
		// 1.����(byte,short,char,int,long) �⺻�� = 0
		
		/*final*/ byte b = 0; // �������� = ���ú��� (���� + �ʱ�ȭ)
		System.out.println(b);
		// ��� = ������(�ʱ�ȭ), 
		b = 10; // 1����Ʈ �뷮 1byte == 8bit : 0000 0000
		System.out.println(b); // �� Ȯ��
		System.out.println(Byte.MIN_VALUE+" ~ "+ Byte.MAX_VALUE);
		
		short s = 100; // 2byte
		System.out.println(Short.MIN_VALUE+" ~ "+ Short.MAX_VALUE);
		
		char c = 100; // 2byte, 0 or ���� ����
		System.out.println((int)Character.MIN_VALUE+" ~ "+(int)Character.MAX_VALUE);
		
		char c2 = 'A'; //
		c2 = (char) 70000; // ��� down casting�� �ȴ� 
		System.out.println(Character.MIN_VALUE+" ~ "+ Character.MAX_VALUE);
		
		int su = 100; // 4byte
		System.out.println(Integer.MIN_VALUE+" ~ "+ Integer.MAX_VALUE);
		
		long ll = 300L; // 8byte
		System.out.println(Long.MIN_VALUE + " ~ " + Long.MAX_VALUE);
		
		
		
		
		// 2. �Ǽ�(float, double) �⺻�� = 0.0

		float f = (float)3.14; // 3.14f ��� ǥ���ص� ��. �Ǽ��� ���е��� ǥ���Ѵ�~ (���� ���� ǥ���Ѵٱ⺸��)
		System.out.println(Float.MIN_VALUE + " ~ " + Float.MAX_VALUE);
		
		double d = 3.14;
		System.out.println(Double.MIN_VALUE + " ~ " + Double.MAX_VALUE);
		
		// 3. ��,����(boolean) ��Ʈ������ ���� 0,1 ���� �����µ� ���� 0 �� 1 ���� 0�� �⺻��
		
		boolean bool = false; // true
		System.out.println(Boolean.TRUE);
		System.out.println(Boolean.FALSE);
		
		
		// �׷��� false �� �⺻���� 
		// ����Ÿ�� �⺻���� = null(�ּҰ� �Ҵ���� �ʾҴ�)
		// 1. ���ڿ�(String)
		String name = "kim";
		name = "lee";
		System.out.println(name);
		
		String name2 = new String(new char[] {'A'});
		System.out.println(name2);
		
		String name3 = new String("A");
		System.out.println(name3);
		
		
		
		// 2. �迭(Array [],{} ���, �����ڴ� new ���, ���Ÿ�Կ� []���)
		// 3. ��ü(Object new�� ��� ù���� �빮�� ex)Cxxxxxx Ŭ����)
		
	} // end main()
	

} // end class
