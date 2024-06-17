package transport;

import driver.Driver;

public class Truck<driverC> extends Transport<Driver> implements Competitive{
    public Truck(String mark, String model, double engineCapacity) {
        super(mark, model, engineCapacity);
    }

    @Override
    public String toString() {
        return  "Transport{" +
                "mark='" + super.getMark() + '\'' +
                ", model='" + super.getModel() + '\'' +
                '}'+
                "Truck{}";
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
