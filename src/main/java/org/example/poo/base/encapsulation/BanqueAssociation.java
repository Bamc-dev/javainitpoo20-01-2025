package org.example.poo.base.encapsulation;

public class BanqueAssociation {
    public static void main(String[] args) {
        CompteCourant compteCourant = new CompteCourant(1000, 500);
        Banque banque = new Banque();
        banque.ajouterCompte(compteCourant);
        banque.afficherSoldes();
    }
}
