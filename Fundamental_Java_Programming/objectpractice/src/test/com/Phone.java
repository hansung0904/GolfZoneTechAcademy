package test.com;

import java.util.Objects;

public class Phone {
    private String chargerType;
    private int price;
    private String brand;
    private String color;

//    public Phone(){
//
//    }

    public Phone(String chargerType, int price, String brand, String color) {
        this.chargerType = "c-type";
        this.price = 1_000_000;
        this.brand = "Apple";
        this.color = "black";
    }

    public String getChargerType() {
        return chargerType;
    }

    public void setChargerType(String chargerType) {
        this.chargerType = chargerType;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
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

    @Override
    public String toString() {
        return "Phone{" +
            "chargerType='" + chargerType + '\'' +
            ", price=" + price +
            ", brand='" + brand + '\'' +
            ", color='" + color + '\'' +
            '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Phone phone = (Phone) o;
        return price == phone.price && Objects.equals(chargerType, phone.chargerType) &&
            Objects.equals(brand, phone.brand) &&
            Objects.equals(color, phone.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(chargerType, price, brand, color);
    }
}
