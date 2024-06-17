package driver;

import transport.Transport;

abstract public class Driver {

    private final String FIO;
    private boolean driverLicense;
    private int experience;

    public Driver(String FIO, boolean driverLicense, int experience) {
        this.FIO = FIO;
        this.driverLicense = driverLicense;
        this.experience = experience;
    }

    public void startMoving() {
        System.out.println(FIO + " Начал движение");
    }
    public void stopMoving() {
        System.out.println(FIO + " Остановился");
    }
    public void refuel() {
        System.out.println(FIO + " Заправляет авто");
    }

    public String getFIO() {
        return FIO;
    }

    public boolean isDriverLicense() {
        return driverLicense;
    }

    public int getExperience() {
        return experience;
    }

    public void setDriverLicense(boolean driverLicense) {
        this.driverLicense = driverLicense;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "driver.Driver{" +
                "FIO='" + FIO + '\'' +
                ", driverLicense=" + driverLicense +
                ", experience=" + experience +
                '}';
    }
}
