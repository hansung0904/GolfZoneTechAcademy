package test.com;

public class PhoneMain {
    public static void main(String[] args) {
        Phone phone = new Phone("C-type", 1000000, "Apple", "Blue");
        System.out.println(phone.getBrand());
        System.out.println(phone.getPrice());
        System.out.println(phone.getColor());
        System.out.println(phone.getChargerType());

    }
}
