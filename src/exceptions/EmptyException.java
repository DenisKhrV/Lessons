package exceptions;

import transport.Transport;

public class EmptyException extends RuntimeException{
    public EmptyException() {
    }

    public String causeOfMalfunction(Transport<?> transport) {
        return null;
    }
}
