package transport;

public enum Type {
    CAR("Легковой автомобиль"),
    TRUCK("Грузовик"),
    BUS("Автобус");

    final String type;

    Type(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
