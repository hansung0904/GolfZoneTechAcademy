package test.com;

import java.io.InputStreamReader;
import java.io.Reader;

import test.kosta.AirBus;

public class Test02Main {

	public static void main(String[] args) {
		System.out.println("Hello");

		Car car = new Car();
		System.out.println(car.price);
		System.out.println(car.model_name);
		System.out.println(car.open());
		car.open();

		System.out.println("========================");

		Bus bus = new Bus();
		System.out.println(bus.price);
		System.out.println(bus.model_name);
		System.out.println(bus.station_count);
		System.out.println(bus.com_name);
		System.out.println(bus.autoDoorOpen());
		System.out.println(bus.open());

		System.out.println("========================");

		AirBus airbus = new AirBus();
		System.out.println(airbus.price);
		System.out.println(airbus.model_name);
		System.out.println(airbus.com_name);
		System.out.println(airbus.staff_count);
		System.out.println(airbus.wing_count);
		System.out.println(airbus.station_count);
		System.out.println(airbus.autoDoorOpen());
		System.out.println(airbus.open());
		System.out.println(airbus.fly());

		System.out.println("========================");
//		Reader r = new InputStreamReader(System.in); // **������** Ÿ���� �̸��� �������� �̸��� �ٸ��� �����ʿ� �ִ� �ִ� ���ʰŸ� ��ӹ�������

		// ������. (��ü���� Ư¡ �� �ϳ� ������� �غ��� �� �ߴ� ��..)
		Car c1 = new Bus(); // <<- Bus�� Car�� ��ӹ޾Ҵ�~~ �� ���� �����U�� �Ű澲������ Car type�� ���� �κи� �Ű澲�� �ȴ�.
		System.out.println(c1.model_name);
		System.out.println(c1.price);
		c1.open();

		System.out.println("=========������==========");

		Car c2 = new AirBus();
		c2.open();

		System.out.println("=========Taxi==========");

		Car c3 = new Taxi();
		c3.open();

		System.out.println("=========������ ����==========");
		Car c4 = testCar();
		c4.open();

		Bus b1 = new AirBus(); // <<- Bus�Ÿ� �� �� �� ����. wing_count ���� ��? Bus���� wing_count������
		System.out.println(b1.price);
		System.out.println(b1.model_name);
		System.out.println(b1.station_count);
		System.out.println(b1.autoDoorOpen());
		System.out.println(b1.open());

		System.out.println("=========������ innerclass,Anonymous==========");
		Car c5 = new Car() { // Ŭ���������� ������ ���� �������ϰ�ʹٸ�... {} ������ Car�� ��ӹ��� class�� �Ǿ����(�̸��� ����..)
								// Car�� �ƴ� ��ӹ������̱� ������ �� �׷��� ���� �� �Ը��� �°� �������� ��
								// aaa�� inner class ���ο����� ���� �� �� ���� �ۿ��� aaa�޼��� ���� �Ұ���.
			int num;

			public void aaa() {
				System.out.println("aaa()...");
			}

			@Override
			public int open() {
				System.out.println("anonymous open");
				aaa();
				return 44;
			}
		};
		c5.open();

		Car c6 = new Car() {
			int num;
			public void aaa() {
				System.out.println("aaa()...");
			}

			@Override
			public int open() {
				System.out.println("anonymous open");
				aaa();
				return 44;
			}
		};
		c6.open(); // $2�� class ��������°� �����ֱ� ���ؼ� �ۼ�.

	} // end main

	private static Car testCar() {
		return new Bus();
//		return new Taxi(); // <<- 82,83 ��° �ٰ� ���� �ȴٴ°��� �˰� ���ַ��� �ۼ�.
	}

} // end class
