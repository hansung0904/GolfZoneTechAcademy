package test.com;

import java.util.Objects;

public class People {
    private int age;
    private String name;
    private String gender;
    private String address;

    public People() {

    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        People people = (People) o;
        return age == people.age && Objects.equals(name, people.name) &&
            Objects.equals(gender, people.gender) &&
            Objects.equals(address, people.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name, gender, address);
    }

    @Override
    public String toString() {
        return "People{" +
            "age=" + age +
            ", name='" + name + '\'' +
            ", gender='" + gender + '\'' +
            ", address='" + address + '\'' +
            '}';
    }
}
