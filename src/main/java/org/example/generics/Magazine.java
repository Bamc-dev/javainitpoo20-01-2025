package org.example.generics;

public class Magazine extends Livre{
    private final int numeroEdition;

    public Magazine(String titre, String auteur, int anneePublication, int numeroEdition) {
        super(titre, auteur, anneePublication);
        this.numeroEdition = numeroEdition;
    }

    public int getNumeroEdition() {
        return numeroEdition;
    }

    @Override
    public String toString() {
        return super.toString() + "Magazine{" +
                "numeroEdition=" + numeroEdition +
                '}';
    }
}
