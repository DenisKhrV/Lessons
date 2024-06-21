package transport;

import driver.Driver;
import driver.DriverB;

public class Car extends Transport<Driver> implements Competitive {


    public Car(Type type, String mark, String model, double engineCapacity, DriverB driver, BodyType bodyType) {
        super(type, mark, model, engineCapacity, driver);
        this.bodyType = bodyType;
    }

    public Car(Type type, String mark, String model, double engineCapacity, Driver driver) {
        super(type, mark, model, engineCapacity, driver);
    }

    BodyType bodyType;

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
    public void printType() {
        if (bodyType != null) {
            System.out.println(Type.CAR.getType() + ". " + bodyType.translate);
        } else {
            System.out.println("Недостаточно данных");
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
