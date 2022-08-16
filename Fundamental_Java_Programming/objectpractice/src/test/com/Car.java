package test.com;

import java.util.Objects;

public class Car {
    private String model;
    private String brand;
    private String color;
    private int price;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Car car = (Car) o;
        return price == car.price && Objects.equals(model, car.model) &&
            Objects.equals(brand, car.brand) && Objects.equals(color, car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, brand, color, price);
    }

    @Override
    public String toString() {
        return "Car{" +
            "model='" + model + '\'' +
            ", brand='" + brand + '\'' +
            ", color='" + color + '\'' +
            ", price=" + price +
            '}';
    }
}
