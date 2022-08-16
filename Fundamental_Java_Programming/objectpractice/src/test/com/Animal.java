package test.com;

import java.util.Objects;

public class Animal {
    private int age;
    private String name;
    private String species;
    private String cry;

    public Animal(int age, String name, String species, String cry) {
        this.age = age;
        this.name = name;
        this.species = species;
        this.cry = cry;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public String getCry() {
        return cry;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void setCry(String cry) {
        this.cry = cry;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Animal animal = (Animal) o;
        return age == animal.age && Objects.equals(name, animal.name) &&
            Objects.equals(species, animal.species) &&
            Objects.equals(cry, animal.cry);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name, species, cry);
    }

    @Override
    public String toString() {
        return "Animal{" +
            "age=" + age +
            ", name='" + name + '\'' +
            ", species='" + species + '\'' +
            ", cry='" + cry + '\'' +
            '}';
    }
}