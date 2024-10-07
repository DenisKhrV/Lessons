package transport;

import driver.Driver;
import exceptions.DiagnosticNotAllowedException;
import exceptions.EmptyException;
import exceptions.EmptyGasTankException;
import exceptions.NoOilException;
import interfaces.Diagnosticable;
import mechanic.Mechanic;

import java.util.ArrayList;
import java.util.List;

abstract public class Transport<T extends Driver> implements Diagnosticable {
    private final String mark;
    private final String model;
    private final double engineCapacity;
    private final T driver;
    private final Type type;
    private int gasTankBar;
    private int oilTankBar;
    List<Mechanic> mechanics = new ArrayList<>();

    public Transport(Type type, String mark, String model, double engineCapacity, T driver, List<Mechanic> mechanics) {
        this.mark = mark;
        this.model = model;
        this.engineCapacity = engineCapacity;
        this.driver = driver;
        this.type = type;
        this.mechanics = mechanics;
    }

    public int getGasTankBar() {
        return gasTankBar;
    }

    public void setGasTankBar(int gasTankBar) {
        this.gasTankBar = gasTankBar;
    }

    public int getOilTankBar() {
        return oilTankBar;
    }

    public void setOilTankBar(int oilTankBar) {
        this.oilTankBar = oilTankBar;
    }

    public void startMoving() {
        System.out.println("Автомобиль начал движение");
            setGasTankBar(getGasTankBar() - 5);
            setOilTankBar(getOilTankBar() - 1);
        if (getGasTankBar() < 1) {
            throw new EmptyGasTankException();
        }
        if (getOilTankBar() < 1) {
            throw new NoOilException();
        }
    }

    public void startMoving2() {
        try {
            startMoving();
            startMoving();
            startMoving();
            startMoving();
            startMoving();
            startMoving();
            startMoving();
//            setOilTankBar(100);
            startMoving();
            startMoving();
            startMoving();
            startMoving();
            startMoving();
        } catch (EmptyException e) {
            System.out.println(e.causeOfMalfunction(this));
        } finally {
            endMoving();
        }
    }

    public void endMoving() {
        System.out.println("Автомобиль закончил движение");
    }

    public void runDiagnostic() throws DiagnosticNotAllowedException {
    }

    abstract public String printType();

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

    public List<Mechanic> getMechanics() {
        return mechanics;
    }

    public void checkTransport() {
        if (this.getClass() != Bus.class) {
            ServiceStation.addTransportToQueue(this);
        } else {
            System.out.println("ТО не требуется");
        }
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
