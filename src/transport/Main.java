package transport;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Prius", 2005, "Japan", "Sedan",
                5, 1.5, "yellow", "auto", "A123HH125", 5, true);
        Car car2 = new Car("Nissan", "Vanette", 2003, "Korea", "Bus", 8, 2,
                "white", "maunal", "B222CC25", 9, false);

        car1.changeTires();

        System.out.println(car1);
        System.out.println(car2);

        Bus bus1 = new Bus("Nissan", "Vanette", 2010, "Japan", "white", 130);
        Bus bus2 = new Bus("Mazda", "Bongo", 2009, "Japan", "white", 140);
        Bus bus3 = new Bus("Mitsubishi", "Delica", 2012, "China", "black", 110);

        System.out.println(bus1);
        System.out.println(bus2);
        System.out.println(bus3);
    }
}
