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
		
		c = new Car("Kia","검정");
		System.out.println(c);
		
		Car c_po = new Car("포르쉐","빨강",1000);
		System.out.println(c_po);
	
		
		/////////////객체배열/////////////
		
		// 자동차 두대의 정보(BMW,포르쉐)를 갖는 배열생성, 출력하기.
		System.out.println("===========================================");
		Car[] c2 = new Car[2];
		c2[0] = c_BMW;
		c2[1] = c_po;
		
		for (Car car : c2) {
			System.out.println(car);
		}
		
		
		

	} // end main()

} // end class
