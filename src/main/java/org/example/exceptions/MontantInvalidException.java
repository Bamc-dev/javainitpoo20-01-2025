package org.example.exceptions;

public class MontantInvalidException extends Exception{
    public MontantInvalidException() {
    }

    public MontantInvalidException(String message) {
        super(message);
    }
}
