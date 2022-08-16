package test.com;

public class AnimalMain {
    public static void main(String[] args) {
        Animal animal = new Animal(1, "popo", "dog", "bowwow");
        System.out.println(animal.toString());

        animal.setAge(11);
        animal.setCry("bow");
        animal.setName("popo");
        animal.setSpecies("dog");
        System.out.println(animal.toString());
    }
}
