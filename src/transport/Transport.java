package transport;

import driver.Driver;

abstract public class Transport<T extends Driver> {
    private final String mark;
    private final String model;
    private final double engineCapacity;
    private final T driver;

    public Transport(String mark, String model, double engineCapacity, T driver) {
        this.mark = mark;
        this.model = model;
        this.engineCapacity = engineCapacity;
        this.driver = driver;
    }

    public void startMoving() {
        System.out.println("Автомобиль начал движение");

    }

    public void endMoving() {
        System.out.println("Автомобиль закончил движение");
    }


    public String getMark() {
        return mark;
    }

    public String getModel() {
        return model;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public T getDriver() {
        return driver;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "mark='" + mark + '\'' +
                ", model='" + model + '\'' +
                ", engineCapacity=" + engineCapacity +
                '}';
    }
}
