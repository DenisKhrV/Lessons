package transport;

import driver.DriverD;

public class Bus extends Transport<DriverD> implements Competitive{

    public Bus(String mark, String model, double engineCapacity) {
        super(mark, model, engineCapacity);
    }

    @Override
    public String toString() {
        return  "Transport{" +
                "mark='" + super.getMark() + '\'' +
                ", model='" + super.getModel() + '\'' +
                '}'+
                "Bus{}";
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
