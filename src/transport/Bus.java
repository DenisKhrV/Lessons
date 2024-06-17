package transport;

public class Bus extends Transport{

    public Bus(String mark, String model, int year, String country, String color, int maxSpeed) {
        super(mark, model, year, country, color, maxSpeed);
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
                "Bus{}";
    }
}
