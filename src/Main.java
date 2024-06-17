import driver.Driver;
import driver.DriverB;
import driver.DriverC;
import driver.DriverD;
import transport.Bus;
import transport.Car;
import transport.Transport;
import transport.Truck;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Prius", 1500);
        Car car2 = new Car("Nissan", "Skyline", 3000);
        Car car3 = new Car("Mazda", "CX5", 2500);
        Bus bus1 = new Bus("Nissan", "Vanette", 2010);
        Bus bus2 = new Bus("Mazda", "Bongo", 2009);
        Bus bus3 = new Bus("Mitsubishi", "Delica", 1800);
        Truck truck1 = new Truck("MAN", "TR11", 5000);
        Truck truck2 = new Truck("MAN", "RK22", 6000);
        Truck truck3 = new Truck("ZIL", "Qwerty", 8000);
        Driver driver1 = new DriverB("Вася", true, 11);
        Driver driver2 = new DriverB("Петя", true, 14);
        Driver driver3 = new DriverC("Гриша", true, 12);
        Driver driver4 = new DriverC("Сергей", true, 21);
        Driver driver5 = new DriverD("Денис", true, 11);
        Driver driver6 = new DriverD("Владимир", true, 13);

        Driver[] drivers = new Driver[6];
        drivers[0] = driver1;
        drivers[1] = driver2;
        drivers[2] = driver3;
        drivers[3] = driver4;
        drivers[4] = driver5;
        drivers[5] = driver6;

        for (int i = 0; i < drivers.length; i++) {
            System.out.println(drivers[i].getFIO());
        }


    }
    private static void printInfo(Transport transport) {
        System.out.println("Водитель " + transport.getDriver().getFIO() +
                " управляет авто " + transport.getMark() +
                ", модель " + transport.getModel() + ", объем двигателя " +
                transport.getEngineCapacity() + " и будет участвовать в заезде. ");
    }

    private String print() {


        return "s";
    }
}
