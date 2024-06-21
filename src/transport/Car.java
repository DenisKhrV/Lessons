package transport;

import driver.Driver;
import driver.DriverB;

public class Car extends Transport<Driver> implements Competitive {


    public Car(String mark, String model, double engineCapacity, DriverB driver) {
        super(mark, model, engineCapacity, driver);
    }

    @Override
    public String toString() {
        return  "Transport{" +
                "mark='" + super.getMark() + '\'' +
                ", model='" + super.getModel() + '\'' +
                '}'+
                "Car{}";
    }

    @Override
    public void pitStop() {
        System.out.println("Заезд на питстоп");
    }

    @Override
    public void bestLap() {
        System.out.println("Лучшее время круга");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость");
    }
}
