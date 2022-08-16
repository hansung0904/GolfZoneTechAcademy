package test.com;

public class PeopleMain {

    public static void main(String[] args) {
        People people = new People();
        people.setAddress("ulsan");
        people.setAge(21);
        people.setGender("female");
        people.setName("yj");

        System.out.println(people);

    }

}
