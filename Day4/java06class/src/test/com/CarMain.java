package test.com;

public class CarMain {

	public static void main(String[] args) {
		System.out.println("Hello car...");
		
		Car c = new Car();
		System.out.println(c);
		
		Car c_BMW = new Car("BMW");
		System.out.println(c_BMW);
		
		c = new Car(300);
		System.out.println(c);
		
		c = new Car("Kia","����");
		System.out.println(c);
		
		Car c_po = new Car("������","����",1000);
		System.out.println(c_po);
	
		
		/////////////��ü�迭/////////////
		
		// �ڵ��� �δ��� ����(BMW,������)�� ���� �迭����, ����ϱ�.
		System.out.println("===========================================");
		Car[] c2 = new Car[2];
		c2[0] = c_BMW;
		c2[1] = c_po;
		
		for (Car car : c2) {
			System.out.println(car);
		}
		
		
		

	} // end main()

} // end class
