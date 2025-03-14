package web.model;

import java.util.Objects;

public class Car {
    private String name;
    private int speed;
    private int price;

    public Car() {
    }

    public Car(String name, int speed, int price) {
        this.name = name;
        this.speed = speed;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car { " +
                "название = ' " + name + '\'' +
                ", скорость = " + speed +
                ", цена = " + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return speed == car.speed && price == car.price && Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, speed, price);
    }
}
