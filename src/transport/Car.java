package transport;

import driver.Driver;
import driver.DriverB;
import exceptions.DiagnosticNotAllowedException;
import interfaces.Competitive;
import interfaces.Diagnosticable;
import mechanic.Mechanic;

import java.util.List;

public class Car extends Transport<Driver> implements Competitive, Diagnosticable {


    public Car(Type type, String mark, String model, double engineCapacity, DriverB driver, BodyType bodyType, List<Mechanic> mechanics) {
        super(type, mark, model, engineCapacity, driver, mechanics);
        this.bodyType = bodyType;
        this.setGasTankBar(50);
        this.setOilTankBar(8);
    }

    public Car(Type type, String mark, String model, double engineCapacity, Driver driver, List<Mechanic> mechanics) {
        super(type, mark, model, engineCapacity, driver, mechanics);
    }

    BodyType bodyType;

    @Override
    public void runDiagnostic() throws DiagnosticNotAllowedException {
        System.out.println("Диагностика успешно пройдена");
    }

    public enum BodyType {
        a("Седан"),
        b("Хетчбэк"),
        c("Купе"),
        d("Универсал"),
        e("Внедорожник"),
        f("Кроссовер"),
        g("Пикап"),
        h("Фургон"),
        i("Минивэн");

        final String translate;

        BodyType(String translate) {
            this.translate = translate;
        }

        @Override
        public String toString() {
            return "Тип кузова: " + translate;
        }
    }

    public BodyType getBodyType() {
        return bodyType;
    }


    @Override
    public String printType() {
        if (bodyType != null) {
            return Type.CAR.getType() + ", " + bodyType.translate;
        } else {
            return "Недостаточно данных";
        }
    }

    @Override
    public String toString() {
        return "Transport{" +
                "mark='" + super.getMark() + '\'' +
                ", model='" + super.getModel() + '\'' +
                '}' +
                "Car{}";
    }

    @Override
    public void pitStop() {
        System.out.println("Заезд на питстоп");
        setGasTankBar(50);
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
