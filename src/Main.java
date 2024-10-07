import driver.DriverB;
import driver.DriverC;
import driver.DriverD;
import exceptions.DiagnosticNotAllowedException;
import mechanic.Mechanic;
import transport.*;

import java.util.ArrayList;
import java.util.List;

import static transport.Bus.Capacity.*;
import static transport.Car.BodyType.*;
import static transport.Truck.LiftingCapacity.*;
import static transport.Type.*;
import static transport.ServiceStation.*;

public class Main {
    public static void main(String[] args) throws DiagnosticNotAllowedException {
        DriverB driver1 = new DriverB("Вася", true, 11);
        DriverB driver2 = new DriverB("Петя", true, 14);
        DriverC driver3 = new DriverC("Гриша", true, 12);
        DriverC driver4 = new DriverC("Сергей", true, 21);
        DriverD driver5 = new DriverD("Денис", true, 11);
        DriverD driver6 = new DriverD("Владимир", true, 13);

        Mechanic mechanic1 = new Mechanic("Василий Пупкин", "Sollers");
        Mechanic mechanic2 = new Mechanic("Иван Ложкин", "Sollers");
        Mechanic mechanic3 = new Mechanic("Петр Сидоров", "AutoGarant");
        Mechanic mechanic4 = new Mechanic("Сергей Богданов", "AutoGarant");
        List<Mechanic> team1 = new ArrayList<>(List.of(mechanic1, mechanic2));
        List<Mechanic> team2 = new ArrayList<>(List.of(mechanic3, mechanic4));

        Car car1 = new Car(CAR,"Toyota", "Prius", 1500, driver1, a, team1);
        Car car2 = new Car(CAR,"Nissan", "Skyline", 3000, driver2, b, team1);
        Car car3 = new Car(CAR,"Nissan", "Skyline", 3000, driver2, team1);
        Truck truck1 = new Truck(TRUCK,"MAN", "TR11", 5000, driver3, N1, team2);
        Truck truck2 = new Truck(TRUCK,"MAN", "RK22", 6000, driver4, N2, team2);
        Bus bus1 = new Bus(BUS,"Nissan", "Vanette", 2010, driver5, SMALL, team2);
        Bus bus2 = new Bus(BUS,"Mazda", "Bongo", 2009, driver6, BIG, team2);

        List<Transport<?>> transports = new ArrayList<>();
        transports.add(car1);
        transports.add(car2);
        transports.add(car3);
        transports.add(truck1);
        transports.add(truck2);
        transports.add(bus1);
        transports.add(bus2);

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
        printNames(car2);
        printNames(car3);
        printNames(truck1);
        printNames(bus2);

        addTransportToQueue(car1);
        addTransportToQueue(car2);
        addTransportToQueue(car3);
        addTransportToQueue(bus1);
        addTransportToQueue(bus2);
        addTransportToQueue(truck1);
        addTransportToQueue(truck2);

        allTI();

        System.out.println("===========================");
        car1.checkTransport();
        car2.checkTransport();
        car3.checkTransport();
        bus1.checkTransport();
        bus2.checkTransport();
        truck1.checkTransport();
        truck2.checkTransport();

        allTI();
    }

    private static void printNames(Transport<?> transport) {
        System.out.println("Водителя авто зовут: " + transport.getDriver().getFIO());
        System.out.println(transport.getMechanics());
    }

    private static void printInfo(Transport<?> transport) {
        System.out.println("Водитель " + transport.getDriver().getFIO() +
                " управляет авто " + transport.getMark() +
                ", модель " + transport.getModel() + ", объем двигателя " +
                transport.getEngineCapacity() + " и будет участвовать в заезде. ");
    }
}
