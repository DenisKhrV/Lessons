package exceptions;

import transport.Transport;

public class NoOilException extends EmptyException {

    public NoOilException() {
    }

    @Override
    public String causeOfMalfunction(Transport<?> transport) {
        return "У автомобиля: " + transport.getMark() + " " + transport.getModel() + ", " + transport.printType() + " закончилось масло";
    }
}
