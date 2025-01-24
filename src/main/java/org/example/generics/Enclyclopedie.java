package org.example.generics;

public class Enclyclopedie extends Livre{
    private final String domaine;

    public Enclyclopedie(String titre, String auteur, int anneePublication, String domaine) {
        super(titre, auteur, anneePublication);
        this.domaine = domaine;
    }

    public String getDomaine() {
        return domaine;
    }

    @Override
    public String toString() {
        return super.toString()+"Enclyclopedie{" +
                "domaine='" + domaine + '\'' +
                '}';
    }
}
