package transport;

import driver.DriverD;
import exceptions.DiagnosticNotAllowedException;
import interfaces.Competitive;
import interfaces.Diagnosticable;

import java.util.Random;

public class Bus extends Transport<DriverD> implements Competitive, Diagnosticable {

    Capacity capacity;

    public Bus(Type type, String mark, String model, double engineCapacity, DriverD driver, Capacity capacity) {
        super(type, mark, model, engineCapacity, driver);
        this.capacity = capacity;
        this.setGasTankBar(100);
        this.setOilTankBar(15);
    }

    @Override
    public void runDiagnostic() throws DiagnosticNotAllowedException {
        Random random = new Random();
        int randomNumber = random.nextInt(10);
        if (randomNumber == 0) {
            throw new DiagnosticNotAllowedException("Диагностика не пройдена");
        } else {
            System.out.println("Диагностика успешно пройдена");
        }
    }

    public enum Capacity {
        VERY_SMALL(null, 10),
        SMALL(null, 25),
        MIDDLE(25, 50),
        BIG(50, 80),
        VERY_BIG(80, 120);

        final Integer min;
        final Integer max;

        Capacity(Integer min, Integer max) {
            this.min = min;
            this.max = max;
        }

        @Override
        public String toString() {
            if (min == null) {
                return "Вместимость до " + max + " мест";
            }
            return "Вместимость от " + min + " до " + max + " мест";
        }
    }

    public Capacity getCapacity() {
        return capacity;
    }


    @Override
    public String printType() {
        return Type.BUS.getType() + ". " + capacity.toString();
    }

    @Override
    public String toString() {
        return "Transport{" +
                "mark='" + super.getMark() + '\'' +
                ", model='" + super.getModel() + '\'' +
                '}' +
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
