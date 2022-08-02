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
//		Reader r = new InputStreamReader(System.in); // **무조건** 타입의 이름과 생성자의 이름이 다르면 오른쪽에 있는 애는 왼쪽거를 상속받은거임

		// 다형성. (객체지향 특징 중 하나 기술면접 준비할 때 했던 것..)
		Car c1 = new Bus(); // <<- Bus는 Car를 상속받았다~~ 이 뜻임 오른쪾은 신경쓰지말고 Car type인 왼쪽 부분만 신경쓰면 된다.
		System.out.println(c1.model_name);
		System.out.println(c1.price);
		c1.open();

		System.out.println("=========다형성==========");

		Car c2 = new AirBus();
		c2.open();

		System.out.println("=========Taxi==========");

		Car c3 = new Taxi();
		c3.open();

		System.out.println("=========다형성 리턴==========");
		Car c4 = testCar();
		c4.open();

		Bus b1 = new AirBus(); // <<- Bus거를 다 쓸 수 있음. wing_count 못씀 왜? Bus에는 wing_count가없다
		System.out.println(b1.price);
		System.out.println(b1.model_name);
		System.out.println(b1.station_count);
		System.out.println(b1.autoDoorOpen());
		System.out.println(b1.open());

		System.out.println("=========다형성 innerclass,Anonymous==========");
		Car c5 = new Car() { // 클래스파일을 만들지 말고 재정의하고싶다면... {} 영역은 Car를 상속받은 class가 되어버림(이름이 없는..)
								// Car게 아님 상속받은것이기 때문에 말 그래도 없는 거 입맛에 맞게 재정의한 것
								// aaa는 inner class 내부에서만 동작 할 수 있음 밖에서 aaa메서드 동작 불가능.
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
		c6.open(); // $2로 class 만들어지는거 보여주기 위해서 작성.

	} // end main

	private static Car testCar() {
		return new Bus();
//		return new Taxi(); // <<- 82,83 번째 줄과 같이 된다는것을 알게 해주려고 작성.
	}

} // end class
