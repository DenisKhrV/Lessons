import driver.DriverB;
import driver.DriverC;
import driver.DriverD;
import transport.Bus;
import transport.Car;
import transport.Transport;
import transport.Truck;

public class Main {
    public static void main(String[] args) {
        DriverB driver1 = new DriverB("Вася", true, 11);
        DriverB driver2 = new DriverB("Петя", true, 14);
        DriverC driver3 = new DriverC("Гриша", true, 12);
        DriverC driver4 = new DriverC("Сергей", true, 21);
        DriverD driver5 = new DriverD("Денис", true, 11);
        DriverD driver6 = new DriverD("Владимир", true, 13);

        Car car1 = new Car("Toyota", "Prius", 1500, driver1);
        Car car2 = new Car("Nissan", "Skyline", 3000, driver2);
        Bus bus1 = new Bus("Nissan", "Vanette", 2010, driver5);
        Bus bus2 = new Bus("Mazda", "Bongo", 2009, driver6);
        Truck truck1 = new Truck("MAN", "TR11", 5000, driver3);
        Truck truck2 = new Truck("MAN", "RK22", 6000, driver4);

        Transport<?>[] transports = new Transport[6];
        transports[0] = car1;
        transports[1] = car2;
        transports[2] = bus1;
        transports[3] = bus2;
        transports[4] = truck1;
        transports[5] = truck2;

        for (Transport<?> transport : transports) {
            printInfo(transport);
        }

    }

    private static void printInfo(Transport<?> transport) {
        System.out.println("Водитель " + transport.getDriver().getFIO() +
                " управляет авто " + transport.getMark() +
                ", модель " + transport.getModel() + ", объем двигателя " +
                transport.getEngineCapacity() + " и будет участвовать в заезде. ");
    }
}
