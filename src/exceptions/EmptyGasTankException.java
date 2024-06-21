package exceptions;

import transport.Transport;

public class EmptyGasTankException extends EmptyException {

    public EmptyGasTankException() {
//        System.out.println(causeOfMalfunction(transport));
    }

    @Override
    public String causeOfMalfunction(Transport<?> transport) {
        return "У автомобиля: " + transport.getMark() + " " + transport.getModel() + ", " + transport.printType() + " закончился бензин";
    }
}
