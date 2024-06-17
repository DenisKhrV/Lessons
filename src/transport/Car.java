package transport;

public class Car extends Transport {

    private double engineCapacity;

    private String transmission;
    private final String bodType;
    private String registrationNumber;
    private final int numberOfSeats;
    private boolean winterTires;

    public Car(String mark, String model, int year, String country, String color, int maxSpeed, double engineCapacity,
               String transmission, String bodType, String registrationNumber, int numberOfSeats, boolean winterTires) {
        super(mark, model, year, country, color, maxSpeed);
        this.engineCapacity = engineCapacity;
        this.transmission = transmission;
        this.bodType = bodType;
        this.registrationNumber = registrationNumber;
        this.numberOfSeats = numberOfSeats;
        this.winterTires = winterTires;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public String getTransmission() {
        return transmission;
    }

    public String getBodType() {
        return bodType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public boolean isWinterTires() {
        return winterTires;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public void setTransmission(String transmission) {
        if (transmission != null && !transmission.isEmpty()) {
            this.transmission = transmission;
        } else {
            this.transmission = "default";
        }
    }

    public void setRegistrationNumber(String registrationNumber) {
        if (registrationNumber != null && !registrationNumber.isEmpty()) {
            this.registrationNumber = registrationNumber;
        } else {
            this.registrationNumber = "A000AA000";
        }
    }

    public void setWinterTires(boolean winterTires) {
        this.winterTires = winterTires;
    }

    public void changeTires() {
        this.winterTires = !this.winterTires;
    }

    @Override
    public String toString() {
        return  "Transport{" +
                "mark='" + super.getMark() + '\'' +
                ", model='" + super.getModel() + '\'' +
                ", year=" + super.getYear() +
                ", country='" + super.getCountry() + '\'' +
                ", color='" + super.getColor() + '\'' +
                ", maxSpeed=" + super.getMaxSpeed() +
                '}'+
                "Car{" +
                "engineCapacity=" + engineCapacity +
                ", transmission='" + transmission + '\'' +
                ", bodType='" + bodType + '\'' +
                ", registrationNumber='" + registrationNumber + '\'' +
                ", numberOfSeats=" + numberOfSeats +
                ", winterTires=" + winterTires +
                '}';
    }

    private class Key {
        private final boolean remoteStartEngine;
        private final boolean keyLessEntry;

        public Key(boolean remoteStartEngine, boolean keyLessEntry) {
            this.remoteStartEngine = remoteStartEngine;
            this.keyLessEntry = keyLessEntry;
        }

        public boolean isRemoteStartEngine() {
            return remoteStartEngine;
        }

        public boolean isKeyLessEntry() {
            return keyLessEntry;
        }
    }
}
