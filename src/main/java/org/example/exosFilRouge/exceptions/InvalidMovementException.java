package org.example.exosFilRouge.exceptions;

public class InvalidMovementException extends GameException{

    public InvalidMovementException() {
        super("Limits of the map detected");
    }
}
