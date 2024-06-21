package transport;

import driver.Driver;

abstract public class Transport<T extends Driver> {
    private final String mark;
    private final String model;
    private final double engineCapacity;
    private final T driver;
    private final Type type;

    public Transport(Type type, String mark, String model, double engineCapacity, T driver) {
        this.mark = mark;
        this.model = model;
        this.engineCapacity = engineCapacity;
        this.driver = driver;
        this.type = type;
    }

    public void startMoving() {
        System.out.println("Автомобиль начал движение");

    }

    public void endMoving() {
        System.out.println("Автомобиль закончил движение");
    }

    abstract public void printType();

    public Type getType() {
        return type;
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
