import driver.DriverB;
import driver.DriverC;
import driver.DriverD;
import exceptions.DiagnosticNotAllowedException;
import transport.*;

import static transport.Bus.Capacity.*;
import static transport.Car.BodyType.*;
import static transport.Truck.LiftingCapacity.*;
import static transport.Type.*;

public class Main {
    public static void main(String[] args) throws DiagnosticNotAllowedException {
        DriverB driver1 = new DriverB("Вася", true, 11);
        DriverB driver2 = new DriverB("Петя", true, 14);
        DriverC driver3 = new DriverC("Гриша", true, 12);
        DriverC driver4 = new DriverC("Сергей", true, 21);
        DriverD driver5 = new DriverD("Денис", true, 11);
        DriverD driver6 = new DriverD("Владимир", true, 13);

        Car car1 = new Car(CAR,"Toyota", "Prius", 1500, driver1, a);
        Car car2 = new Car(CAR,"Nissan", "Skyline", 3000, driver2, b);
        Car car3 = new Car(CAR,"Nissan", "Skyline", 3000, driver2);
        Truck truck1 = new Truck(TRUCK,"MAN", "TR11", 5000, driver3, N1);
        Truck truck2 = new Truck(TRUCK,"MAN", "RK22", 6000, driver4, N2);
        Bus bus1 = new Bus(BUS,"Nissan", "Vanette", 2010, driver5, SMALL);
        Bus bus2 = new Bus(BUS,"Mazda", "Bongo", 2009, driver6, BIG);

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

        System.out.println(car1.getBodyType());
        System.out.println(car2.getBodyType());
        System.out.println(truck1.getLiftingCapacity());
        System.out.println(truck2.getLiftingCapacity());
        System.out.println(bus1.getCapacity());
        System.out.println(bus2.getCapacity());

        System.out.println(car1.getType());
        System.out.println(bus2.getType());
        System.out.println(truck1.getType());

        System.out.println(truck1.printType());
        System.out.println(car1.printType());
        System.out.println(bus1.printType());
        System.out.println(car3.printType());

        car1.startMoving2();
        truck1.startMoving2();

        for (Transport<?> transport : transports) {
            transport.runDiagnostic();
        }

    }

    private static void printInfo(Transport<?> transport) {
        System.out.println("Водитель " + transport.getDriver().getFIO() +
                " управляет авто " + transport.getMark() +
                ", модель " + transport.getModel() + ", объем двигателя " +
                transport.getEngineCapacity() + " и будет участвовать в заезде. ");
    }
}
