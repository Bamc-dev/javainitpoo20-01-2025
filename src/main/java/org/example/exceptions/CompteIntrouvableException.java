package org.example.exceptions;

public class CompteIntrouvableException extends Exception{
    public CompteIntrouvableException() {
        super(" Compte introuvable ");
    }

    public CompteIntrouvableException(String message) {
        super(message);
    }
}
