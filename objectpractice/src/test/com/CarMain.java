package test.com;

public class CarMain {
    public static void main(String[] args) {
        Car car = new Car();

        car.setBrand("Audi");
        car.setColor("black");
        car.setModel("gasoline");
        car.setPrice(4_500_000);

        System.out.println(car);
    }
}
